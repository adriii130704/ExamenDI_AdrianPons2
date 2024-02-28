package com.example.gestionbiblioteca;

import com.example.models.Libros;
import com.example.models.Prestamo;
import com.example.models.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class HelloController {

    //main
    @FXML
    private Button altaLibrods;

    @FXML
    private Button bajaLibros;

    @FXML
    private ListView<Libros> inventario;

    @FXML
    private ListView<Prestamo> listaPrestamos;

    @FXML
    private ListView<Usuario> listaUsuarios;

    //darAlta

    @FXML
    private Button darAlta;

    @FXML
    private TextField autor_alta;

    @FXML
    private TextField fecha_edicion_alta;

    @FXML
    private TextField id_libros_alta;

    @FXML
    private TextField isbn_alta;

    @FXML
    private TextField tematica_alta;

    @FXML
    private TextField titula_alta;

    List<Libros> l = new ArrayList<>();


    //private final List<Usuario> u = new ArrayList<>();
    //private final List<Prestamo> p = new ArrayList<>();



    /**
     * no funciona por motivos que desconozco
     * Este metodo añade libros a la lista
     * @author: Adrian Posn
     * @version: 28/02/2024
     */
    @FXML
    public void altaLibro(ActionEvent event){
        if(id_libros_alta==null||isbn_alta==null||titula_alta==null||autor_alta==null||tematica_alta==null||fecha_edicion_alta==null){
            System.out.println(" ");
        }else{
            Libros lib = new Libros(Integer.parseInt(id_libros_alta.getText()), titula_alta.getText(),Integer.parseInt(isbn_alta.getText()), autor_alta.getText(), tematica_alta.getText(), fecha_edicion_alta.getText());
            l = Collections.emptyList();
            l.add(lib);
            ObservableList<Libros> libs = FXCollections.observableList(l);
            inventario.setItems(libs);
        }
    }
    /**
     * Este metodo abre el menu para añadir los datos de los libros
     * @author: Adrian Posn
     * @version: 28/02/2024
     */
    @FXML
    public void menuAlta() throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        Parent root =
                FXMLLoader.load(Objects.requireNonNull(getClass().getResource("altaLibros.fxml")));

        Scene scene = new Scene(root);

        stage.setTitle("LOGIN");
        stage.setScene(scene);
        stage.show();
        stage.setOnHidden((e) -> {

        });
    }

    /**
     * Este metodo borra libros de la lista
     * @author: Adrian Posn
     * @version: 28/02/2024
     */
    @FXML
    void bajaLibros(ActionEvent event) {
        int i;
        i = inventario.getSelectionModel().getSelectedIndex();
        if(i!= -1){
            inventario.getItems().remove(i);
            inventario.getSelectionModel().select(-1);
        }
    }
    /**
     * Este metodo presta un libro a un usuario
     * @author: Adrian Posn
     * @version: 28/02/2024
     */
    @FXML
    void prestar(ActionEvent event){
        int i;
        i = inventario.getSelectionModel().getSelectedIndex();
        if(i!= -1){
            Usuario u = new Usuario("",null);
            Prestamo p = new Prestamo(inventario.getItems().get(i).getId_libro(),u.getDni_usuario(),null);
        }
    }


    /**
     * Este metodo devuelve un libro a la biblioteca
     * @author: Adrian Posn
     * @version: 28/02/2024
     */
    @FXML
    void devolver(ActionEvent event) {
        int i;
        i = listaPrestamos.getSelectionModel().getSelectedIndex();
        if(i!= -1){
            if(listaPrestamos.getItems().get(i).getFecha_devolucion().getDay()> LocalDate.now().getDayOfMonth()){
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("TODO MAL");
                    alerta.setHeaderText("Se ha pasado el tiepo de entrga");
                    alerta.showAndWait();
            }else{
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("TODO BIEN");
                alerta.setHeaderText("Se ha deveuelto el libro en la fecha indicada");
                alerta.showAndWait();
            }
        }
    }


}
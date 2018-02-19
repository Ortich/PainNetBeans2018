/*
 * esta clase dibuja triángulos

 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Pentagono extends Forma {

    public Pentagono(int _posX, int _posY, Color _color, boolean _relleno) {
	//Inicializa el constructor del pentagono correctamente para que guarde  5 lados
	super(_posX ,_posY, 5, _color, _relleno);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author xp
 */
public class Circulo extends Forma{
    public Circulo(int _posX, int _posY, Color _color, boolean _relleno) {
	//Inicializa el constructor del triangulo correctamente para que guarde  5 lados
	super(_posX ,_posY, 3600, _color, _relleno);

    }
}

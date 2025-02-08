package Interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
	// Declaramos los metodos
	void RegistrarProducto(TblProducto tblproducto);
	void ActualizarProducto(TblProducto tblproducto);
	void EliminarProdcutos(TblProducto tblproducto);
	List<TblProducto> ListadoProducto();
	TblProducto BuscarProducto (TblProducto tblproducto);
}

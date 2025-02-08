package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_proveedor database table.
 * 
 */
@Entity
@Table(name="tbl_proveedor")
@NamedQuery(name="TblProveedor.findAll", query="SELECT t FROM TblProveedor t")
public class TblProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedor;

	private String emaproveedor;

	private String nompreveedor;

	private String rucproveedor;

	public TblProveedor() {
	}

	public int getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getEmaproveedor() {
		return this.emaproveedor;
	}

	public void setEmaproveedor(String emaproveedor) {
		this.emaproveedor = emaproveedor;
	}

	public String getNompreveedor() {
		return this.nompreveedor;
	}

	public void setNompreveedor(String nompreveedor) {
		this.nompreveedor = nompreveedor;
	}

	public String getRucproveedor() {
		return this.rucproveedor;
	}

	public void setRucproveedor(String rucproveedor) {
		this.rucproveedor = rucproveedor;
	}

}
package br.com.model;

public class PordutoPedido {

	private long id;
	private Long idProduto;
	private Long idPedido;

	public PordutoPedido() {

	}

	public PordutoPedido(Long idProduto, Long idPedido) {
		this.idProduto = idProduto;
		this.idPedido = idPedido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	@Override
	public String toString() {
		return "PordutoPedido [id=" + id + ", idProduto=" + idProduto + ", idPedido=" + idPedido + "]";
	}

}

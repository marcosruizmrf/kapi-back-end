package com.marcos.todo.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TodoDto  {

	private Integer id;
	private String nomeDoCliente;
	private String descricaoDoProduto;
	private Integer codigoDaPeca;
	private Integer numeroDoPedido;
	private String responsavel;
	private String status;
	private String ordemDeProducao;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataParaFinalizar;
	private Boolean finalizado = false;

}

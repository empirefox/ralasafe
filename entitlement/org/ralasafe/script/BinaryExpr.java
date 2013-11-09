/**
 * Copyright (c) 2004-2011 Wang Jinbao(Julian Wong), http://www.ralasafe.com
 * Licensed under the MIT license: http://www.opensource.org/licenses/mit-license.php
 */
package org.ralasafe.script;

public class BinaryExpr implements Expr {
	private Variable variable1;
	private Variable variable2;
	private Operator operator;

	/**
	 * Script liks v1.compareTo(v2)==0
	 * 
	 */
	public String toScript() {
		StringBuffer buff=new StringBuffer();
		String v1=variable1.toScript();
		String v2=variable2.toScript();
		buff.append( v1 ).append( ".compareTo(" ).append( v2 ).append( ") " )
				.append( operator.toScript() ).append( " 0 " );
		return buff.toString();
	}

	public Variable getVariable1() {
		return variable1;
	}

	public void setVariable1( Variable variable1 ) {
		this.variable1=variable1;
	}

	public Variable getVariable2() {
		return variable2;
	}

	public void setVariable2( Variable variable2 ) {
		this.variable2=variable2;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator( Operator operator ) {
		this.operator=operator;
	}
}

package com.alv.grupoii.manejadores;

import com.alv.grupoii.recursos.IApagado;
import com.alv.grupoii.recursos.IPrendido;

public class ManejadorBombillos {

	public void encenderBombillo(IPrendido b) {		
		b.encender();
	}
	
	public void apagarBombillo(IApagado b) {
		b.apagar();
	}
}

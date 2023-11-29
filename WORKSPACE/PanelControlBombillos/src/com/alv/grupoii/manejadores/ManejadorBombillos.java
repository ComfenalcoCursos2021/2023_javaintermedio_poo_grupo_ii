package com.alv.grupoii.manejadores;

import com.alv.grupoii.recursos.Bombillo;

public class ManejadorBombillos {

	public void encenderBombillo(Bombillo b) {
		b.setEstaPrendido(true);
	}
	
	public void apagarBombillo(Bombillo b) {
		b.setEstaPrendido(false);
	}
}

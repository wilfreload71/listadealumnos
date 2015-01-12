package com.wilsonpachas.listaalumnos.fragment;


import com.wilsonpachas.listaalumnos.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetallePruebaFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		View listaDePruebas = 
				inflater.inflate(R.layout.pruebas_detalle, 
						null);
		return listaDePruebas;
	}
	
}

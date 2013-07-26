package br.androidapp.unialliance.e_point;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_login);
		
		final EditText textLogin = (EditText) findViewById(R.id.campoLogin);
		final EditText textPass = (EditText) findViewById(R.id.campoSenha);
		Button buttonLogar = (Button) findViewById(R.id.campoLogar);
		

		
		//Verificação do Login
		//buttonLogar.setOnClickListener(new Button.OnClickListener(){
		//	public void onClick(View v){
		//		
		//	}
		//});		
		
	}	
}



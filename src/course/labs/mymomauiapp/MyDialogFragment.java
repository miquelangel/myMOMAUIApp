package course.labs.mymomauiapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MyDialogFragment extends DialogFragment {
	
	public MyDialogFragment newInstance() {
		return new MyDialogFragment();
	}
	
	@Override
	public Dialog onCreateDialog(Bundle sacedInstanceState){
		return new AlertDialog.Builder(getActivity()).setMessage("Basic colours. \n\n Do you want to see more real modern art?")
				.setCancelable(false)
				.setNegativeButton("Not Now", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				})
				.setPositiveButton("Visit MOMA", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						
						Intent intent = new Intent(Intent.ACTION_VIEW);
						intent.setData(Uri.parse("http://www.moma.org"));
						startActivity(intent);
						
					}
				})
		.create();
	}
}
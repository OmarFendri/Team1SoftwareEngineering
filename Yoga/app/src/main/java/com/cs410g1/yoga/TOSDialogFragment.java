package com.cs410g1.yoga;

import android.app.AlertDialog;
import android.app.Dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by Conor on 3/4/2015.
 */
public class TOSDialogFragment extends DialogFragment {

    public static DialogFragment newInstance(int title) {
        TOSDialogFragment frag = new TOSDialogFragment();
        Bundle args = new Bundle();
        args.putInt("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt("title");

        return new AlertDialog.Builder(getActivity())
                   .setTitle(title)
                   .setPositiveButton("I Agree", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           ((MainMenu)getActivity()).doPositiveClick();

                       }
                   })
                   .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           ((MainMenu)getActivity()).doNegativeClick();

                       }
                   })
                   .setMessage(R.string.TOS_message)
                   .create();

        /*return new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.alert_dialog_icon)
                .setTitle(title)
                .setPositiveButton(R.string.alert_dialog_ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                ((FragmentAlertDialog)getActivity()).doPositiveClick();
                            }
                        }
                )
                .setNegativeButton(R.string.alert_dialog_cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                ((FragmentAlertDialog)getActivity()).doNegativeClick();
                            }
                        }
                )
                .create();*/
    }
}

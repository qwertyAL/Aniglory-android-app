// Generated by view binder compiler. Do not edit!
package com.example.aniglory_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aniglory_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EditUserNameBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button accept;

  @NonNull
  public final EditText editUserName;

  @NonNull
  public final TextView textView2;

  private EditUserNameBinding(@NonNull CardView rootView, @NonNull Button accept,
      @NonNull EditText editUserName, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.accept = accept;
    this.editUserName = editUserName;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static EditUserNameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditUserNameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_user_name, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditUserNameBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accept;
      Button accept = ViewBindings.findChildViewById(rootView, id);
      if (accept == null) {
        break missingId;
      }

      id = R.id.editUserName;
      EditText editUserName = ViewBindings.findChildViewById(rootView, id);
      if (editUserName == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new EditUserNameBinding((CardView) rootView, accept, editUserName, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

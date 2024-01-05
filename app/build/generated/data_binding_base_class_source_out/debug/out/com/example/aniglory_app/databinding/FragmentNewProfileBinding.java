// Generated by view binder compiler. Do not edit!
package com.example.aniglory_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aniglory_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNewProfileBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnAbout;

  @NonNull
  public final Button btnDonate;

  @NonNull
  public final Button btnSignInOut;

  @NonNull
  public final FrameLayout shadow;

  @NonNull
  public final ImageView userAvatar;

  @NonNull
  public final TextView userId;

  @NonNull
  public final TextView userName;

  @NonNull
  public final TextView userStatus;

  private FragmentNewProfileBinding(@NonNull FrameLayout rootView, @NonNull Button btnAbout,
      @NonNull Button btnDonate, @NonNull Button btnSignInOut, @NonNull FrameLayout shadow,
      @NonNull ImageView userAvatar, @NonNull TextView userId, @NonNull TextView userName,
      @NonNull TextView userStatus) {
    this.rootView = rootView;
    this.btnAbout = btnAbout;
    this.btnDonate = btnDonate;
    this.btnSignInOut = btnSignInOut;
    this.shadow = shadow;
    this.userAvatar = userAvatar;
    this.userId = userId;
    this.userName = userName;
    this.userStatus = userStatus;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNewProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNewProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_new_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNewProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAbout;
      Button btnAbout = ViewBindings.findChildViewById(rootView, id);
      if (btnAbout == null) {
        break missingId;
      }

      id = R.id.btnDonate;
      Button btnDonate = ViewBindings.findChildViewById(rootView, id);
      if (btnDonate == null) {
        break missingId;
      }

      id = R.id.btn_signInOut;
      Button btnSignInOut = ViewBindings.findChildViewById(rootView, id);
      if (btnSignInOut == null) {
        break missingId;
      }

      id = R.id.shadow;
      FrameLayout shadow = ViewBindings.findChildViewById(rootView, id);
      if (shadow == null) {
        break missingId;
      }

      id = R.id.userAvatar;
      ImageView userAvatar = ViewBindings.findChildViewById(rootView, id);
      if (userAvatar == null) {
        break missingId;
      }

      id = R.id.userId;
      TextView userId = ViewBindings.findChildViewById(rootView, id);
      if (userId == null) {
        break missingId;
      }

      id = R.id.userName;
      TextView userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      id = R.id.userStatus;
      TextView userStatus = ViewBindings.findChildViewById(rootView, id);
      if (userStatus == null) {
        break missingId;
      }

      return new FragmentNewProfileBinding((FrameLayout) rootView, btnAbout, btnDonate,
          btnSignInOut, shadow, userAvatar, userId, userName, userStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
// Generated by view binder compiler. Do not edit!
package com.example.aniglory_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aniglory_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TitleHorizontalBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView nameTitle;

  @NonNull
  public final TextView otherData;

  @NonNull
  public final ImageView poster;

  @NonNull
  public final TextView titleID;

  private TitleHorizontalBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView2,
      @NonNull TextView description, @NonNull TextView nameTitle, @NonNull TextView otherData,
      @NonNull ImageView poster, @NonNull TextView titleID) {
    this.rootView = rootView;
    this.cardView2 = cardView2;
    this.description = description;
    this.nameTitle = nameTitle;
    this.otherData = otherData;
    this.poster = poster;
    this.titleID = titleID;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TitleHorizontalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TitleHorizontalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.title_horizontal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TitleHorizontalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.nameTitle;
      TextView nameTitle = ViewBindings.findChildViewById(rootView, id);
      if (nameTitle == null) {
        break missingId;
      }

      id = R.id.otherData;
      TextView otherData = ViewBindings.findChildViewById(rootView, id);
      if (otherData == null) {
        break missingId;
      }

      id = R.id.poster;
      ImageView poster = ViewBindings.findChildViewById(rootView, id);
      if (poster == null) {
        break missingId;
      }

      id = R.id.titleID;
      TextView titleID = ViewBindings.findChildViewById(rootView, id);
      if (titleID == null) {
        break missingId;
      }

      return new TitleHorizontalBinding((ConstraintLayout) rootView, cardView2, description,
          nameTitle, otherData, poster, titleID);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

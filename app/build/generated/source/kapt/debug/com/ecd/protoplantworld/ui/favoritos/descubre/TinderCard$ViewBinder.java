package com.ecd.protoplantworld.ui.favoritos.descubre;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.$.R;
import com.mindorks.placeholderview.ViewBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Override;

@Keep
public class TinderCard$ViewBinder extends ViewBinder<TinderCard, View> {
  public TinderCard$ViewBinder(TinderCard resolver) {
    super(resolver, R.layout.TinderCard, false);
  }

  @Override
  protected void resolveView(TinderCard resolver) {
    resolver.onResolved();
  }

  @Override
  protected void recycleView() {
    TinderCard resolver = getResolver();
  }

  @Override
  protected void unbind() {
    TinderCard resolver = getResolver();
    boolean nullable = isNullable();
    if (resolver != null && nullable) {
      resolver.profileImageView = null;
      resolver.nameAgeTxt = null;
      resolver.locationNameTxt = null;
      resolver.swipeView = null;
      setResolver(null);
      setAnimationResolver(null);
    }
  }

  @Override
  protected void bindViewPosition(TinderCard resolver, int position) {
    resolver.position = position;
  }

  @Override
  protected void bindViews(TinderCard resolver, View itemView) {
    resolver.profileImageView = (ImageView)itemView.findViewById(R.id.profileImageView);
    resolver.nameAgeTxt = (TextView)itemView.findViewById(R.id.nameAgeTxt);
    resolver.locationNameTxt = (TextView)itemView.findViewById(R.id.locationNameTxt);
  }

  @Override
  protected void bindClick(final TinderCard resolver, View itemView) {
    itemView.findViewById(R.id.onClick).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        resolver.onClick();
      }
    });
  }

  @Override
  protected void bindLongClick(final TinderCard resolver, View itemView) {
  }
}

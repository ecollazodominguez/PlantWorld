package com.ecd.protoplantworld.ui.favoritos.descubre;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.$.R;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.SwipeViewBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Override;

@Keep
public class TinderCard$SwipeViewBinder extends SwipeViewBinder<TinderCard, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
  public TinderCard$SwipeViewBinder(TinderCard resolver) {
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
  protected void bindViews(TinderCard resolver, SwipePlaceHolderView.FrameView itemView) {
    resolver.profileImageView = (ImageView)itemView.findViewById(R.id.profileImageView);
    resolver.nameAgeTxt = (TextView)itemView.findViewById(R.id.nameAgeTxt);
    resolver.locationNameTxt = (TextView)itemView.findViewById(R.id.locationNameTxt);
  }

  @Override
  protected void bindClick(final TinderCard resolver, SwipePlaceHolderView.FrameView itemView) {
    itemView.findViewById(R.id.onClick).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        resolver.onClick();
      }
    });
  }

  @Override
  protected void bindLongClick(final TinderCard resolver, SwipePlaceHolderView.FrameView itemView) {
  }

  @Override
  protected void bindSwipeView(SwipePlaceHolderView.FrameView itemView) {
    getResolver().swipeView = itemView;
  }

  @Override
  protected void bindSwipeIn(TinderCard resolver) {
  }

  @Override
  protected void bindSwipeOut(TinderCard resolver) {
  }

  @Override
  protected void bindSwipeInState() {
  }

  @Override
  protected void bindSwipeOutState() {
  }

  @Override
  protected void bindSwipeCancelState() {
    getResolver().onSwipeCancelState();
  }

  @Override
  protected void bindSwipeHead(TinderCard resolver) {
  }
}
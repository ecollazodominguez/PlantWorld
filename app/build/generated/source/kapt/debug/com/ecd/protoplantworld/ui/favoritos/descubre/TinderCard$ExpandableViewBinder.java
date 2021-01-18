package com.ecd.protoplantworld.ui.favoritos.descubre;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.$.R;
import com.mindorks.placeholderview.ExpandableViewBinder;
import com.mindorks.placeholderview.annotations.Keep;
import java.lang.Deprecated;
import java.lang.Override;

@Keep
public class TinderCard$ExpandableViewBinder extends ExpandableViewBinder<TinderCard, View> {
  public TinderCard$ExpandableViewBinder(TinderCard resolver) {
    super(resolver, R.layout.TinderCard, false, false, false);
  }

  @Override
  protected void resolveView(TinderCard resolver) {
    resolver.onResolved();
  }

  @Override
  protected void recycleView() {
    TinderCard resolver = getResolver();
  }

  @Deprecated
  @Override
  protected void unbind() {
  }

  @Deprecated
  @Override
  protected void bindAnimation(int deviceWidth, int deviceHeight, View view) {
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

  @Override
  protected void bindParentPosition(int position) {
  }

  @Override
  protected void bindChildPosition(int position) {
  }

  @Override
  protected void bindToggle(final TinderCard resolver, View itemView) {
    itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (isExpanded()) collapse();
        else expand();
      }
    });
  }

  @Override
  protected void bindExpand(TinderCard resolver) {
  }

  @Override
  protected void bindCollapse(TinderCard resolver) {
  }
}

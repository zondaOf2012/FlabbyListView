// Generated code from Butter Knife. Do not modify!
package com.jpardogo.android.flabbylistview;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ListAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.jpardogo.android.flabbylistview.ListAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131034172);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131034172' for field 'text' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.text = (android.widget.TextView) view;
  }

  public static void reset(com.jpardogo.android.flabbylistview.ListAdapter.ViewHolder target) {
    target.text = null;
  }
}

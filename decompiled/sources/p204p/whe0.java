package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class whe0 implements ft11, hie0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f251340a;

    /* JADX INFO: renamed from: k */
    public static int m88127k(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: f */
    public final boolean mo28116f(lhe0 lhe0Var) {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: g */
    public final boolean mo28117g(lhe0 lhe0Var) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo61202j(zge0 zge0Var);

    /* JADX INFO: renamed from: l */
    public abstract void mo61203l(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo61204o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (wge0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (wge0) listAdapter).f251046a.m96071s((MenuItem) listAdapter.getItem(i), this, !(this instanceof m9c) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo61205p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo61206q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo61207r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo61208s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo61209t(int i);

    @Override // p204p.hie0
    /* JADX INFO: renamed from: c */
    public final void mo28113c(Context context, zge0 zge0Var) {
    }
}

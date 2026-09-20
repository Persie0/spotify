package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes3.dex */
public final class cie0 extends rhs {

    /* JADX INFO: renamed from: N0 */
    public final int f38297N0;

    /* JADX INFO: renamed from: O0 */
    public final int f38298O0;

    /* JADX INFO: renamed from: P0 */
    public khe0 f38299P0;

    /* JADX INFO: renamed from: Q0 */
    public lhe0 f38300Q0;

    public cie0(Context context, boolean z) {
        super(context, z);
        if (1 == bie0.m29315a(context.getResources().getConfiguration())) {
            this.f38297N0 = 21;
            this.f38298O0 = 22;
        } else {
            this.f38297N0 = 22;
            this.f38298O0 = 21;
        }
    }

    @Override // p204p.rhs, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        wge0 wge0Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f38299P0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                wge0Var = (wge0) headerViewListAdapter.getWrappedAdapter();
            } else {
                wge0Var = (wge0) adapter;
                headersCount = 0;
            }
            lhe0 lhe0VarM88024b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= wge0Var.getCount()) ? null : wge0Var.getItem(i);
            lhe0 lhe0Var = this.f38300Q0;
            if (lhe0Var != lhe0VarM88024b) {
                zge0 zge0Var = wge0Var.f251046a;
                if (lhe0Var != null) {
                    this.f38299P0.mo36080l(zge0Var, lhe0Var);
                }
                this.f38300Q0 = lhe0VarM88024b;
                if (lhe0VarM88024b != null) {
                    this.f38299P0.mo36081p(zge0Var, lhe0VarM88024b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f38297N0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f38298O0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (wge0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (wge0) adapter).f251046a.m96064d(false);
        return true;
    }

    public void setHoverListener(khe0 khe0Var) {
        this.f38299P0 = khe0Var;
    }

    @Override // p204p.rhs, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

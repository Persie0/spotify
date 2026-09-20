package p204p;

import android.widget.AbsListView;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class epm0 extends sjv0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public int f61674a;

    /* JADX INFO: renamed from: b */
    public boolean f61675b;

    @Override // p204p.sjv0
    /* JADX INFO: renamed from: f */
    public final void mo35394f(RecyclerView recyclerView, int i, int i2) {
        AbstractC0110a layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            na6.m63957e("LayoutManager is not compatible: ".concat(String.valueOf(layoutManager)));
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iM939g1 = linearLayoutManager.m939g1();
        int iM1097I = linearLayoutManager.m1097I();
        m39661l(iM939g1 + (iM1097I <= 0 ? 0 : iM1097I - 1), iM1097I, linearLayoutManager.m1104R());
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo39658g();

    /* JADX INFO: renamed from: h */
    public abstract int mo39659h();

    /* JADX INFO: renamed from: j */
    public abstract void mo39660j(int i);

    /* JADX INFO: renamed from: l */
    public final void m39661l(int i, int i2, int i3) {
        if (i3 != this.f61674a) {
            this.f61674a = i3;
            this.f61675b = false;
        }
        if (!mo39658g()) {
            this.f61675b = false;
        } else {
            if (this.f61675b || i2 == 0 || mo39659h() + i < i3 - 1) {
                return;
            }
            mo39660j(i);
            this.f61675b = true;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        m39661l((i + i2) - 1, i2, i3);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}

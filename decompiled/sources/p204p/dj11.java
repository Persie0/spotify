package p204p;

import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class dj11 extends sjv0 {

    /* JADX INFO: renamed from: a */
    public final rfx f49529a;

    /* JADX INFO: renamed from: b */
    public int f49530b;

    public dj11(rfx rfxVar) {
        this.f49529a = rfxVar;
    }

    @Override // p204p.sjv0
    /* JADX INFO: renamed from: f */
    public final void mo35394f(RecyclerView recyclerView, int i, int i2) {
        int iM1104R;
        AbstractC0110a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iM1104R = linearLayoutManager.m1104R()) == 0 || i2 < 0) {
            return;
        }
        int iM942i1 = linearLayoutManager.m942i1();
        int iM939g1 = linearLayoutManager.m939g1();
        if (iM1104R < 5) {
            return;
        }
        int i3 = iM1104R / 2;
        boolean z = iM939g1 <= i3 && i3 <= iM942i1;
        boolean z2 = iM942i1 >= iM1104R + (-5) && iM1104R > 5;
        if ((z || z2) && this.f49530b != iM1104R) {
            this.f49529a.invoke(this);
            this.f49530b = iM1104R;
        }
    }
}

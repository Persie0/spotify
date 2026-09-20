package p204p;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class a3z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f12087b;

    public /* synthetic */ a3z0(SearchView searchView, int i) {
        this.f12086a = i;
        this.f12087b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12086a) {
            case 0:
                this.f12087b.m143t();
                break;
            default:
                u8m u8mVar = this.f12087b.f248q1;
                if (u8mVar instanceof q261) {
                    u8mVar.mo71986b(null);
                }
                break;
        }
    }
}

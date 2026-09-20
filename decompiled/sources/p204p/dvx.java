package p204p;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public final class dvx implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView f53560b;

    public /* synthetic */ dvx(RecyclerView recyclerView, int i) {
        this.f53559a = i;
        this.f53560b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iMo1617e;
        switch (this.f53559a) {
            case 0:
                RecyclerView recyclerView = this.f53560b;
                hjv0 adapter = recyclerView.getAdapter();
                if (adapter != null && (iMo1617e = adapter.mo1617e()) > 0) {
                    recyclerView.mo1035v0(iMo1617e - 1);
                    recyclerView.post(new dvx(recyclerView, 1));
                    break;
                }
                break;
            case 1:
                this.f53560b.scrollBy(0, Alert.DURATION_SHOW_INDEFINITELY);
                break;
            default:
                RecyclerView recyclerView2 = this.f53560b;
                mjv0 mjv0Var = recyclerView2.f1251n1;
                if (mjv0Var != null) {
                    mjv0Var.mo33398j();
                }
                recyclerView2.f1201L1 = false;
                break;
        }
    }

    public dvx(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f53559a = 0;
        this.f53560b = recyclerView2;
    }
}

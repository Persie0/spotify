package p204p;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class t8m extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f218108b;

    public /* synthetic */ t8m(Object obj, int i) {
        this.f218107a = i;
        this.f218108b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f218107a) {
            case 0:
                q261 q261Var = (q261) this.f218108b;
                q261Var.f227973a = true;
                q261Var.notifyDataSetChanged();
                break;
            default:
                k290 k290Var = (k290) this.f218108b;
                if (k290Var.f118567W0.isShowing()) {
                    k290Var.mo42575m();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f218107a) {
            case 0:
                q261 q261Var = (q261) this.f218108b;
                q261Var.f227973a = false;
                q261Var.notifyDataSetInvalidated();
                break;
            default:
                ((k290) this.f218108b).dismiss();
                break;
        }
    }
}

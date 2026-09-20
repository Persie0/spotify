package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class vv30 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zu0 f245136b;

    public /* synthetic */ vv30(zu0 zu0Var, int i) {
        this.f245135a = i;
        this.f245136b = zu0Var;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [p.eh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f245135a) {
            case 0:
                ((qe70) this.f245136b.f286293L0).invoke();
                break;
            default:
                ((eh00) this.f245136b.f286294M0).invoke();
                break;
        }
    }
}

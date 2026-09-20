package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class byp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f32293b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32294c;

    public /* synthetic */ byp(gh00 gh00Var, int i, int i2) {
        this.f32292a = i2;
        this.f32293b = gh00Var;
        this.f32294c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32292a) {
            case 0:
                gh00 gh00Var = this.f32293b;
                if (gh00Var != null) {
                    gh00Var.invoke(new bwp0(this.f32294c));
                }
                break;
            default:
                gh00 gh00Var2 = this.f32293b;
                if (gh00Var2 != null) {
                    gh00Var2.invoke(new eje0(this.f32294c));
                }
                break;
        }
    }
}

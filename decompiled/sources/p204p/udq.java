package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class udq implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229292a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f229293b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f229294c;

    public udq(vdq vdqVar, gh00 gh00Var) {
        this.f229294c = vdqVar;
        this.f229293b = gh00Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f229292a) {
            case 0:
                vdq vdqVar = (vdq) this.f229294c;
                if (vdqVar.f240471d || !vdqVar.f240474g.m20728x()) {
                    return false;
                }
                this.f229293b.invoke(hq81.f94063b);
                return true;
            default:
                this.f229293b.invoke(new ijv(((hlv) this.f229294c).f92755e));
                return true;
        }
    }

    public udq(gh00 gh00Var, hlv hlvVar) {
        this.f229293b = gh00Var;
        this.f229294c = hlvVar;
    }
}

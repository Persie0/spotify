package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zfa implements g0r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282265a;

    /* JADX INFO: renamed from: b */
    public final m500 f282266b;

    /* JADX INFO: renamed from: c */
    public final q0f0 f282267c;

    /* JADX INFO: renamed from: d */
    public final jal0 f282268d;

    public /* synthetic */ zfa(m500 m500Var, q0f0 q0f0Var, jal0 jal0Var, int i) {
        this.f282265a = i;
        this.f282266b = m500Var;
        this.f282267c = q0f0Var;
        this.f282268d = jal0Var;
    }

    @Override // p204p.g0r0
    /* JADX INFO: renamed from: a */
    public final qte0 mo31430a(Context context) {
        switch (this.f282265a) {
            case 0:
                return new yfa(this.f282266b, this.f282267c, this.f282268d);
            case 1:
                return new og00(this.f282266b, this.f282267c, this.f282268d);
            case 2:
                return new mth0(this.f282266b, this.f282267c, this.f282268d);
            default:
                return new xmd1(this.f282266b, this.f282267c, this.f282268d);
        }
    }
}

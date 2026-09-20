package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h24 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final g24 f86881a;

    /* JADX INFO: renamed from: b */
    public final bji f86882b;

    /* JADX INFO: renamed from: c */
    public final wg61 f86883c = new wg61(new u14(this, 7));

    public h24(g24 g24Var, bji bjiVar) {
        this.f86881a = g24Var;
        this.f86882b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final g24 m46469a() {
        g24 g24VarM46469a;
        h24 h24Var = (h24) this.f86883c.getValue();
        return (h24Var == null || (g24VarM46469a = h24Var.m46469a()) == null) ? this.f86881a : g24VarM46469a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m46469a().f75829a;
        g24[] g24VarArrValues = g24.values();
        ArrayList arrayList = new ArrayList(g24VarArrValues.length);
        for (g24 g24Var : g24VarArrValues) {
            arrayList.add(g24Var.f75829a);
        }
        return geg1.m44518y(new k8a("foreground_refresh_frequency", "android-devicelocation-locationrefresh", str, arrayList));
    }
}

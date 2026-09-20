package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final g04 f97133a;

    /* JADX INFO: renamed from: b */
    public final bji f97134b;

    /* JADX INFO: renamed from: c */
    public final wg61 f97135c = new wg61(new ey3(this, 16));

    public i04(g04 g04Var, bji bjiVar) {
        this.f97133a = g04Var;
        this.f97134b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final g04 m49294a() {
        g04 g04VarM49294a;
        i04 i04Var = (i04) this.f97135c.getValue();
        return (i04Var == null || (g04VarM49294a = i04Var.m49294a()) == null) ? this.f97133a : g04VarM49294a;
    }

    @Override // p204p.iys0
    public final List models() {
        String strM43255a = m49294a().m43255a();
        g04[] g04VarArrValues = g04.values();
        ArrayList arrayList = new ArrayList(g04VarArrValues.length);
        for (g04 g04Var : g04VarArrValues) {
            arrayList.add(g04Var.m43255a());
        }
        return geg1.m44518y(new k8a("http_engine", "android-connectivity", strM43255a, arrayList));
    }
}

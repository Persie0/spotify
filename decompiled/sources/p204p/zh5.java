package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zh5 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f282803a;

    /* JADX INFO: renamed from: b */
    public final vh5 f282804b;

    /* JADX INFO: renamed from: c */
    public final wh5 f282805c;

    /* JADX INFO: renamed from: d */
    public final fnk0 f282806d;

    /* JADX INFO: renamed from: e */
    public final bji f282807e;

    /* JADX INFO: renamed from: f */
    public final wg61 f282808f = new wg61(new yh5(this, 1));

    /* JADX INFO: renamed from: g */
    public final wg61 f282809g = new wg61(new yh5(this, 0));

    public zh5(boolean z, vh5 vh5Var, wh5 wh5Var, fnk0 fnk0Var, bji bjiVar) {
        this.f282803a = z;
        this.f282804b = vh5Var;
        this.f282805c = wh5Var;
        this.f282806d = fnk0Var;
        this.f282807e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96115a() {
        zh5 zh5Var = (zh5) this.f282809g.getValue();
        return zh5Var != null ? zh5Var.m96115a() : this.f282803a;
    }

    /* JADX INFO: renamed from: b */
    public final vh5 m96116b() {
        vh5 vh5VarM96116b;
        zh5 zh5Var = (zh5) this.f282809g.getValue();
        return (zh5Var == null || (vh5VarM96116b = zh5Var.m96116b()) == null) ? this.f282804b : vh5VarM96116b;
    }

    /* JADX INFO: renamed from: c */
    public final wh5 m96117c() {
        wh5 wh5VarM96117c;
        zh5 zh5Var = (zh5) this.f282809g.getValue();
        return (zh5Var == null || (wh5VarM96117c = zh5Var.m96117c()) == null) ? this.f282805c : wh5VarM96117c;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("button_big", "apps-music-features-remoteconfiguration", m96115a());
        String str = m96116b().f241414a;
        vh5[] vh5VarArrValues = vh5.values();
        ArrayList arrayList = new ArrayList(vh5VarArrValues.length);
        for (vh5 vh5Var : vh5VarArrValues) {
            arrayList.add(vh5Var.f241414a);
        }
        k8a k8aVar2 = new k8a("button_color", "apps-music-features-remoteconfiguration", str, arrayList);
        String str2 = m96117c().f251260a;
        wh5[] wh5VarArrValues = wh5.values();
        ArrayList arrayList2 = new ArrayList(wh5VarArrValues.length);
        for (wh5 wh5Var : wh5VarArrValues) {
            arrayList2.add(wh5Var.f251260a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, new k8a("message", "apps-music-features-remoteconfiguration", str2, arrayList2));
    }
}

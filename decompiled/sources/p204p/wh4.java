package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f251247a;

    /* JADX INFO: renamed from: b */
    public final vh4 f251248b;

    /* JADX INFO: renamed from: c */
    public final bji f251249c;

    /* JADX INFO: renamed from: d */
    public final wg61 f251250d = new wg61(new bh4(this, 12));

    public wh4(boolean z, vh4 vh4Var, bji bjiVar) {
        this.f251247a = z;
        this.f251248b = vh4Var;
        this.f251249c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88084a() {
        wh4 wh4Var = (wh4) this.f251250d.getValue();
        return wh4Var != null ? wh4Var.m88084a() : this.f251247a;
    }

    /* JADX INFO: renamed from: b */
    public final vh4 m88085b() {
        vh4 vh4VarM88085b;
        wh4 wh4Var = (wh4) this.f251250d.getValue();
        return (wh4Var == null || (vh4VarM88085b = wh4Var.m88085b()) == null) ? this.f251248b : vh4VarM88085b;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("player_reuse_enabled", "android-multiplayer", m88084a());
        String str = m88085b().f241406a;
        vh4[] vh4VarArrValues = vh4.values();
        ArrayList arrayList = new ArrayList(vh4VarArrValues.length);
        for (vh4 vh4Var : vh4VarArrValues) {
            arrayList.add(vh4Var.f241406a);
        }
        return h6f.m46715L(k8aVar, new k8a("stream_reporting_mode", "android-multiplayer", str, arrayList));
    }
}

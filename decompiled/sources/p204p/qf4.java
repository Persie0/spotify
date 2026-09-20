package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f188113a;

    /* JADX INFO: renamed from: b */
    public final boolean f188114b;

    /* JADX INFO: renamed from: c */
    public final boolean f188115c;

    /* JADX INFO: renamed from: d */
    public final pf4 f188116d;

    /* JADX INFO: renamed from: e */
    public final boolean f188117e;

    /* JADX INFO: renamed from: f */
    public final bji f188118f;

    /* JADX INFO: renamed from: g */
    public final wg61 f188119g = new wg61(new ne4(this, 23));

    public qf4(boolean z, boolean z2, boolean z3, pf4 pf4Var, boolean z4, bji bjiVar) {
        this.f188113a = z;
        this.f188114b = z2;
        this.f188115c = z3;
        this.f188116d = pf4Var;
        this.f188117e = z4;
        this.f188118f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72684a() {
        qf4 qf4Var = (qf4) this.f188119g.getValue();
        return qf4Var != null ? qf4Var.m72684a() : this.f188113a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72685b() {
        qf4 qf4Var = (qf4) this.f188119g.getValue();
        return qf4Var != null ? qf4Var.m72685b() : this.f188114b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72686c() {
        qf4 qf4Var = (qf4) this.f188119g.getValue();
        return qf4Var != null ? qf4Var.m72686c() : this.f188115c;
    }

    /* JADX INFO: renamed from: d */
    public final pf4 m72687d() {
        pf4 pf4VarM72687d;
        qf4 qf4Var = (qf4) this.f188119g.getValue();
        return (qf4Var == null || (pf4VarM72687d = qf4Var.m72687d()) == null) ? this.f188116d : pf4VarM72687d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72688e() {
        qf4 qf4Var = (qf4) this.f188119g.getValue();
        return qf4Var != null ? qf4Var.m72688e() : this.f188117e;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("active_line_size_indicator_enabled", "android-lyrics-textelement", m72684a());
        k8a k8aVar2 = new k8a("center_single_line_enabled", "android-lyrics-textelement", m72685b());
        k8a k8aVar3 = new k8a("instrumentation_container_support_enabled", "android-lyrics-textelement", m72686c());
        String str = m72687d().f176959a;
        pf4[] pf4VarArrValues = pf4.values();
        ArrayList arrayList = new ArrayList(pf4VarArrValues.length);
        for (pf4 pf4Var : pf4VarArrValues) {
            arrayList.add(pf4Var.f176959a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, new k8a("lyrics_type_style", "android-lyrics-textelement", str, arrayList), new k8a("single_line_touch_through_enabled", "android-lyrics-textelement", m72688e()));
    }
}

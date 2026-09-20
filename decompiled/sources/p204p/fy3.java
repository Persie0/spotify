package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fy3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final cy3 f74510a;

    /* JADX INFO: renamed from: b */
    public final int f74511b;

    /* JADX INFO: renamed from: c */
    public final fnk0 f74512c;

    /* JADX INFO: renamed from: d */
    public final bji f74513d;

    /* JADX INFO: renamed from: e */
    public final wg61 f74514e = new wg61(new f30(this, 8));

    /* JADX INFO: renamed from: f */
    public final wg61 f74515f = new wg61(new ey3(this, 0));

    public fy3(cy3 cy3Var, int i, fnk0 fnk0Var, bji bjiVar) {
        this.f74510a = cy3Var;
        this.f74511b = i;
        this.f74512c = fnk0Var;
        this.f74513d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final cy3 m43060a() {
        cy3 cy3VarM43060a;
        fy3 fy3Var = (fy3) this.f74515f.getValue();
        return (fy3Var == null || (cy3VarM43060a = fy3Var.m43060a()) == null) ? this.f74510a : cy3VarM43060a;
    }

    /* JADX INFO: renamed from: b */
    public final int m43061b() {
        fy3 fy3Var = (fy3) this.f74515f.getValue();
        return fy3Var != null ? fy3Var.m43061b() : this.f74511b;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m43060a().f43148a;
        cy3[] cy3VarArrValues = cy3.values();
        ArrayList arrayList = new ArrayList(cy3VarArrValues.length);
        for (cy3 cy3Var : cy3VarArrValues) {
            arrayList.add(cy3Var.f43148a);
        }
        return h6f.m46715L(new k8a("enable_cal", "android-cal-rollout-service", str, arrayList), new k8a("minimum_gearhead_version", "android-cal-rollout-service", m43061b(), 144000000, 300000000));
    }
}

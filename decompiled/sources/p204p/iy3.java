package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iy3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final hy3 f106830a;

    /* JADX INFO: renamed from: b */
    public final bji f106831b;

    /* JADX INFO: renamed from: c */
    public final wg61 f106832c = new wg61(new ey3(this, 1));

    public iy3(hy3 hy3Var, bji bjiVar) {
        this.f106830a = hy3Var;
        this.f106831b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final hy3 m51878a() {
        hy3 hy3VarM51878a;
        iy3 iy3Var = (iy3) this.f106832c.getValue();
        return (iy3Var == null || (hy3VarM51878a = iy3Var.m51878a()) == null) ? this.f106830a : hy3VarM51878a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m51878a().f96447a;
        hy3[] hy3VarArrValues = hy3.values();
        ArrayList arrayList = new ArrayList(hy3VarArrValues.length);
        for (hy3 hy3Var : hy3VarArrValues) {
            arrayList.add(hy3Var.f96447a);
        }
        return geg1.m44518y(new k8a("wrapped_routing_destination", "android-campaign-routing", str, arrayList));
    }
}

package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wa4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final va4 f249359a;

    /* JADX INFO: renamed from: b */
    public final bji f249360b;

    /* JADX INFO: renamed from: c */
    public final wg61 f249361c = new wg61(new ga4(this, 12));

    public wa4(va4 va4Var, bji bjiVar) {
        this.f249359a = va4Var;
        this.f249360b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final va4 m87573a() {
        va4 va4VarM87573a;
        wa4 wa4Var = (wa4) this.f249361c.getValue();
        return (wa4Var == null || (va4VarM87573a = wa4Var.m87573a()) == null) ? this.f249359a : va4VarM87573a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m87573a().f239117a;
        va4[] va4VarArrValues = va4.values();
        ArrayList arrayList = new ArrayList(va4VarArrValues.length);
        for (va4 va4Var : va4VarArrValues) {
            arrayList.add(va4Var.f239117a);
        }
        return geg1.m44518y(new k8a("car_detection_is_enabled", "android-libs-car-detection", str, arrayList));
    }
}

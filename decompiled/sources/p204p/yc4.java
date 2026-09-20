package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final xc4 f271368a;

    /* JADX INFO: renamed from: b */
    public final bji f271369b;

    /* JADX INFO: renamed from: c */
    public final wg61 f271370c = new wg61(new sb4(this, 27));

    public yc4(xc4 xc4Var, bji bjiVar) {
        this.f271368a = xc4Var;
        this.f271369b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final xc4 m93331a() {
        xc4 xc4VarM93331a;
        yc4 yc4Var = (yc4) this.f271370c.getValue();
        return (yc4Var == null || (xc4VarM93331a = yc4Var.m93331a()) == null) ? this.f271368a : xc4VarM93331a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m93331a().f260082a;
        xc4[] xc4VarArrValues = xc4.values();
        ArrayList arrayList = new ArrayList(xc4VarArrValues.length);
        for (xc4 xc4Var : xc4VarArrValues) {
            arrayList.add(xc4Var.f260082a);
        }
        return geg1.m44518y(new k8a("quickplay_mix", "android-libs-quickplay", str, arrayList));
    }
}

package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final b34 f33548a;

    /* JADX INFO: renamed from: b */
    public final bji f33549b;

    /* JADX INFO: renamed from: c */
    public final wg61 f33550c = new wg61(new u14(this, 12));

    public c34(b34 b34Var, bji bjiVar) {
        this.f33548a = b34Var;
        this.f33549b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final b34 m31359a() {
        b34 b34VarM31359a;
        c34 c34Var = (c34) this.f33550c.getValue();
        return (c34Var == null || (b34VarM31359a = c34Var.m31359a()) == null) ? this.f33548a : b34VarM31359a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m31359a().f22881a;
        b34[] b34VarArrValues = b34.values();
        ArrayList arrayList = new ArrayList(b34VarArrValues.length);
        for (b34 b34Var : b34VarArrValues) {
            arrayList.add(b34Var.f22881a);
        }
        return geg1.m44518y(new k8a("player_implementation", "android-endless-sillywalk-commentaryplayerimpl", str, arrayList));
    }
}

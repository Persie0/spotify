package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final b74 f34739a;

    /* JADX INFO: renamed from: b */
    public final bji f34740b;

    /* JADX INFO: renamed from: c */
    public final wg61 f34741c = new wg61(new o54(this, 27));

    public c74(b74 b74Var, bji bjiVar) {
        this.f34739a = b74Var;
        this.f34740b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final b74 m31680a() {
        b74 b74VarM31680a;
        c74 c74Var = (c74) this.f34741c.getValue();
        return (c74Var == null || (b74VarM31680a = c74Var.m31680a()) == null) ? this.f34739a : b74VarM31680a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m31680a().f24157a;
        b74[] b74VarArrValues = b74.values();
        ArrayList arrayList = new ArrayList(b74VarArrValues.length);
        for (b74 b74Var : b74VarArrValues) {
            arrayList.add(b74Var.f24157a);
        }
        return Collections.singletonList(new k8a("header_variant", "android-feature-sidedrawer", str, arrayList));
    }
}

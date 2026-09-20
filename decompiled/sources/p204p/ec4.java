package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ec4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final dc4 f58221a;

    /* JADX INFO: renamed from: b */
    public final bji f58222b;

    /* JADX INFO: renamed from: c */
    public final wg61 f58223c = new wg61(new sb4(this, 10));

    public ec4(dc4 dc4Var, bji bjiVar) {
        this.f58221a = dc4Var;
        this.f58222b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final dc4 m38472a() {
        dc4 dc4VarM38472a;
        ec4 ec4Var = (ec4) this.f58223c.getValue();
        return (ec4Var == null || (dc4VarM38472a = ec4Var.m38472a()) == null) ? this.f58221a : dc4VarM38472a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m38472a().f47421a;
        dc4[] dc4VarArrValues = dc4.values();
        ArrayList arrayList = new ArrayList(dc4VarArrValues.length);
        for (dc4 dc4Var : dc4VarArrValues) {
            arrayList.add(dc4Var.f47421a);
        }
        return Collections.singletonList(new k8a("persistence_mode", "android-libs-nowplaying-elements-videoqualityselection", str, arrayList));
    }
}

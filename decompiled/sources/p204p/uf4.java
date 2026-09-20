package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class uf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final tf4 f229671a;

    /* JADX INFO: renamed from: b */
    public final bji f229672b;

    /* JADX INFO: renamed from: c */
    public final wg61 f229673c;

    public uf4(tf4 tf4Var, bji bjiVar) {
        this.f229671a = tf4Var;
        this.f229672b = bjiVar;
        this.f229673c = new wg61(new ne4(this, 25));
    }

    /* JADX INFO: renamed from: a */
    public final tf4 m82951a() {
        tf4 tf4VarM82951a;
        uf4 uf4Var = (uf4) this.f229673c.getValue();
        return (uf4Var == null || (tf4VarM82951a = uf4Var.m82951a()) == null) ? this.f229671a : tf4VarM82951a;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m82951a().f219847a;
        tf4[] tf4VarArrValues = tf4.values();
        ArrayList arrayList = new ArrayList(tf4VarArrValues.length);
        for (tf4 tf4Var : tf4VarArrValues) {
            arrayList.add(tf4Var.f219847a);
        }
        return Collections.singletonList(new k8a("mark_as_played_endpoint_options", "android-markasplayed", str, arrayList));
    }

    public uf4(bji bjiVar) {
        this(tf4.LEGACY, bjiVar);
    }
}

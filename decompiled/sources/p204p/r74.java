package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class r74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f196425a;

    /* JADX INFO: renamed from: b */
    public final q74 f196426b;

    /* JADX INFO: renamed from: c */
    public final bji f196427c;

    /* JADX INFO: renamed from: d */
    public final wg61 f196428d = new wg61(new f74(this, 10));

    public r74(boolean z, q74 q74Var, bji bjiVar) {
        this.f196425a = z;
        this.f196426b = q74Var;
        this.f196427c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final q74 m74884a() {
        q74 q74VarM74884a;
        r74 r74Var = (r74) this.f196428d.getValue();
        return (r74Var == null || (q74VarM74884a = r74Var.m74884a()) == null) ? this.f196426b : q74VarM74884a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74885b() {
        r74 r74Var = (r74) this.f196428d.getValue();
        return r74Var != null ? r74Var.m74885b() : this.f196425a;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("is_page_enabled", "android-feature-upcoming-releases-hub", m74885b());
        String str = m74884a().f186026a;
        q74[] q74VarArrValues = q74.values();
        ArrayList arrayList = new ArrayList(q74VarArrValues.length);
        for (q74 q74Var : q74VarArrValues) {
            arrayList.add(q74Var.f186026a);
        }
        return h6f.m46715L(k8aVar, new k8a("prerelease_card_presave_content", "android-feature-upcoming-releases-hub", str, arrayList));
    }
}

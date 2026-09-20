package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hg4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f91019a;

    /* JADX INFO: renamed from: b */
    public final gg4 f91020b;

    /* JADX INFO: renamed from: c */
    public final bji f91021c;

    /* JADX INFO: renamed from: d */
    public final wg61 f91022d = new wg61(new ne4(this, 28));

    public hg4(boolean z, gg4 gg4Var, bji bjiVar) {
        this.f91019a = z;
        this.f91020b = gg4Var;
        this.f91021c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47400a() {
        hg4 hg4Var = (hg4) this.f91022d.getValue();
        return hg4Var != null ? hg4Var.m47400a() : this.f91019a;
    }

    /* JADX INFO: renamed from: b */
    public final gg4 m47401b() {
        gg4 gg4VarM47401b;
        hg4 hg4Var = (hg4) this.f91022d.getValue();
        return (hg4Var == null || (gg4VarM47401b = hg4Var.m47401b()) == null) ? this.f91020b : gg4VarM47401b;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("log_image_loading_failures", "android-media-session-image-loader", m47400a());
        String str = m47401b().f79532a;
        gg4[] gg4VarArrValues = gg4.values();
        ArrayList arrayList = new ArrayList(gg4VarArrValues.length);
        for (gg4 gg4Var : gg4VarArrValues) {
            arrayList.add(gg4Var.f79532a);
        }
        return h6f.m46715L(k8aVar, new k8a("quasar_loader", "android-media-session-image-loader", str, arrayList));
    }
}

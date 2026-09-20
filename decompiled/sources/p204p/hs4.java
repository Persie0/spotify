package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f94603a;

    /* JADX INFO: renamed from: b */
    public final boolean f94604b;

    /* JADX INFO: renamed from: c */
    public final bji f94605c;

    /* JADX INFO: renamed from: d */
    public final wg61 f94606d = new wg61(new zr4(this, 6));

    public hs4(boolean z, boolean z2, bji bjiVar) {
        this.f94603a = z;
        this.f94604b = z2;
        this.f94605c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48416a() {
        hs4 hs4Var = (hs4) this.f94606d.getValue();
        return hs4Var != null ? hs4Var.m48416a() : this.f94603a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m48417b() {
        hs4 hs4Var = (hs4) this.f94606d.getValue();
        return hs4Var != null ? hs4Var.m48417b() : this.f94604b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_fail_on_low_precision", "android-transcript-passthrough", m48416a()), new k8a("enable_passthrough_service", "android-transcript-passthrough", m48417b()));
    }
}

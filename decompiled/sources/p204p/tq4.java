package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f222669a;

    /* JADX INFO: renamed from: b */
    public final boolean f222670b;

    /* JADX INFO: renamed from: c */
    public final boolean f222671c;

    /* JADX INFO: renamed from: d */
    public final int f222672d;

    /* JADX INFO: renamed from: e */
    public final int f222673e;

    /* JADX INFO: renamed from: f */
    public final bji f222674f;

    /* JADX INFO: renamed from: g */
    public final wg61 f222675g = new wg61(new kp4(this, 25));

    public tq4(boolean z, boolean z2, boolean z3, int i, int i2, bji bjiVar) {
        this.f222669a = z;
        this.f222670b = z2;
        this.f222671c = z3;
        this.f222672d = i;
        this.f222673e = i2;
        this.f222674f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81297a() {
        tq4 tq4Var = (tq4) this.f222675g.getValue();
        return tq4Var != null ? tq4Var.m81297a() : this.f222669a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81298b() {
        tq4 tq4Var = (tq4) this.f222675g.getValue();
        return tq4Var != null ? tq4Var.m81298b() : this.f222670b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81299c() {
        tq4 tq4Var = (tq4) this.f222675g.getValue();
        return tq4Var != null ? tq4Var.m81299c() : this.f222671c;
    }

    /* JADX INFO: renamed from: d */
    public final int m81300d() {
        tq4 tq4Var = (tq4) this.f222675g.getValue();
        return tq4Var != null ? tq4Var.m81300d() : this.f222672d;
    }

    /* JADX INFO: renamed from: e */
    public final int m81301e() {
        tq4 tq4Var = (tq4) this.f222675g.getValue();
        return tq4Var != null ? tq4Var.m81301e() : this.f222673e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_first_note_bottom_sheet", "android-tasteprofile-page", m81297a()), new k8a("enable_notes", "android-tasteprofile-page", m81298b()), new k8a("enable_processing_status", "android-tasteprofile-page", m81299c()), new k8a("polling_interval_seconds", "android-tasteprofile-page", m81300d(), 1, 60), new k8a("polling_max_attempts", "android-tasteprofile-page", m81301e(), 0, 100));
    }
}

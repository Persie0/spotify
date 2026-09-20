package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f68311a;

    /* JADX INFO: renamed from: b */
    public final boolean f68312b;

    /* JADX INFO: renamed from: c */
    public final boolean f68313c;

    /* JADX INFO: renamed from: d */
    public final bji f68314d;

    /* JADX INFO: renamed from: e */
    public final wg61 f68315e = new wg61(new dd4(this, 1));

    public fd4(int i, bji bjiVar, boolean z, boolean z2) {
        this.f68311a = i;
        this.f68312b = z;
        this.f68313c = z2;
        this.f68314d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m41350a() {
        fd4 fd4Var = (fd4) this.f68315e.getValue();
        return fd4Var != null ? fd4Var.m41350a() : this.f68311a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41351b() {
        fd4 fd4Var = (fd4) this.f68315e.getValue();
        return fd4Var != null ? fd4Var.m41351b() : this.f68312b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41352c() {
        fd4 fd4Var = (fd4) this.f68315e.getValue();
        return fd4Var != null ? fd4Var.m41352c() : this.f68313c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("number_of_retries", "android-libs-storage", m41350a(), 0, 15), new k8a("touch_dirs_on_background", "android-libs-storage", m41351b()), new k8a("wait_for_mounted_storage", "android-libs-storage", m41352c()));
    }
}

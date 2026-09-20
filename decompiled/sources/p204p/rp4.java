package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f201413a;

    /* JADX INFO: renamed from: b */
    public final int f201414b;

    /* JADX INFO: renamed from: c */
    public final int f201415c;

    /* JADX INFO: renamed from: d */
    public final int f201416d;

    /* JADX INFO: renamed from: e */
    public final boolean f201417e;

    /* JADX INFO: renamed from: f */
    public final bji f201418f;

    /* JADX INFO: renamed from: g */
    public final wg61 f201419g = new wg61(new kp4(this, 3));

    public rp4(int i, int i2, int i3, int i4, boolean z, bji bjiVar) {
        this.f201413a = i;
        this.f201414b = i2;
        this.f201415c = i3;
        this.f201416d = i4;
        this.f201417e = z;
        this.f201418f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m76097a() {
        rp4 rp4Var = (rp4) this.f201419g.getValue();
        return rp4Var != null ? rp4Var.m76097a() : this.f201413a;
    }

    /* JADX INFO: renamed from: b */
    public final int m76098b() {
        rp4 rp4Var = (rp4) this.f201419g.getValue();
        return rp4Var != null ? rp4Var.m76098b() : this.f201414b;
    }

    /* JADX INFO: renamed from: c */
    public final int m76099c() {
        rp4 rp4Var = (rp4) this.f201419g.getValue();
        return rp4Var != null ? rp4Var.m76099c() : this.f201415c;
    }

    /* JADX INFO: renamed from: d */
    public final int m76100d() {
        rp4 rp4Var = (rp4) this.f201419g.getValue();
        return rp4Var != null ? rp4Var.m76100d() : this.f201416d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m76101e() {
        rp4 rp4Var = (rp4) this.f201419g.getValue();
        return rp4Var != null ? rp4Var.m76101e() : this.f201417e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("read_ahead_batch_size_kbytes", "android-system-contentdelivery", m76097a(), 0, 3072), new k8a("read_ahead_initial_kbytes", "android-system-contentdelivery", m76098b(), 0, 3072), new k8a("read_ahead_minimum_capacity_kbytes", "android-system-contentdelivery", m76099c(), 0, 3072), new k8a("segment_cache_max_size_bytes", "android-system-contentdelivery", m76100d(), 0, 104857600), new k8a("use_waiting_transport_proxy", "android-system-contentdelivery", m76101e()));
    }
}

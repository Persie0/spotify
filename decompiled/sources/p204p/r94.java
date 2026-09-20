package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f196904a;

    /* JADX INFO: renamed from: b */
    public final int f196905b;

    /* JADX INFO: renamed from: c */
    public final bji f196906c;

    /* JADX INFO: renamed from: d */
    public final wg61 f196907d = new wg61(new f74(this, 25));

    public r94(int i, bji bjiVar, boolean z) {
        this.f196904a = z;
        this.f196905b = i;
        this.f196906c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75010a() {
        r94 r94Var = (r94) this.f196907d.getValue();
        return r94Var != null ? r94Var.m75010a() : this.f196904a;
    }

    /* JADX INFO: renamed from: b */
    public final int m75011b() {
        r94 r94Var = (r94) this.f196907d.getValue();
        return r94Var != null ? r94Var.m75011b() : this.f196905b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("clear_memory_cache_on_trim_enabled", "android-image-loader", m75010a()), new k8a("image_load_instrumentation_sampling_percentage", "android-image-loader", m75011b(), 0, 100));
    }
}

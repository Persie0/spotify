package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f34072a;

    /* JADX INFO: renamed from: b */
    public final boolean f34073b;

    /* JADX INFO: renamed from: c */
    public final fnk0 f34074c;

    /* JADX INFO: renamed from: d */
    public final bji f34075d;

    /* JADX INFO: renamed from: e */
    public final wg61 f34076e;

    /* JADX INFO: renamed from: f */
    public final wg61 f34077f;

    public c54(boolean z, boolean z2, fnk0 fnk0Var, bji bjiVar) {
        this.f34072a = z;
        this.f34073b = z2;
        this.f34074c = fnk0Var;
        this.f34075d = bjiVar;
        this.f34076e = new wg61(new b54(this, 1));
        this.f34077f = new wg61(new b54(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31454a() {
        c54 c54Var = (c54) this.f34077f.getValue();
        return c54Var != null ? c54Var.m31454a() : this.f34072a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31455b() {
        c54 c54Var = (c54) this.f34077f.getValue();
        return c54Var != null ? c54Var.m31455b() : this.f34073b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("debug_is_in_kids_mode", "android-feature-kidsmode", m31454a()), new k8a("kids_mode_enabled", "android-feature-kidsmode", m31455b()));
    }

    public c54(fnk0 fnk0Var, bji bjiVar) {
        this(false, false, fnk0Var, bjiVar);
    }
}

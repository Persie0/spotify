package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class al60 {

    /* JADX INFO: renamed from: a */
    public final dwt f16784a;

    /* JADX INFO: renamed from: b */
    public boolean f16785b;

    public al60(ktz0 ktz0Var) {
        this.f16784a = new dwt(ktz0Var, new mh50(2, this, al60.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0, 1));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m26270a(al60 al60Var, ktz0 ktz0Var, int i) {
        al60Var.getClass();
        boolean z = !ktz0Var.mo33227j(i) && ktz0Var.mo33225h(i).mo57365b();
        al60Var.f16785b = z;
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26271b() {
        return this.f16785b;
    }

    /* JADX INFO: renamed from: c */
    public final void m26272c(int i) {
        this.f16784a.m37172b(i);
    }

    /* JADX INFO: renamed from: d */
    public final int m26273d() {
        return this.f16784a.m37173c();
    }
}

package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dzx0 implements c9y {

    /* JADX INFO: renamed from: a */
    public final i4t0 f54796a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f54797b;

    public dzx0(i4t0 i4t0Var, i4t0 i4t0Var2) {
        this.f54796a = i4t0Var;
        this.f54797b = i4t0Var2;
    }

    @Override // p204p.i4t0
    public final Object get() {
        o7d1 o7d1Var = new o7d1();
        t36 t36Var = new t36(29);
        u08 u08Var = u08.f225403f;
        if (u08Var != null) {
            return new czx0(o7d1Var, t36Var, u08Var, (ogy0) this.f54796a.get(), this.f54797b);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

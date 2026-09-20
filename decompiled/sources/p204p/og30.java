package p204p;

/* JADX INFO: loaded from: classes15.dex */
public final class og30 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final km6 f164982a;

    /* JADX INFO: renamed from: b */
    public final km6 f164983b;

    public og30(km6 km6Var, km6 km6Var2) {
        this.f164982a = km6Var;
        this.f164983b = km6Var2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f164982a.close();
    }
}

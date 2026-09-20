package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ba00 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f25060a;

    /* JADX INFO: renamed from: b */
    public final Throwable f25061b;

    public ba00(int i, Throwable th) {
        super(th);
        this.f25060a = i;
        this.f25061b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f25061b;
    }
}

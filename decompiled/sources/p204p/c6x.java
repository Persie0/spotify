package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c6x extends d6x {

    /* JADX INFO: renamed from: c */
    public final Runnable f34639c;

    public c6x(Runnable runnable, long j) {
        super(j);
        this.f34639c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34639c.run();
    }

    @Override // p204p.d6x
    public final String toString() {
        return super.toString() + this.f34639c;
    }
}

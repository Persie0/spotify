package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b6x extends d6x {

    /* JADX INFO: renamed from: c */
    public final hqb f24067c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f6x f24068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6x(f6x f6xVar, long j, hqb hqbVar) {
        super(j);
        this.f24068d = f6xVar;
        this.f24067c = hqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24067c.m48208B(this.f24068d, w2a1.f247311a);
    }

    @Override // p204p.d6x
    public final String toString() {
        return super.toString() + this.f24067c;
    }
}

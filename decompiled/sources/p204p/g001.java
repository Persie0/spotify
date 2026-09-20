package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g001 implements t160 {

    /* JADX INFO: renamed from: a */
    public final c6q f75229a;

    /* JADX INFO: renamed from: b */
    public final mb60 f75230b;

    public g001(c6q c6qVar, mb60 mb60Var) {
        this.f75229a = c6qVar;
        this.f75230b = mb60Var;
    }

    @Override // p204p.t160
    public final void start() {
        this.f75229a.f34599a.add(this.f75230b);
    }

    @Override // p204p.t160
    public final void stop() {
        this.f75229a.f34599a.remove(this.f75230b);
    }
}

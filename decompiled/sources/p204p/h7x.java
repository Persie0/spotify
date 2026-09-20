package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h7x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j7x f88560b;

    public /* synthetic */ h7x(j7x j7xVar, int i) {
        this.f88559a = i;
        this.f88560b = j7xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f88559a) {
            case 0:
                j7x j7xVar = this.f88560b;
                if (j7xVar.m52663b().f167635e) {
                    j7xVar.m52662a().m53789a();
                }
                break;
            default:
                ((Runnable) this.f88560b.f109694J.getValue()).run();
                break;
        }
    }
}

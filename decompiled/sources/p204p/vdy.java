package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vdy extends cv61 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gnx0 f240525e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wdy f240526f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdy(String str, gnx0 gnx0Var, wdy wdyVar) {
        super(str, true);
        this.f240525e = gnx0Var;
        this.f240526f = wdyVar;
    }

    @Override // p204p.cv61
    /* JADX INFO: renamed from: a */
    public final long mo33978a() throws InterruptedException {
        fnx0 fnx0Var;
        gnx0 gnx0Var = this.f240525e;
        try {
            fnx0Var = gnx0Var.mo28598f();
        } catch (Throwable th) {
            fnx0Var = new fnx0(gnx0Var, th, 2);
        }
        wdy wdyVar = this.f240526f;
        if (!wdyVar.f250381e.contains(gnx0Var)) {
            return -1L;
        }
        wdyVar.f250382f.put(fnx0Var);
        return -1L;
    }
}

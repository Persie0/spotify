package p204p;

/* JADX INFO: loaded from: classes.dex */
public class ujr extends ftq {

    /* JADX INFO: renamed from: m */
    public int f231081m;

    public ujr(lud1 lud1Var) {
        super(lud1Var);
        if (lud1Var instanceof l730) {
            this.f73269e = 2;
        } else {
            this.f73269e = 3;
        }
    }

    @Override // p204p.ftq
    /* JADX INFO: renamed from: d */
    public final void mo42686d(int i) {
        if (this.f73274j) {
            return;
        }
        this.f73274j = true;
        this.f73271g = i;
        for (ctq ctqVar : this.f73275k) {
            ctqVar.mo29208a(ctqVar);
        }
    }
}

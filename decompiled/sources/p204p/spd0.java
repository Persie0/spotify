package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class spd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pqd0 f212818b;

    public /* synthetic */ spd0(pqd0 pqd0Var, int i) {
        this.f212817a = i;
        this.f212818b = pqd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f212817a) {
            case 0:
                pqd0 pqd0Var = this.f212818b;
                pqd0Var.m70641i(new spd0(pqd0Var, 1));
                break;
            default:
                this.f212818b.m70645m();
                break;
        }
    }
}

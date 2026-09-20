package p204p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta31 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f218447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f218448c;

    public /* synthetic */ ta31(int i, Object obj, Object obj2) {
        this.f218446a = i;
        this.f218447b = obj;
        this.f218448c = obj2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f218446a) {
            case 0:
                gh00 gh00Var = (gh00) this.f218447b;
                gh00 gh00Var2 = (gh00) this.f218448c;
                gh00Var.invoke(obj);
                gh00Var2.invoke(obj);
                break;
            case 1:
                gh00 gh00Var3 = (gh00) this.f218447b;
                gh00 gh00Var4 = (gh00) this.f218448c;
                gh00Var3.invoke(obj);
                gh00Var4.invoke(obj);
                break;
            default:
                wqr wqrVar = (wqr) this.f218447b;
                nqr nqrVar = (nqr) this.f218448c;
                synchronized (wqrVar) {
                    nqrVar.m65455c();
                    break;
                }
                break;
        }
        return w2a1.f247311a;
    }
}

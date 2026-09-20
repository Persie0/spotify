package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class je0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f111416b;

    public /* synthetic */ je0(int i, eh00 eh00Var) {
        this.f111415a = i;
        this.f111416b = eh00Var;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f111415a) {
            case 0:
                this.f111416b.invoke();
                break;
            case 1:
                this.f111416b.invoke();
                break;
            default:
                eh00 eh00Var = this.f111416b;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                break;
        }
    }
}

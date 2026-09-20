package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f39 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rb71 f65416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f65417c;

    public /* synthetic */ f39(rb71 rb71Var, gh00 gh00Var, int i) {
        this.f65415a = i;
        this.f65416b = rb71Var;
        this.f65417c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f65415a) {
            case 0:
                db71 db71Var = (db71) obj;
                rb71 rb71Var = this.f65416b;
                if (rb71Var != null) {
                    rb71Var.f197520a.setValue(db71Var);
                }
                gh00 gh00Var = this.f65417c;
                if (gh00Var != null) {
                    gh00Var.invoke(db71Var);
                }
                return w2a1.f247311a;
            default:
                rb71 rb71Var2 = this.f65416b;
                gb31 gb31Var = rb71Var2.f197522c;
                gh00 gh00Var2 = this.f65417c;
                gb31Var.add(gh00Var2);
                return new qlt0(10, rb71Var2, gh00Var2);
        }
    }
}

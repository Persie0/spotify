package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bmz extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f28661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f28662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bmz(eh00 eh00Var, Class cls, int i) {
        super(0);
        this.f28660a = i;
        this.f28661b = eh00Var;
        this.f28662c = cls;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f28660a) {
            case 0:
                qy8 qy8Var = (qy8) this.f28661b.invoke();
                if ((qy8Var instanceof cut) || (qy8Var instanceof cfo)) {
                    return qy8Var;
                }
                throw new IllegalArgumentException(edb.m38566o("Unsupported element ", qy8Var.getClass().getName(), " for ", this.f28662c.getName()).toString());
            default:
                qy8 qy8Var2 = (qy8) this.f28661b.invoke();
                if ((qy8Var2 instanceof cut) || (qy8Var2 instanceof cfo)) {
                    return qy8Var2;
                }
                throw new IllegalArgumentException(edb.m38566o("Unsupported element ", qy8Var2.getClass().getName(), " for ", this.f28662c.getName()).toString());
        }
    }
}

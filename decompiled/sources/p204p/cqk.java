package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cqk extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f40912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f40913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqk(int i, Object obj, gh00 gh00Var) {
        super(0);
        this.f40911a = i;
        this.f40912b = gh00Var;
        this.f40913c = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f40911a) {
            case 0:
                return this.f40912b.invoke(this.f40913c);
            case 1:
                this.f40912b.invoke(this.f40913c);
                return w2a1.f247311a;
            default:
                this.f40912b.invoke(this.f40913c);
                return w2a1.f247311a;
        }
    }
}

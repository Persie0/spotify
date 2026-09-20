package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qi10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui10 f188896b;

    /* JADX INFO: renamed from: c */
    public int f188897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi10(ui10 ui10Var, ibk ibkVar) {
        super(ibkVar);
        this.f188896b = ui10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188895a = obj;
        this.f188897c |= Integer.MIN_VALUE;
        Object objM83171a = this.f188896b.m83171a(this);
        return objM83171a == yuk.f276404a ? objM83171a : new s6x0(objM83171a);
    }
}

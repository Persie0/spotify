package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ne41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f152921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oe41 f152922b;

    /* JADX INFO: renamed from: c */
    public int f152923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne41(oe41 oe41Var, ibk ibkVar) {
        super(ibkVar);
        this.f152922b = oe41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152921a = obj;
        this.f152923c |= Integer.MIN_VALUE;
        Object objM66790a = this.f152922b.m66790a(this);
        return objM66790a == yuk.f276404a ? objM66790a : new s6x0(objM66790a);
    }
}

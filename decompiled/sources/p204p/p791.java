package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p791 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r791 f174627b;

    /* JADX INFO: renamed from: c */
    public int f174628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p791(r791 r791Var, ibk ibkVar) {
        super(ibkVar);
        this.f174627b = r791Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174626a = obj;
        this.f174628c |= Integer.MIN_VALUE;
        Object objM74895c = this.f174627b.m74895c(null, null, null, null, this);
        return objM74895c == yuk.f276404a ? objM74895c : new s6x0(objM74895c);
    }
}

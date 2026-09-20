package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kja1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lja1 f123287b;

    /* JADX INFO: renamed from: c */
    public int f123288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kja1(lja1 lja1Var, ibk ibkVar) {
        super(ibkVar);
        this.f123287b = lja1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123286a = obj;
        this.f123288c |= Integer.MIN_VALUE;
        return this.f123287b.m59143b(null, null, this);
    }
}

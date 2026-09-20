package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s49 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u49 f205516b;

    /* JADX INFO: renamed from: c */
    public int f205517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s49(u49 u49Var, ibk ibkVar) {
        super(ibkVar);
        this.f205516b = u49Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205515a = obj;
        this.f205517c |= Integer.MIN_VALUE;
        Object objM82314a = u49.m82314a(this.f205516b, null, null, 0, null, this);
        return objM82314a == yuk.f276404a ? objM82314a : new s6x0(objM82314a);
    }
}

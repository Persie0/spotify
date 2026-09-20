package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s2r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v2r0 f205055b;

    /* JADX INFO: renamed from: c */
    public int f205056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2r0(v2r0 v2r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f205055b = v2r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205054a = obj;
        this.f205056c |= Integer.MIN_VALUE;
        Object objM84525a = this.f205055b.m84525a(null, this);
        return objM84525a == yuk.f276404a ? objM84525a : new s6x0(objM84525a);
    }
}

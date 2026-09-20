package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j3g0 f76211b;

    /* JADX INFO: renamed from: c */
    public int f76212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3g0(j3g0 j3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f76211b = j3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76210a = obj;
        this.f76212c |= Integer.MIN_VALUE;
        return this.f76211b.m52259c(this);
    }
}

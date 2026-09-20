package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ up0 f222375b;

    /* JADX INFO: renamed from: c */
    public int f222376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(up0 up0Var, ibk ibkVar) {
        super(ibkVar);
        this.f222375b = up0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222374a = obj;
        this.f222376c |= Integer.MIN_VALUE;
        return this.f222375b.m83640a(null, false, this);
    }
}

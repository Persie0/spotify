package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class csj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dsj0 f41623b;

    /* JADX INFO: renamed from: c */
    public int f41624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csj0(dsj0 dsj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f41623b = dsj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41622a = obj;
        this.f41624c |= Integer.MIN_VALUE;
        return this.f41623b.m36776a(null, this);
    }
}

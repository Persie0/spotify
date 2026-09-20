package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xnv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ynv0 f263716b;

    /* JADX INFO: renamed from: c */
    public int f263717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnv0(ynv0 ynv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f263716b = ynv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263715a = obj;
        this.f263717c |= Integer.MIN_VALUE;
        return this.f263716b.m94262c(null, null, this);
    }
}

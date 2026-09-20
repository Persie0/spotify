package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r921 f175130b;

    /* JADX INFO: renamed from: c */
    public int f175131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p921(r921 r921Var, ibk ibkVar) {
        super(ibkVar);
        this.f175130b = r921Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175129a = obj;
        this.f175131c |= Integer.MIN_VALUE;
        return this.f175130b.m75008c(null, this);
    }
}

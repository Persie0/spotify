package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f216403b;

    /* JADX INFO: renamed from: c */
    public int f216404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t210(x210 x210Var, ibk ibkVar) {
        super(ibkVar);
        this.f216403b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216402a = obj;
        this.f216404c |= Integer.MIN_VALUE;
        return this.f216403b.m89701d(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h090 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n090 f86183b;

    /* JADX INFO: renamed from: c */
    public int f86184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h090(n090 n090Var, ibk ibkVar) {
        super(ibkVar);
        this.f86183b = n090Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86182a = obj;
        this.f86184c |= Integer.MIN_VALUE;
        return this.f86183b.m63312i(null, this);
    }
}

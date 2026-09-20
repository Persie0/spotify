package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f225954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f225955b;

    /* JADX INFO: renamed from: c */
    public int f225956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u210(x210 x210Var, ibk ibkVar) {
        super(ibkVar);
        this.f225955b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225954a = obj;
        this.f225956c |= Integer.MIN_VALUE;
        return this.f225955b.m89702e(null, null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gy50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nc00 f85474b;

    /* JADX INFO: renamed from: c */
    public int f85475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy50(nc00 nc00Var, ibk ibkVar) {
        super(ibkVar);
        this.f85474b = nc00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85473a = obj;
        this.f85475c |= Integer.MIN_VALUE;
        return this.f85474b.m64105b(null, this);
    }
}

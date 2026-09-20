package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hl2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f92587b;

    /* JADX INFO: renamed from: c */
    public int f92588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f92587b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92586a = obj;
        this.f92588c |= Integer.MIN_VALUE;
        return this.f92587b.m70242c(null, this);
    }
}

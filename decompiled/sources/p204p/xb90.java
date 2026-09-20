package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f259872b;

    /* JADX INFO: renamed from: c */
    public int f259873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f259872b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259871a = obj;
        this.f259873c |= Integer.MIN_VALUE;
        return this.f259872b.m44303c(this);
    }
}

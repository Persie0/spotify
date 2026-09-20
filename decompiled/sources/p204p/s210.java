package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f204873b;

    /* JADX INFO: renamed from: c */
    public int f204874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s210(x210 x210Var, ibk ibkVar) {
        super(ibkVar);
        this.f204873b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204872a = obj;
        this.f204874c |= Integer.MIN_VALUE;
        return this.f204873b.m89700c(null, this);
    }
}

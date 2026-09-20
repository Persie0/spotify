package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x670 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y670 f258605b;

    /* JADX INFO: renamed from: c */
    public int f258606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x670(y670 y670Var, ibk ibkVar) {
        super(ibkVar);
        this.f258605b = y670Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258604a = obj;
        this.f258606c |= Integer.MIN_VALUE;
        return this.f258605b.m92950a(null, this);
    }
}

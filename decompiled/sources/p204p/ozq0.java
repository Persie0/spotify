package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ozq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public amf0 f172343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f172344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pzq0 f172345c;

    /* JADX INFO: renamed from: d */
    public int f172346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozq0(pzq0 pzq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f172345c = pzq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172344b = obj;
        this.f172346d |= Integer.MIN_VALUE;
        return this.f172345c.m71765f(null, this);
    }
}

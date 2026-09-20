package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p0w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f172823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ww8 f172824b;

    /* JADX INFO: renamed from: c */
    public int f172825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0w0(ww8 ww8Var, ibk ibkVar) {
        super(ibkVar);
        this.f172824b = ww8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172823a = obj;
        this.f172825c |= Integer.MIN_VALUE;
        return this.f172824b.m89176c(0.0f, this);
    }
}

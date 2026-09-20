package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t87 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v87 f217985b;

    /* JADX INFO: renamed from: c */
    public int f217986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t87(v87 v87Var, ibk ibkVar) {
        super(ibkVar);
        this.f217985b = v87Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217984a = obj;
        this.f217986c |= Integer.MIN_VALUE;
        return v87.m84910a(this.f217985b, this);
    }
}

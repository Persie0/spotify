package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ww81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw81 f255731b;

    /* JADX INFO: renamed from: c */
    public int f255732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww81(yw81 yw81Var, ibk ibkVar) {
        super(ibkVar);
        this.f255731b = yw81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255730a = obj;
        this.f255732c |= Integer.MIN_VALUE;
        return this.f255731b.m94785d(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vs01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ws01 f244306b;

    /* JADX INFO: renamed from: c */
    public int f244307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs01(ws01 ws01Var, ibk ibkVar) {
        super(ibkVar);
        this.f244306b = ws01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244305a = obj;
        this.f244307c |= Integer.MIN_VALUE;
        return this.f244306b.m88872a(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f87224a;

    /* JADX INFO: renamed from: b */
    public r431 f87225b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f87226c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j3g0 f87227d;

    /* JADX INFO: renamed from: e */
    public int f87228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g0(j3g0 j3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f87227d = j3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87226c = obj;
        this.f87228e |= Integer.MIN_VALUE;
        return this.f87227d.m52260d(null, this);
    }
}

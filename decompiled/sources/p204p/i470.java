package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f98444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j470 f98445b;

    /* JADX INFO: renamed from: c */
    public int f98446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i470(j470 j470Var, ibk ibkVar) {
        super(ibkVar);
        this.f98445b = j470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98444a = obj;
        this.f98446c |= Integer.MIN_VALUE;
        return this.f98445b.m52330d(null, this);
    }
}

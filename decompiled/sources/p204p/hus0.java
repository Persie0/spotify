package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hus0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f95454a;

    /* JADX INFO: renamed from: b */
    public boolean f95455b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f95456c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ius0 f95457d;

    /* JADX INFO: renamed from: e */
    public int f95458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hus0(ius0 ius0Var, ibk ibkVar) {
        super(ibkVar);
        this.f95457d = ius0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95456c = obj;
        this.f95458e |= Integer.MIN_VALUE;
        return ius0.m51699d(this.f95457d, null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h0c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public u4z0 f86213a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f86214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i0c0 f86215c;

    /* JADX INFO: renamed from: d */
    public int f86216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0c0(i0c0 i0c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f86215c = i0c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86214b = obj;
        this.f86216d |= Integer.MIN_VALUE;
        return this.f86215c.m49355a(null, this);
    }
}

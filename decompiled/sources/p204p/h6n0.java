package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h6n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i6n0 f88205b;

    /* JADX INFO: renamed from: c */
    public int f88206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6n0(i6n0 i6n0Var, ibk ibkVar) {
        super(ibkVar);
        this.f88205b = i6n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88204a = obj;
        this.f88206c |= Integer.MIN_VALUE;
        return this.f88205b.m49812a(null, this);
    }
}

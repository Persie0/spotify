package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qy71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dz31 f193848b;

    /* JADX INFO: renamed from: c */
    public int f193849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy71(dz31 dz31Var, ibk ibkVar) {
        super(ibkVar);
        this.f193848b = dz31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193847a = obj;
        this.f193849c |= Integer.MIN_VALUE;
        return this.f193848b.m37401f(this);
    }
}

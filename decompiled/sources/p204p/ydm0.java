package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ydm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bem0 f271786b;

    /* JADX INFO: renamed from: c */
    public int f271787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydm0(bem0 bem0Var, ibk ibkVar) {
        super(ibkVar);
        this.f271786b = bem0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271785a = obj;
        this.f271787c |= Integer.MIN_VALUE;
        return this.f271786b.m28950d(this);
    }
}

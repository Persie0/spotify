package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bem0 f250310b;

    /* JADX INFO: renamed from: c */
    public int f250311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdm0(bem0 bem0Var, ibk ibkVar) {
        super(ibkVar);
        this.f250310b = bem0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250309a = obj;
        this.f250311c |= Integer.MIN_VALUE;
        return this.f250310b.m28948b(this);
    }
}

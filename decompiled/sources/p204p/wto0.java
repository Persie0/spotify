package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wto0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f254991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ buo0 f254992b;

    /* JADX INFO: renamed from: c */
    public int f254993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wto0(buo0 buo0Var, ibk ibkVar) {
        super(ibkVar);
        this.f254992b = buo0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254991a = obj;
        this.f254993c |= Integer.MIN_VALUE;
        return buo0.m30577a(this.f254992b, null, this);
    }
}

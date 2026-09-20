package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n111 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f149264a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p111 f149265b;

    /* JADX INFO: renamed from: c */
    public int f149266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n111(p111 p111Var, fbk fbkVar) {
        super(fbkVar);
        this.f149265b = p111Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149264a = obj;
        this.f149266c |= Integer.MIN_VALUE;
        return p111.m68760i(this.f149265b, null, null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wqq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f254128a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f254129b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xqq0 f254130c;

    /* JADX INFO: renamed from: d */
    public int f254131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqq0(xqq0 xqq0Var, fbk fbkVar) {
        super(fbkVar);
        this.f254130c = xqq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254129b = obj;
        this.f254131d |= Integer.MIN_VALUE;
        return this.f254130c.invoke(this);
    }
}

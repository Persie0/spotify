package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wsr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f254720a;

    /* JADX INFO: renamed from: b */
    public int f254721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f254722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f254722c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254720a = obj;
        this.f254721b |= Integer.MIN_VALUE;
        return this.f254722c.emit(null, this);
    }
}

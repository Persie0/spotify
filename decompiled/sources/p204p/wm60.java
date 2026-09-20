package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wm60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252742a;

    /* JADX INFO: renamed from: b */
    public int f252743b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t950 f252744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm60(t950 t950Var, fbk fbkVar) {
        super(fbkVar);
        this.f252744c = t950Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252742a = obj;
        this.f252743b |= Integer.MIN_VALUE;
        return this.f252744c.emit(null, this);
    }
}

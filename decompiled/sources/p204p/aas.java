package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aas extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13912a;

    /* JADX INFO: renamed from: b */
    public int f13913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f13914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aas(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f13914c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13912a = obj;
        this.f13913b |= Integer.MIN_VALUE;
        return this.f13914c.emit(null, this);
    }
}

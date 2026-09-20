package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kx80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127358a;

    /* JADX INFO: renamed from: b */
    public int f127359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lx80 f127360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx80(lx80 lx80Var, fbk fbkVar) {
        super(fbkVar);
        this.f127360c = lx80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127358a = obj;
        this.f127359b |= Integer.MIN_VALUE;
        return this.f127360c.emit(null, this);
    }
}

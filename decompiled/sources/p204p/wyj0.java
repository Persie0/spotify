package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wyj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f256304a;

    /* JADX INFO: renamed from: b */
    public int f256305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f256306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyj0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f256306c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256304a = obj;
        this.f256305b |= Integer.MIN_VALUE;
        return this.f256306c.emit(null, this);
    }
}

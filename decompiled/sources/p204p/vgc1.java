package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vgc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241218a;

    /* JADX INFO: renamed from: b */
    public int f241219b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f241220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgc1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f241220c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241218a = obj;
        this.f241219b |= Integer.MIN_VALUE;
        return this.f241220c.emit(null, this);
    }
}

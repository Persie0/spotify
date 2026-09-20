package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vfx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f241065a;

    /* JADX INFO: renamed from: b */
    public int f241066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f241067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfx0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f241067c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241065a = obj;
        this.f241066b |= Integer.MIN_VALUE;
        return this.f241067c.emit(null, this);
    }
}

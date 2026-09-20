package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280649a;

    /* JADX INFO: renamed from: b */
    public int f280650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f280651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z921(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f280651c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280649a = obj;
        this.f280650b |= Integer.MIN_VALUE;
        return this.f280651c.emit(null, this);
    }
}

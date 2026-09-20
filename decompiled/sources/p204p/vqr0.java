package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vqr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243989a;

    /* JADX INFO: renamed from: b */
    public int f243990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f243991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f243991c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243989a = obj;
        this.f243990b |= Integer.MIN_VALUE;
        return this.f243991c.emit(null, this);
    }
}

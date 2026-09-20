package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class avk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20206a;

    /* JADX INFO: renamed from: b */
    public int f20207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f20208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f20208c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20206a = obj;
        this.f20207b |= Integer.MIN_VALUE;
        return this.f20208c.emit(null, this);
    }
}

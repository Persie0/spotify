package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gsk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83981a;

    /* JADX INFO: renamed from: b */
    public int f83982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f83983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f83983c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83981a = obj;
        this.f83982b |= Integer.MIN_VALUE;
        return this.f83983c.emit(null, this);
    }
}

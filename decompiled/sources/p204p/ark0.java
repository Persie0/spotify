package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ark0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19090a;

    /* JADX INFO: renamed from: b */
    public int f19091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f19092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ark0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f19092c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19090a = obj;
        this.f19091b |= Integer.MIN_VALUE;
        return this.f19092c.emit(null, this);
    }
}

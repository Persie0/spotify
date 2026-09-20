package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kuk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126626a;

    /* JADX INFO: renamed from: b */
    public int f126627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f126628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f126628c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126626a = obj;
        this.f126627b |= Integer.MIN_VALUE;
        return this.f126628c.emit(null, this);
    }
}

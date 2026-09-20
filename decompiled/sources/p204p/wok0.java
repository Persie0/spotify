package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wok0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f253492a;

    /* JADX INFO: renamed from: b */
    public int f253493b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f253494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wok0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f253494c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253492a = obj;
        this.f253493b |= Integer.MIN_VALUE;
        return this.f253494c.emit(null, this);
    }
}

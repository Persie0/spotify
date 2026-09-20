package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yok0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274689a;

    /* JADX INFO: renamed from: b */
    public int f274690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f274691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yok0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f274691c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274689a = obj;
        this.f274690b |= Integer.MIN_VALUE;
        return this.f274691c.emit(null, this);
    }
}

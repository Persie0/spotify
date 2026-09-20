package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ehk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59612a;

    /* JADX INFO: renamed from: b */
    public int f59613b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f59614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehk0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f59614c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59612a = obj;
        this.f59613b |= Integer.MIN_VALUE;
        return this.f59614c.emit(null, this);
    }
}

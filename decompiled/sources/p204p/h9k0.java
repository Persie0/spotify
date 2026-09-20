package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h9k0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88995a;

    /* JADX INFO: renamed from: b */
    public int f88996b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f88997c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9k0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f88997c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88995a = obj;
        this.f88996b |= Integer.MIN_VALUE;
        return this.f88997c.emit(null, this);
    }
}

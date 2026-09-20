package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c7g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34895a;

    /* JADX INFO: renamed from: b */
    public int f34896b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f34897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7g0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f34897c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34895a = obj;
        this.f34896b |= Integer.MIN_VALUE;
        return this.f34897c.emit(null, this);
    }
}

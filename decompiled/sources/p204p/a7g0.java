package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a7g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13048a;

    /* JADX INFO: renamed from: b */
    public int f13049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f13050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7g0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f13050c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13048a = obj;
        this.f13049b |= Integer.MIN_VALUE;
        return this.f13050c.emit(null, this);
    }
}

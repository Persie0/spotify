package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n0g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f149051a;

    /* JADX INFO: renamed from: b */
    public int f149052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f149053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0g0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f149053c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149051a = obj;
        this.f149052b |= Integer.MIN_VALUE;
        return this.f149053c.emit(null, this);
    }
}

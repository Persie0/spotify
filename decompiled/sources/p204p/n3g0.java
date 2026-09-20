package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150051a;

    /* JADX INFO: renamed from: b */
    public int f150052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f150053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3g0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f150053c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150051a = obj;
        this.f150052b |= Integer.MIN_VALUE;
        return this.f150053c.emit(null, this);
    }
}

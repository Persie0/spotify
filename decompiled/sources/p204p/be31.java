package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class be31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26268a;

    /* JADX INFO: renamed from: b */
    public int f26269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f26270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be31(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f26270c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26268a = obj;
        this.f26269b |= Integer.MIN_VALUE;
        return this.f26270c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kb71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121104a;

    /* JADX INFO: renamed from: b */
    public int f121105b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f121106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb71(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f121106c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121104a = obj;
        this.f121105b |= Integer.MIN_VALUE;
        return this.f121106c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218279a;

    /* JADX INFO: renamed from: b */
    public int f218280b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f218281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f218281c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218279a = obj;
        this.f218280b |= Integer.MIN_VALUE;
        return this.f218281c.emit(null, this);
    }
}

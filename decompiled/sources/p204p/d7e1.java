package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d7e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46091a;

    /* JADX INFO: renamed from: b */
    public int f46092b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f46093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f46093c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46091a = obj;
        this.f46092b |= Integer.MIN_VALUE;
        return this.f46093c.emit(null, this);
    }
}

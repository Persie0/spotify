package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rtd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202568a;

    /* JADX INFO: renamed from: b */
    public int f202569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f202570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f202570c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202568a = obj;
        this.f202569b |= Integer.MIN_VALUE;
        return this.f202570c.emit(null, this);
    }
}

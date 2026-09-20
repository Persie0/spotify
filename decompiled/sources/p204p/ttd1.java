package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ttd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223578a;

    /* JADX INFO: renamed from: b */
    public int f223579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f223580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f223580c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223578a = obj;
        this.f223579b |= Integer.MIN_VALUE;
        return this.f223580c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u5p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227079a;

    /* JADX INFO: renamed from: b */
    public int f227080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f227081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f227081c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227079a = obj;
        this.f227080b |= Integer.MIN_VALUE;
        return this.f227081c.emit(null, this);
    }
}

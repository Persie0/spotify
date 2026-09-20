package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yfp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272308a;

    /* JADX INFO: renamed from: b */
    public int f272309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f272310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f272310c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272308a = obj;
        this.f272309b |= Integer.MIN_VALUE;
        return this.f272310c.emit(null, this);
    }
}

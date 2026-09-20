package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99809a;

    /* JADX INFO: renamed from: b */
    public int f99810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f99811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f99811c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99809a = obj;
        this.f99810b |= Integer.MIN_VALUE;
        return this.f99811c.emit(null, this);
    }
}

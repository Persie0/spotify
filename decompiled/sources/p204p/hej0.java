package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hej0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90444a;

    /* JADX INFO: renamed from: b */
    public int f90445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f90446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hej0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f90446c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90444a = obj;
        this.f90445b |= Integer.MIN_VALUE;
        return this.f90446c.emit(null, this);
    }
}

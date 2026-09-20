package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uei0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f229544a;

    /* JADX INFO: renamed from: b */
    public int f229545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f229546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uei0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f229546c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229544a = obj;
        this.f229545b |= Integer.MIN_VALUE;
        return this.f229546c.emit(null, this);
    }
}

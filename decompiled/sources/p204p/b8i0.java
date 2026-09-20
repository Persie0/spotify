package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b8i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24593a;

    /* JADX INFO: renamed from: b */
    public int f24594b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f24595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8i0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24595c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24593a = obj;
        this.f24594b |= Integer.MIN_VALUE;
        return this.f24595c.emit(null, this);
    }
}

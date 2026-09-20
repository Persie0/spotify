package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z5j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f279583a;

    /* JADX INFO: renamed from: b */
    public int f279584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f279585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5j0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f279585c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f279583a = obj;
        this.f279584b |= Integer.MIN_VALUE;
        return this.f279585c.emit(null, this);
    }
}

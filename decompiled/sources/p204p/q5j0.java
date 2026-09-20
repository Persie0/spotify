package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q5j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185544a;

    /* JADX INFO: renamed from: b */
    public int f185545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f185546c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5j0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f185546c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185544a = obj;
        this.f185545b |= Integer.MIN_VALUE;
        return this.f185546c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z3t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f279035a;

    /* JADX INFO: renamed from: b */
    public int f279036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f279037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f279037c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f279035a = obj;
        this.f279036b |= Integer.MIN_VALUE;
        return this.f279037c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class but0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31216a;

    /* JADX INFO: renamed from: b */
    public int f31217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f31218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public but0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f31218c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31216a = obj;
        this.f31217b |= Integer.MIN_VALUE;
        return this.f31218c.emit(null, this);
    }
}

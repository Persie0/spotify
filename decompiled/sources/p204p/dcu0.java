package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dcu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47646a;

    /* JADX INFO: renamed from: b */
    public int f47647b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f47648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcu0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f47648c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47646a = obj;
        this.f47647b |= Integer.MIN_VALUE;
        return this.f47648c.emit(null, this);
    }
}

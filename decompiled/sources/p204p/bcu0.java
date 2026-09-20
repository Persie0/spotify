package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bcu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25944a;

    /* JADX INFO: renamed from: b */
    public int f25945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f25946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcu0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f25946c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25944a = obj;
        this.f25945b |= Integer.MIN_VALUE;
        return this.f25946c.emit(null, this);
    }
}

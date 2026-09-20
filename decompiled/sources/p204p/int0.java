package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class int0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104059a;

    /* JADX INFO: renamed from: b */
    public int f104060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f104061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public int0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f104061c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104059a = obj;
        this.f104060b |= Integer.MIN_VALUE;
        return this.f104061c.emit(null, this);
    }
}

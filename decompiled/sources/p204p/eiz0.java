package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eiz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60085a;

    /* JADX INFO: renamed from: b */
    public int f60086b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f60087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f60087c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60085a = obj;
        this.f60086b |= Integer.MIN_VALUE;
        return this.f60087c.emit(null, this);
    }
}

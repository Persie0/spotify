package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ejf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60216a;

    /* JADX INFO: renamed from: b */
    public int f60217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f60218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f60218c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60216a = obj;
        this.f60217b |= Integer.MIN_VALUE;
        return this.f60218c.emit(null, this);
    }
}

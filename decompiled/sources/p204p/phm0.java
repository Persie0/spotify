package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class phm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177684a;

    /* JADX INFO: renamed from: b */
    public int f177685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fu00 f177686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phm0(fu00 fu00Var, fbk fbkVar) {
        super(fbkVar);
        this.f177686c = fu00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177684a = obj;
        this.f177685b |= Integer.MIN_VALUE;
        return this.f177686c.emit(null, this);
    }
}

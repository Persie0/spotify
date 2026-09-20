package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133788a;

    /* JADX INFO: renamed from: b */
    public int f133789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f133790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lif0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f133790c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133788a = obj;
        this.f133789b |= Integer.MIN_VALUE;
        return this.f133790c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g7e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77251a;

    /* JADX INFO: renamed from: b */
    public int f77252b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f77253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f77253c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77251a = obj;
        this.f77252b |= Integer.MIN_VALUE;
        return this.f77253c.emit(null, this);
    }
}

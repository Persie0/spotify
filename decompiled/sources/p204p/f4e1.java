package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f4e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65771a;

    /* JADX INFO: renamed from: b */
    public int f65772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d4e1 f65773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4e1(d4e1 d4e1Var, fbk fbkVar) {
        super(fbkVar);
        this.f65773c = d4e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65771a = obj;
        this.f65772b |= Integer.MIN_VALUE;
        return this.f65773c.emit(null, this);
    }
}

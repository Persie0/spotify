package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yub1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276304a;

    /* JADX INFO: renamed from: b */
    public int f276305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f276306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yub1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f276306c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276304a = obj;
        this.f276305b |= Integer.MIN_VALUE;
        return this.f276306c.emit(null, this);
    }
}

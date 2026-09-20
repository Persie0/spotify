package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yu7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276280a;

    /* JADX INFO: renamed from: b */
    public int f276281b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f276282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu7(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f276282c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276280a = obj;
        this.f276281b |= Integer.MIN_VALUE;
        return this.f276282c.emit(null, this);
    }
}

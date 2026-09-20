package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h78 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88376a;

    /* JADX INFO: renamed from: b */
    public int f88377b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f88378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h78(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f88378c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88376a = obj;
        this.f88377b |= Integer.MIN_VALUE;
        return this.f88378c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m98 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141223a;

    /* JADX INFO: renamed from: b */
    public int f141224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f141225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m98(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f141225c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141223a = obj;
        this.f141224b |= Integer.MIN_VALUE;
        return this.f141225c.emit(null, this);
    }
}

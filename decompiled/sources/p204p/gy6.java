package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gy6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85478a;

    /* JADX INFO: renamed from: b */
    public int f85479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f85480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f85480c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85478a = obj;
        this.f85479b |= Integer.MIN_VALUE;
        return this.f85480c.emit(null, this);
    }
}

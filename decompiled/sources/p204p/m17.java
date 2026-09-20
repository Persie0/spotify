package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m17 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138852a;

    /* JADX INFO: renamed from: b */
    public int f138853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f138854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m17(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f138854c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138852a = obj;
        this.f138853b |= Integer.MIN_VALUE;
        return this.f138854c.emit(null, this);
    }
}

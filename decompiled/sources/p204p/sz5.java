package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sz5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f215390a;

    /* JADX INFO: renamed from: b */
    public int f215391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f215392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f215392c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215390a = obj;
        this.f215391b |= Integer.MIN_VALUE;
        return this.f215392c.emit(null, this);
    }
}

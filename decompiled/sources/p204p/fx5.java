package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fx5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74240a;

    /* JADX INFO: renamed from: b */
    public int f74241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f74242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f74242c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74240a = obj;
        this.f74241b |= Integer.MIN_VALUE;
        return this.f74242c.emit(null, this);
    }
}

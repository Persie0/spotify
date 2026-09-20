package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xv7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266306a;

    /* JADX INFO: renamed from: b */
    public int f266307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f266308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv7(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f266308c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266306a = obj;
        this.f266307b |= Integer.MIN_VALUE;
        return this.f266308c.emit(null, this);
    }
}

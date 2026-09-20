package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252596a;

    /* JADX INFO: renamed from: b */
    public int f252597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f252598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f252598c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252596a = obj;
        this.f252597b |= Integer.MIN_VALUE;
        return this.f252598c.emit(null, this);
    }
}

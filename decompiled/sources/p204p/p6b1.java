package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p6b1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174340a;

    /* JADX INFO: renamed from: b */
    public int f174341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f174342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6b1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f174342c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174340a = obj;
        this.f174341b |= Integer.MIN_VALUE;
        return this.f174342c.emit(null, this);
    }
}

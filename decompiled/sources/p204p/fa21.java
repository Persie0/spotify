package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fa21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67417a;

    /* JADX INFO: renamed from: b */
    public int f67418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f67419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f67419c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67417a = obj;
        this.f67418b |= Integer.MIN_VALUE;
        return this.f67419c.emit(null, this);
    }
}

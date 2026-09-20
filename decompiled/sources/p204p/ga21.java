package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ga21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77957a;

    /* JADX INFO: renamed from: b */
    public int f77958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f77959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f77959c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77957a = obj;
        this.f77958b |= Integer.MIN_VALUE;
        return this.f77959c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lmb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134850a;

    /* JADX INFO: renamed from: b */
    public int f134851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f134852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f134852c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134850a = obj;
        this.f134851b |= Integer.MIN_VALUE;
        return this.f134852c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fp2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71696a;

    /* JADX INFO: renamed from: b */
    public int f71697b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f71698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f71698c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71696a = obj;
        this.f71697b |= Integer.MIN_VALUE;
        return this.f71698c.emit(null, this);
    }
}

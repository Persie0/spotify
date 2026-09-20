package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class akc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16486a;

    /* JADX INFO: renamed from: b */
    public int f16487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f16488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akc1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f16488c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16486a = obj;
        this.f16487b |= Integer.MIN_VALUE;
        return this.f16488c.emit(null, this);
    }
}

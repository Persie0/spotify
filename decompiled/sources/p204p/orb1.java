package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class orb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168527a;

    /* JADX INFO: renamed from: b */
    public int f168528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f168529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f168529c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168527a = obj;
        this.f168528b |= Integer.MIN_VALUE;
        return this.f168529c.emit(null, this);
    }
}

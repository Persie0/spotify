package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rvb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203045a;

    /* JADX INFO: renamed from: b */
    public int f203046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f203047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f203047c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203045a = obj;
        this.f203046b |= Integer.MIN_VALUE;
        return this.f203047c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bal0 extends ibk {

    /* JADX INFO: renamed from: a */
    public fal0 f25236a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fal0 f25238c;

    /* JADX INFO: renamed from: d */
    public int f25239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bal0(fal0 fal0Var, ibk ibkVar) {
        super(ibkVar);
        this.f25238c = fal0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25237b = obj;
        this.f25239d |= Integer.MIN_VALUE;
        return this.f25238c.m41186f(this);
    }
}

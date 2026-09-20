package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e7c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public m6c0 f56904a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f56905b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7c0 f56906c;

    /* JADX INFO: renamed from: d */
    public int f56907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7c0(f7c0 f7c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f56906c = f7c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56905b = obj;
        this.f56907d |= Integer.MIN_VALUE;
        return f7c0.m40965e(this.f56906c, null, this);
    }
}

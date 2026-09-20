package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w0d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1d0 f246701b;

    /* JADX INFO: renamed from: c */
    public int f246702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f246701b = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246700a = obj;
        this.f246702c |= Integer.MIN_VALUE;
        return this.f246701b.m46418b(this);
    }
}

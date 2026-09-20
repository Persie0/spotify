package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k50 extends ibk {

    /* JADX INFO: renamed from: a */
    public k35 f119373a;

    /* JADX INFO: renamed from: b */
    public Object f119374b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f119375c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n50 f119376d;

    /* JADX INFO: renamed from: e */
    public int f119377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(n50 n50Var, ibk ibkVar) {
        super(ibkVar);
        this.f119376d = n50Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119375c = obj;
        this.f119377e |= Integer.MIN_VALUE;
        return n50.m63692f(this.f119376d, null, null, this);
    }
}

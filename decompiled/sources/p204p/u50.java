package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u50 extends ibk {

    /* JADX INFO: renamed from: a */
    public s50 f226864a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f226865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v50 f226866c;

    /* JADX INFO: renamed from: d */
    public int f226867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(v50 v50Var, ibk ibkVar) {
        super(ibkVar);
        this.f226866c = v50Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226865b = obj;
        this.f226867d |= Integer.MIN_VALUE;
        return this.f226866c.m84669a(null, this);
    }
}

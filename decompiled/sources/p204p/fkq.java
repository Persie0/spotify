package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fkq extends ibk {

    /* JADX INFO: renamed from: a */
    public iph0 f70578a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f70579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qro f70580c;

    /* JADX INFO: renamed from: d */
    public int f70581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkq(qro qroVar, ibk ibkVar) {
        super(ibkVar);
        this.f70580c = qroVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70579b = obj;
        this.f70581d |= Integer.MIN_VALUE;
        return this.f70580c.m73657a(this);
    }
}

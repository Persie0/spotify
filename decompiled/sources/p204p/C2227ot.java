package p204p;

/* JADX INFO: renamed from: p.ot */
/* JADX INFO: loaded from: classes4.dex */
public final class C2227ot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2313qt f168927b;

    /* JADX INFO: renamed from: c */
    public int f168928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2227ot(C2313qt c2313qt, ibk ibkVar) {
        super(ibkVar);
        this.f168927b = c2313qt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168926a = obj;
        this.f168928c |= Integer.MIN_VALUE;
        return C2313qt.m73777b(this.f168927b, this);
    }
}

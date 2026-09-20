package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cqa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public fqa1 f40804a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f40805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fqa1 f40806c;

    /* JADX INFO: renamed from: d */
    public int f40807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqa1(fqa1 fqa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f40806c = fqa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40805b = obj;
        this.f40807d |= Integer.MIN_VALUE;
        return this.f40806c.m42411a(this);
    }
}

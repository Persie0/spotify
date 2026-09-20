package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kny0 extends ibk {

    /* JADX INFO: renamed from: a */
    public qlv0 f124484a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f124485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nny0 f124486c;

    /* JADX INFO: renamed from: d */
    public int f124487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kny0(nny0 nny0Var, ibk ibkVar) {
        super(ibkVar);
        this.f124486c = nny0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124485b = obj;
        this.f124487d |= Integer.MIN_VALUE;
        return this.f124486c.m65219a(0L, this);
    }
}

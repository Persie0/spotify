package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class koe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ loe f124769b;

    /* JADX INFO: renamed from: c */
    public int f124770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koe(loe loeVar, ibk ibkVar) {
        super(ibkVar);
        this.f124769b = loeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124768a = obj;
        this.f124770c |= Integer.MIN_VALUE;
        return loe.m59561g(this.f124769b, null, this);
    }
}

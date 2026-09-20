package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class paa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ raa1 f175459b;

    /* JADX INFO: renamed from: c */
    public int f175460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paa1(raa1 raa1Var, ibk ibkVar) {
        super(ibkVar);
        this.f175459b = raa1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175458a = obj;
        this.f175460c |= Integer.MIN_VALUE;
        return this.f175459b.m75105b(null, this);
    }
}

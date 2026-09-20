package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ij2 extends ibk {

    /* JADX INFO: renamed from: a */
    public ocm0 f102669a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f102670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ck2 f102671c;

    /* JADX INFO: renamed from: d */
    public int f102672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f102671c = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102670b = obj;
        this.f102672d |= Integer.MIN_VALUE;
        return this.f102671c.m33046B(null, this);
    }
}

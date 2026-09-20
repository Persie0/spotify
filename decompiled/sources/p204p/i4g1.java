package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i4g1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f98525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q6g1 f98526b;

    /* JADX INFO: renamed from: c */
    public int f98527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4g1(q6g1 q6g1Var, ibk ibkVar) {
        super(ibkVar);
        this.f98526b = q6g1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98525a = obj;
        this.f98527c |= Integer.MIN_VALUE;
        return q6g1.m72228i(this.f98526b, this);
    }
}

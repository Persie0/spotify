package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f220807b;

    /* JADX INFO: renamed from: c */
    public int f220808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f220807b = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220806a = obj;
        this.f220808c |= Integer.MIN_VALUE;
        return this.f220807b.m33050G(null, this);
    }
}

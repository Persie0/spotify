package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f283334b;

    /* JADX INFO: renamed from: c */
    public int f283335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f283334b = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283333a = obj;
        this.f283335c |= Integer.MIN_VALUE;
        return this.f283334b.m33060Q(null, this);
    }
}

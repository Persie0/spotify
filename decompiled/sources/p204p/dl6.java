package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dl6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ el6 f50128b;

    /* JADX INFO: renamed from: c */
    public int f50129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl6(el6 el6Var, ibk ibkVar) {
        super(ibkVar);
        this.f50128b = el6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50127a = obj;
        this.f50129c |= Integer.MIN_VALUE;
        return this.f50128b.m39354b(null, this);
    }
}

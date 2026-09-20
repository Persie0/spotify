package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f65497a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j3g0 f65499c;

    /* JADX INFO: renamed from: d */
    public int f65500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3g0(j3g0 j3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f65499c = j3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65498b = obj;
        this.f65500d |= Integer.MIN_VALUE;
        return this.f65499c.m52257a(null, this);
    }
}

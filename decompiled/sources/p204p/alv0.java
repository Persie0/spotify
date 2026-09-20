package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class alv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public utm0 f16994a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clv0 f16996c;

    /* JADX INFO: renamed from: d */
    public int f16997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alv0(clv0 clv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f16996c = clv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16995b = obj;
        this.f16997d |= Integer.MIN_VALUE;
        return this.f16996c.m33345b(null, this);
    }
}

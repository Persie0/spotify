package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class eq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jq2 f61763b;

    /* JADX INFO: renamed from: c */
    public int f61764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq2(jq2 jq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f61763b = jq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61762a = obj;
        this.f61764c |= Integer.MIN_VALUE;
        return this.f61763b.m54023a(null, this, false);
    }
}

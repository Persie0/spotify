package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72038a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jq2 f72039b;

    /* JADX INFO: renamed from: c */
    public int f72040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq2(jq2 jq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f72039b = jq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72038a = obj;
        this.f72040c |= Integer.MIN_VALUE;
        return this.f72039b.m54024b(this);
    }
}

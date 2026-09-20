package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ii91 f110195a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f110196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k9l0 f110197c;

    /* JADX INFO: renamed from: d */
    public int f110198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9l0(k9l0 k9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f110197c = k9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110196b = obj;
        this.f110198d |= Integer.MIN_VALUE;
        return this.f110197c.m55837d(null, this);
    }
}

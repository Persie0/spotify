package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j470 f76357b;

    /* JADX INFO: renamed from: c */
    public int f76358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g470(j470 j470Var, ibk ibkVar) {
        super(ibkVar);
        this.f76357b = j470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76356a = obj;
        this.f76358c |= Integer.MIN_VALUE;
        return this.f76357b.m52328b(this);
    }
}

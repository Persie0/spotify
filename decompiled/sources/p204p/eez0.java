package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class eez0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jez0 f58894b;

    /* JADX INFO: renamed from: c */
    public int f58895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eez0(jez0 jez0Var, ibk ibkVar) {
        super(ibkVar);
        this.f58894b = jez0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58893a = obj;
        this.f58895c |= Integer.MIN_VALUE;
        return jez0.m53134G1(this.f58894b, this);
    }
}

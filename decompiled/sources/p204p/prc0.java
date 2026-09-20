package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class prc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qrc0 f180551b;

    /* JADX INFO: renamed from: c */
    public int f180552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prc0(qrc0 qrc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f180551b = qrc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180550a = obj;
        this.f180552c |= Integer.MIN_VALUE;
        return this.f180551b.m73615c(this);
    }
}

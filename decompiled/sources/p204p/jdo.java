package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jdo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f111375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kdo f111376b;

    /* JADX INFO: renamed from: c */
    public int f111377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdo(kdo kdoVar, ibk ibkVar) {
        super(ibkVar);
        this.f111376b = kdoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f111375a = obj;
        this.f111377c |= Integer.MIN_VALUE;
        return this.f111376b.mo38767b(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3e f236837b;

    /* JADX INFO: renamed from: c */
    public int f236838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3e(z3e z3eVar, ibk ibkVar) {
        super(ibkVar);
        this.f236837b = z3eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236836a = obj;
        this.f236838c |= Integer.MIN_VALUE;
        return this.f236837b.m95272c(null, this);
    }
}

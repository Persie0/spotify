package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3e f226333b;

    /* JADX INFO: renamed from: c */
    public int f226334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3e(z3e z3eVar, ibk ibkVar) {
        super(ibkVar);
        this.f226333b = z3eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226332a = obj;
        this.f226334c |= Integer.MIN_VALUE;
        return this.f226333b.m95271b(null, this);
    }
}

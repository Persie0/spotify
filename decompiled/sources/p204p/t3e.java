package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3e f216753b;

    /* JADX INFO: renamed from: c */
    public int f216754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3e(z3e z3eVar, ibk ibkVar) {
        super(ibkVar);
        this.f216753b = z3eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216752a = obj;
        this.f216754c |= Integer.MIN_VALUE;
        return this.f216753b.m95270a(null, this);
    }
}

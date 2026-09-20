package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a9i0 f248970b;

    /* JADX INFO: renamed from: c */
    public int f248971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8n0(a9i0 a9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f248970b = a9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248969a = obj;
        this.f248971c |= Integer.MIN_VALUE;
        return this.f248970b.m25134p(0L, null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aja0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16204a;

    /* JADX INFO: renamed from: b */
    public int f16205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bja0 f16206c;

    /* JADX INFO: renamed from: d */
    public bqz0 f16207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aja0(bja0 bja0Var, ibk ibkVar) {
        super(ibkVar);
        this.f16206c = bja0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16204a = obj;
        this.f16205b |= Integer.MIN_VALUE;
        return this.f16206c.mo15629a(null, null, this);
    }
}

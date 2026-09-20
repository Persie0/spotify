package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k770 f99460b;

    /* JADX INFO: renamed from: c */
    public int f99461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i770(k770 k770Var, ibk ibkVar) {
        super(ibkVar);
        this.f99460b = k770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99459a = obj;
        this.f99461c |= Integer.MIN_VALUE;
        return this.f99460b.m55634a(null, null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vnk extends ibk {

    /* JADX INFO: renamed from: a */
    public String f243150a;

    /* JADX INFO: renamed from: b */
    public jj70 f243151b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f243152c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bpk f243153d;

    /* JADX INFO: renamed from: e */
    public int f243154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f243153d = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243152c = obj;
        this.f243154e |= Integer.MIN_VALUE;
        return this.f243153d.m30138c(null, this);
    }
}

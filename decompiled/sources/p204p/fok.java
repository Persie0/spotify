package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f71554a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f71555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f71556c;

    /* JADX INFO: renamed from: d */
    public int f71557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f71556c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71555b = obj;
        this.f71557d |= Integer.MIN_VALUE;
        return this.f71556c.m30148n(null, this);
    }
}

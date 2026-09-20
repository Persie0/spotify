package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cok extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f40281a;

    /* JADX INFO: renamed from: b */
    public String f40282b;

    /* JADX INFO: renamed from: c */
    public long f40283c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f40284d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bpk f40285e;

    /* JADX INFO: renamed from: f */
    public int f40286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f40285e = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40284d = obj;
        this.f40286f |= Integer.MIN_VALUE;
        return this.f40285e.m30146l(false, this);
    }
}

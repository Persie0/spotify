package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f284802a;

    /* JADX INFO: renamed from: b */
    public String f284803b;

    /* JADX INFO: renamed from: c */
    public String f284804c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f284805d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bpk f284806e;

    /* JADX INFO: renamed from: f */
    public int f284807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f284806e = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284805d = obj;
        this.f284807f |= Integer.MIN_VALUE;
        return this.f284806e.m30134I(null, null, null, this);
    }
}

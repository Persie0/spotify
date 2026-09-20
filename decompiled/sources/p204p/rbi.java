package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rbi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197604a;

    /* JADX INFO: renamed from: b */
    public int f197605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sbi f197606c;

    /* JADX INFO: renamed from: d */
    public bqz0 f197607d;

    /* JADX INFO: renamed from: e */
    public abi f197608e;

    /* JADX INFO: renamed from: f */
    public String f197609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbi(sbi sbiVar, ibk ibkVar) {
        super(ibkVar);
        this.f197606c = sbiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197604a = obj;
        this.f197605b |= Integer.MIN_VALUE;
        return this.f197606c.mo15629a(null, null, this);
    }
}

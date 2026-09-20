package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class znk extends ibk {

    /* JADX INFO: renamed from: a */
    public String f284514a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f284515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f284516c;

    /* JADX INFO: renamed from: d */
    public int f284517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f284516c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284515b = obj;
        this.f284517d |= Integer.MIN_VALUE;
        return this.f284516c.m30143i(null, this);
    }
}

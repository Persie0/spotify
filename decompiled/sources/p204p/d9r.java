package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d9r extends ibk {

    /* JADX INFO: renamed from: a */
    public long f46883a;

    /* JADX INFO: renamed from: b */
    public String f46884b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f46885c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e9r f46886d;

    /* JADX INFO: renamed from: e */
    public int f46887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9r(e9r e9rVar, ibk ibkVar) {
        super(ibkVar);
        this.f46886d = e9rVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46885c = obj;
        this.f46887e |= Integer.MIN_VALUE;
        return this.f46886d.m38260c(0L, null, this);
    }
}

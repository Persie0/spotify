package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tex extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219802a;

    /* JADX INFO: renamed from: b */
    public int f219803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uex f219804c;

    /* JADX INFO: renamed from: d */
    public bqz0 f219805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tex(uex uexVar, ibk ibkVar) {
        super(ibkVar);
        this.f219804c = uexVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219802a = obj;
        this.f219803b |= Integer.MIN_VALUE;
        return this.f219804c.mo15629a(null, null, this);
    }
}

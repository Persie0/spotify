package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f0p extends ibk {

    /* JADX INFO: renamed from: a */
    public String f64690a;

    /* JADX INFO: renamed from: b */
    public String f64691b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f64692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h0p f64693d;

    /* JADX INFO: renamed from: e */
    public int f64694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0p(h0p h0pVar, ibk ibkVar) {
        super(ibkVar);
        this.f64693d = h0pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64692c = obj;
        this.f64694e |= Integer.MIN_VALUE;
        return this.f64693d.m46368f(null, null, this);
    }
}

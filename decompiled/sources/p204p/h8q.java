package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h8q extends ibk {

    /* JADX INFO: renamed from: a */
    public String f88769a;

    /* JADX INFO: renamed from: b */
    public String f88770b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f88771c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j8q f88772d;

    /* JADX INFO: renamed from: e */
    public int f88773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8q(j8q j8qVar, ibk ibkVar) {
        super(ibkVar);
        this.f88772d = j8qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88771c = obj;
        this.f88773e |= Integer.MIN_VALUE;
        return j8q.m52708a(this.f88772d, null, null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b2q extends ibk {

    /* JADX INFO: renamed from: a */
    public int f22666a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22667b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2q f22668c;

    /* JADX INFO: renamed from: d */
    public int f22669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2q(c2q c2qVar, ibk ibkVar) {
        super(ibkVar);
        this.f22668c = c2qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22667b = obj;
        this.f22669d |= Integer.MIN_VALUE;
        return this.f22668c.m31341a(null, null, null, this);
    }
}

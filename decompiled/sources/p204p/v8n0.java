package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f238628a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f238629b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a9i0 f238630c;

    /* JADX INFO: renamed from: d */
    public int f238631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8n0(a9i0 a9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f238630c = a9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238629b = obj;
        this.f238631d |= Integer.MIN_VALUE;
        return a9i0.m25119a(this.f238630c, 0, null, this);
    }
}

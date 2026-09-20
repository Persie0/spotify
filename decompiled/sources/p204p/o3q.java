package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o3q extends ibk {

    /* JADX INFO: renamed from: a */
    public hv31 f161426a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f161427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q3q f161428c;

    /* JADX INFO: renamed from: d */
    public int f161429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3q(q3q q3qVar, ibk ibkVar) {
        super(ibkVar);
        this.f161428c = q3qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161427b = obj;
        this.f161429d |= Integer.MIN_VALUE;
        return this.f161428c.m72124a(this);
    }
}

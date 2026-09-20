package p204p;

/* JADX INFO: renamed from: p.w4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2520w4 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f247666a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f247667b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1729c5 f247668c;

    /* JADX INFO: renamed from: d */
    public int f247669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2520w4(C1729c5 c1729c5, ibk ibkVar) {
        super(ibkVar);
        this.f247668c = c1729c5;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247667b = obj;
        this.f247669d |= Integer.MIN_VALUE;
        return C1729c5.m31450e(this.f247668c, null, this);
    }
}

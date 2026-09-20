package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z72 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f280073a;

    /* JADX INFO: renamed from: b */
    public String f280074b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f280075c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ a82 f280076d;

    /* JADX INFO: renamed from: e */
    public int f280077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z72(a82 a82Var, ibk ibkVar) {
        super(ibkVar);
        this.f280076d = a82Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280075c = obj;
        this.f280077e |= Integer.MIN_VALUE;
        return this.f280076d.m25008a(0L, this);
    }
}

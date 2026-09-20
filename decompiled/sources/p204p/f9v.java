package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f9v extends ibk {

    /* JADX INFO: renamed from: a */
    public lvu0 f67343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f67344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g9v f67345c;

    /* JADX INFO: renamed from: d */
    public int f67346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9v(g9v g9vVar, ibk ibkVar) {
        super(ibkVar);
        this.f67345c = g9vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67344b = obj;
        this.f67346d |= Integer.MIN_VALUE;
        return this.f67345c.mo44137a(null, this);
    }
}

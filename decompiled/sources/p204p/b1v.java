package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b1v extends ibk {

    /* JADX INFO: renamed from: a */
    public xqi0 f22417a;

    /* JADX INFO: renamed from: b */
    public ase0 f22418b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22419c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c1v f22420d;

    /* JADX INFO: renamed from: e */
    public int f22421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1v(c1v c1vVar, ibk ibkVar) {
        super(ibkVar);
        this.f22420d = c1vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22419c = obj;
        this.f22421e |= Integer.MIN_VALUE;
        return this.f22420d.m31279e(null, null, this);
    }
}

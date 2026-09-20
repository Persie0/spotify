package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bth extends ibk {

    /* JADX INFO: renamed from: a */
    public iy81 f30861a;

    /* JADX INFO: renamed from: b */
    public izl0 f30862b;

    /* JADX INFO: renamed from: c */
    public long f30863c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f30864d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jth f30865e;

    /* JADX INFO: renamed from: f */
    public int f30866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bth(jth jthVar, ibk ibkVar) {
        super(ibkVar);
        this.f30865e = jthVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30864d = obj;
        this.f30866f |= Integer.MIN_VALUE;
        return jth.m54287b(this.f30865e, null, null, 0L, this);
    }
}

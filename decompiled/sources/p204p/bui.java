package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bui extends ibk {

    /* JADX INFO: renamed from: a */
    public String f31138a;

    /* JADX INFO: renamed from: b */
    public int f31139b;

    /* JADX INFO: renamed from: c */
    public int f31140c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f31141d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cui f31142e;

    /* JADX INFO: renamed from: f */
    public int f31143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bui(cui cuiVar, ibk ibkVar) {
        super(ibkVar);
        this.f31142e = cuiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31141d = obj;
        this.f31143f |= Integer.MIN_VALUE;
        return this.f31142e.m33926b(null, this);
    }
}

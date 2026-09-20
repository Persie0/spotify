package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a7m extends ibk {

    /* JADX INFO: renamed from: a */
    public String f13098a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f13099b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b7m f13100c;

    /* JADX INFO: renamed from: d */
    public int f13101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7m(b7m b7mVar, ibk ibkVar) {
        super(ibkVar);
        this.f13100c = b7mVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13099b = obj;
        this.f13101d |= Integer.MIN_VALUE;
        return this.f13100c.m28391a(null, this);
    }
}

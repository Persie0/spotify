package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p5x extends ibk {

    /* JADX INFO: renamed from: a */
    public m5x f174247a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f174248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q5x f174249c;

    /* JADX INFO: renamed from: d */
    public int f174250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5x(q5x q5xVar, ibk ibkVar) {
        super(ibkVar);
        this.f174249c = q5xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174248b = obj;
        this.f174250d |= Integer.MIN_VALUE;
        return this.f174249c.m72202d(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cof extends ibk {

    /* JADX INFO: renamed from: a */
    public gof f40246a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f40247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gof f40248c;

    /* JADX INFO: renamed from: d */
    public int f40249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cof(gof gofVar, ibk ibkVar) {
        super(ibkVar);
        this.f40248c = gofVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40247b = obj;
        this.f40249d |= Integer.MIN_VALUE;
        return this.f40248c.m45343a(null, 0, this);
    }
}

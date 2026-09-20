package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f8j extends ibk {

    /* JADX INFO: renamed from: a */
    public rlv0 f66998a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g8j f67000c;

    /* JADX INFO: renamed from: d */
    public int f67001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8j(g8j g8jVar, ibk ibkVar) {
        super(ibkVar);
        this.f67000c = g8jVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66999b = obj;
        this.f67001d |= Integer.MIN_VALUE;
        return this.f67000c.mo40114b(this);
    }
}

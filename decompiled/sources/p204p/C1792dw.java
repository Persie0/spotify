package p204p;

/* JADX INFO: renamed from: p.dw */
/* JADX INFO: loaded from: classes4.dex */
public final class C1792dw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53568a;

    /* JADX INFO: renamed from: b */
    public int f53569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f53570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1792dw(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f53570c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53568a = obj;
        this.f53569b |= Integer.MIN_VALUE;
        return this.f53570c.emit(null, this);
    }
}

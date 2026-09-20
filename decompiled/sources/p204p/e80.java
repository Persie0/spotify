package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57027a;

    /* JADX INFO: renamed from: b */
    public int f57028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f57029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f57029c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57027a = obj;
        this.f57028b |= Integer.MIN_VALUE;
        return this.f57029c.emit(null, this);
    }
}

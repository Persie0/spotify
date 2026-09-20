package p204p;

/* JADX INFO: renamed from: p.qj */
/* JADX INFO: loaded from: classes.dex */
public final class C2295qj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189114a;

    /* JADX INFO: renamed from: b */
    public int f189115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f189116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2295qj(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f189116c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189114a = obj;
        this.f189115b |= Integer.MIN_VALUE;
        return this.f189116c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: renamed from: p.sj */
/* JADX INFO: loaded from: classes.dex */
public final class C2378sj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209700a;

    /* JADX INFO: renamed from: b */
    public int f209701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f209702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2378sj(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f209702c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209700a = obj;
        this.f209701b |= Integer.MIN_VALUE;
        return this.f209702c.emit(null, this);
    }
}

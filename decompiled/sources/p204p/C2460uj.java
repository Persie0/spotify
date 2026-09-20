package p204p;

/* JADX INFO: renamed from: p.uj */
/* JADX INFO: loaded from: classes.dex */
public final class C2460uj extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230845a;

    /* JADX INFO: renamed from: b */
    public int f230846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f230847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2460uj(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f230847c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230845a = obj;
        this.f230846b |= Integer.MIN_VALUE;
        return this.f230847c.emit(null, this);
    }
}

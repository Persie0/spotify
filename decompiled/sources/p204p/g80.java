package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77373a;

    /* JADX INFO: renamed from: b */
    public int f77374b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f77375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f77375c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77373a = obj;
        this.f77374b |= Integer.MIN_VALUE;
        return this.f77375c.emit(null, this);
    }
}

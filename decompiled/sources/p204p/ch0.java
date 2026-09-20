package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ch0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f37859a;

    /* JADX INFO: renamed from: b */
    public int f37860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f37861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f37861c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37859a = obj;
        this.f37860b |= Integer.MIN_VALUE;
        return this.f37861c.emit(null, this);
    }
}

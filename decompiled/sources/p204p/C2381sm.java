package p204p;

/* JADX INFO: renamed from: p.sm */
/* JADX INFO: loaded from: classes11.dex */
public final class C2381sm extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210530a;

    /* JADX INFO: renamed from: b */
    public int f210531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f210532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2381sm(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f210532c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210530a = obj;
        this.f210531b |= Integer.MIN_VALUE;
        return this.f210532c.emit(null, this);
    }
}

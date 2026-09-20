package p204p;

/* JADX INFO: renamed from: p.gt */
/* JADX INFO: loaded from: classes4.dex */
public final class C1909gt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84053a;

    /* JADX INFO: renamed from: b */
    public int f84054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f84055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909gt(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f84055c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84053a = obj;
        this.f84054b |= Integer.MIN_VALUE;
        return this.f84055c.emit(null, this);
    }
}

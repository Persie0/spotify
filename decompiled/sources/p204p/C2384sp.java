package p204p;

/* JADX INFO: renamed from: p.sp */
/* JADX INFO: loaded from: classes18.dex */
public final class C2384sp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212701a;

    /* JADX INFO: renamed from: b */
    public int f212702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2423tp f212703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2384sp(C2423tp c2423tp, fbk fbkVar) {
        super(fbkVar);
        this.f212703c = c2423tp;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212701a = obj;
        this.f212702b |= Integer.MIN_VALUE;
        return this.f212703c.emit(null, this);
    }
}

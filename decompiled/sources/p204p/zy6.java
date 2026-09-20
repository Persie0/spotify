package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zy6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287498a;

    /* JADX INFO: renamed from: b */
    public int f287499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f287500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f287500c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287498a = obj;
        this.f287499b |= Integer.MIN_VALUE;
        return this.f287500c.emit(null, this);
    }
}

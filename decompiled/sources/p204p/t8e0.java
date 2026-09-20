package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t8e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218071a;

    /* JADX INFO: renamed from: b */
    public int f218072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f218073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f218073c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218071a = obj;
        this.f218072b |= Integer.MIN_VALUE;
        return this.f218073c.emit(null, this);
    }
}

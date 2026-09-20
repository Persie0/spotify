package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xyr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f267406a;

    /* JADX INFO: renamed from: b */
    public int f267407b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f267408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f267408c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267406a = obj;
        this.f267407b |= Integer.MIN_VALUE;
        return this.f267408c.emit(null, this);
    }
}

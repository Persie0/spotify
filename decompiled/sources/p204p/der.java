package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class der extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48159a;

    /* JADX INFO: renamed from: b */
    public int f48160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f48161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public der(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f48161c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48159a = obj;
        this.f48160b |= Integer.MIN_VALUE;
        return this.f48161c.emit(null, this);
    }
}

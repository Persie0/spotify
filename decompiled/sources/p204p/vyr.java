package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vyr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246309a;

    /* JADX INFO: renamed from: b */
    public int f246310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f246311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f246311c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246309a = obj;
        this.f246310b |= Integer.MIN_VALUE;
        return this.f246311c.emit(null, this);
    }
}

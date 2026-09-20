package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hzr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96998a;

    /* JADX INFO: renamed from: b */
    public int f96999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f97000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f97000c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96998a = obj;
        this.f96999b |= Integer.MIN_VALUE;
        return this.f97000c.emit(null, this);
    }
}

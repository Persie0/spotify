package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jsq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f115536a;

    /* JADX INFO: renamed from: b */
    public int f115537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f115538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsq(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f115538c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115536a = obj;
        this.f115537b |= Integer.MIN_VALUE;
        return this.f115538c.emit(null, this);
    }
}

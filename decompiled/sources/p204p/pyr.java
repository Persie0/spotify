package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pyr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183458a;

    /* JADX INFO: renamed from: b */
    public int f183459b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f183460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f183460c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183458a = obj;
        this.f183459b |= Integer.MIN_VALUE;
        return this.f183460c.emit(null, this);
    }
}

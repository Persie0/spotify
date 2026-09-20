package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t5r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217337a;

    /* JADX INFO: renamed from: b */
    public int f217338b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f217339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5r(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f217339c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217337a = obj;
        this.f217338b |= Integer.MIN_VALUE;
        return this.f217339c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class skr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210183a;

    /* JADX INFO: renamed from: b */
    public int f210184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f210185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f210185c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210183a = obj;
        this.f210184b |= Integer.MIN_VALUE;
        return this.f210185c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ozr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f172347a;

    /* JADX INFO: renamed from: b */
    public int f172348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f172349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f172349c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172347a = obj;
        this.f172348b |= Integer.MIN_VALUE;
        return this.f172349c.emit(null, this);
    }
}

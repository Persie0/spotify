package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class htt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95164a;

    /* JADX INFO: renamed from: b */
    public int f95165b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f95166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htt(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f95166c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95164a = obj;
        this.f95165b |= Integer.MIN_VALUE;
        return this.f95166c.emit(null, this);
    }
}

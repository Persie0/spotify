package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hpq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93825a;

    /* JADX INFO: renamed from: b */
    public int f93826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f93827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f93827c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93825a = obj;
        this.f93826b |= Integer.MIN_VALUE;
        return this.f93827c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hpi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93790a;

    /* JADX INFO: renamed from: b */
    public int f93791b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f93792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f93792c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93790a = obj;
        this.f93791b |= Integer.MIN_VALUE;
        return this.f93792c.emit(null, this);
    }
}

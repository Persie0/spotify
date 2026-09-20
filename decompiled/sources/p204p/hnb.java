package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hnb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93278a;

    /* JADX INFO: renamed from: b */
    public int f93279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f93280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f93280c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93278a = obj;
        this.f93279b |= Integer.MIN_VALUE;
        return this.f93280c.emit(null, this);
    }
}

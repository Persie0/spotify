package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zxb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287265a;

    /* JADX INFO: renamed from: b */
    public int f287266b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f287267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f287267c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287265a = obj;
        this.f287266b |= Integer.MIN_VALUE;
        return this.f287267c.emit(null, this);
    }
}

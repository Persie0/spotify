package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zuo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286477a;

    /* JADX INFO: renamed from: b */
    public int f286478b;

    /* JADX INFO: renamed from: c */
    public niz f286479c;

    /* JADX INFO: renamed from: d */
    public int f286480d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ v1a f286481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuo(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f286481e = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286477a = obj;
        this.f286478b |= Integer.MIN_VALUE;
        return this.f286481e.emit(null, this);
    }
}

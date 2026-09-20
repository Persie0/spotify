package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178595a;

    /* JADX INFO: renamed from: b */
    public int f178596b;

    /* JADX INFO: renamed from: c */
    public niz f178597c;

    /* JADX INFO: renamed from: d */
    public int f178598d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k2c f178599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkz(k2c k2cVar, fbk fbkVar) {
        super(fbkVar);
        this.f178599e = k2cVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178595a = obj;
        this.f178596b |= Integer.MIN_VALUE;
        return this.f178599e.emit(null, this);
    }
}

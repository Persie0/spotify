package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j9k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110188a;

    /* JADX INFO: renamed from: b */
    public int f110189b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f110190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9k(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f110190c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110188a = obj;
        this.f110189b |= Integer.MIN_VALUE;
        return this.f110190c.emit(null, this);
    }
}

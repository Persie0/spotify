package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qtp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192429a;

    /* JADX INFO: renamed from: b */
    public int f192430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f192431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtp(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f192431c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192429a = obj;
        this.f192430b |= Integer.MIN_VALUE;
        return this.f192431c.emit(null, this);
    }
}

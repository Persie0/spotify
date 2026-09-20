package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k301 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118729a;

    /* JADX INFO: renamed from: b */
    public int f118730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f118731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k301(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f118731c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118729a = obj;
        this.f118730b |= Integer.MIN_VALUE;
        return this.f118731c.emit(null, this);
    }
}

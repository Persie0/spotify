package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ltt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136863a;

    /* JADX INFO: renamed from: b */
    public int f136864b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f136865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltt(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f136865c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136863a = obj;
        this.f136864b |= Integer.MIN_VALUE;
        return this.f136865c.emit(null, this);
    }
}

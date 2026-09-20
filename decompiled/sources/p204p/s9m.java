package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s9m extends ibk {

    /* JADX INFO: renamed from: a */
    public int f206979a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f206980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u9m f206981c;

    /* JADX INFO: renamed from: d */
    public int f206982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9m(u9m u9mVar, fbk fbkVar) {
        super(fbkVar);
        this.f206981c = u9mVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206980b = obj;
        this.f206982d |= Integer.MIN_VALUE;
        return this.f206981c.m82644a(0.0f, null, this);
    }
}

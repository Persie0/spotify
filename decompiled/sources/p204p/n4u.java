package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class n4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150419a;

    /* JADX INFO: renamed from: b */
    public int f150420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f150421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f150421c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150419a = obj;
        this.f150420b |= Integer.MIN_VALUE;
        return this.f150421c.emit(null, this);
    }
}

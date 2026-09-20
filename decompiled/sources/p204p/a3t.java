package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a3t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12068a;

    /* JADX INFO: renamed from: b */
    public int f12069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f12070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3t(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f12070c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12068a = obj;
        this.f12069b |= Integer.MIN_VALUE;
        return this.f12070c.emit(null, this);
    }
}

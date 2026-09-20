package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class llz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v1a f134723b;

    /* JADX INFO: renamed from: c */
    public int f134724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llz(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f134723b = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134722a = obj;
        this.f134724c |= Integer.MIN_VALUE;
        return this.f134723b.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class akz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v1a f16681b;

    /* JADX INFO: renamed from: c */
    public int f16682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akz(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f16681b = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16680a = obj;
        this.f16682c |= Integer.MIN_VALUE;
        return this.f16681b.emit(null, this);
    }
}

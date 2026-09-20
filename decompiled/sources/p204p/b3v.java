package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b3v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23135a;

    /* JADX INFO: renamed from: b */
    public int f23136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f23137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3v(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f23137c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23135a = obj;
        this.f23136b |= Integer.MIN_VALUE;
        return this.f23137c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hvi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95720a;

    /* JADX INFO: renamed from: b */
    public int f95721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f95722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f95722c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95720a = obj;
        this.f95721b |= Integer.MIN_VALUE;
        return this.f95722c.emit(null, this);
    }
}

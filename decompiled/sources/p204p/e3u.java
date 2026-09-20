package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55885a;

    /* JADX INFO: renamed from: b */
    public int f55886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f55887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f55887c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55885a = obj;
        this.f55886b |= Integer.MIN_VALUE;
        return this.f55887c.emit(null, this);
    }
}

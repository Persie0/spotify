package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33761a;

    /* JADX INFO: renamed from: b */
    public int f33762b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f33763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f33763c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33761a = obj;
        this.f33762b |= Integer.MIN_VALUE;
        return this.f33763c.emit(null, this);
    }
}

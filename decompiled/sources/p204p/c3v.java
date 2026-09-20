package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c3v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33765a;

    /* JADX INFO: renamed from: b */
    public int f33766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f33767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3v(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f33767c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33765a = obj;
        this.f33766b |= Integer.MIN_VALUE;
        return this.f33767c.emit(null, this);
    }
}

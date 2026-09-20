package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class smv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210729a;

    /* JADX INFO: renamed from: b */
    public int f210730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f210731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smv(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f210731c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210729a = obj;
        this.f210730b |= Integer.MIN_VALUE;
        return this.f210731c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jtt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f115967a;

    /* JADX INFO: renamed from: b */
    public int f115968b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f115969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtt(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f115969c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115967a = obj;
        this.f115968b |= Integer.MIN_VALUE;
        return this.f115969c.emit(null, this);
    }
}

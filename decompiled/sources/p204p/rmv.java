package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rmv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200618a;

    /* JADX INFO: renamed from: b */
    public int f200619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f200620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmv(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f200620c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200618a = obj;
        this.f200619b |= Integer.MIN_VALUE;
        return this.f200620c.emit(null, this);
    }
}

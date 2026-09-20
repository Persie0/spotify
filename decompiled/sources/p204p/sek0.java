package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sek0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208317a;

    /* JADX INFO: renamed from: b */
    public int f208318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f208319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sek0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f208319c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208317a = obj;
        this.f208318b |= Integer.MIN_VALUE;
        return this.f208319c.emit(null, this);
    }
}

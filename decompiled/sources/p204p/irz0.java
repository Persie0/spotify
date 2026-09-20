package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class irz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105075a;

    /* JADX INFO: renamed from: b */
    public int f105076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f105077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f105077c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105075a = obj;
        this.f105076b |= Integer.MIN_VALUE;
        return this.f105077c.emit(null, this);
    }
}

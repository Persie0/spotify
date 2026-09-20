package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class li40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133719a;

    /* JADX INFO: renamed from: b */
    public int f133720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f133721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f133721c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133719a = obj;
        this.f133720b |= Integer.MIN_VALUE;
        return this.f133721c.emit(null, this);
    }
}

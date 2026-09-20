package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xsd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265567a;

    /* JADX INFO: renamed from: b */
    public int f265568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f265569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f265569c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265567a = obj;
        this.f265568b |= Integer.MIN_VALUE;
        return this.f265569c.emit(null, this);
    }
}

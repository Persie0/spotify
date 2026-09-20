package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w0d1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f246703a;

    /* JADX INFO: renamed from: b */
    public int f246704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f246705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0d1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f246705c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f246703a = obj;
        this.f246704b |= Integer.MIN_VALUE;
        return this.f246705c.emit(null, this);
    }
}

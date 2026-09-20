package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class odm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f164220a;

    /* JADX INFO: renamed from: b */
    public int f164221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f164222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f164222c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164220a = obj;
        this.f164221b |= Integer.MIN_VALUE;
        return this.f164222c.emit(null, this);
    }
}

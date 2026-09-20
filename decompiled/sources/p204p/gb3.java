package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gb3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78177a;

    /* JADX INFO: renamed from: b */
    public int f78178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hb3 f78179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb3(hb3 hb3Var, fbk fbkVar) {
        super(fbkVar);
        this.f78179c = hb3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78177a = obj;
        this.f78178b |= Integer.MIN_VALUE;
        return this.f78179c.emit(null, this);
    }
}

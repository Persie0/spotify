package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uvb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234415a;

    /* JADX INFO: renamed from: b */
    public int f234416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t13 f234417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvb1(t13 t13Var, fbk fbkVar) {
        super(fbkVar);
        this.f234417c = t13Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234415a = obj;
        this.f234416b |= Integer.MIN_VALUE;
        return this.f234417c.emit(null, this);
    }
}

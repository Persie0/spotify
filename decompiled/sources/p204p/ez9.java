package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ez9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64306a;

    /* JADX INFO: renamed from: b */
    public int f64307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f64308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f64308c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64306a = obj;
        this.f64307b |= Integer.MIN_VALUE;
        return this.f64308c.emit(null, this);
    }
}

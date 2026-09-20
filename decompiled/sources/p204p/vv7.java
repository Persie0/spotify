package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vv7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f245159a;

    /* JADX INFO: renamed from: b */
    public int f245160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f245161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv7(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f245161c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f245159a = obj;
        this.f245160b |= Integer.MIN_VALUE;
        return this.f245161c.emit(null, this);
    }
}

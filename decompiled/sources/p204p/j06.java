package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j06 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107356a;

    /* JADX INFO: renamed from: b */
    public int f107357b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f107358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j06(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f107358c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107356a = obj;
        this.f107357b |= Integer.MIN_VALUE;
        return this.f107358c.emit(null, this);
    }
}

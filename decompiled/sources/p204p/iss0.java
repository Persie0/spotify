package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iss0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105305a;

    /* JADX INFO: renamed from: b */
    public int f105306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dss0 f105307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iss0(dss0 dss0Var, fbk fbkVar) {
        super(fbkVar);
        this.f105307c = dss0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105305a = obj;
        this.f105306b |= Integer.MIN_VALUE;
        return this.f105307c.emit(null, this);
    }
}

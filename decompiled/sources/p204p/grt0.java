package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class grt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f83828a;

    /* JADX INFO: renamed from: b */
    public int f83829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ert0 f83830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grt0(ert0 ert0Var, fbk fbkVar) {
        super(fbkVar);
        this.f83830c = ert0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83828a = obj;
        this.f83829b |= Integer.MIN_VALUE;
        return this.f83830c.emit(null, this);
    }
}

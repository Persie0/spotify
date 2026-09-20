package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ky21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127637a;

    /* JADX INFO: renamed from: b */
    public int f127638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f127639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f127639c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127637a = obj;
        this.f127638b |= Integer.MIN_VALUE;
        return this.f127639c.emit(null, this);
    }
}

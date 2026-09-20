package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wj31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f251837a;

    /* JADX INFO: renamed from: b */
    public int f251838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f251839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj31(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f251839c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251837a = obj;
        this.f251838b |= Integer.MIN_VALUE;
        return this.f251839c.emit(null, this);
    }
}

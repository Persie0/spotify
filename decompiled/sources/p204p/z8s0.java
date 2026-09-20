package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z8s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280552a;

    /* JADX INFO: renamed from: b */
    public int f280553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jq5 f280554c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8s0(jq5 jq5Var, fbk fbkVar) {
        super(fbkVar);
        this.f280554c = jq5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280552a = obj;
        this.f280553b |= Integer.MIN_VALUE;
        return this.f280554c.emit(null, this);
    }
}

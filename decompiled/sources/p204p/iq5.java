package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iq5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104630a;

    /* JADX INFO: renamed from: b */
    public int f104631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jq5 f104632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq5(jq5 jq5Var, fbk fbkVar) {
        super(fbkVar);
        this.f104632c = jq5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104630a = obj;
        this.f104631b |= Integer.MIN_VALUE;
        return this.f104632c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xt40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265746a;

    /* JADX INFO: renamed from: b */
    public int f265747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f265748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt40(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f265748c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265746a = obj;
        this.f265747b |= Integer.MIN_VALUE;
        return this.f265748c.emit(null, this);
    }
}

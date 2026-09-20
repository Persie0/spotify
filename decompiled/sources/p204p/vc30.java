package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f239656a;

    /* JADX INFO: renamed from: b */
    public int f239657b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f239658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc30(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f239658c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239656a = obj;
        this.f239657b |= Integer.MIN_VALUE;
        return this.f239658c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277733a;

    /* JADX INFO: renamed from: b */
    public int f277734b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zz90 f277735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz90(zz90 zz90Var, fbk fbkVar) {
        super(fbkVar);
        this.f277735c = zz90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277733a = obj;
        this.f277734b |= Integer.MIN_VALUE;
        return this.f277735c.emit(null, this);
    }
}

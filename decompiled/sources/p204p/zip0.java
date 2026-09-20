package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zip0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283219a;

    /* JADX INFO: renamed from: b */
    public int f283220b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f283221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zip0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f283221c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283219a = obj;
        this.f283220b |= Integer.MIN_VALUE;
        return this.f283221c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gz50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85845a;

    /* JADX INFO: renamed from: b */
    public int f85846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f85847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f85847c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85845a = obj;
        this.f85846b |= Integer.MIN_VALUE;
        return this.f85847c.emit(null, this);
    }
}

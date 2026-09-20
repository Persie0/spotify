package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yy50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277407a;

    /* JADX INFO: renamed from: b */
    public int f277408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f277409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f277409c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277407a = obj;
        this.f277408b |= Integer.MIN_VALUE;
        return this.f277409c.emit(null, this);
    }
}

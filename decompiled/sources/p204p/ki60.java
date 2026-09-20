package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ki60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122862a;

    /* JADX INFO: renamed from: b */
    public int f122863b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f122864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f122864c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122862a = obj;
        this.f122863b |= Integer.MIN_VALUE;
        return this.f122864c.emit(null, this);
    }
}

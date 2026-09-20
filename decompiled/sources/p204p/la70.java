package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class la70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131287a;

    /* JADX INFO: renamed from: b */
    public int f131288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f131289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f131289c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131287a = obj;
        this.f131288b |= Integer.MIN_VALUE;
        return this.f131289c.emit(null, this);
    }
}

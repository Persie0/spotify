package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m280 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139278a;

    /* JADX INFO: renamed from: b */
    public int f139279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f139280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m280(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f139280c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139278a = obj;
        this.f139279b |= Integer.MIN_VALUE;
        return this.f139280c.emit(null, this);
    }
}

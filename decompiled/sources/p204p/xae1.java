package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xae1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259668a;

    /* JADX INFO: renamed from: b */
    public int f259669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f259670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xae1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f259670c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259668a = obj;
        this.f259669b |= Integer.MIN_VALUE;
        return this.f259670c.emit(null, this);
    }
}

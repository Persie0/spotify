package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class enp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61193a;

    /* JADX INFO: renamed from: b */
    public int f61194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sn2 f61195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enp(sn2 sn2Var, fbk fbkVar) {
        super(fbkVar);
        this.f61195c = sn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61193a = obj;
        this.f61194b |= Integer.MIN_VALUE;
        return this.f61195c.emit(null, this);
    }
}

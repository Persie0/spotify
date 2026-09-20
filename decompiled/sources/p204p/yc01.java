package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yc01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271350a;

    /* JADX INFO: renamed from: b */
    public int f271351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zc01 f271352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc01(zc01 zc01Var, fbk fbkVar) {
        super(fbkVar);
        this.f271352c = zc01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271350a = obj;
        this.f271351b |= Integer.MIN_VALUE;
        return this.f271352c.emit(null, this);
    }
}

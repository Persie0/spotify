package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185094a;

    /* JADX INFO: renamed from: b */
    public int f185095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f185096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q470(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f185096c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185094a = obj;
        this.f185095b |= Integer.MIN_VALUE;
        return this.f185096c.emit(null, this);
    }
}

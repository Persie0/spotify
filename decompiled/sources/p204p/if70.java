package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class if70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f101700a;

    /* JADX INFO: renamed from: b */
    public int f101701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f101702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f101702c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101700a = obj;
        this.f101701b |= Integer.MIN_VALUE;
        return this.f101702c.emit(null, this);
    }
}

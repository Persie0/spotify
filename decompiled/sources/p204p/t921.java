package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218177a;

    /* JADX INFO: renamed from: b */
    public int f218178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f218179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t921(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f218179c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218177a = obj;
        this.f218178b |= Integer.MIN_VALUE;
        return this.f218179c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tvk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224186a;

    /* JADX INFO: renamed from: b */
    public int f224187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f224188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f224188c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224186a = obj;
        this.f224187b |= Integer.MIN_VALUE;
        return this.f224188c.emit(null, this);
    }
}

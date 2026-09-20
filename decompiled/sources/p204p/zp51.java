package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zp51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284937a;

    /* JADX INFO: renamed from: b */
    public int f284938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f284939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp51(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f284939c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284937a = obj;
        this.f284938b |= Integer.MIN_VALUE;
        return this.f284939c.emit(null, this);
    }
}

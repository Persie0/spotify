package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r490 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f195701a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f195702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u490 f195703c;

    /* JADX INFO: renamed from: d */
    public int f195704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r490(u490 u490Var, fbk fbkVar) {
        super(fbkVar);
        this.f195703c = u490Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195702b = obj;
        this.f195704d |= Integer.MIN_VALUE;
        return this.f195703c.m82316a(null, this);
    }
}

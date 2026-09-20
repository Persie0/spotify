package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class s1a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204645a;

    /* JADX INFO: renamed from: b */
    public int f204646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f204647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1a(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f204647c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204645a = obj;
        this.f204646b |= Integer.MIN_VALUE;
        return this.f204647c.emit(null, this);
    }
}

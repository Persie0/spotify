package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r6b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196233a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s6b0 f196234b;

    /* JADX INFO: renamed from: c */
    public int f196235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6b0(s6b0 s6b0Var, fbk fbkVar) {
        super(fbkVar);
        this.f196234b = s6b0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196233a = obj;
        this.f196235c |= Integer.MIN_VALUE;
        return this.f196234b.m77323a(this);
    }
}

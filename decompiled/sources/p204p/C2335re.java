package p204p;

/* JADX INFO: renamed from: p.re */
/* JADX INFO: loaded from: classes11.dex */
public final class C2335re extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198233a;

    /* JADX INFO: renamed from: b */
    public int f198234b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f198235c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335re(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f198235c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198233a = obj;
        this.f198234b |= Integer.MIN_VALUE;
        return this.f198235c.emit(null, this);
    }
}

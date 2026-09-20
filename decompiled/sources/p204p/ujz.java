package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ujz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231180a;

    /* JADX INFO: renamed from: b */
    public int f231181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjz f231182c;

    /* JADX INFO: renamed from: d */
    public niz f231183d;

    /* JADX INFO: renamed from: e */
    public nlv0 f231184e;

    /* JADX INFO: renamed from: f */
    public izx0 f231185f;

    /* JADX INFO: renamed from: g */
    public int f231186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujz(vjz vjzVar, fbk fbkVar) {
        super(fbkVar);
        this.f231182c = vjzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231180a = obj;
        this.f231181b |= Integer.MIN_VALUE;
        return this.f231182c.collect(null, this);
    }
}

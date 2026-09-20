package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hat extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89274a;

    /* JADX INFO: renamed from: b */
    public int f89275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f89276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hat(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f89276c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89274a = obj;
        this.f89275b |= Integer.MIN_VALUE;
        return this.f89276c.emit(null, this);
    }
}

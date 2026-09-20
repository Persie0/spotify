package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xyj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f267326a;

    /* JADX INFO: renamed from: b */
    public int f267327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f267328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyj0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f267328c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f267326a = obj;
        this.f267327b |= Integer.MIN_VALUE;
        return this.f267328c.emit(null, this);
    }
}

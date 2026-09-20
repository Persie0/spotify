package p204p;

/* JADX INFO: renamed from: p.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2399t3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216675a;

    /* JADX INFO: renamed from: b */
    public int f216676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f216677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2399t3(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f216677c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216675a = obj;
        this.f216676b |= Integer.MIN_VALUE;
        return this.f216677c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: renamed from: p.ew */
/* JADX INFO: loaded from: classes4.dex */
public final class C1829ew extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63377a;

    /* JADX INFO: renamed from: b */
    public int f63378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f63379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829ew(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f63379c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63377a = obj;
        this.f63378b |= Integer.MIN_VALUE;
        return this.f63379c.emit(null, this);
    }
}

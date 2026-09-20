package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class nue extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f158606a;

    /* JADX INFO: renamed from: b */
    public nlv0 f158607b;

    /* JADX INFO: renamed from: c */
    public nlv0 f158608c;

    /* JADX INFO: renamed from: d */
    public sir0 f158609d;

    /* JADX INFO: renamed from: e */
    public w1f1 f158610e;

    /* JADX INFO: renamed from: f */
    public w1f1 f158611f;

    /* JADX INFO: renamed from: g */
    public long f158612g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f158613h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ inc f158614i;

    /* JADX INFO: renamed from: t */
    public int f158615t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nue(inc incVar, fbk fbkVar) {
        super(fbkVar);
        this.f158614i = incVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158613h = obj;
        this.f158615t |= Integer.MIN_VALUE;
        return this.f158614i.emit(null, this);
    }
}

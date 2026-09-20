package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hlz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92769a;

    /* JADX INFO: renamed from: b */
    public int f92770b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ner f92771c;

    /* JADX INFO: renamed from: d */
    public niz f92772d;

    /* JADX INFO: renamed from: e */
    public rlv0 f92773e;

    /* JADX INFO: renamed from: f */
    public int f92774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlz(ner nerVar, fbk fbkVar) {
        super(fbkVar);
        this.f92771c = nerVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92769a = obj;
        this.f92770b |= Integer.MIN_VALUE;
        return this.f92771c.collect(null, this);
    }
}

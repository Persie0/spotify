package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f262243a;

    /* JADX INFO: renamed from: b */
    public int f262244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjz f262245c;

    /* JADX INFO: renamed from: d */
    public niz f262246d;

    /* JADX INFO: renamed from: e */
    public izx0 f262247e;

    /* JADX INFO: renamed from: f */
    public int f262248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjz(vjz vjzVar, fbk fbkVar) {
        super(fbkVar);
        this.f262245c = vjzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f262243a = obj;
        this.f262244b |= Integer.MIN_VALUE;
        return this.f262245c.collect(null, this);
    }
}

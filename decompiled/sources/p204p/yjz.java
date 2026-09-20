package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273503a;

    /* JADX INFO: renamed from: b */
    public int f273504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjz f273505c;

    /* JADX INFO: renamed from: d */
    public niz f273506d;

    /* JADX INFO: renamed from: e */
    public int f273507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjz(vjz vjzVar, fbk fbkVar) {
        super(fbkVar);
        this.f273505c = vjzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273503a = obj;
        this.f273504b |= Integer.MIN_VALUE;
        return this.f273505c.collect(null, this);
    }
}

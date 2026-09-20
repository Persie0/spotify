package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kx11 extends ibk {

    /* JADX INFO: renamed from: a */
    public xx11 f127308a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f127309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f127310c;

    /* JADX INFO: renamed from: d */
    public int f127311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx11(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f127310c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127309b = obj;
        this.f127311d |= Integer.MIN_VALUE;
        return this.f127310c.m84456c(null, this);
    }
}

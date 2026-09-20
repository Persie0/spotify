package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ndy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ob71 f152867a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f152868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f152869c;

    /* JADX INFO: renamed from: d */
    public int f152870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndy0(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f152869c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152868b = obj;
        this.f152870d |= Integer.MIN_VALUE;
        return this.f152869c.m84457d(null, this);
    }
}

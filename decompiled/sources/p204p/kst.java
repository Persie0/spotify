package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kst extends ibk {

    /* JADX INFO: renamed from: a */
    public mst f126012a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f126013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mst f126014c;

    /* JADX INFO: renamed from: d */
    public int f126015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kst(mst mstVar, fbk fbkVar) {
        super(fbkVar);
        this.f126014c = mstVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126013b = obj;
        this.f126015d |= Integer.MIN_VALUE;
        return this.f126014c.m62777a(this);
    }
}

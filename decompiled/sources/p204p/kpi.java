package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kpi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125073a;

    /* JADX INFO: renamed from: b */
    public int f125074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f125075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f125075c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125073a = obj;
        this.f125074b |= Integer.MIN_VALUE;
        return this.f125075c.emit(null, this);
    }
}

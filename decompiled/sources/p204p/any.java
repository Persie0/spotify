package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class any extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17519a;

    /* JADX INFO: renamed from: b */
    public int f17520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f17521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public any(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f17521c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17519a = obj;
        this.f17520b |= Integer.MIN_VALUE;
        return this.f17521c.emit(null, this);
    }
}

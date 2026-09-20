package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hiz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91911a;

    /* JADX INFO: renamed from: b */
    public int f91912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f91913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiz(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f91913c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91911a = obj;
        this.f91912b |= Integer.MIN_VALUE;
        return this.f91913c.emit(null, this);
    }
}

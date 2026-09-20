package p204p;

/* JADX INFO: renamed from: p.try, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class Ctry extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223143a;

    /* JADX INFO: renamed from: b */
    public int f223144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f223145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ctry(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f223145c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223143a = obj;
        this.f223144b |= Integer.MIN_VALUE;
        return this.f223145c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tux extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223966a;

    /* JADX INFO: renamed from: b */
    public int f223967b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f223968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tux(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f223968c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223966a = obj;
        this.f223967b |= Integer.MIN_VALUE;
        return this.f223968c.emit(null, this);
    }
}

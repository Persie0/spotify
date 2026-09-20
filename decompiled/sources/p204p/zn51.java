package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zn51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284416a;

    /* JADX INFO: renamed from: b */
    public int f284417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m2p f284418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn51(m2p m2pVar, fbk fbkVar) {
        super(fbkVar);
        this.f284418c = m2pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284416a = obj;
        this.f284417b |= Integer.MIN_VALUE;
        return this.f284418c.emit(null, this);
    }
}

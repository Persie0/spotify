package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o6u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162414a;

    /* JADX INFO: renamed from: b */
    public int f162415b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f162416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f162416c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162414a = obj;
        this.f162415b |= Integer.MIN_VALUE;
        return this.f162416c.emit(null, this);
    }
}

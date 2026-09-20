package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t4u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217074a;

    /* JADX INFO: renamed from: b */
    public int f217075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f217076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f217076c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217074a = obj;
        this.f217075b |= Integer.MIN_VALUE;
        return this.f217076c.emit(null, this);
    }
}

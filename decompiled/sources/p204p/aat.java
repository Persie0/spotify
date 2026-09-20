package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aat extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13918a;

    /* JADX INFO: renamed from: b */
    public int f13919b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f13920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aat(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f13920c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13918a = obj;
        this.f13919b |= Integer.MIN_VALUE;
        return this.f13920c.emit(null, this);
    }
}

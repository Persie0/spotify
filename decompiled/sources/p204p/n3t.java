package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n3t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150120a;

    /* JADX INFO: renamed from: b */
    public int f150121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f150122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3t(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f150122c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150120a = obj;
        this.f150121b |= Integer.MIN_VALUE;
        return this.f150122c.emit(null, this);
    }
}

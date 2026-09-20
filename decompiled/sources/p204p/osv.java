package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class osv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168903a;

    /* JADX INFO: renamed from: b */
    public int f168904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f168905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f168905c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168903a = obj;
        this.f168904b |= Integer.MIN_VALUE;
        return this.f168905c.emit(null, this);
    }
}

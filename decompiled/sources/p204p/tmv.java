package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tmv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221782a;

    /* JADX INFO: renamed from: b */
    public int f221783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f221784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f221784c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221782a = obj;
        this.f221783b |= Integer.MIN_VALUE;
        return this.f221784c.emit(null, this);
    }
}

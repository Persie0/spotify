package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u4w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226811a;

    /* JADX INFO: renamed from: b */
    public int f226812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f226813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4w(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f226813c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226811a = obj;
        this.f226812b |= Integer.MIN_VALUE;
        return this.f226813c.emit(null, this);
    }
}

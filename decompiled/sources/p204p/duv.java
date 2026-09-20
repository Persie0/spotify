package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class duv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53308a;

    /* JADX INFO: renamed from: b */
    public int f53309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f53310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f53310c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53308a = obj;
        this.f53309b |= Integer.MIN_VALUE;
        return this.f53310c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zpt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285217a;

    /* JADX INFO: renamed from: b */
    public int f285218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f285219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpt(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f285219c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285217a = obj;
        this.f285218b |= Integer.MIN_VALUE;
        return this.f285219c.emit(null, this);
    }
}

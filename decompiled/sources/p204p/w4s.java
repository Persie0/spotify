package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w4s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247876a;

    /* JADX INFO: renamed from: b */
    public int f247877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x4s f247878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4s(x4s x4sVar, fbk fbkVar) {
        super(fbkVar);
        this.f247878c = x4sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247876a = obj;
        this.f247877b |= Integer.MIN_VALUE;
        return this.f247878c.emit(null, this);
    }
}

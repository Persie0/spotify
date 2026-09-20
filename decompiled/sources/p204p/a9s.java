package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a9s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13632a;

    /* JADX INFO: renamed from: b */
    public int f13633b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f13634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9s(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f13634c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13632a = obj;
        this.f13633b |= Integer.MIN_VALUE;
        return this.f13634c.emit(null, this);
    }
}

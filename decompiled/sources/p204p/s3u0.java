package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s3u0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205344a;

    /* JADX INFO: renamed from: b */
    public int f205345b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f205346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3u0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f205346c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205344a = obj;
        this.f205345b |= Integer.MIN_VALUE;
        return this.f205346c.emit(null, this);
    }
}

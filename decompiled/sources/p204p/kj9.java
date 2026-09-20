package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kj9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123268a;

    /* JADX INFO: renamed from: b */
    public int f123269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f123270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f123270c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123268a = obj;
        this.f123269b |= Integer.MIN_VALUE;
        return this.f123270c.emit(null, this);
    }
}

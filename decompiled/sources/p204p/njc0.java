package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class njc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154557a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pjc0 f154558b;

    /* JADX INFO: renamed from: c */
    public int f154559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njc0(pjc0 pjc0Var, fbk fbkVar) {
        super(fbkVar);
        this.f154558b = pjc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154557a = obj;
        this.f154559c |= Integer.MIN_VALUE;
        this.f154558b.collect(null, this);
        return yuk.f276404a;
    }
}

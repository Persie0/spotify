package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dqz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52119a;

    /* JADX INFO: renamed from: b */
    public int f52120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f52121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f52121c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52119a = obj;
        this.f52120b |= Integer.MIN_VALUE;
        return this.f52121c.emit(null, this);
    }
}

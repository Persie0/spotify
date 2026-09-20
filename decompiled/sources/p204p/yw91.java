package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yw91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276926a;

    /* JADX INFO: renamed from: b */
    public int f276927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t091 f276928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw91(t091 t091Var, fbk fbkVar) {
        super(fbkVar);
        this.f276928c = t091Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276926a = obj;
        this.f276927b |= Integer.MIN_VALUE;
        return this.f276928c.emit(null, this);
    }
}

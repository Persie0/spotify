package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aud1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19921a;

    /* JADX INFO: renamed from: b */
    public int f19922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t091 f19923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aud1(t091 t091Var, fbk fbkVar) {
        super(fbkVar);
        this.f19923c = t091Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19921a = obj;
        this.f19922b |= Integer.MIN_VALUE;
        return this.f19923c.emit(null, this);
    }
}

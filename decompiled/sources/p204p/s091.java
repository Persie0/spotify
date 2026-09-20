package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s091 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204323a;

    /* JADX INFO: renamed from: b */
    public int f204324b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t091 f204325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s091(t091 t091Var, fbk fbkVar) {
        super(fbkVar);
        this.f204325c = t091Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204323a = obj;
        this.f204324b |= Integer.MIN_VALUE;
        return this.f204325c.emit(null, this);
    }
}

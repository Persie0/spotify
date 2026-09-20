package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d09 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43813a;

    /* JADX INFO: renamed from: b */
    public int f43814b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f43815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d09(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f43815c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43813a = obj;
        this.f43814b |= Integer.MIN_VALUE;
        return this.f43815c.emit(null, this);
    }
}

package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ec8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58257a;

    /* JADX INFO: renamed from: b */
    public int f58258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f58259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec8(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f58259c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58257a = obj;
        this.f58258b |= Integer.MIN_VALUE;
        return this.f58259c.emit(null, this);
    }
}

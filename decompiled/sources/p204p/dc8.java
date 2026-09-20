package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dc8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47448a;

    /* JADX INFO: renamed from: b */
    public int f47449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f47450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc8(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f47450c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47448a = obj;
        this.f47449b |= Integer.MIN_VALUE;
        return this.f47450c.emit(null, this);
    }
}

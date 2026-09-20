package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c09 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32714a;

    /* JADX INFO: renamed from: b */
    public int f32715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f32716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c09(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f32716c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32714a = obj;
        this.f32715b |= Integer.MIN_VALUE;
        return this.f32716c.emit(null, this);
    }
}

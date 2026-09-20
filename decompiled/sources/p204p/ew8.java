package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ew8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63451a;

    /* JADX INFO: renamed from: b */
    public int f63452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f63453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew8(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f63453c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63451a = obj;
        this.f63452b |= Integer.MIN_VALUE;
        return this.f63453c.emit(null, this);
    }
}

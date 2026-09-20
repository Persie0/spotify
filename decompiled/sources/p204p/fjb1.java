package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fjb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70152a;

    /* JADX INFO: renamed from: b */
    public int f70153b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f70154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjb1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f70154c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70152a = obj;
        this.f70153b |= Integer.MIN_VALUE;
        return this.f70154c.emit(null, this);
    }
}

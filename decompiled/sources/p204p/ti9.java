package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ti9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220578a;

    /* JADX INFO: renamed from: b */
    public int f220579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f220580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f220580c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220578a = obj;
        this.f220579b |= Integer.MIN_VALUE;
        return this.f220580c.emit(null, this);
    }
}

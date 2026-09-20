package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ek70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60392a;

    /* JADX INFO: renamed from: b */
    public int f60393b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f60394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f60394c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60392a = obj;
        this.f60393b |= Integer.MIN_VALUE;
        return this.f60394c.emit(null, this);
    }
}

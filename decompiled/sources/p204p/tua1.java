package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tua1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223807a;

    /* JADX INFO: renamed from: b */
    public int f223808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uc90 f223809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tua1(uc90 uc90Var, fbk fbkVar) {
        super(fbkVar);
        this.f223809c = uc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223807a = obj;
        this.f223808b |= Integer.MIN_VALUE;
        return this.f223809c.emit(null, this);
    }
}

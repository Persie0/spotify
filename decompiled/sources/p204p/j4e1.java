package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j4e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108679a;

    /* JADX INFO: renamed from: b */
    public int f108680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f108681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4e1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f108681c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108679a = obj;
        this.f108680b |= Integer.MIN_VALUE;
        return this.f108681c.emit(null, this);
    }
}

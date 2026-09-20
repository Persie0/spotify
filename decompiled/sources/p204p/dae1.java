package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dae1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47036a;

    /* JADX INFO: renamed from: b */
    public int f47037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f47038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dae1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f47038c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47036a = obj;
        this.f47037b |= Integer.MIN_VALUE;
        return this.f47038c.emit(null, this);
    }
}

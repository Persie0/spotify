package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gg01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f79501a;

    /* JADX INFO: renamed from: b */
    public int f79502b;

    /* JADX INFO: renamed from: c */
    public niz f79503c;

    /* JADX INFO: renamed from: d */
    public int f79504d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kre0 f79505e;

    /* JADX INFO: renamed from: f */
    public xf01 f79506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg01(kre0 kre0Var, fbk fbkVar) {
        super(fbkVar);
        this.f79505e = kre0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f79501a = obj;
        this.f79502b |= Integer.MIN_VALUE;
        return this.f79505e.emit(null, this);
    }
}

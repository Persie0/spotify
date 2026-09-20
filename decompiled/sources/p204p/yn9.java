package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yn9 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqa f274421b;

    public /* synthetic */ yn9(bqa bqaVar, int i) {
        this.f274420a = i;
        this.f274421b = bqaVar;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f274420a) {
            case 0:
                bqa bqaVar = this.f274421b;
                w2a1 w2a1Var = w2a1.f247311a;
                bqaVar.mo30231j(w2a1Var);
                return w2a1Var;
            default:
                Object objMo30229d = this.f274421b.mo30229d(obj, fbkVar);
                return objMo30229d == yuk.f276404a ? objMo30229d : w2a1.f247311a;
        }
    }
}

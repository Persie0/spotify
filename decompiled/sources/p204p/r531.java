package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r531 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s531 f195949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r531(s531 s531Var, int i) {
        super(0);
        this.f195948a = i;
        this.f195949b = s531Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f195948a) {
            case 0:
                return this.f195949b;
            default:
                jst jstVar = this.f195949b.f205707E1;
                if (jstVar != null) {
                    return jstVar;
                }
                wj50.m88260d0("viewModelFactory");
                throw null;
        }
    }
}

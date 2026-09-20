package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g901 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h901 f77641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g901(h901 h901Var, int i) {
        super(0);
        this.f77640a = i;
        this.f77641b = h901Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f77640a) {
            case 0:
                gn41 gn41Var = this.f77641b.f88848a.f67141b;
                return new s15(gn41Var.f81564d, null, gn41Var.f81565e, null, 8);
            default:
                f901 f901Var = this.f77641b.f88848a;
                gn41 gn41Var2 = f901Var.f67141b;
                z601 z601Var = new z601(f901Var);
                Integer num = gn41Var2.f81566f;
                xxf xxfVar = gn41Var2.f81567g;
                return new s15(num, null, null, xxfVar != null ? new r15(xxfVar, z601Var) : null, 4);
        }
    }
}

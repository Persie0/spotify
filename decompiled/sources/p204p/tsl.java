package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tsl extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f223339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tsl(int i, int i2) {
        super(1);
        this.f223338a = i2;
        this.f223339b = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f223338a) {
            case 0:
                return new rq91(this.f223339b);
            case 1:
                return Boolean.valueOf(((pqz) obj).m70697N1(this.f223339b));
            case 2:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("DELETE FROM history WHERE uri NOT IN (SELECT uri FROM history ORDER BY timeStamp DESC LIMIT (30 - ?))");
                try {
                    ezx0VarMo63454G1.mo24846u(1, this.f223339b);
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1.f247311a;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            default:
                return kif1.m56501j((st91) obj).m86922e(this.f223339b).m74553j();
        }
    }
}

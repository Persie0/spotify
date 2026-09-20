package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e901 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f57327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e901(int i, vh00 vh00Var) {
        super(4);
        this.f57326a = i;
        switch (i) {
            case 1:
                this.f57327b = (qe70) vh00Var;
                super(4);
                break;
            default:
                this.f57327b = (qe70) vh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.qe70, p.xh00] */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p.qe70, p.vh00] */
    /* JADX WARN: Type inference failed for: r5v4, types: [p.qe70, p.vh00] */
    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f57326a) {
            case 0:
                return (av91) this.f57327b.mo24510D0((pv91) obj, ((f901) obj2).f67142c, obj4);
            case 1:
                ((Number) obj3).intValue();
                jg01 jg01Var = (jg01) this.f57327b.mo24510D0(obj, obj2, (st91) obj4);
                return jg01Var == null ? jg01.f111991b : jg01Var;
            case 2:
                jg01 jg01Var2 = (jg01) obj;
                if (jg01Var2.equals(jg01.f111991b)) {
                    jg01Var2 = null;
                }
                if (jg01Var2 != null) {
                    return (av91) this.f57327b.mo24818M(jg01Var2.f111992a, obj2, obj3, obj4);
                }
                return null;
            default:
                int iIntValue = ((Number) obj3).intValue();
                this.f57327b.invoke(Integer.valueOf(iIntValue));
                return new ed01(Integer.valueOf(iIntValue));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e901(gh00 gh00Var) {
        super(4);
        this.f57326a = 3;
        this.f57327b = (qe70) gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e901(xh00 xh00Var) {
        super(4);
        this.f57326a = 2;
        this.f57327b = (qe70) xh00Var;
    }
}

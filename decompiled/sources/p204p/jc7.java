package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jc7 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f111007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v6w0 f111008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jc7(q6u q6uVar, eh00 eh00Var, v6w0 v6w0Var) {
        super(0);
        this.f111006a = 1;
        this.f111007b = (qe70) eh00Var;
        this.f111008c = v6w0Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v10, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p.eh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f111006a) {
            case 0:
                nc7 nc7Var = (nc7) this.f111007b.invoke();
                v6w0 v6w0Var = this.f111008c;
                u6w0 u6w0Var = v6w0Var.f237984f;
                return edg1.m38593n(nc7.m64123a(nc7Var, u6w0Var != null ? u6w0Var.f227441a : null), v6w0Var.f237982d);
            case 1:
                cqv cqvVar = (cqv) this.f111007b.invoke();
                v6w0 v6w0Var2 = this.f111008c;
                u6w0 u6w0Var2 = v6w0Var2.f237984f;
                String str = u6w0Var2 != null ? u6w0Var2.f227441a : null;
                String str2 = cqvVar.f40998a;
                return new q4k(v6w0Var2.f237982d, cqvVar.f41007j != null, false, cqvVar.f41003f, cqvVar.f40999b, false, false, null, false, false, 2, !cqvVar.f41002e, false, false, false, false, null, cqvVar.f41004g, false, cqvVar.f41008k, false, str, null, null, false, false, 1051711380);
            default:
                x6w x6wVar = (x6w) this.f111007b.invoke();
                v6w0 v6w0Var3 = this.f111008c;
                u6w0 u6w0Var3 = v6w0Var3.f237984f;
                return pwg1.m71264A(x6w.m90104a(x6wVar, u6w0Var3 != null ? u6w0Var3.f227441a : null), v6w0Var3.f237982d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jc7(eh00 eh00Var, v6w0 v6w0Var, int i) {
        super(0);
        this.f111006a = i;
        switch (i) {
            case 2:
                this.f111007b = (qe70) eh00Var;
                this.f111008c = v6w0Var;
                super(0);
                break;
            default:
                this.f111007b = (qe70) eh00Var;
                this.f111008c = v6w0Var;
                break;
        }
    }
}

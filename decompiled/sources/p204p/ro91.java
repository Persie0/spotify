package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ro91 extends lmq {

    /* JADX INFO: renamed from: b */
    public final String f201197b;

    public ro91(String str) {
        this.f201197b = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m76030O0(int i) {
        String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i == 2) {
            objArr[0] = "delegate";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i == 1) {
            objArr[1] = "toString";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i == 3) {
                objArr[2] = "refine";
            } else if (i != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.lmq, p204p.gd70
    /* JADX INFO: renamed from: E0 */
    public final gd70 mo35110H0(ld70 ld70Var) {
        if (ld70Var != null) {
            return this;
        }
        m76030O0(3);
        throw null;
    }

    @Override // p204p.jd21, p204p.d6a1
    /* JADX INFO: renamed from: G0 */
    public final /* bridge */ /* synthetic */ d6a1 mo35109G0(boolean z) {
        mo35109G0(z);
        throw null;
    }

    @Override // p204p.lmq, p204p.d6a1
    /* JADX INFO: renamed from: H0 */
    public final d6a1 mo35110H0(ld70 ld70Var) {
        if (ld70Var != null) {
            return this;
        }
        m76030O0(3);
        throw null;
    }

    @Override // p204p.jd21, p204p.d6a1
    /* JADX INFO: renamed from: I0 */
    public final /* bridge */ /* synthetic */ d6a1 mo35111I0(gn91 gn91Var) {
        mo35111I0(gn91Var);
        throw null;
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: J0 */
    public final jd21 mo35109G0(boolean z) {
        throw new IllegalStateException(this.f201197b);
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: K0 */
    public final jd21 mo35111I0(gn91 gn91Var) {
        if (gn91Var != null) {
            throw new IllegalStateException(this.f201197b);
        }
        m76030O0(0);
        throw null;
    }

    @Override // p204p.lmq
    /* JADX INFO: renamed from: L0 */
    public final jd21 mo48291L0() {
        throw new IllegalStateException(this.f201197b);
    }

    @Override // p204p.lmq
    /* JADX INFO: renamed from: M0 */
    public final jd21 mo41684E0(ld70 ld70Var) {
        if (ld70Var != null) {
            return this;
        }
        m76030O0(3);
        throw null;
    }

    @Override // p204p.lmq
    /* JADX INFO: renamed from: N0 */
    public final lmq mo45438N0(jd21 jd21Var) {
        throw new IllegalStateException(this.f201197b);
    }

    @Override // p204p.jd21
    public final String toString() {
        String str = this.f201197b;
        if (str != null) {
            return str;
        }
        m76030O0(1);
        throw null;
    }
}

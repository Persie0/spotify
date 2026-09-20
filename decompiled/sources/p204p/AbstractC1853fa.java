package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.fa */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1853fa extends rqo implements bo91 {

    /* JADX INFO: renamed from: X */
    public final bna0 f67395X;

    /* JADX INFO: renamed from: f */
    public final int f67396f;

    /* JADX INFO: renamed from: g */
    public final boolean f67397g;

    /* JADX INFO: renamed from: h */
    public final int f67398h;

    /* JADX INFO: renamed from: i */
    public final yma0 f67399i;

    /* JADX INFO: renamed from: t */
    public final yma0 f67400t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1853fa(y751 y751Var, oqo oqoVar, l25 l25Var, qti0 qti0Var, int i, boolean z, int i2, hkr0 hkr0Var) {
        super(oqoVar, l25Var, qti0Var, du31.f52959o0);
        if (y751Var == null) {
            m41113A0(0);
            throw null;
        }
        if (oqoVar == null) {
            m41113A0(1);
            throw null;
        }
        if (l25Var == null) {
            m41113A0(2);
            throw null;
        }
        if (qti0Var == null) {
            m41113A0(3);
            throw null;
        }
        if (i == 0) {
            m41113A0(4);
            throw null;
        }
        if (hkr0Var == null) {
            m41113A0(6);
            throw null;
        }
        this.f67396f = i;
        this.f67397g = z;
        this.f67398h = i2;
        C1771da c1771da = new C1771da(this, y751Var, hkr0Var);
        bna0 bna0Var = (bna0) y751Var;
        this.f67399i = new yma0(bna0Var, c1771da);
        this.f67400t = new yma0(bna0Var, new C2445u9(this, qti0Var, 1));
        this.f67395X = bna0Var;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m41113A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: A */
    public final boolean mo27373A() {
        return this.f67397g;
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: C */
    public final int mo27374C() {
        int i = this.f67396f;
        if (i != 0) {
            return i;
        }
        m41113A0(7);
        throw null;
    }

    /* JADX INFO: renamed from: I1 */
    public abstract List mo33492I1();

    @Override // p204p.bo91
    /* JADX INFO: renamed from: O */
    public final y751 mo27375O() {
        bna0 bna0Var = this.f67395X;
        if (bna0Var != null) {
            return bna0Var;
        }
        m41113A0(14);
        throw null;
    }

    @Override // p204p.bo91
    /* JADX INFO: renamed from: S */
    public final boolean mo27376S() {
        return false;
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final qge mo27377a() {
        return this;
    }

    @Override // p204p.bo91
    public final int getIndex() {
        return this.f67398h;
    }

    @Override // p204p.bo91
    public final List getUpperBounds() {
        List listM31981d = ((C1807ea) mo27378k()).mo25172f();
        if (listM31981d != null) {
            return listM31981d;
        }
        m41113A0(8);
        throw null;
    }

    @Override // p204p.bo91, p204p.qge
    /* JADX INFO: renamed from: k */
    public final jn91 mo27378k() {
        jn91 jn91Var = (jn91) this.f67399i.invoke();
        if (jn91Var != null) {
            return jn91Var;
        }
        m41113A0(9);
        throw null;
    }

    @Override // p204p.qge
    /* JADX INFO: renamed from: q */
    public final jd21 mo27380q() {
        jd21 jd21Var = (jd21) this.f67400t.invoke();
        if (jd21Var != null) {
            return jd21Var;
        }
        m41113A0(10);
        throw null;
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28179b(this, obj);
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final oqo mo27377a() {
        return this;
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: a */
    public final bo91 mo27377a() {
        return this;
    }

    @Override // p204p.rqo
    /* JADX INFO: renamed from: G1 */
    public final qqo mo27377a() {
        return this;
    }

    /* JADX INFO: renamed from: H1 */
    public List mo41114H1(List list) {
        return list;
    }
}

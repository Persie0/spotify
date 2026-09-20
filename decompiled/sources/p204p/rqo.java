package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class rqo extends pqo implements qqo {

    /* JADX INFO: renamed from: d */
    public final oqo f201855d;

    /* JADX INFO: renamed from: e */
    public final du31 f201856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqo(oqo oqoVar, l25 l25Var, qti0 qti0Var, du31 du31Var) {
        super(l25Var, qti0Var);
        if (oqoVar == null) {
            m76260A0(0);
            throw null;
        }
        if (l25Var == null) {
            m76260A0(1);
            throw null;
        }
        if (qti0Var == null) {
            m76260A0(2);
            throw null;
        }
        if (du31Var == null) {
            m76260A0(3);
            throw null;
        }
        this.f201855d = oqoVar;
        this.f201856e = du31Var;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m76260A0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public du31 getSource() {
        du31 du31Var = this.f201856e;
        if (du31Var != null) {
            return du31Var;
        }
        m76260A0(6);
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public oqo mo27379o() {
        oqo oqoVar = this.f201855d;
        if (oqoVar != null) {
            return oqoVar;
        }
        m76260A0(5);
        throw null;
    }

    @Override // p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: G1 */
    public qqo mo27377a() {
        return this;
    }
}

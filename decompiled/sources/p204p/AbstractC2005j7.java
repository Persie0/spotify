package p204p;

/* JADX INFO: renamed from: p.j7 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2005j7 extends AbstractC1853fa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2005j7(y751 y751Var, oqo oqoVar, l25 l25Var, qti0 qti0Var, int i, boolean z, int i2, hkr0 hkr0Var) {
        super(y751Var, oqoVar, l25Var, qti0Var, i, z, i2, hkr0Var);
        if (y751Var == null) {
            m52596A0(0);
            throw null;
        }
        if (oqoVar == null) {
            m52596A0(1);
            throw null;
        }
        if (i == 0) {
            m52596A0(4);
            throw null;
        }
        if (hkr0Var != null) {
        } else {
            m52596A0(6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m52596A0(int i) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p204p.pqo, p204p.AbstractC1806e9
    public final String toString() {
        return (this.f67397g ? "reified " : "") + (mo27374C() != 1 ? xl81.m91412u(mo27374C()).concat(" ") : "") + getName();
    }
}

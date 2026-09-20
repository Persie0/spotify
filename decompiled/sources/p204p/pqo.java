package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pqo extends AbstractC1806e9 implements oqo {

    /* JADX INFO: renamed from: c */
    public final qti0 f180353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqo(l25 l25Var, qti0 qti0Var) {
        super(l25Var);
        if (l25Var == null) {
            m70658A0(0);
            throw null;
        }
        if (qti0Var == null) {
            m70658A0(1);
            throw null;
        }
        this.f180353c = qti0Var;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m70658A0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: F1 */
    public static String m70659F1(oqo oqoVar) {
        try {
            String str = jxq.f117172e.m54718v(oqoVar) + "[" + oqoVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(oqoVar)) + "]";
            if (str != null) {
                return str;
            }
            m70658A0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = oqoVar.getClass().getSimpleName() + " " + oqoVar.getName();
            if (str2 != null) {
                return str2;
            }
            m70658A0(6);
            throw null;
        }
    }

    @Override // p204p.oqo
    public final qti0 getName() {
        qti0 qti0Var = this.f180353c;
        if (qti0Var != null) {
            return qti0Var;
        }
        m70658A0(2);
        throw null;
    }

    @Override // p204p.AbstractC1806e9
    public String toString() {
        return m70659F1(this);
    }

    /* JADX INFO: renamed from: a */
    public oqo mo27377a() {
        return this;
    }
}

package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ofe extends AbstractC1803e6 {

    /* JADX INFO: renamed from: e */
    public final oqo f164742e;

    /* JADX INFO: renamed from: f */
    public final du31 f164743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofe(y751 y751Var, oqo oqoVar, qti0 qti0Var, du31 du31Var) {
        super(y751Var, qti0Var);
        if (y751Var == null) {
            m66818u0(0);
            throw null;
        }
        if (oqoVar == null) {
            m66818u0(1);
            throw null;
        }
        if (qti0Var == null) {
            m66818u0(2);
            throw null;
        }
        this.f164742e = oqoVar;
        this.f164743f = du31Var;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m66818u0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.qqo
    public final du31 getSource() {
        du31 du31Var = this.f164743f;
        if (du31Var != null) {
            return du31Var;
        }
        m66818u0(5);
        throw null;
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: o */
    public final oqo mo27379o() {
        oqo oqoVar = this.f164742e;
        if (oqoVar != null) {
            return oqoVar;
        }
        m66818u0(4);
        throw null;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: s */
    public boolean mo28472s() {
        return false;
    }
}

package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qtx extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final cab f192498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtx(cab cabVar, gd70 gd70Var) {
        super(gd70Var);
        if (cabVar == null) {
            m73854A0(0);
            throw null;
        }
        if (gd70Var == null) {
            m73854A0(1);
            throw null;
        }
        this.f192498c = cabVar;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m73854A0(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p204p.AbstractC1806e9
    public final String toString() {
        return getType() + ": Ext {" + this.f192498c + "}";
    }
}

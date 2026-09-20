package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g4b1 extends rqo implements f4b1 {

    /* JADX INFO: renamed from: f */
    public gd70 f76385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4b1(oqo oqoVar, l25 l25Var, qti0 qti0Var, gd70 gd70Var, du31 du31Var) {
        super(oqoVar, l25Var, qti0Var, du31Var);
        if (oqoVar == null) {
            m43524A0(0);
            throw null;
        }
        if (l25Var == null) {
            m43524A0(1);
            throw null;
        }
        if (qti0Var == null) {
            m43524A0(2);
            throw null;
        }
        if (du31Var == null) {
            m43524A0(3);
            throw null;
        }
        this.f76385f = gd70Var;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m43524A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: K */
    public final List mo32015K() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m43524A0(6);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: Q */
    public wr70 mo32017Q() {
        return null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: f0 */
    public boolean mo28800f0() {
        return false;
    }

    @Override // p204p.AbstractC1806e9, p204p.rzu0
    public final gd70 getType() {
        gd70 gd70Var = this.f76385f;
        if (gd70Var != null) {
            return gd70Var;
        }
        m43524A0(4);
        throw null;
    }

    @Override // p204p.cab
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m43524A0(8);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: i */
    public gd70 mo29933i() {
        gd70 type = getType();
        if (type != null) {
            return type;
        }
        m43524A0(10);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: n0 */
    public List mo32018n0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m43524A0(9);
        throw null;
    }
}

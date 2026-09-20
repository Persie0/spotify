package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class dge extends AbstractC1849f6 {

    /* JADX INFO: renamed from: c */
    public final kxh0 f48783c;

    /* JADX INFO: renamed from: d */
    public final List f48784d;

    /* JADX INFO: renamed from: e */
    public final Collection f48785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dge(kxh0 kxh0Var, List list, Collection collection, y751 y751Var) {
        super(y751Var);
        if (list == null) {
            m35922j(1);
            throw null;
        }
        if (collection == null) {
            m35922j(2);
            throw null;
        }
        if (y751Var == null) {
            m35922j(3);
            throw null;
        }
        this.f48783c = kxh0Var;
        this.f48784d = Collections.unmodifiableList(new ArrayList(list));
        this.f48785e = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m35922j(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: I */
    public final boolean mo25170I() {
        return true;
    }

    @Override // p204p.AbstractC1734ca
    /* JADX INFO: renamed from: a */
    public final Collection mo31978a() {
        Collection collection = this.f48785e;
        if (collection != null) {
            return collection;
        }
        m35922j(6);
        throw null;
    }

    @Override // p204p.AbstractC1734ca
    /* JADX INFO: renamed from: c */
    public final hkr0 mo31980c() {
        return hkr0.f92480R0;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: e */
    public final List mo25171e() {
        List list = this.f48784d;
        if (list != null) {
            return list;
        }
        m35922j(4);
        throw null;
    }

    @Override // p204p.AbstractC1849f6
    /* JADX INFO: renamed from: k */
    public final nfe mo25169G() {
        kxh0 kxh0Var = this.f48783c;
        if (kxh0Var != null) {
            return kxh0Var;
        }
        m35922j(5);
        throw null;
    }

    public final String toString() {
        return rxq.m76668f(this.f48783c).f279080a;
    }
}

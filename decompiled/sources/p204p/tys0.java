package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class tys0 extends lys0 implements kys0 {

    /* JADX INFO: renamed from: L0 */
    public gd70 f225026L0;

    /* JADX INFO: renamed from: M0 */
    public final tys0 f225027M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tys0(nys0 nys0Var, l25 l25Var, int i, uxq uxqVar, boolean z, boolean z2, boolean z3, int i2, tys0 tys0Var, du31 du31Var) {
        super(i, uxqVar, nys0Var, l25Var, qti0.m73843g("<get-" + nys0Var.getName() + ">"), z, z2, z3, i2, du31Var);
        if (l25Var == null) {
            m82001A0(1);
            throw null;
        }
        if (i == 0) {
            m82001A0(2);
            throw null;
        }
        if (uxqVar == null) {
            m82001A0(3);
            throw null;
        }
        if (i2 == 0) {
            m82001A0(4);
            throw null;
        }
        if (du31Var == null) {
            m82001A0(5);
            throw null;
        }
        this.f225027M0 = tys0Var != null ? tys0Var : this;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m82001A0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final tys0 mo27377a() {
        tys0 tys0Var = this.f225027M0;
        if (tys0Var != null) {
            return tys0Var;
        }
        m82001A0(8);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: K */
    public final List mo32015K() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m82001A0(7);
        throw null;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m82003K1(gd70 gd70Var) {
        if (gd70Var == null) {
            gd70Var = m60266H1().getType();
        }
        this.f225026L0 = gd70Var;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: i */
    public final gd70 mo29933i() {
        return this.f225026L0;
    }

    @Override // p204p.eab, p204p.cab
    /* JADX INFO: renamed from: p */
    public final Collection mo32019p() {
        return m60267I1(true);
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28186j(this, obj);
    }
}

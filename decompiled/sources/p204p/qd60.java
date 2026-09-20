package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class qd60 extends pys0 implements ad60 {

    /* JADX INFO: renamed from: Z0 */
    public final boolean f187498Z0;

    /* JADX INFO: renamed from: a1 */
    public final pqm0 f187499a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd60(oqo oqoVar, l25 l25Var, int i, uxq uxqVar, boolean z, qti0 qti0Var, du31 du31Var, nys0 nys0Var, int i2, boolean z2, pqm0 pqm0Var) {
        super(oqoVar, nys0Var, l25Var, i, uxqVar, z, qti0Var, i2, du31Var, false, false, false, false, false);
        if (oqoVar == null) {
            m72586A0(0);
            throw null;
        }
        if (l25Var == null) {
            m72586A0(1);
            throw null;
        }
        if (i == 0) {
            m72586A0(2);
            throw null;
        }
        if (uxqVar == null) {
            m72586A0(3);
            throw null;
        }
        if (qti0Var == null) {
            m72586A0(4);
            throw null;
        }
        if (du31Var == null) {
            m72586A0(5);
            throw null;
        }
        if (i2 == 0) {
            m72586A0(6);
            throw null;
        }
        this.f187498Z0 = z2;
        this.f187499a1 = pqm0Var;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m72586A0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public static qd60 m72587P1(oqo oqoVar, kt70 kt70Var, uxq uxqVar, boolean z, qti0 qti0Var, kvx0 kvx0Var, boolean z2) {
        if (oqoVar == null) {
            m72586A0(7);
            throw null;
        }
        if (qti0Var != null) {
            return new qd60(oqoVar, kt70Var, 1, uxqVar, z, qti0Var, kvx0Var, null, 1, z2, null);
        }
        m72586A0(11);
        throw null;
    }

    @Override // p204p.pys0, p204p.cab
    /* JADX INFO: renamed from: B */
    public final Object mo32014B(hyq hyqVar) {
        pqm0 pqm0Var = this.f187499a1;
        if (pqm0Var == null || !((hyq) pqm0Var.f180350a).equals(hyqVar)) {
            return null;
        }
        return pqm0Var.f180351b;
    }

    @Override // p204p.pys0
    /* JADX INFO: renamed from: J1 */
    public final pys0 mo71656J1(oqo oqoVar, int i, uxq uxqVar, nys0 nys0Var, int i2, qti0 qti0Var) {
        if (oqoVar == null) {
            m72586A0(13);
            throw null;
        }
        if (i == 0) {
            m72586A0(14);
            throw null;
        }
        if (uxqVar == null) {
            m72586A0(15);
            throw null;
        }
        if (i2 == 0) {
            m72586A0(16);
            throw null;
        }
        if (qti0Var == null) {
            m72586A0(17);
            throw null;
        }
        return new qd60(oqoVar, getAnnotations(), i, uxqVar, this.f183512g, qti0Var, du31.f52959o0, nys0Var, i2, this.f187498Z0, this.f187499a1);
    }

    @Override // p204p.pys0, p204p.f4b1
    /* JADX INFO: renamed from: b0 */
    public final boolean mo40726b0() {
        gd70 type = getType();
        if (!this.f187498Z0) {
            return false;
        }
        if (((!ib70.m50139G(type) && !n5a1.m63718a(type)) || so91.m78634e(type)) && !ib70.m50141I(type)) {
            return false;
        }
        n25 n25Var = rn91.f200771a;
        return !unq0.f232220N0.m83589y(type, fn60.f71212r) || ib70.m50141I(type);
    }

    @Override // p204p.g4b1, p204p.cab
    /* JADX INFO: renamed from: f0 */
    public final boolean mo28800f0() {
        return false;
    }

    @Override // p204p.ad60
    /* JADX INFO: renamed from: z */
    public final ad60 mo25521z(gd70 gd70Var, ArrayList arrayList, gd70 gd70Var2, pqm0 pqm0Var) {
        gd70 gd70Var3;
        tys0 tys0Var;
        zys0 zys0Var;
        nys0 nys0VarMo27377a = mo27377a() == this ? null : mo27377a();
        qd60 qd60Var = new qd60(mo27379o(), getAnnotations(), mo28473t(), mo28470e(), this.f183512g, getName(), getSource(), nys0VarMo27377a, mo38278l0(), this.f187498Z0, pqm0Var);
        tys0 tys0Var2 = this.f183505V0;
        if (tys0Var2 != null) {
            tys0 tys0Var3 = new tys0(qd60Var, tys0Var2.getAnnotations(), tys0Var2.mo28473t(), tys0Var2.mo28470e(), tys0Var2.f138109f, tys0Var2.f138110g, tys0Var2.f138113t, mo38278l0(), nys0VarMo27377a == null ? null : nys0VarMo27377a.mo65908b(), tys0Var2.getSource());
            tys0Var3.f138108Z = tys0Var2.f138108Z;
            gd70Var3 = gd70Var2;
            tys0Var3.f225026L0 = gd70Var3;
            tys0Var = tys0Var3;
        } else {
            gd70Var3 = gd70Var2;
            tys0Var = null;
        }
        zys0 zys0Var2 = this.f183506W0;
        if (zys0Var2 != null) {
            zys0 zys0Var3 = zys0Var2;
            zys0Var = new zys0(qd60Var, zys0Var2.getAnnotations(), zys0Var3.mo28473t(), zys0Var3.mo28470e(), zys0Var3.f138109f, zys0Var3.f138110g, zys0Var3.f138113t, mo38278l0(), nys0VarMo27377a == null ? null : nys0VarMo27377a.mo65909c(), zys0Var2.getSource());
            zys0Var.f138108Z = zys0Var.f138108Z;
            s3b1 s3b1Var = (s3b1) zys0Var2.mo32015K().get(0);
            if (s3b1Var == null) {
                zys0.m97244A0(6);
                throw null;
            }
            zys0Var.f287664L0 = s3b1Var;
        } else {
            zys0Var = null;
        }
        qd60Var.m71657L1(tys0Var, zys0Var, this.f183508X0, this.f183510Y0);
        eh00 eh00Var = this.f183514i;
        if (eh00Var != null) {
            qd60Var.m71658M1(this.f183513h, eh00Var);
        }
        qd60Var.mo38279t0(mo32019p());
        qd60Var.m71660O1(gd70Var3, getTypeParameters(), this.f183502S0, gd70Var != null ? fmg1.m42119J(this, gd70Var, e370.f55667h) : null, lau.f131415a);
        return qd60Var;
    }

    @Override // p204p.pys0
    /* JADX INFO: renamed from: N1 */
    public final void mo71659N1(gd70 gd70Var) {
    }
}

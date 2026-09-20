package p204p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class oi00 implements li00 {

    /* JADX INFO: renamed from: L0 */
    public boolean f165598L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f165599M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f165600N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f165601O0;

    /* JADX INFO: renamed from: P0 */
    public lau f165602P0;

    /* JADX INFO: renamed from: Q0 */
    public l25 f165603Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f165604R0;

    /* JADX INFO: renamed from: S0 */
    public final LinkedHashMap f165605S0;

    /* JADX INFO: renamed from: T0 */
    public Boolean f165606T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f165607U0;

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ pi00 f165608V0;

    /* JADX INFO: renamed from: X */
    public gd70 f165609X;

    /* JADX INFO: renamed from: Y */
    public qti0 f165610Y;

    /* JADX INFO: renamed from: Z */
    public boolean f165611Z;

    /* JADX INFO: renamed from: a */
    public mo91 f165612a;

    /* JADX INFO: renamed from: b */
    public oqo f165613b;

    /* JADX INFO: renamed from: c */
    public int f165614c;

    /* JADX INFO: renamed from: d */
    public uxq f165615d;

    /* JADX INFO: renamed from: e */
    public mi00 f165616e;

    /* JADX INFO: renamed from: f */
    public int f165617f;

    /* JADX INFO: renamed from: g */
    public List f165618g;

    /* JADX INFO: renamed from: h */
    public final List f165619h;

    /* JADX INFO: renamed from: i */
    public wr70 f165620i;

    /* JADX INFO: renamed from: t */
    public wr70 f165621t;

    public oi00(pi00 pi00Var, mo91 mo91Var, oqo oqoVar, int i, uxq uxqVar, int i2, List list, List list2, wr70 wr70Var, gd70 gd70Var) {
        if (mo91Var == null) {
            m66985p(0);
            throw null;
        }
        if (oqoVar == null) {
            m66985p(1);
            throw null;
        }
        if (i == 0) {
            m66985p(2);
            throw null;
        }
        if (uxqVar == null) {
            m66985p(3);
            throw null;
        }
        if (i2 == 0) {
            m66985p(4);
            throw null;
        }
        if (list == null) {
            m66985p(5);
            throw null;
        }
        if (list2 == null) {
            m66985p(6);
            throw null;
        }
        if (gd70Var == null) {
            m66985p(7);
            throw null;
        }
        this.f165608V0 = pi00Var;
        this.f165616e = null;
        this.f165621t = pi00Var.f177792X;
        this.f165611Z = true;
        this.f165598L0 = false;
        this.f165599M0 = false;
        this.f165600N0 = false;
        this.f165601O0 = pi00Var.f177786R0;
        this.f165602P0 = null;
        this.f165603Q0 = null;
        this.f165604R0 = pi00Var.f177787S0;
        this.f165605S0 = new LinkedHashMap();
        this.f165606T0 = null;
        this.f165607U0 = false;
        this.f165612a = mo91Var;
        this.f165613b = oqoVar;
        this.f165614c = i;
        this.f165615d = uxqVar;
        this.f165617f = i2;
        this.f165618g = list;
        this.f165619h = list2;
        this.f165620i = wr70Var;
        this.f165609X = gd70Var;
        this.f165610Y = null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m66985p(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: a */
    public final li00 mo49506a(List list) {
        this.f165618g = list;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: b */
    public final li00 mo49507b(int i) {
        if (i != 0) {
            this.f165617f = i;
            return this;
        }
        m66985p(14);
        throw null;
    }

    @Override // p204p.li00
    public final mi00 build() {
        return this.f165608V0.mo70061K1(this);
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: c */
    public final li00 mo49508c(qti0 qti0Var) {
        if (qti0Var != null) {
            this.f165610Y = qti0Var;
            return this;
        }
        m66985p(17);
        throw null;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: d */
    public final li00 mo49509d() {
        this.f165604R0 = true;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: e */
    public final li00 mo49510e(l25 l25Var) {
        if (l25Var != null) {
            this.f165603Q0 = l25Var;
            return this;
        }
        m66985p(35);
        throw null;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: f */
    public final li00 mo49511f(uxq uxqVar) {
        if (uxqVar != null) {
            this.f165615d = uxqVar;
            return this;
        }
        m66985p(12);
        throw null;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: g */
    public final li00 mo49512g() {
        this.f165611Z = false;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: h */
    public final li00 mo49513h(oqo oqoVar) {
        if (oqoVar != null) {
            this.f165613b = oqoVar;
            return this;
        }
        m66985p(8);
        throw null;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: i */
    public final li00 mo49514i() {
        this.f165602P0 = lau.f131415a;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: j */
    public final li00 mo49515j() {
        this.f165601O0 = true;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: k */
    public final li00 mo49516k(int i) {
        if (i != 0) {
            this.f165614c = i;
            return this;
        }
        m66985p(10);
        throw null;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: l */
    public final li00 mo49517l(gd70 gd70Var) {
        if (gd70Var != null) {
            this.f165609X = gd70Var;
            return this;
        }
        m66985p(23);
        throw null;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: m */
    public final li00 mo49518m() {
        this.f165599M0 = true;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: n */
    public final li00 mo49519n() {
        this.f165605S0.put(nd60.f152690f1, Boolean.TRUE);
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: o */
    public final li00 mo49520o(wr70 wr70Var) {
        this.f165621t = wr70Var;
        return this;
    }

    @Override // p204p.li00
    /* JADX INFO: renamed from: q */
    public final li00 mo49521q() {
        this.f165598L0 = true;
        return this;
    }
}

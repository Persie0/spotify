package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pi00 extends rqo implements mi00 {

    /* JADX INFO: renamed from: L0 */
    public boolean f177780L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f177781M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f177782N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f177783O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f177784P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f177785Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f177786R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f177787S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f177788T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f177789U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f177790V0;

    /* JADX INFO: renamed from: W0 */
    public Collection f177791W0;

    /* JADX INFO: renamed from: X */
    public wr70 f177792X;

    /* JADX INFO: renamed from: X0 */
    public volatile C2445u9 f177793X0;

    /* JADX INFO: renamed from: Y */
    public int f177794Y;

    /* JADX INFO: renamed from: Y0 */
    public final mi00 f177795Y0;

    /* JADX INFO: renamed from: Z */
    public uxq f177796Z;

    /* JADX INFO: renamed from: Z0 */
    public final int f177797Z0;

    /* JADX INFO: renamed from: a1 */
    public mi00 f177798a1;

    /* JADX INFO: renamed from: b1 */
    public Map f177799b1;

    /* JADX INFO: renamed from: f */
    public List f177800f;

    /* JADX INFO: renamed from: g */
    public List f177801g;

    /* JADX INFO: renamed from: h */
    public gd70 f177802h;

    /* JADX INFO: renamed from: i */
    public List f177803i;

    /* JADX INFO: renamed from: t */
    public wr70 f177804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi00(int i, l25 l25Var, oqo oqoVar, mi00 mi00Var, qti0 qti0Var, du31 du31Var) {
        super(oqoVar, l25Var, qti0Var, du31Var);
        if (oqoVar == null) {
            m70057A0(0);
            throw null;
        }
        if (l25Var == null) {
            m70057A0(1);
            throw null;
        }
        if (qti0Var == null) {
            m70057A0(2);
            throw null;
        }
        if (i == 0) {
            m70057A0(3);
            throw null;
        }
        if (du31Var == null) {
            m70057A0(4);
            throw null;
        }
        this.f177796Z = vxq.f245814i;
        this.f177780L0 = false;
        this.f177781M0 = false;
        this.f177782N0 = false;
        this.f177783O0 = false;
        this.f177784P0 = false;
        this.f177785Q0 = false;
        this.f177786R0 = false;
        this.f177787S0 = false;
        this.f177788T0 = false;
        this.f177789U0 = true;
        this.f177790V0 = false;
        this.f177791W0 = null;
        this.f177793X0 = null;
        this.f177798a1 = null;
        this.f177799b1 = null;
        this.f177795Y0 = mi00Var == null ? this : mi00Var;
        this.f177797Z0 = i;
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m70057A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
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
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public static ArrayList m70058L1(mi00 mi00Var, List list, oo91 oo91Var, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            m70057A0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s3b1 s3b1Var = (s3b1) it.next();
            s3b1 s3b1Var2 = s3b1Var;
            gd70 gd70VarM67463i = oo91Var.m67463i(2, s3b1Var2.getType());
            gd70 gd70Var = s3b1Var.f205254X;
            gd70 gd70VarM67463i2 = gd70Var == null ? null : oo91Var.m67463i(2, gd70Var);
            if (gd70VarM67463i == null) {
                return null;
            }
            if ((gd70VarM67463i != s3b1Var2.getType() || gd70Var != gd70VarM67463i2) && zArr != null) {
                zArr[0] = true;
            }
            ni00 ni00Var = s3b1Var instanceof r3b1 ? new ni00((List) ((r3b1) s3b1Var).f195471Z.getValue(), 0) : null;
            s3b1 s3b1Var3 = z ? null : s3b1Var;
            int i = s3b1Var.f205256g;
            l25 annotations = s3b1Var.getAnnotations();
            qti0 name = s3b1Var.getName();
            boolean zM77123I1 = s3b1Var.m77123I1();
            boolean z3 = s3b1Var.f205258i;
            boolean z4 = s3b1Var.f205259t;
            du31 source = z2 ? s3b1Var.getSource() : du31.f52959o0;
            arrayList.add(ni00Var == null ? new s3b1(mi00Var, s3b1Var3, i, annotations, name, gd70VarM67463i, zM77123I1, z3, z4, gd70VarM67463i2, source) : new r3b1(mi00Var, s3b1Var3, i, annotations, name, gd70VarM67463i, zM77123I1, z3, z4, gd70VarM67463i2, source, ni00Var));
        }
        return arrayList;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: B */
    public Object mo32014B(hyq hyqVar) {
        Map map = this.f177799b1;
        if (map == null) {
            return null;
        }
        return map.get(hyqVar);
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: F */
    public boolean mo60265F() {
        return this.f177784P0;
    }

    /* JADX INFO: renamed from: H1 */
    public final mi00 m70059H1(oqo oqoVar, int i, uxq uxqVar) {
        mi00 mi00VarBuild = mo61794w0().mo49513h(oqoVar).mo49516k(i).mo49511f(uxqVar).mo49507b(2).mo49512g().build();
        if (mi00VarBuild != null) {
            return mi00VarBuild;
        }
        m70057A0(26);
        throw null;
    }

    @Override // p204p.eab
    /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
    public qc21 mo29934o0(oqo oqoVar, int i, uxq uxqVar) {
        return (qc21) m70059H1(oqoVar, i, uxqVar);
    }

    /* JADX INFO: renamed from: J1 */
    public abstract pi00 mo28795J1(int i, l25 l25Var, oqo oqoVar, mi00 mi00Var, qti0 qti0Var, du31 du31Var);

    @Override // p204p.cab
    /* JADX INFO: renamed from: K */
    public final List mo32015K() {
        List list = this.f177801g;
        if (list != null) {
            return list;
        }
        m70057A0(19);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0218  */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:114:0x023e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0242  */
    /* JADX WARN: Code duplicated, block: B:118:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x024d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x015d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:98:0x020e  */
    /* JADX INFO: renamed from: K1 */
    public pi00 mo70061K1(oi00 oi00Var) {
        l25 annotations;
        char c;
        wr70 wr70Var;
        wr70 wr70Var2;
        wr70 wr70Var3;
        wr70 wr70Var4;
        ArrayList arrayListM70058L1;
        gd70 gd70VarM67463i;
        char c2;
        boolean z;
        Boolean bool;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        Map map;
        mi00 mi00Var;
        C2445u9 c2445u9;
        wr70 wr70VarMo29932f;
        char c3;
        gd70 gd70VarM67463i2;
        char c4;
        boolean[] zArr = new boolean[1];
        char c5 = 0;
        if (oi00Var.f165603Q0 != null) {
            annotations = getAnnotations();
            l25 l25Var = oi00Var.f165603Q0;
            if (annotations.isEmpty()) {
                annotations = l25Var;
            } else if (!l25Var.isEmpty()) {
                annotations = new n25(new l25[]{annotations, l25Var});
            }
        } else {
            annotations = getAnnotations();
        }
        l25 l25Var2 = annotations;
        oqo oqoVar = oi00Var.f165613b;
        mi00 mi00Var2 = oi00Var.f165616e;
        int i = oi00Var.f165617f;
        qti0 qti0Var = oi00Var.f165610Y;
        du31 source = oi00Var.f165599M0 ? ((rqo) (mi00Var2 != null ? mi00Var2 : mo27377a())).getSource() : du31.f52959o0;
        if (source == null) {
            m70057A0(27);
            throw null;
        }
        pi00 pi00VarMo28795J1 = mo28795J1(i, l25Var2, oqoVar, mi00Var2, qti0Var, source);
        List typeParameters = oi00Var.f165602P0;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        oo91 oo91VarM59451v = lmg1.m59451v(typeParameters, oi00Var.f165612a, pi00VarMo28795J1, arrayList, zArr);
        if (oo91VarM59451v != null) {
            ArrayList arrayList2 = new ArrayList();
            if (oi00Var.f165619h.isEmpty()) {
                c = c5;
                wr70Var = oi00Var.f165620i;
                if (wr70Var != null) {
                    gd70VarM67463i2 = oo91VarM59451v.m67463i(2, wr70Var.getType());
                    if (gd70VarM67463i2 != null) {
                        oi00Var.f165620i.m88808H1();
                        wr70 wr70Var5 = new wr70(pi00VarMo28795J1, new qtx(pi00VarMo28795J1, gd70VarM67463i2), oi00Var.f165620i.getAnnotations());
                        boolean z2 = zArr[c];
                        if (gd70VarM67463i2 != oi00Var.f165620i.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z2 ? 1 : 0);
                        wr70Var2 = wr70Var5;
                    }
                } else {
                    wr70Var2 = null;
                }
                wr70Var3 = oi00Var.f165621t;
                if (wr70Var3 != null) {
                    wr70VarMo29932f = wr70Var3.mo29932f(oo91VarM59451v);
                    if (wr70VarMo29932f != null) {
                        boolean z3 = zArr[c];
                        if (wr70VarMo29932f != oi00Var.f165621t) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z3 ? 1 : 0) | c3;
                        wr70Var4 = wr70VarMo29932f;
                    }
                } else {
                    wr70Var4 = null;
                }
                arrayListM70058L1 = m70058L1(pi00VarMo28795J1, oi00Var.f165618g, oo91VarM59451v, oi00Var.f165600N0, oi00Var.f165599M0, zArr);
                if (arrayListM70058L1 != null) {
                    boolean z4 = zArr[c];
                    if (gd70VarM67463i != oi00Var.f165609X) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z4 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0) {
                    }
                    pi00VarMo28795J1.mo70062M1(wr70Var2, wr70Var4, arrayList2, arrayList, arrayListM70058L1, gd70VarM67463i, oi00Var.f165614c, oi00Var.f165615d);
                    pi00VarMo28795J1.f177780L0 = this.f177780L0;
                    pi00VarMo28795J1.f177781M0 = this.f177781M0;
                    pi00VarMo28795J1.f177782N0 = this.f177782N0;
                    pi00VarMo28795J1.f177783O0 = this.f177783O0;
                    pi00VarMo28795J1.f177784P0 = this.f177784P0;
                    pi00VarMo28795J1.f177788T0 = this.f177788T0;
                    pi00VarMo28795J1.f177785Q0 = this.f177785Q0;
                    pi00VarMo28795J1.mo28796P1(this.f177789U0);
                    pi00VarMo28795J1.f177786R0 = oi00Var.f165601O0;
                    pi00VarMo28795J1.f177787S0 = oi00Var.f165604R0;
                    bool = oi00Var.f165606T0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.f177790V0;
                    }
                    pi00VarMo28795J1.mo28797Q1(zBooleanValue);
                    if (oi00Var.f165605S0.isEmpty()) {
                        linkedHashMap = oi00Var.f165605S0;
                        map = this.f177799b1;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            pi00VarMo28795J1.f177799b1 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            pi00VarMo28795J1.f177799b1 = linkedHashMap;
                        }
                    } else {
                        linkedHashMap = oi00Var.f165605S0;
                        map = this.f177799b1;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            pi00VarMo28795J1.f177799b1 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            pi00VarMo28795J1.f177799b1 = linkedHashMap;
                        }
                    }
                    if (oi00Var.f165598L0) {
                        mi00Var = this.f177798a1;
                        if (mi00Var == null) {
                            mi00Var = this;
                        }
                        pi00VarMo28795J1.f177798a1 = mi00Var.mo29932f(oo91VarM59451v);
                    } else {
                        mi00Var = this.f177798a1;
                        if (mi00Var == null) {
                            mi00Var = this;
                        }
                        pi00VarMo28795J1.f177798a1 = mi00Var.mo29932f(oo91VarM59451v);
                    }
                    if (oi00Var.f165611Z) {
                        if (oi00Var.f165612a.mo26562e()) {
                            c2445u9 = this.f177793X0;
                            if (c2445u9 != null) {
                                pi00VarMo28795J1.f177793X0 = c2445u9;
                                return pi00VarMo28795J1;
                            }
                            pi00VarMo28795J1.mo38279t0(mo32019p());
                            return pi00VarMo28795J1;
                        }
                        pi00VarMo28795J1.f177793X0 = new C2445u9(this, oo91VarM59451v, 15);
                    }
                    return pi00VarMo28795J1;
                }
            } else {
                int i2 = 0;
                for (wr70 wr70Var6 : oi00Var.f165619h) {
                    gd70 gd70VarM67463i3 = oo91VarM59451v.m67463i(2, wr70Var6.getType());
                    if (gd70VarM67463i3 != null) {
                        char c6 = c5;
                        int i3 = i2 + 1;
                        arrayList2.add(fmg1.m42113D(pi00VarMo28795J1, gd70VarM67463i3, ((kzj) wr70Var6.m88808H1()).m57759F1(), wr70Var6.getAnnotations(), i2));
                        zArr[c6] = (zArr[c6] ? 1 : 0) | (gd70VarM67463i3 != wr70Var6.getType() ? (char) 1 : c6);
                        c5 = c6;
                        i2 = i3;
                    }
                }
                c = c5;
                wr70Var = oi00Var.f165620i;
                if (wr70Var != null) {
                    gd70VarM67463i2 = oo91VarM59451v.m67463i(2, wr70Var.getType());
                    if (gd70VarM67463i2 != null) {
                        oi00Var.f165620i.m88808H1();
                        wr70 wr70Var7 = new wr70(pi00VarMo28795J1, new qtx(pi00VarMo28795J1, gd70VarM67463i2), oi00Var.f165620i.getAnnotations());
                        boolean z5 = zArr[c];
                        if (gd70VarM67463i2 != oi00Var.f165620i.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z5 ? 1 : 0);
                        wr70Var2 = wr70Var7;
                    }
                } else {
                    wr70Var2 = null;
                }
                wr70Var3 = oi00Var.f165621t;
                if (wr70Var3 != null) {
                    wr70VarMo29932f = wr70Var3.mo29932f(oo91VarM59451v);
                    if (wr70VarMo29932f != null) {
                        boolean z6 = zArr[c];
                        if (wr70VarMo29932f != oi00Var.f165621t) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z6 ? 1 : 0) | c3;
                        wr70Var4 = wr70VarMo29932f;
                    }
                } else {
                    wr70Var4 = null;
                }
                arrayListM70058L1 = m70058L1(pi00VarMo28795J1, oi00Var.f165618g, oo91VarM59451v, oi00Var.f165600N0, oi00Var.f165599M0, zArr);
                if (arrayListM70058L1 != null && (gd70VarM67463i = oo91VarM59451v.m67463i(3, oi00Var.f165609X)) != null) {
                    boolean z7 = zArr[c];
                    if (gd70VarM67463i != oi00Var.f165609X) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z7 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0 && oi00Var.f165607U0) {
                        return this;
                    }
                    pi00VarMo28795J1.mo70062M1(wr70Var2, wr70Var4, arrayList2, arrayList, arrayListM70058L1, gd70VarM67463i, oi00Var.f165614c, oi00Var.f165615d);
                    pi00VarMo28795J1.f177780L0 = this.f177780L0;
                    pi00VarMo28795J1.f177781M0 = this.f177781M0;
                    pi00VarMo28795J1.f177782N0 = this.f177782N0;
                    pi00VarMo28795J1.f177783O0 = this.f177783O0;
                    pi00VarMo28795J1.f177784P0 = this.f177784P0;
                    pi00VarMo28795J1.f177788T0 = this.f177788T0;
                    pi00VarMo28795J1.f177785Q0 = this.f177785Q0;
                    pi00VarMo28795J1.mo28796P1(this.f177789U0);
                    pi00VarMo28795J1.f177786R0 = oi00Var.f165601O0;
                    pi00VarMo28795J1.f177787S0 = oi00Var.f165604R0;
                    bool = oi00Var.f165606T0;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.f177790V0;
                    }
                    pi00VarMo28795J1.mo28797Q1(zBooleanValue);
                    if (oi00Var.f165605S0.isEmpty() || this.f177799b1 != null) {
                        linkedHashMap = oi00Var.f165605S0;
                        map = this.f177799b1;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            pi00VarMo28795J1.f177799b1 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            pi00VarMo28795J1.f177799b1 = linkedHashMap;
                        }
                    }
                    if (oi00Var.f165598L0 || this.f177798a1 != null) {
                        mi00Var = this.f177798a1;
                        if (mi00Var == null) {
                            mi00Var = this;
                        }
                        pi00VarMo28795J1.f177798a1 = mi00Var.mo29932f(oo91VarM59451v);
                    }
                    if (oi00Var.f165611Z && !mo27377a().mo32019p().isEmpty()) {
                        if (oi00Var.f165612a.mo26562e()) {
                            c2445u9 = this.f177793X0;
                            if (c2445u9 != null) {
                                pi00VarMo28795J1.f177793X0 = c2445u9;
                                return pi00VarMo28795J1;
                            }
                            pi00VarMo28795J1.mo38279t0(mo32019p());
                            return pi00VarMo28795J1;
                        }
                        pi00VarMo28795J1.f177793X0 = new C2445u9(this, oo91VarM59451v, 15);
                    }
                    return pi00VarMo28795J1;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M1 */
    public void mo70062M1(wr70 wr70Var, wr70 wr70Var2, List list, List list2, List list3, gd70 gd70Var, int i, uxq uxqVar) {
        if (list == null) {
            m70057A0(5);
            throw null;
        }
        if (list2 == null) {
            m70057A0(6);
            throw null;
        }
        if (list3 == null) {
            m70057A0(7);
            throw null;
        }
        if (uxqVar == null) {
            m70057A0(8);
            throw null;
        }
        this.f177800f = g6f.m43728j1(list2);
        this.f177801g = g6f.m43728j1(list3);
        this.f177802h = gd70Var;
        this.f177794Y = i;
        this.f177796Z = uxqVar;
        this.f177804t = wr70Var;
        this.f177792X = wr70Var2;
        this.f177803i = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            bo91 bo91Var = (bo91) list2.get(i2);
            if (bo91Var.getIndex() != i2) {
                throw new IllegalStateException(bo91Var + " index is " + bo91Var.getIndex() + " but position is " + i2);
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            s3b1 s3b1Var = (s3b1) list3.get(i3);
            if (s3b1Var.f205256g != i3) {
                throw new IllegalStateException(s3b1Var + "index is " + s3b1Var.f205256g + " but position is " + i3);
            }
        }
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: N */
    public final wr70 mo32016N() {
        return this.f177792X;
    }

    /* JADX INFO: renamed from: N1 */
    public final oi00 m70063N1(oo91 oo91Var) {
        if (oo91Var != null) {
            return new oi00(this, oo91Var.m67461f(), mo27379o(), mo28473t(), mo28470e(), mo38278l0(), mo32015K(), mo32018n0(), this.f177804t, mo29933i());
        }
        m70057A0(24);
        throw null;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m70064O1(hyq hyqVar, Object obj) {
        if (this.f177799b1 == null) {
            this.f177799b1 = new LinkedHashMap();
        }
        this.f177799b1.put(hyqVar, obj);
    }

    /* JADX INFO: renamed from: P1 */
    public void mo28796P1(boolean z) {
        this.f177789U0 = z;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: Q */
    public final wr70 mo32017Q() {
        return this.f177804t;
    }

    /* JADX INFO: renamed from: Q1 */
    public void mo28797Q1(boolean z) {
        this.f177790V0 = z;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m70065R1(jd21 jd21Var) {
        if (jd21Var != null) {
            this.f177802h = jd21Var;
        } else {
            m70057A0(11);
            throw null;
        }
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: X */
    public final boolean mo28469X() {
        return false;
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: a */
    public mi00 mo27377a() {
        mi00 mi00Var = this.f177795Y0;
        mi00 mi00VarMo27377a = mi00Var == this ? this : mi00Var.mo27377a();
        if (mi00VarMo27377a != null) {
            return mi00VarMo27377a;
        }
        m70057A0(20);
        throw null;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: d */
    public boolean mo60268d() {
        return this.f177783O0;
    }

    @Override // p204p.tqo
    /* JADX INFO: renamed from: e */
    public final uxq mo28470e() {
        uxq uxqVar = this.f177796Z;
        if (uxqVar != null) {
            return uxqVar;
        }
        m70057A0(16);
        throw null;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean mo28800f0() {
        return this.f177790V0;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: g0 */
    public final boolean mo28471g0() {
        return this.f177785Q0;
    }

    @Override // p204p.cab
    public final List getTypeParameters() {
        List list = this.f177800f;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: h */
    public boolean mo60269h() {
        return this.f177788T0;
    }

    /* JADX INFO: renamed from: i */
    public gd70 mo29933i() {
        return this.f177802h;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: k0 */
    public final mi00 mo60270k0() {
        return this.f177798a1;
    }

    @Override // p204p.eab
    /* JADX INFO: renamed from: l0 */
    public final int mo38278l0() {
        int i = this.f177797Z0;
        if (i != 0) {
            return i;
        }
        m70057A0(21);
        throw null;
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: n0 */
    public final List mo32018n0() {
        List list = this.f177803i;
        if (list != null) {
            return list;
        }
        m70057A0(13);
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public Collection mo32019p() {
        C2445u9 c2445u9 = this.f177793X0;
        if (c2445u9 != null) {
            this.f177791W0 = (Collection) c2445u9.invoke();
            this.f177793X0 = null;
        }
        Collection collection = this.f177791W0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m70057A0(14);
        throw null;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: s */
    public boolean mo28472s() {
        return this.f177782N0;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: s0 */
    public final boolean mo60271s0() {
        return this.f177786R0;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: t */
    public final int mo28473t() {
        int i = this.f177794Y;
        if (i != 0) {
            return i;
        }
        m70057A0(15);
        throw null;
    }

    /* JADX INFO: renamed from: t0 */
    public void mo38279t0(Collection collection) {
        if (collection == null) {
            m70057A0(17);
            throw null;
        }
        this.f177791W0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((mi00) it.next()).mo60273v0()) {
                this.f177787S0 = true;
                return;
            }
        }
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: v */
    public final boolean mo60272v() {
        if (this.f177780L0) {
            return true;
        }
        Iterator it = mo27377a().mo32019p().iterator();
        while (it.hasNext()) {
            if (((mi00) it.next()).mo60272v()) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: v0 */
    public final boolean mo60273v0() {
        return this.f177787S0;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: w */
    public final boolean mo60274w() {
        if (this.f177781M0) {
            return true;
        }
        Iterator it = mo27377a().mo32019p().iterator();
        while (it.hasNext()) {
            if (((mi00) it.next()).mo60274w()) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.mi00
    /* JADX INFO: renamed from: w0 */
    public li00 mo61794w0() {
        return m70063N1(oo91.f167517b);
    }

    /* JADX INFO: renamed from: y */
    public Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28188l(this, obj);
    }

    /* JADX INFO: renamed from: f */
    public mi00 mo29932f(oo91 oo91Var) {
        if (oo91Var == null) {
            m70057A0(22);
            throw null;
        }
        if (oo91Var.f167518a.mo26562e()) {
            return this;
        }
        oi00 oi00VarM70063N1 = m70063N1(oo91Var);
        oi00VarM70063N1.f165616e = mo27377a();
        oi00VarM70063N1.f165599M0 = true;
        oi00VarM70063N1.f165607U0 = true;
        return oi00VarM70063N1.f165608V0.mo70061K1(oi00VarM70063N1);
    }
}

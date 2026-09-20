package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p204p.aux;
import p204p.dux;
import p204p.e3t0;
import p204p.gd8;
import p204p.gva;
import p204p.iru0;
import p204p.kuy;
import p204p.lgy0;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.vyd1;
import p204p.w110;
import p204p.xtx;
import p204p.y110;

/* JADX INFO: renamed from: com.google.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0267f extends dux {
    @Override // p204p.dux
    /* JADX INFO: renamed from: a */
    public final int mo2110a(Map.Entry entry) {
        return ((w110) entry.getKey()).f246924b;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: b */
    public final Object mo2111b(aux auxVar, pre0 pre0Var, int i) {
        return (y110) auxVar.f20045a.get(new xtx(i, pre0Var));
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: c */
    public final kuy mo2112c(Object obj) {
        return ((GeneratedMessageLite$ExtendableMessage) obj).f2426a;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: d */
    public final kuy mo2113d(Object obj) {
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        kuy kuyVar = generatedMessageLite$ExtendableMessage.f2426a;
        if (kuyVar.f126736b) {
            generatedMessageLite$ExtendableMessage.f2426a = kuyVar.clone();
        }
        return generatedMessageLite$ExtendableMessage.f2426a;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: e */
    public final boolean mo2114e(pre0 pre0Var) {
        return pre0Var instanceof GeneratedMessageLite$ExtendableMessage;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: f */
    public final void mo2115f(Object obj) {
        ((GeneratedMessageLite$ExtendableMessage) obj).f2426a.m57423k();
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: g */
    public final Object mo2116g(Object obj, iru0 iru0Var, Object obj2, aux auxVar, kuy kuyVar, Object obj3, AbstractC0274m abstractC0274m) {
        Object objValueOf;
        Object objM57420f;
        List arrayList;
        y110 y110Var = (y110) obj2;
        w110 w110Var = y110Var.f268128c;
        pre0 pre0Var = y110Var.f268127b;
        int i = w110Var.f246924b;
        vyd1 vyd1Var = w110Var.f246925c;
        if (w110Var.f246926d && w110Var.f246927e) {
            switch (vyd1Var.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    iru0Var.mo2067E(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    iru0Var.mo2064B(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    iru0Var.mo2091h(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    iru0Var.mo2089f(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    iru0Var.mo2105v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    iru0Var.mo2099p(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    iru0Var.mo2106w(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    iru0Var.mo2095l(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(w110Var.f246925c)));
                case 12:
                    arrayList = new ArrayList();
                    iru0Var.mo2102s(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    iru0Var.mo2092i(arrayList2);
                    obj3 = AbstractC0273l.m2182j(obj, i, arrayList2, w110Var.f246923a, obj3, abstractC0274m);
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    iru0Var.mo2085b(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    iru0Var.mo2104u(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    iru0Var.mo2100q(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    iru0Var.mo2086c(arrayList);
                    break;
            }
            kuyVar.m57425m(w110Var, arrayList);
            return obj3;
        }
        if (vyd1Var != vyd1.f246072Y) {
            switch (vyd1Var.ordinal()) {
                case 0:
                    objValueOf = Double.valueOf(iru0Var.readDouble());
                    break;
                case 1:
                    objValueOf = Float.valueOf(iru0Var.readFloat());
                    break;
                case 2:
                    objValueOf = Long.valueOf(iru0Var.mo2068F());
                    break;
                case 3:
                    objValueOf = Long.valueOf(iru0Var.mo2101r());
                    break;
                case 4:
                    objValueOf = Integer.valueOf(iru0Var.mo2098o());
                    break;
                case 5:
                    objValueOf = Long.valueOf(iru0Var.mo2084a());
                    break;
                case 6:
                    objValueOf = Integer.valueOf(iru0Var.mo2103t());
                    break;
                case 7:
                    objValueOf = Boolean.valueOf(iru0Var.mo2087d());
                    break;
                case 8:
                    objValueOf = iru0Var.mo2108y();
                    break;
                case 9:
                    if (!w110Var.f246926d) {
                        Object objM57420f2 = kuyVar.m57420f(w110Var);
                        if (objM57420f2 instanceof AbstractC0269h) {
                            e3t0 e3t0Var = e3t0.f55882c;
                            e3t0Var.getClass();
                            lgy0 lgy0VarM37694a = e3t0Var.m37694a(objM57420f2.getClass());
                            if (!((AbstractC0269h) objM57420f2).isMutable()) {
                                Object objMo2152c = lgy0VarM37694a.mo2152c();
                                lgy0VarM37694a.mo2153d(objMo2152c, objM57420f2);
                                kuyVar.m57425m(w110Var, objMo2152c);
                                objM57420f2 = objMo2152c;
                            }
                            iru0Var.mo2072J(objM57420f2, lgy0VarM37694a, auxVar);
                            return obj3;
                        }
                    }
                    objValueOf = iru0Var.mo2076N(pre0Var.getClass(), auxVar);
                    break;
                case 10:
                    if (!w110Var.f246926d) {
                        Object objM57420f3 = kuyVar.m57420f(w110Var);
                        if (objM57420f3 instanceof AbstractC0269h) {
                            e3t0 e3t0Var2 = e3t0.f55882c;
                            e3t0Var2.getClass();
                            lgy0 lgy0VarM37694a2 = e3t0Var2.m37694a(objM57420f3.getClass());
                            if (!((AbstractC0269h) objM57420f3).isMutable()) {
                                Object objMo2152c2 = lgy0VarM37694a2.mo2152c();
                                lgy0VarM37694a2.mo2153d(objMo2152c2, objM57420f3);
                                kuyVar.m57425m(w110Var, objMo2152c2);
                                objM57420f3 = objMo2152c2;
                            }
                            iru0Var.mo2071I(objM57420f3, lgy0VarM37694a2, auxVar);
                            return obj3;
                        }
                    }
                    objValueOf = iru0Var.mo2075M(pre0Var.getClass(), auxVar);
                    break;
                case 11:
                    objValueOf = iru0Var.mo2097n();
                    break;
                case 12:
                    objValueOf = Integer.valueOf(iru0Var.mo2090g());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    objValueOf = Integer.valueOf(iru0Var.mo2065C());
                    break;
                case 15:
                    objValueOf = Long.valueOf(iru0Var.mo2088e());
                    break;
                case 16:
                    objValueOf = Integer.valueOf(iru0Var.mo2094k());
                    break;
                case 17:
                    objValueOf = Long.valueOf(iru0Var.mo2107x());
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iMo2098o = iru0Var.mo2098o();
            if (w110Var.f246923a.findValueByNumber(iMo2098o) == null) {
                return AbstractC0273l.m2187o(obj, i, iMo2098o, obj3, abstractC0274m);
            }
            objValueOf = Integer.valueOf(iMo2098o);
        }
        if (w110Var.f246926d) {
            kuyVar.m57418a(w110Var, objValueOf);
            return obj3;
        }
        int iOrdinal = w110Var.f246925c.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objM57420f = kuyVar.m57420f(w110Var)) != null) {
            objValueOf = ((pre0) objM57420f).toBuilder().mergeFrom((pre0) objValueOf).buildPartial();
        }
        kuyVar.m57425m(w110Var, objValueOf);
        return obj3;
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: h */
    public final void mo2117h(iru0 iru0Var, Object obj, aux auxVar, kuy kuyVar) {
        y110 y110Var = (y110) obj;
        kuyVar.m57425m(y110Var.f268128c, iru0Var.mo2075M(y110Var.f268127b.getClass(), auxVar));
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: i */
    public final void mo2118i(gva gvaVar, Object obj, aux auxVar, kuy kuyVar) {
        y110 y110Var = (y110) obj;
        ore0 ore0VarNewBuilderForType = y110Var.f268127b.newBuilderForType();
        owe oweVarMo34018o = gvaVar.mo34018o();
        ore0VarNewBuilderForType.mergeFrom(oweVarMo34018o, auxVar);
        kuyVar.m57425m(y110Var.f268128c, ore0VarNewBuilderForType.buildPartial());
        oweVarMo34018o.mo2020a(0);
    }

    @Override // p204p.dux
    /* JADX INFO: renamed from: j */
    public final void mo2119j(gd8 gd8Var, Map.Entry entry) {
        w110 w110Var = (w110) entry.getKey();
        boolean z = w110Var.f246926d;
        vyd1 vyd1Var = w110Var.f246925c;
        boolean z2 = w110Var.f246927e;
        int i = w110Var.f246924b;
        if (!z) {
            switch (vyd1Var.ordinal()) {
                case 0:
                    gd8Var.m44374C(((Double) entry.getValue()).doubleValue(), i);
                    break;
                case 1:
                    gd8Var.m44383L(((Float) entry.getValue()).floatValue(), i);
                    break;
                case 2:
                    gd8Var.m44389R(i, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    gd8Var.m44409k0(i, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    gd8Var.m44387P(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    gd8Var.m44381J(i, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    gd8Var.m44379H(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    gd8Var.m44414y(i, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    gd8Var.m44404g0(i, (String) entry.getValue());
                    break;
                case 9:
                    gd8Var.m44385N(i, entry.getValue(), e3t0.f55882c.m37694a(entry.getValue().getClass()));
                    break;
                case 10:
                    gd8Var.m44392U(i, entry.getValue(), e3t0.f55882c.m37694a(entry.getValue().getClass()));
                    break;
                case 11:
                    gd8Var.m44372A(i, (gva) entry.getValue());
                    break;
                case 12:
                    gd8Var.m44406i0(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    gd8Var.m44387P(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    gd8Var.m44395X(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    gd8Var.m44397Z(i, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    gd8Var.m44399b0(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    gd8Var.m44401d0(i, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (vyd1Var.ordinal()) {
            case 0:
                List list = (List) entry.getValue();
                Class cls = AbstractC0273l.f2478a;
                if (list != null && !list.isEmpty()) {
                    gd8Var.m44375D(i, list, z2);
                    break;
                }
                break;
            case 1:
                List list2 = (List) entry.getValue();
                Class cls2 = AbstractC0273l.f2478a;
                if (list2 != null && !list2.isEmpty()) {
                    gd8Var.m44384M(i, list2, z2);
                    break;
                }
                break;
            case 2:
                List list3 = (List) entry.getValue();
                Class cls3 = AbstractC0273l.f2478a;
                if (list3 != null && !list3.isEmpty()) {
                    gd8Var.m44390S(i, list3, z2);
                    break;
                }
                break;
            case 3:
                List list4 = (List) entry.getValue();
                Class cls4 = AbstractC0273l.f2478a;
                if (list4 != null && !list4.isEmpty()) {
                    gd8Var.m44410l0(i, list4, z2);
                    break;
                }
                break;
            case 4:
                List list5 = (List) entry.getValue();
                Class cls5 = AbstractC0273l.f2478a;
                if (list5 != null && !list5.isEmpty()) {
                    gd8Var.m44388Q(i, list5, z2);
                    break;
                }
                break;
            case 5:
                List list6 = (List) entry.getValue();
                Class cls6 = AbstractC0273l.f2478a;
                if (list6 != null && !list6.isEmpty()) {
                    gd8Var.m44382K(i, list6, z2);
                    break;
                }
                break;
            case 6:
                List list7 = (List) entry.getValue();
                Class cls7 = AbstractC0273l.f2478a;
                if (list7 != null && !list7.isEmpty()) {
                    gd8Var.m44380I(i, list7, z2);
                    break;
                }
                break;
            case 7:
                List list8 = (List) entry.getValue();
                Class cls8 = AbstractC0273l.f2478a;
                if (list8 != null && !list8.isEmpty()) {
                    gd8Var.m44415z(i, list8, z2);
                    break;
                }
                break;
            case 8:
                List list9 = (List) entry.getValue();
                Class cls9 = AbstractC0273l.f2478a;
                if (list9 != null && !list9.isEmpty()) {
                    gd8Var.m44405h0(i, list9);
                    break;
                }
                break;
            case 9:
                List list10 = (List) entry.getValue();
                if (list10 != null && !list10.isEmpty()) {
                    List list11 = (List) entry.getValue();
                    lgy0 lgy0VarM37694a = e3t0.f55882c.m37694a(list10.get(0).getClass());
                    Class cls10 = AbstractC0273l.f2478a;
                    if (list11 != null && !list11.isEmpty()) {
                        gd8Var.m44386O(i, list11, lgy0VarM37694a);
                        break;
                    }
                }
                break;
            case 10:
                List list12 = (List) entry.getValue();
                if (list12 != null && !list12.isEmpty()) {
                    List list13 = (List) entry.getValue();
                    lgy0 lgy0VarM37694a2 = e3t0.f55882c.m37694a(list12.get(0).getClass());
                    Class cls11 = AbstractC0273l.f2478a;
                    if (list13 != null && !list13.isEmpty()) {
                        gd8Var.m44393V(i, list13, lgy0VarM37694a2);
                        break;
                    }
                }
                break;
            case 11:
                List list14 = (List) entry.getValue();
                Class cls12 = AbstractC0273l.f2478a;
                if (list14 != null && !list14.isEmpty()) {
                    gd8Var.m44373B(i, list14);
                    break;
                }
                break;
            case 12:
                List list15 = (List) entry.getValue();
                Class cls13 = AbstractC0273l.f2478a;
                if (list15 != null && !list15.isEmpty()) {
                    gd8Var.m44408j0(i, list15, z2);
                    break;
                }
                break;
            case 13:
                List list16 = (List) entry.getValue();
                Class cls14 = AbstractC0273l.f2478a;
                if (list16 != null && !list16.isEmpty()) {
                    gd8Var.m44388Q(i, list16, z2);
                    break;
                }
                break;
            case 14:
                List list17 = (List) entry.getValue();
                Class cls15 = AbstractC0273l.f2478a;
                if (list17 != null && !list17.isEmpty()) {
                    gd8Var.m44396Y(i, list17, z2);
                    break;
                }
                break;
            case 15:
                List list18 = (List) entry.getValue();
                Class cls16 = AbstractC0273l.f2478a;
                if (list18 != null && !list18.isEmpty()) {
                    gd8Var.m44398a0(i, list18, z2);
                    break;
                }
                break;
            case 16:
                List list19 = (List) entry.getValue();
                Class cls17 = AbstractC0273l.f2478a;
                if (list19 != null && !list19.isEmpty()) {
                    gd8Var.m44400c0(i, list19, z2);
                    break;
                }
                break;
            case 17:
                List list20 = (List) entry.getValue();
                Class cls18 = AbstractC0273l.f2478a;
                if (list20 != null && !list20.isEmpty()) {
                    gd8Var.m44402e0(i, list20, z2);
                    break;
                }
                break;
        }
    }
}

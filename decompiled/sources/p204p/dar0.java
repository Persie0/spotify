package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class dar0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f47097b;

    public /* synthetic */ dar0(niz nizVar, int i) {
        this.f47096a = i;
        this.f47097b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0197  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:149:0x0209  */
    /* JADX WARN: Code duplicated, block: B:167:0x0247  */
    /* JADX WARN: Code duplicated, block: B:183:0x0280  */
    /* JADX WARN: Code duplicated, block: B:217:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x033b  */
    /* JADX WARN: Code duplicated, block: B:249:0x037a  */
    /* JADX WARN: Code duplicated, block: B:265:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:281:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:296:0x0435  */
    /* JADX WARN: Code duplicated, block: B:299:0x043f  */
    /* JADX WARN: Code duplicated, block: B:306:0x0452  */
    /* JADX WARN: Code duplicated, block: B:321:0x048f  */
    /* JADX WARN: Code duplicated, block: B:324:0x0499  */
    /* JADX WARN: Code duplicated, block: B:331:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:352:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:373:0x053c  */
    /* JADX WARN: Code duplicated, block: B:389:0x0579  */
    /* JADX WARN: Code duplicated, block: B:405:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:421:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:437:0x0634  */
    /* JADX WARN: Code duplicated, block: B:453:0x0674  */
    /* JADX WARN: Code duplicated, block: B:469:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:485:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:503:0x0725  */
    /* JADX WARN: Code duplicated, block: B:519:0x075e  */
    /* JADX WARN: Code duplicated, block: B:545:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:557:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:632:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0157  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        car0 car0Var;
        ear0 ear0Var;
        pqm0 pqm0Var;
        String str;
        uar0 uar0Var;
        cbr0 cbr0Var;
        dbr0 dbr0Var;
        kbr0 kbr0Var;
        pfr0 pfr0Var;
        qfr0 qfr0Var;
        rfr0 rfr0Var;
        kgr0 kgr0Var;
        mgr0 mgr0Var;
        ojr0 ojr0Var;
        pjr0 pjr0Var;
        qjr0 qjr0Var;
        b62 b62Var;
        rjr0 rjr0Var;
        d92 d92Var;
        skr0 skr0Var;
        tkr0 tkr0Var;
        ukr0 ukr0Var;
        ulr0 ulr0Var;
        mqr0 mqr0Var;
        fq01 fq01Var;
        nqr0 nqr0Var;
        vqr0 vqr0Var;
        vsr0 vsr0Var;
        wsr0 wsr0Var;
        xsr0 xsr0Var;
        ysr0 ysr0Var;
        zsr0 zsr0Var;
        mtr0 mtr0Var;
        ntr0 ntr0Var;
        otr0 otr0Var;
        int i = this.f47096a;
        Object obj2 = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f47097b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof car0) {
                    car0Var = (car0) fbkVar;
                    int i2 = car0Var.f35921b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        car0Var.f35921b = i2 - Integer.MIN_VALUE;
                    } else {
                        car0Var = new car0(this, fbkVar);
                    }
                } else {
                    car0Var = new car0(this, fbkVar);
                }
                Object obj3 = car0Var.f35920a;
                int i3 = car0Var.f35921b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                List listMo45450b = ((gqx) obj).mo45450b(lar0.class);
                car0Var.f35921b = 1;
                return nizVar.emit(listMo45450b, car0Var) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof ear0) {
                    ear0Var = (ear0) fbkVar;
                    int i4 = ear0Var.f57718b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ear0Var.f57718b = i4 - Integer.MIN_VALUE;
                    } else {
                        ear0Var = new ear0(this, fbkVar);
                    }
                } else {
                    ear0Var = new ear0(this, fbkVar);
                }
                Object obj4 = ear0Var.f57717a;
                int i5 = ear0Var.f57718b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                ArrayList arrayList = new ArrayList();
                for (fqx fqxVar : (List) obj) {
                    String str2 = fqxVar.f72300a;
                    lar0 lar0Var = (lar0) fqxVar.f72301b;
                    if (lar0Var != null) {
                        jar0 jar0Var = lar0Var.f131400b;
                        if (jar0Var instanceof har0) {
                            str = ((har0) jar0Var).f89268a.f223223a.f213499a.f198763a;
                        } else {
                            if (!(jar0Var instanceof iar0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ts6 ts6Var = ((iar0) jar0Var).f100330a.f102231c;
                            str = ts6Var != null ? ts6Var.f223223a.f213499a.f198763a : null;
                        }
                        if (str == null) {
                            pqm0Var = null;
                        } else {
                            pqm0Var = new pqm0(str2, str);
                        }
                    } else {
                        pqm0Var = null;
                    }
                    if (pqm0Var != null) {
                        arrayList.add(pqm0Var);
                    }
                }
                Map mapM56705r0 = kkc0.m56705r0(arrayList);
                ear0Var.f57718b = 1;
                return nizVar.emit(mapM56705r0, ear0Var) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof uar0) {
                    uar0Var = (uar0) fbkVar;
                    int i6 = uar0Var.f228539b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        uar0Var.f228539b = i6 - Integer.MIN_VALUE;
                    } else {
                        uar0Var = new uar0(this, fbkVar);
                    }
                } else {
                    uar0Var = new uar0(this, fbkVar);
                }
                Object obj5 = uar0Var.f228538a;
                int i7 = uar0Var.f228539b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                ig21 ig21Var = ((cg21) obj).f37544h;
                uar0Var.f228539b = 1;
                return nizVar.emit(ig21Var, uar0Var) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof cbr0) {
                    cbr0Var = (cbr0) fbkVar;
                    int i8 = cbr0Var.f36193b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        cbr0Var.f36193b = i8 - Integer.MIN_VALUE;
                    } else {
                        cbr0Var = new cbr0(this, fbkVar);
                    }
                } else {
                    cbr0Var = new cbr0(this, fbkVar);
                }
                Object obj6 = cbr0Var.f36192a;
                int i9 = cbr0Var.f36193b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                if (!((ew7) obj).f63447b) {
                    return w2a1Var;
                }
                cbr0Var.f36193b = 1;
                return nizVar.emit(obj, cbr0Var) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof dbr0) {
                    dbr0Var = (dbr0) fbkVar;
                    int i10 = dbr0Var.f47351b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dbr0Var.f47351b = i10 - Integer.MIN_VALUE;
                    } else {
                        dbr0Var = new dbr0(this, fbkVar);
                    }
                } else {
                    dbr0Var = new dbr0(this, fbkVar);
                }
                Object obj7 = dbr0Var.f47350a;
                int i11 = dbr0Var.f47351b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                    return w2a1Var;
                }
                bga.m29073P(obj7);
                ig21 ig21Var2 = ((cg21) obj).f37544h;
                dbr0Var.f47351b = 1;
                return nizVar.emit(ig21Var2, dbr0Var) == yukVar ? yukVar : w2a1Var;
            case 5:
                if (fbkVar instanceof kbr0) {
                    kbr0Var = (kbr0) fbkVar;
                    int i12 = kbr0Var.f121269b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        kbr0Var.f121269b = i12 - Integer.MIN_VALUE;
                    } else {
                        kbr0Var = new kbr0(this, fbkVar);
                    }
                } else {
                    kbr0Var = new kbr0(this, fbkVar);
                }
                Object obj8 = kbr0Var.f121268a;
                int i13 = kbr0Var.f121269b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                pof0 pof0Var = new pof0((mxf0) obj);
                kbr0Var.f121269b = 1;
                return nizVar.emit(pof0Var, kbr0Var) == yukVar ? yukVar : w2a1Var;
            case 6:
                if (fbkVar instanceof pfr0) {
                    pfr0Var = (pfr0) fbkVar;
                    int i14 = pfr0Var.f177133b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        pfr0Var.f177133b = i14 - Integer.MIN_VALUE;
                    } else {
                        pfr0Var = new pfr0(this, fbkVar);
                    }
                } else {
                    pfr0Var = new pfr0(this, fbkVar);
                }
                Object obj9 = pfr0Var.f177132a;
                int i15 = pfr0Var.f177133b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                pfr0Var.f177133b = 1;
                return nizVar.emit(boolValueOf, pfr0Var) == yukVar ? yukVar : w2a1Var;
            case 7:
                if (fbkVar instanceof qfr0) {
                    qfr0Var = (qfr0) fbkVar;
                    int i16 = qfr0Var.f188286b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qfr0Var.f188286b = i16 - Integer.MIN_VALUE;
                    } else {
                        qfr0Var = new qfr0(this, fbkVar);
                    }
                } else {
                    qfr0Var = new qfr0(this, fbkVar);
                }
                Object obj10 = qfr0Var.f188285a;
                int i17 = qfr0Var.f188286b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                hfr0 hfr0Var = new hfr0(((Boolean) obj).booleanValue());
                qfr0Var.f188286b = 1;
                return nizVar.emit(hfr0Var, qfr0Var) == yukVar ? yukVar : w2a1Var;
            case 8:
                if (fbkVar instanceof rfr0) {
                    rfr0Var = (rfr0) fbkVar;
                    int i18 = rfr0Var.f198724b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        rfr0Var.f198724b = i18 - Integer.MIN_VALUE;
                    } else {
                        rfr0Var = new rfr0(this, fbkVar);
                    }
                } else {
                    rfr0Var = new rfr0(this, fbkVar);
                }
                Object obj11 = rfr0Var.f198723a;
                int i19 = rfr0Var.f198724b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                ifr0 ifr0Var = new ifr0(((Boolean) obj).booleanValue());
                rfr0Var.f198724b = 1;
                return nizVar.emit(ifr0Var, rfr0Var) == yukVar ? yukVar : w2a1Var;
            case 9:
                if (fbkVar instanceof kgr0) {
                    kgr0Var = (kgr0) fbkVar;
                    int i20 = kgr0Var.f122441b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        kgr0Var.f122441b = i20 - Integer.MIN_VALUE;
                    } else {
                        kgr0Var = new kgr0(this, fbkVar);
                    }
                } else {
                    kgr0Var = new kgr0(this, fbkVar);
                }
                Object obj12 = kgr0Var.f122440a;
                int i21 = kgr0Var.f122441b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                lnn0 lnn0Var = ((ty80) obj).f224877f.f271277v;
                kgr0Var.f122441b = 1;
                return nizVar.emit(lnn0Var, kgr0Var) == yukVar ? yukVar : w2a1Var;
            case 10:
                if (fbkVar instanceof mgr0) {
                    mgr0Var = (mgr0) fbkVar;
                    int i22 = mgr0Var.f143613b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        mgr0Var.f143613b = i22 - Integer.MIN_VALUE;
                    } else {
                        mgr0Var = new mgr0(this, fbkVar);
                    }
                } else {
                    mgr0Var = new mgr0(this, fbkVar);
                }
                Object obj13 = mgr0Var.f143612a;
                int i23 = mgr0Var.f143613b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                Boolean boolValueOf2 = Boolean.valueOf(((pe01) obj).f176586c);
                mgr0Var.f143613b = 1;
                return nizVar.emit(boolValueOf2, mgr0Var) == yukVar ? yukVar : w2a1Var;
            case 11:
                if (fbkVar instanceof ojr0) {
                    ojr0Var = (ojr0) fbkVar;
                    int i24 = ojr0Var.f166114b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        ojr0Var.f166114b = i24 - Integer.MIN_VALUE;
                    } else {
                        ojr0Var = new ojr0(this, fbkVar);
                    }
                } else {
                    ojr0Var = new ojr0(this, fbkVar);
                }
                Object obj14 = ojr0Var.f166113a;
                int i25 = ojr0Var.f166114b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                try {
                    Integer num = new Integer(Integer.parseInt((String) obj));
                    if (num.intValue() != -1) {
                        obj2 = num;
                    }
                } catch (NumberFormatException unused) {
                }
                ojr0Var.f166114b = 1;
                return nizVar.emit(obj2, ojr0Var) == yukVar ? yukVar : w2a1Var;
            case 12:
                if (fbkVar instanceof pjr0) {
                    pjr0Var = (pjr0) fbkVar;
                    int i26 = pjr0Var.f178303b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        pjr0Var.f178303b = i26 - Integer.MIN_VALUE;
                    } else {
                        pjr0Var = new pjr0(this, fbkVar);
                    }
                } else {
                    pjr0Var = new pjr0(this, fbkVar);
                }
                Object obj15 = pjr0Var.f178302a;
                int i27 = pjr0Var.f178303b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj15);
                    return w2a1Var;
                }
                bga.m29073P(obj15);
                try {
                    Integer num2 = new Integer(Integer.parseInt((String) obj));
                    if (num2.intValue() != -1) {
                        obj2 = num2;
                    }
                } catch (NumberFormatException unused2) {
                }
                pjr0Var.f178303b = 1;
                return nizVar.emit(obj2, pjr0Var) == yukVar ? yukVar : w2a1Var;
            case 13:
                if (fbkVar instanceof qjr0) {
                    qjr0Var = (qjr0) fbkVar;
                    int i28 = qjr0Var.f189297b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        qjr0Var.f189297b = i28 - Integer.MIN_VALUE;
                    } else {
                        qjr0Var = new qjr0(this, fbkVar);
                    }
                } else {
                    qjr0Var = new qjr0(this, fbkVar);
                }
                Object obj16 = qjr0Var.f189296a;
                int i29 = qjr0Var.f189297b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                String str3 = (String) obj;
                C2042k7 c2042k7 = new C2042k7(b62.f23804d, 0);
                while (c2042k7.hasNext()) {
                    Object next = c2042k7.next();
                    if (((b62) next).f23805a.equalsIgnoreCase(str3)) {
                        obj2 = next;
                        b62Var = (b62) obj2;
                        if (b62Var == null) {
                            b62Var = b62.UNKNOWN;
                        }
                        qjr0Var.f189297b = 1;
                        if (nizVar.emit(b62Var, qjr0Var) == yukVar) {
                            return yukVar;
                        }
                        return w2a1Var;
                    }
                }
                b62Var = (b62) obj2;
                if (b62Var == null) {
                    b62Var = b62.UNKNOWN;
                }
                qjr0Var.f189297b = 1;
                if (nizVar.emit(b62Var, qjr0Var) == yukVar) {
                    return yukVar;
                }
                return w2a1Var;
            case 14:
                if (fbkVar instanceof rjr0) {
                    rjr0Var = (rjr0) fbkVar;
                    int i30 = rjr0Var.f199900b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        rjr0Var.f199900b = i30 - Integer.MIN_VALUE;
                    } else {
                        rjr0Var = new rjr0(this, fbkVar);
                    }
                } else {
                    rjr0Var = new rjr0(this, fbkVar);
                }
                Object obj17 = rjr0Var.f199899a;
                int i31 = rjr0Var.f199900b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                String str4 = (String) obj;
                C2042k7 c2042k8 = new C2042k7(d92.f46641d, 0);
                while (c2042k8.hasNext()) {
                    Object next2 = c2042k8.next();
                    if (((d92) next2).f46642a.equalsIgnoreCase(str4)) {
                        obj2 = next2;
                        d92Var = (d92) obj2;
                        if (d92Var == null) {
                            d92Var = d92.UNSET;
                        }
                        rjr0Var.f199900b = 1;
                        if (nizVar.emit(d92Var, rjr0Var) == yukVar) {
                            return yukVar;
                        }
                        return w2a1Var;
                    }
                }
                d92Var = (d92) obj2;
                if (d92Var == null) {
                    d92Var = d92.UNSET;
                }
                rjr0Var.f199900b = 1;
                if (nizVar.emit(d92Var, rjr0Var) == yukVar) {
                    return yukVar;
                }
                return w2a1Var;
            case 15:
                if (fbkVar instanceof skr0) {
                    skr0Var = (skr0) fbkVar;
                    int i32 = skr0Var.f210187b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        skr0Var.f210187b = i32 - Integer.MIN_VALUE;
                    } else {
                        skr0Var = new skr0(this, fbkVar);
                    }
                } else {
                    skr0Var = new skr0(this, fbkVar);
                }
                Object obj18 = skr0Var.f210186a;
                int i33 = skr0Var.f210187b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                Boolean boolValueOf3 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                skr0Var.f210187b = 1;
                return nizVar.emit(boolValueOf3, skr0Var) == yukVar ? yukVar : w2a1Var;
            case 16:
                if (fbkVar instanceof tkr0) {
                    tkr0Var = (tkr0) fbkVar;
                    int i34 = tkr0Var.f221211b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        tkr0Var.f221211b = i34 - Integer.MIN_VALUE;
                    } else {
                        tkr0Var = new tkr0(this, fbkVar);
                    }
                } else {
                    tkr0Var = new tkr0(this, fbkVar);
                }
                Object obj19 = tkr0Var.f221210a;
                int i35 = tkr0Var.f221211b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                Boolean boolValueOf4 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                tkr0Var.f221211b = 1;
                return nizVar.emit(boolValueOf4, tkr0Var) == yukVar ? yukVar : w2a1Var;
            case 17:
                if (fbkVar instanceof ukr0) {
                    ukr0Var = (ukr0) fbkVar;
                    int i36 = ukr0Var.f231355b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ukr0Var.f231355b = i36 - Integer.MIN_VALUE;
                    } else {
                        ukr0Var = new ukr0(this, fbkVar);
                    }
                } else {
                    ukr0Var = new ukr0(this, fbkVar);
                }
                Object obj20 = ukr0Var.f231354a;
                int i37 = ukr0Var.f231355b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                Boolean boolValueOf5 = Boolean.valueOf(wj50.m88271j((String) obj, "1"));
                ukr0Var.f231355b = 1;
                return nizVar.emit(boolValueOf5, ukr0Var) == yukVar ? yukVar : w2a1Var;
            case 18:
                if (fbkVar instanceof ulr0) {
                    ulr0Var = (ulr0) fbkVar;
                    int i38 = ulr0Var.f231623b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        ulr0Var.f231623b = i38 - Integer.MIN_VALUE;
                    } else {
                        ulr0Var = new ulr0(this, fbkVar);
                    }
                } else {
                    ulr0Var = new ulr0(this, fbkVar);
                }
                Object obj21 = ulr0Var.f231622a;
                int i39 = ulr0Var.f231623b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                Map map = (Map) obj;
                wj50.m88279p(map);
                Boolean boolValueOf6 = Boolean.valueOf(dxf1.m37217F(map));
                ulr0Var.f231623b = 1;
                return nizVar.emit(boolValueOf6, ulr0Var) == yukVar ? yukVar : w2a1Var;
            case 19:
                if (fbkVar instanceof mqr0) {
                    mqr0Var = (mqr0) fbkVar;
                    int i40 = mqr0Var.f146346b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        mqr0Var.f146346b = i40 - Integer.MIN_VALUE;
                    } else {
                        mqr0Var = new mqr0(this, fbkVar);
                    }
                } else {
                    mqr0Var = new mqr0(this, fbkVar);
                }
                Object obj22 = mqr0Var.f146345a;
                int i41 = mqr0Var.f146346b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                f1y f1yVar = (f1y) obj;
                boolean z = f1yVar.f65004d;
                String str5 = f1yVar.f65003c;
                if (!z || (fq01Var = f1yVar.f65002b) == null || psg1.m70831G(fq01Var) || f1yVar.f65001a || str5 == null) {
                    return w2a1Var;
                }
                Set set = dd41.f47702f;
                if (r46.m74708A(str5, gn80.WRAPPED_INSTANCE_SHARE)) {
                    return w2a1Var;
                }
                try {
                    dd41 dd41VarM74726U = r46.m74726U(str5);
                    String strValueOf = String.valueOf(dd41VarM74726U.f47707a);
                    if (dd41VarM74726U.f47709c == gn80.VTEC_FEATURE_WITH_DATA && (wl51.m88496t0(strValueOf, "party", false) || wl51.m88496t0(strValueOf, "party-dev", false))) {
                        return w2a1Var;
                    }
                } catch (Exception unused3) {
                }
                mqr0Var.f146346b = 1;
                return nizVar.emit(obj, mqr0Var) == yukVar ? yukVar : w2a1Var;
            case 20:
                if (fbkVar instanceof nqr0) {
                    nqr0Var = (nqr0) fbkVar;
                    int i42 = nqr0Var.f157325b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        nqr0Var.f157325b = i42 - Integer.MIN_VALUE;
                    } else {
                        nqr0Var = new nqr0(this, fbkVar);
                    }
                } else {
                    nqr0Var = new nqr0(this, fbkVar);
                }
                Object obj23 = nqr0Var.f157324a;
                int i43 = nqr0Var.f157325b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                nqr0Var.f157325b = 1;
                return nizVar.emit(xmr0.SHARE_SEND, nqr0Var) == yukVar ? yukVar : w2a1Var;
            case 21:
                if (fbkVar instanceof vqr0) {
                    vqr0Var = (vqr0) fbkVar;
                    int i44 = vqr0Var.f243990b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        vqr0Var.f243990b = i44 - Integer.MIN_VALUE;
                    } else {
                        vqr0Var = new vqr0(this, fbkVar);
                    }
                } else {
                    vqr0Var = new vqr0(this, fbkVar);
                }
                Object obj24 = vqr0Var.f243989a;
                int i45 = vqr0Var.f243990b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                if (((iqx) ((gqx) obj)).f104863f) {
                    return w2a1Var;
                }
                vqr0Var.f243990b = 1;
                return nizVar.emit(obj, vqr0Var) == yukVar ? yukVar : w2a1Var;
            case 22:
                if (fbkVar instanceof vsr0) {
                    vsr0Var = (vsr0) fbkVar;
                    int i46 = vsr0Var.f244485b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        vsr0Var.f244485b = i46 - Integer.MIN_VALUE;
                    } else {
                        vsr0Var = new vsr0(this, fbkVar);
                    }
                } else {
                    vsr0Var = new vsr0(this, fbkVar);
                }
                Object obj25 = vsr0Var.f244484a;
                int i47 = vsr0Var.f244485b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                if (!(obj instanceof m6x0)) {
                    return w2a1Var;
                }
                vsr0Var.f244485b = 1;
                return nizVar.emit(obj, vsr0Var) == yukVar ? yukVar : w2a1Var;
            case 23:
                if (fbkVar instanceof wsr0) {
                    wsr0Var = (wsr0) fbkVar;
                    int i48 = wsr0Var.f254721b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        wsr0Var.f254721b = i48 - Integer.MIN_VALUE;
                    } else {
                        wsr0Var = new wsr0(this, fbkVar);
                    }
                } else {
                    wsr0Var = new wsr0(this, fbkVar);
                }
                Object obj26 = wsr0Var.f254720a;
                int i49 = wsr0Var.f254721b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var;
                }
                bga.m29073P(obj26);
                if (!(obj instanceof m6x0)) {
                    return w2a1Var;
                }
                wsr0Var.f254721b = 1;
                return nizVar.emit(obj, wsr0Var) == yukVar ? yukVar : w2a1Var;
            case 24:
                if (fbkVar instanceof xsr0) {
                    xsr0Var = (xsr0) fbkVar;
                    int i50 = xsr0Var.f265654b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        xsr0Var.f265654b = i50 - Integer.MIN_VALUE;
                    } else {
                        xsr0Var = new xsr0(this, fbkVar);
                    }
                } else {
                    xsr0Var = new xsr0(this, fbkVar);
                }
                Object obj27 = xsr0Var.f265653a;
                int i51 = xsr0Var.f265654b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                gsr0 gsr0Var = new gsr0(((Boolean) obj).booleanValue());
                xsr0Var.f265654b = 1;
                return nizVar.emit(gsr0Var, xsr0Var) == yukVar ? yukVar : w2a1Var;
            case 25:
                if (fbkVar instanceof ysr0) {
                    ysr0Var = (ysr0) fbkVar;
                    int i52 = ysr0Var.f275867b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ysr0Var.f275867b = i52 - Integer.MIN_VALUE;
                    } else {
                        ysr0Var = new ysr0(this, fbkVar);
                    }
                } else {
                    ysr0Var = new ysr0(this, fbkVar);
                }
                Object obj28 = ysr0Var.f275866a;
                int i53 = ysr0Var.f275867b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var;
                }
                bga.m29073P(obj28);
                Boolean boolValueOf7 = Boolean.valueOf(((m6x0) obj).f140597a);
                ysr0Var.f275867b = 1;
                return nizVar.emit(boolValueOf7, ysr0Var) == yukVar ? yukVar : w2a1Var;
            case 26:
                if (fbkVar instanceof zsr0) {
                    zsr0Var = (zsr0) fbkVar;
                    int i54 = zsr0Var.f285991b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        zsr0Var.f285991b = i54 - Integer.MIN_VALUE;
                    } else {
                        zsr0Var = new zsr0(this, fbkVar);
                    }
                } else {
                    zsr0Var = new zsr0(this, fbkVar);
                }
                Object obj29 = zsr0Var.f285990a;
                int i55 = zsr0Var.f285991b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                Boolean boolValueOf8 = Boolean.valueOf(((m6x0) obj).f140597a);
                zsr0Var.f285991b = 1;
                return nizVar.emit(boolValueOf8, zsr0Var) == yukVar ? yukVar : w2a1Var;
            case 27:
                if (fbkVar instanceof mtr0) {
                    mtr0Var = (mtr0) fbkVar;
                    int i56 = mtr0Var.f147144b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        mtr0Var.f147144b = i56 - Integer.MIN_VALUE;
                    } else {
                        mtr0Var = new mtr0(this, fbkVar);
                    }
                } else {
                    mtr0Var = new mtr0(this, fbkVar);
                }
                Object obj30 = mtr0Var.f147143a;
                int i57 = mtr0Var.f147144b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                hbt hbtVar = (hbt) obj;
                Boolean boolValueOf9 = Boolean.valueOf(hbtVar instanceof fbt ? ((fbt) hbtVar).f67882a : false);
                mtr0Var.f147144b = 1;
                return nizVar.emit(boolValueOf9, mtr0Var) == yukVar ? yukVar : w2a1Var;
            case 28:
                if (fbkVar instanceof ntr0) {
                    ntr0Var = (ntr0) fbkVar;
                    int i58 = ntr0Var.f158135b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        ntr0Var.f158135b = i58 - Integer.MIN_VALUE;
                    } else {
                        ntr0Var = new ntr0(this, fbkVar);
                    }
                } else {
                    ntr0Var = new ntr0(this, fbkVar);
                }
                Object obj31 = ntr0Var.f158134a;
                int i59 = ntr0Var.f158135b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                String str6 = (String) obj;
                if (str6 == null) {
                    str6 = "";
                }
                ntr0Var.f158135b = 1;
                return nizVar.emit(str6, ntr0Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof otr0) {
                    otr0Var = (otr0) fbkVar;
                    int i60 = otr0Var.f170085b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        otr0Var.f170085b = i60 - Integer.MIN_VALUE;
                    } else {
                        otr0Var = new otr0(this, fbkVar);
                    }
                } else {
                    otr0Var = new otr0(this, fbkVar);
                }
                Object obj32 = otr0Var.f170084a;
                int i61 = otr0Var.f170085b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                if (!(obj instanceof v1s0)) {
                    return w2a1Var;
                }
                otr0Var.f170085b = 1;
                return nizVar.emit(obj, otr0Var) == yukVar ? yukVar : w2a1Var;
        }
    }

    public /* synthetic */ dar0(niz nizVar, Object obj, int i) {
        this.f47096a = i;
        this.f47097b = nizVar;
    }
}

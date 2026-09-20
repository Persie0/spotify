package p204p;

import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qb90 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187044a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f187045b;

    public /* synthetic */ qb90(niz nizVar, int i) {
        this.f187044a = i;
        this.f187045b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x0229  */
    /* JADX WARN: Code duplicated, block: B:183:0x0262  */
    /* JADX WARN: Code duplicated, block: B:199:0x029e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0322  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:262:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:285:0x040b  */
    /* JADX WARN: Code duplicated, block: B:301:0x0444  */
    /* JADX WARN: Code duplicated, block: B:317:0x0480  */
    /* JADX WARN: Code duplicated, block: B:333:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:349:0x0508  */
    /* JADX WARN: Code duplicated, block: B:365:0x0545  */
    /* JADX WARN: Code duplicated, block: B:381:0x0586  */
    /* JADX WARN: Code duplicated, block: B:397:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:413:0x0601  */
    /* JADX WARN: Code duplicated, block: B:429:0x0641  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:447:0x067a  */
    /* JADX WARN: Code duplicated, block: B:467:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:483:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:503:0x073e  */
    /* JADX WARN: Code duplicated, block: B:523:0x0784  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        pb90 pb90Var;
        vb90 vb90Var;
        ic90 ic90Var;
        vc90 vc90Var;
        ad90 ad90Var;
        ce90 ce90Var;
        ee90 ee90Var;
        kf90 kf90Var;
        mf90 mf90Var;
        nf90 nf90Var;
        of90 of90Var;
        pi90 pi90Var;
        cl90 cl90Var;
        gl90 gl90Var;
        iu90 iu90Var;
        ju90 ju90Var;
        rw90 rw90Var;
        Object c6x0Var;
        Object objEmit;
        rz90 rz90Var;
        wz90 wz90Var;
        a0a0 a0a0Var;
        b0a0 b0a0Var;
        c0a0 c0a0Var;
        d0a0 d0a0Var;
        e0a0 e0a0Var;
        f0a0 f0a0Var;
        u0a0 u0a0Var;
        d2a0 d2a0Var;
        e2a0 e2a0Var;
        g2a0 g2a0Var;
        int i = this.f187044a;
        Object s6x0Var = null;
        w2a1 w2a1Var = w2a1.f247311a;
        niz nizVar = this.f187045b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof pb90) {
                    pb90Var = (pb90) fbkVar;
                    int i2 = pb90Var.f175743b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        pb90Var.f175743b = i2 - Integer.MIN_VALUE;
                    } else {
                        pb90Var = new pb90(this, fbkVar);
                    }
                } else {
                    pb90Var = new pb90(this, fbkVar);
                }
                Object obj2 = pb90Var.f175742a;
                int i3 = pb90Var.f175743b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                if (((String) obj).length() <= 0) {
                    return w2a1Var;
                }
                pb90Var.f175743b = 1;
                return nizVar.emit(obj, pb90Var) == yukVar ? yukVar : w2a1Var;
            case 1:
                if (fbkVar instanceof vb90) {
                    vb90Var = (vb90) fbkVar;
                    int i4 = vb90Var.f239442b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vb90Var.f239442b = i4 - Integer.MIN_VALUE;
                    } else {
                        vb90Var = new vb90(this, fbkVar);
                    }
                } else {
                    vb90Var = new vb90(this, fbkVar);
                }
                Object obj3 = vb90Var.f239441a;
                int i5 = vb90Var.f239442b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                nb90 nb90Var = (nb90) g6f.m43745s0((List) obj);
                s6x0Var = nb90Var != null ? new s6x0(nb90Var) : null;
                if (s6x0Var == null) {
                    return w2a1Var;
                }
                vb90Var.f239442b = 1;
                return nizVar.emit(s6x0Var, vb90Var) == yukVar ? yukVar : w2a1Var;
            case 2:
                if (fbkVar instanceof ic90) {
                    ic90Var = (ic90) fbkVar;
                    int i6 = ic90Var.f100761b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ic90Var.f100761b = i6 - Integer.MIN_VALUE;
                    } else {
                        ic90Var = new ic90(this, fbkVar);
                    }
                } else {
                    ic90Var = new ic90(this, fbkVar);
                }
                Object obj4 = ic90Var.f100760a;
                int i7 = ic90Var.f100761b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                    return w2a1Var;
                }
                bga.m29073P(obj4);
                Boolean boolValueOf = Boolean.valueOf(((as6) obj) != null);
                ic90Var.f100761b = 1;
                return nizVar.emit(boolValueOf, ic90Var) == yukVar ? yukVar : w2a1Var;
            case 3:
                if (fbkVar instanceof vc90) {
                    vc90Var = (vc90) fbkVar;
                    int i8 = vc90Var.f240090b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        vc90Var.f240090b = i8 - Integer.MIN_VALUE;
                    } else {
                        vc90Var = new vc90(this, fbkVar);
                    }
                } else {
                    vc90Var = new vc90(this, fbkVar);
                }
                Object obj5 = vc90Var.f240089a;
                int i9 = vc90Var.f240090b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                    return w2a1Var;
                }
                bga.m29073P(obj5);
                v8d v8dVar = new v8d((Map) obj);
                vc90Var.f240090b = 1;
                return nizVar.emit(v8dVar, vc90Var) == yukVar ? yukVar : w2a1Var;
            case 4:
                if (fbkVar instanceof ad90) {
                    ad90Var = (ad90) fbkVar;
                    int i10 = ad90Var.f14580b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ad90Var.f14580b = i10 - Integer.MIN_VALUE;
                    } else {
                        ad90Var = new ad90(this, fbkVar);
                    }
                } else {
                    ad90Var = new ad90(this, fbkVar);
                }
                Object obj6 = ad90Var.f14579a;
                int i11 = ad90Var.f14580b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                Object obj7 = ((mey) ((Map) obj).get(r890.f196740a)) instanceof ley ? o890.f162741a : p890.f174899a;
                ad90Var.f14580b = 1;
                return nizVar.emit(obj7, ad90Var) == yukVar ? yukVar : w2a1Var;
            case 5:
                if (fbkVar instanceof ce90) {
                    ce90Var = (ce90) fbkVar;
                    int i12 = ce90Var.f37064b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        ce90Var.f37064b = i12 - Integer.MIN_VALUE;
                    } else {
                        ce90Var = new ce90(this, fbkVar);
                    }
                } else {
                    ce90Var = new ce90(this, fbkVar);
                }
                Object obj8 = ce90Var.f37063a;
                int i13 = ce90Var.f37064b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                    return w2a1Var;
                }
                bga.m29073P(obj8);
                zyq0 zyq0Var = (zyq0) obj;
                if (zyq0Var == null) {
                    return w2a1Var;
                }
                ce90Var.f37064b = 1;
                return nizVar.emit(zyq0Var, ce90Var) == yukVar ? yukVar : w2a1Var;
            case 6:
                if (fbkVar instanceof ee90) {
                    ee90Var = (ee90) fbkVar;
                    int i14 = ee90Var.f58719b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ee90Var.f58719b = i14 - Integer.MIN_VALUE;
                    } else {
                        ee90Var = new ee90(this, fbkVar);
                    }
                } else {
                    ee90Var = new ee90(this, fbkVar);
                }
                Object obj9 = ee90Var.f58718a;
                int i15 = ee90Var.f58719b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                    return w2a1Var;
                }
                bga.m29073P(obj9);
                u8d u8dVar = new u8d(((Boolean) obj).booleanValue());
                ee90Var.f58719b = 1;
                return nizVar.emit(u8dVar, ee90Var) == yukVar ? yukVar : w2a1Var;
            case 7:
                if (fbkVar instanceof kf90) {
                    kf90Var = (kf90) fbkVar;
                    int i16 = kf90Var.f122110b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        kf90Var.f122110b = i16 - Integer.MIN_VALUE;
                    } else {
                        kf90Var = new kf90(this, fbkVar);
                    }
                } else {
                    kf90Var = new kf90(this, fbkVar);
                }
                Object obj10 = kf90Var.f122109a;
                int i17 = kf90Var.f122110b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                    return w2a1Var;
                }
                bga.m29073P(obj10);
                Boolean boolValueOf2 = Boolean.valueOf(((q890) obj) instanceof o890);
                kf90Var.f122110b = 1;
                return nizVar.emit(boolValueOf2, kf90Var) == yukVar ? yukVar : w2a1Var;
            case 8:
                if (fbkVar instanceof mf90) {
                    mf90Var = (mf90) fbkVar;
                    int i18 = mf90Var.f143001b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        mf90Var.f143001b = i18 - Integer.MIN_VALUE;
                    } else {
                        mf90Var = new mf90(this, fbkVar);
                    }
                } else {
                    mf90Var = new mf90(this, fbkVar);
                }
                Object obj11 = mf90Var.f143000a;
                int i19 = mf90Var.f143001b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                    return w2a1Var;
                }
                bga.m29073P(obj11);
                Boolean boolValueOf3 = Boolean.valueOf(!((pe01) obj).f176586c);
                mf90Var.f143001b = 1;
                return nizVar.emit(boolValueOf3, mf90Var) == yukVar ? yukVar : w2a1Var;
            case 9:
                if (fbkVar instanceof nf90) {
                    nf90Var = (nf90) fbkVar;
                    int i20 = nf90Var.f153300b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        nf90Var.f153300b = i20 - Integer.MIN_VALUE;
                    } else {
                        nf90Var = new nf90(this, fbkVar);
                    }
                } else {
                    nf90Var = new nf90(this, fbkVar);
                }
                Object obj12 = nf90Var.f153299a;
                int i21 = nf90Var.f153300b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                    return w2a1Var;
                }
                bga.m29073P(obj12);
                Boolean boolValueOf4 = Boolean.valueOf(wj50.m88271j((String) obj, "ENABLED"));
                nf90Var.f153300b = 1;
                return nizVar.emit(boolValueOf4, nf90Var) == yukVar ? yukVar : w2a1Var;
            case 10:
                if (fbkVar instanceof of90) {
                    of90Var = (of90) fbkVar;
                    int i22 = of90Var.f164679b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        of90Var.f164679b = i22 - Integer.MIN_VALUE;
                    } else {
                        of90Var = new of90(this, fbkVar);
                    }
                } else {
                    of90Var = new of90(this, fbkVar);
                }
                Object obj13 = of90Var.f164678a;
                int i23 = of90Var.f164679b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                    return w2a1Var;
                }
                bga.m29073P(obj13);
                Boolean boolValueOf5 = Boolean.valueOf(((cke1) obj) instanceof xje1);
                of90Var.f164679b = 1;
                return nizVar.emit(boolValueOf5, of90Var) == yukVar ? yukVar : w2a1Var;
            case 11:
                if (fbkVar instanceof pi90) {
                    pi90Var = (pi90) fbkVar;
                    int i24 = pi90Var.f177867b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        pi90Var.f177867b = i24 - Integer.MIN_VALUE;
                    } else {
                        pi90Var = new pi90(this, fbkVar);
                    }
                } else {
                    pi90Var = new pi90(this, fbkVar);
                }
                Object obj14 = pi90Var.f177866a;
                int i25 = pi90Var.f177867b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                    return w2a1Var;
                }
                bga.m29073P(obj14);
                Object obj15 = ((PlayerState) obj).contextMetadata().get("listening_party_notify_preview_almost_ended_timestamp");
                pi90Var.f177867b = 1;
                return nizVar.emit(obj15, pi90Var) == yukVar ? yukVar : w2a1Var;
            case 12:
                if (fbkVar instanceof cl90) {
                    cl90Var = (cl90) fbkVar;
                    int i26 = cl90Var.f39218b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        cl90Var.f39218b = i26 - Integer.MIN_VALUE;
                    } else {
                        cl90Var = new cl90(this, fbkVar);
                    }
                } else {
                    cl90Var = new cl90(this, fbkVar);
                }
                Object obj16 = cl90Var.f39217a;
                int i27 = cl90Var.f39218b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                    return w2a1Var;
                }
                bga.m29073P(obj16);
                List list = (List) obj;
                wj50.m88279p(list);
                z4m z4mVar = new z4m(8, g6f.m43736n1(list), gbu.f78413a);
                cl90Var.f39218b = 1;
                return nizVar.emit(z4mVar, cl90Var) == yukVar ? yukVar : w2a1Var;
            case 13:
                if (fbkVar instanceof gl90) {
                    gl90Var = (gl90) fbkVar;
                    int i28 = gl90Var.f81026b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        gl90Var.f81026b = i28 - Integer.MIN_VALUE;
                    } else {
                        gl90Var = new gl90(this, fbkVar);
                    }
                } else {
                    gl90Var = new gl90(this, fbkVar);
                }
                Object obj17 = gl90Var.f81025a;
                int i29 = gl90Var.f81026b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                    return w2a1Var;
                }
                bga.m29073P(obj17);
                f4m f4mVar = new f4m((Map) obj);
                gl90Var.f81026b = 1;
                return nizVar.emit(f4mVar, gl90Var) == yukVar ? yukVar : w2a1Var;
            case 14:
                if (fbkVar instanceof iu90) {
                    iu90Var = (iu90) fbkVar;
                    int i30 = iu90Var.f105895b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        iu90Var.f105895b = i30 - Integer.MIN_VALUE;
                    } else {
                        iu90Var = new iu90(this, fbkVar);
                    }
                } else {
                    iu90Var = new iu90(this, fbkVar);
                }
                Object obj18 = iu90Var.f105894a;
                int i31 = iu90Var.f105895b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                    return w2a1Var;
                }
                bga.m29073P(obj18);
                String str = ((e301) obj).f55571a;
                iu90Var.f105895b = 1;
                return nizVar.emit(str, iu90Var) == yukVar ? yukVar : w2a1Var;
            case 15:
                if (fbkVar instanceof ju90) {
                    ju90Var = (ju90) fbkVar;
                    int i32 = ju90Var.f116057b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ju90Var.f116057b = i32 - Integer.MIN_VALUE;
                    } else {
                        ju90Var = new ju90(this, fbkVar);
                    }
                } else {
                    ju90Var = new ju90(this, fbkVar);
                }
                Object obj19 = ju90Var.f116056a;
                int i33 = ju90Var.f116057b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                    return w2a1Var;
                }
                bga.m29073P(obj19);
                gmr0 gmr0Var = (gmr0) ((xul0) obj).mo49283h();
                if (gmr0Var != null) {
                    String str2 = gmr0Var.f81455f;
                    if (str2 == null) {
                        str2 = (String) g6f.m43745s0(gmr0Var.f81454e);
                    }
                    s6x0Var = new o8m(str2, gmr0Var.f81451b);
                }
                ju90Var.f116057b = 1;
                return nizVar.emit(s6x0Var, ju90Var) == yukVar ? yukVar : w2a1Var;
            case 16:
                if (fbkVar instanceof rw90) {
                    rw90Var = (rw90) fbkVar;
                    int i34 = rw90Var.f203309b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        rw90Var.f203309b = i34 - Integer.MIN_VALUE;
                    } else {
                        rw90Var = new rw90(this, fbkVar);
                    }
                } else {
                    rw90Var = new rw90(this, fbkVar);
                }
                Object obj20 = rw90Var.f203308a;
                int i35 = rw90Var.f203309b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                    return w2a1Var;
                }
                bga.m29073P(obj20);
                tb80 tb80Var = (tb80) obj;
                String str3 = tb80Var.getF5195a().f5183a;
                try {
                    c6x0Var = Long.valueOf(z050.m95042r6(str3).m95047v6());
                    break;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                if (s6x0.m77348a(c6x0Var) != null) {
                    try {
                        lba0 lba0Var = lba0.f131608f;
                        c6x0Var = Long.valueOf(lba0.m58644y6(str3, bno.f28899h).m41300m6(hze1.f96907f).m95047v6());
                    } catch (Throwable th2) {
                        c6x0Var = new c6x0(th2);
                    }
                    break;
                }
                Long l = (Long) (c6x0Var instanceof c6x0 ? null : c6x0Var);
                pqm0 pqm0Var = new pqm0(tb80Var, new Long(l != null ? l.longValue() : System.currentTimeMillis()));
                rw90Var.f203309b = 1;
                return nizVar.emit(pqm0Var, rw90Var) == yukVar ? yukVar : w2a1Var;
            case 17:
                qho qhoVar = (qho) obj;
                if (qhoVar instanceof oho) {
                    hz90 hz90Var = (hz90) ((oho) qhoVar).f165512a;
                    objEmit = nizVar.emit(new inf0(hz90Var.f96840a, hz90Var.f96841b, (int) hz90Var.f96842c, (int) hz90Var.f96843d, hz90Var.f96844e, hz90Var.f96845f), fbkVar);
                    if (objEmit != yukVar) {
                        return w2a1Var;
                    }
                } else if (!(qhoVar instanceof nho) || (objEmit = nizVar.emit(new inf0(null, null, 0, 0, null, null), fbkVar)) != yukVar) {
                    return w2a1Var;
                }
                return objEmit;
            case 18:
                if (fbkVar instanceof rz90) {
                    rz90Var = (rz90) fbkVar;
                    int i36 = rz90Var.f204098b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        rz90Var.f204098b = i36 - Integer.MIN_VALUE;
                    } else {
                        rz90Var = new rz90(this, fbkVar);
                    }
                } else {
                    rz90Var = new rz90(this, fbkVar);
                }
                Object obj21 = rz90Var.f204097a;
                int i37 = rz90Var.f204098b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                    return w2a1Var;
                }
                bga.m29073P(obj21);
                qwe0 qwe0Var = new qwe0(((Boolean) obj).booleanValue());
                rz90Var.f204098b = 1;
                return nizVar.emit(qwe0Var, rz90Var) == yukVar ? yukVar : w2a1Var;
            case 19:
                if (fbkVar instanceof wz90) {
                    wz90Var = (wz90) fbkVar;
                    int i38 = wz90Var.f256537b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        wz90Var.f256537b = i38 - Integer.MIN_VALUE;
                    } else {
                        wz90Var = new wz90(this, fbkVar);
                    }
                } else {
                    wz90Var = new wz90(this, fbkVar);
                }
                Object obj22 = wz90Var.f256536a;
                int i39 = wz90Var.f256537b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    return w2a1Var;
                }
                bga.m29073P(obj22);
                t990 t990Var = new t990((r990) obj);
                wz90Var.f256537b = 1;
                return nizVar.emit(t990Var, wz90Var) == yukVar ? yukVar : w2a1Var;
            case 20:
                if (fbkVar instanceof a0a0) {
                    a0a0Var = (a0a0) fbkVar;
                    int i40 = a0a0Var.f11038b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        a0a0Var.f11038b = i40 - Integer.MIN_VALUE;
                    } else {
                        a0a0Var = new a0a0(this, fbkVar);
                    }
                } else {
                    a0a0Var = new a0a0(this, fbkVar);
                }
                Object obj23 = a0a0Var.f11037a;
                int i41 = a0a0Var.f11038b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj23);
                    return w2a1Var;
                }
                bga.m29073P(obj23);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                a0a0Var.f11038b = 1;
                return nizVar.emit(obj, a0a0Var) == yukVar ? yukVar : w2a1Var;
            case 21:
                if (fbkVar instanceof b0a0) {
                    b0a0Var = (b0a0) fbkVar;
                    int i42 = b0a0Var.f21811b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        b0a0Var.f21811b = i42 - Integer.MIN_VALUE;
                    } else {
                        b0a0Var = new b0a0(this, fbkVar);
                    }
                } else {
                    b0a0Var = new b0a0(this, fbkVar);
                }
                Object obj24 = b0a0Var.f21810a;
                int i43 = b0a0Var.f21811b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var;
                }
                bga.m29073P(obj24);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                b0a0Var.f21811b = 1;
                return nizVar.emit(obj, b0a0Var) == yukVar ? yukVar : w2a1Var;
            case 22:
                if (fbkVar instanceof c0a0) {
                    c0a0Var = (c0a0) fbkVar;
                    int i44 = c0a0Var.f32725b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        c0a0Var.f32725b = i44 - Integer.MIN_VALUE;
                    } else {
                        c0a0Var = new c0a0(this, fbkVar);
                    }
                } else {
                    c0a0Var = new c0a0(this, fbkVar);
                }
                Object obj25 = c0a0Var.f32724a;
                int i45 = c0a0Var.f32725b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var;
                }
                bga.m29073P(obj25);
                Object obj26 = ((oho) obj).f165512a;
                c0a0Var.f32725b = 1;
                return nizVar.emit(obj26, c0a0Var) == yukVar ? yukVar : w2a1Var;
            case 23:
                if (fbkVar instanceof d0a0) {
                    d0a0Var = (d0a0) fbkVar;
                    int i46 = d0a0Var.f43826b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        d0a0Var.f43826b = i46 - Integer.MIN_VALUE;
                    } else {
                        d0a0Var = new d0a0(this, fbkVar);
                    }
                } else {
                    d0a0Var = new d0a0(this, fbkVar);
                }
                Object obj27 = d0a0Var.f43825a;
                int i47 = d0a0Var.f43826b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var;
                }
                bga.m29073P(obj27);
                Object obj28 = ((oho) obj).f165512a;
                d0a0Var.f43826b = 1;
                return nizVar.emit(obj28, d0a0Var) == yukVar ? yukVar : w2a1Var;
            case 24:
                if (fbkVar instanceof e0a0) {
                    e0a0Var = (e0a0) fbkVar;
                    int i48 = e0a0Var.f54911b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        e0a0Var.f54911b = i48 - Integer.MIN_VALUE;
                    } else {
                        e0a0Var = new e0a0(this, fbkVar);
                    }
                } else {
                    e0a0Var = new e0a0(this, fbkVar);
                }
                Object obj29 = e0a0Var.f54910a;
                int i49 = e0a0Var.f54911b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var;
                }
                bga.m29073P(obj29);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                e0a0Var.f54911b = 1;
                return nizVar.emit(obj, e0a0Var) == yukVar ? yukVar : w2a1Var;
            case 25:
                if (fbkVar instanceof f0a0) {
                    f0a0Var = (f0a0) fbkVar;
                    int i50 = f0a0Var.f64579b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        f0a0Var.f64579b = i50 - Integer.MIN_VALUE;
                    } else {
                        f0a0Var = new f0a0(this, fbkVar);
                    }
                } else {
                    f0a0Var = new f0a0(this, fbkVar);
                }
                Object obj30 = f0a0Var.f64578a;
                int i51 = f0a0Var.f64579b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var;
                }
                bga.m29073P(obj30);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                f0a0Var.f64579b = 1;
                return nizVar.emit(obj, f0a0Var) == yukVar ? yukVar : w2a1Var;
            case 26:
                if (fbkVar instanceof u0a0) {
                    u0a0Var = (u0a0) fbkVar;
                    int i52 = u0a0Var.f225431b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        u0a0Var.f225431b = i52 - Integer.MIN_VALUE;
                    } else {
                        u0a0Var = new u0a0(this, fbkVar);
                    }
                } else {
                    u0a0Var = new u0a0(this, fbkVar);
                }
                Object obj31 = u0a0Var.f225430a;
                int i53 = u0a0Var.f225431b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var;
                }
                bga.m29073P(obj31);
                y420 y420Var = (y420) obj;
                if (y420Var == null) {
                    return w2a1Var;
                }
                u0a0Var.f225431b = 1;
                return nizVar.emit(y420Var, u0a0Var) == yukVar ? yukVar : w2a1Var;
            case 27:
                if (fbkVar instanceof d2a0) {
                    d2a0Var = (d2a0) fbkVar;
                    int i54 = d2a0Var.f44523b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        d2a0Var.f44523b = i54 - Integer.MIN_VALUE;
                    } else {
                        d2a0Var = new d2a0(this, fbkVar);
                    }
                } else {
                    d2a0Var = new d2a0(this, fbkVar);
                }
                Object obj32 = d2a0Var.f44522a;
                int i55 = d2a0Var.f44523b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var;
                }
                bga.m29073P(obj32);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                d2a0Var.f44523b = 1;
                return nizVar.emit(obj, d2a0Var) == yukVar ? yukVar : w2a1Var;
            case 28:
                if (fbkVar instanceof e2a0) {
                    e2a0Var = (e2a0) fbkVar;
                    int i56 = e2a0Var.f55413b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        e2a0Var.f55413b = i56 - Integer.MIN_VALUE;
                    } else {
                        e2a0Var = new e2a0(this, fbkVar);
                    }
                } else {
                    e2a0Var = new e2a0(this, fbkVar);
                }
                Object obj33 = e2a0Var.f55412a;
                int i57 = e2a0Var.f55413b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj33);
                    return w2a1Var;
                }
                bga.m29073P(obj33);
                if (!(obj instanceof oho)) {
                    return w2a1Var;
                }
                e2a0Var.f55413b = 1;
                return nizVar.emit(obj, e2a0Var) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof g2a0) {
                    g2a0Var = (g2a0) fbkVar;
                    int i58 = g2a0Var.f75873b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        g2a0Var.f75873b = i58 - Integer.MIN_VALUE;
                    } else {
                        g2a0Var = new g2a0(this, fbkVar);
                    }
                } else {
                    g2a0Var = new g2a0(this, fbkVar);
                }
                Object obj34 = g2a0Var.f75872a;
                int i59 = g2a0Var.f75873b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj34);
                    return w2a1Var;
                }
                bga.m29073P(obj34);
                Object obj35 = ((oho) obj).f165512a;
                g2a0Var.f75873b = 1;
                return nizVar.emit(obj35, g2a0Var) == yukVar ? yukVar : w2a1Var;
        }
    }

    public qb90(niz nizVar, tw90 tw90Var) {
        this.f187044a = 16;
        this.f187045b = nizVar;
    }
}

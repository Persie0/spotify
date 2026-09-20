package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.sharecard.config.impl.proto.BackgroundWithSticker;
import com.spotify.sharecard.config.impl.proto.CardData;
import com.spotify.sharecard.config.impl.proto.Line;
import com.spotify.sharecard.config.impl.proto.Quote;
import com.spotify.sharecard.config.impl.proto.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class czz0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f43670b;

    public /* synthetic */ czz0(niz nizVar, int i) {
        this.f43669a = i;
        this.f43670b = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m34480b(Object obj, fbk fbkVar) {
        v511 v511Var;
        if (fbkVar instanceof v511) {
            v511Var = (v511) fbkVar;
            int i = v511Var.f237290b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v511Var.f237290b = i - Integer.MIN_VALUE;
            } else {
                v511Var = new v511(this, fbkVar);
            }
        } else {
            v511Var = new v511(this, fbkVar);
        }
        Object obj2 = v511Var.f237289a;
        int i2 = v511Var.f237290b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            if (obj instanceof l8r0) {
                v511Var.f237290b = 1;
                Object objEmit = this.f43670b.emit(obj, v511Var);
                yuk yukVar = yuk.f276404a;
                if (objEmit == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    private final Object m34481c(Object obj, fbk fbkVar) {
        k611 k611Var;
        if (fbkVar instanceof k611) {
            k611Var = (k611) fbkVar;
            int i = k611Var.f119613b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k611Var.f119613b = i - Integer.MIN_VALUE;
            } else {
                k611Var = new k611(this, fbkVar);
            }
        } else {
            k611Var = new k611(this, fbkVar);
        }
        Object obj2 = k611Var.f119612a;
        int i2 = k611Var.f119613b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            if (!((iqx) ((gqx) obj)).f104863f) {
                k611Var.f119613b = 1;
                Object objEmit = this.f43670b.emit(obj, k611Var);
                yuk yukVar = yuk.f276404a;
                if (objEmit == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x019b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x0217  */
    /* JADX WARN: Code duplicated, block: B:171:0x0255  */
    /* JADX WARN: Code duplicated, block: B:260:0x0490  */
    /* JADX WARN: Code duplicated, block: B:276:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:297:0x0536  */
    /* JADX WARN: Code duplicated, block: B:316:0x057a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:333:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:350:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:367:0x0647  */
    /* JADX WARN: Code duplicated, block: B:385:0x0693  */
    /* JADX WARN: Code duplicated, block: B:402:0x06da  */
    /* JADX WARN: Code duplicated, block: B:427:0x072e  */
    /* JADX WARN: Code duplicated, block: B:444:0x076e  */
    /* JADX WARN: Code duplicated, block: B:461:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:492:0x080d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:510:0x0856  */
    /* JADX WARN: Code duplicated, block: B:527:0x089b  */
    /* JADX WARN: Code duplicated, block: B:558:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:575:0x093d  */
    /* JADX WARN: Code duplicated, block: B:609:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:646:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x0162  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        bzz0 bzz0Var;
        dzz0 dzz0Var;
        rzz0 rzz0Var;
        v201 v201Var;
        Object s201Var;
        int i;
        k301 k301Var;
        i701 i701Var;
        a901 a901Var;
        b901 b901Var;
        ma01 ma01Var;
        xc01 xc01Var;
        bd01 bd01Var;
        cd01 cd01Var;
        lm01 lm01Var;
        oq01 oq01Var;
        uq01 uq01Var;
        zq01 zq01Var;
        kr01 kr01Var;
        yv01 yv01Var;
        zv01 zv01Var;
        w2a1 w2a1Var;
        lv01 jv01Var;
        int i2;
        xu01 xu01Var;
        List list;
        z0c v0cVar;
        pqm0 pqm0Var;
        jm8 hm8Var;
        j311 j311Var;
        k311 k311Var;
        m311 m311Var;
        o411 o411Var;
        p411 p411Var;
        q411 q411Var;
        r411 r411Var;
        y411 y411Var;
        ga11 ga11Var;
        int i3 = this.f43669a;
        boolean z = false;
        w2a1 w2a1Var2 = w2a1.f247311a;
        niz nizVar = this.f43670b;
        yuk yukVar = yuk.f276404a;
        int i4 = 1;
        switch (i3) {
            case 0:
                if (fbkVar instanceof bzz0) {
                    bzz0Var = (bzz0) fbkVar;
                    int i5 = bzz0Var.f32629b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bzz0Var.f32629b = i5 - Integer.MIN_VALUE;
                    } else {
                        bzz0Var = new bzz0(this, fbkVar);
                    }
                } else {
                    bzz0Var = new bzz0(this, fbkVar);
                }
                Object obj2 = bzz0Var.f32628a;
                int i6 = bzz0Var.f32629b;
                if (i6 == 0) {
                    bga.m29073P(obj2);
                    List list2 = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((wyz0) obj3).f256416c == syz0.f215350b) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((wyz0) it.next()).f256414a);
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList2);
                    wyz0 wyz0Var = (wyz0) g6f.m43745s0(arrayList);
                    String str = wyz0Var != null ? wyz0Var.f256417d : null;
                    if (str == null) {
                        str = "";
                    }
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(wyz0.m89389a((wyz0) it2.next(), setM43736n1, str, 319));
                    }
                    bzz0Var.f32629b = 1;
                    if (nizVar.emit(arrayList3, bzz0Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1Var2;
            case 1:
                if (fbkVar instanceof dzz0) {
                    dzz0Var = (dzz0) fbkVar;
                    int i7 = dzz0Var.f54803b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dzz0Var.f54803b = i7 - Integer.MIN_VALUE;
                    } else {
                        dzz0Var = new dzz0(this, fbkVar);
                    }
                } else {
                    dzz0Var = new dzz0(this, fbkVar);
                }
                Object obj4 = dzz0Var.f54802a;
                int i8 = dzz0Var.f54803b;
                if (i8 == 0) {
                    bga.m29073P(obj4);
                    ybv ybvVar = ((ty80) obj).f224877f;
                    if (ybvVar != null) {
                        dzz0Var.f54803b = 1;
                        if (nizVar.emit(ybvVar, dzz0Var) == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1Var2;
            case 2:
                if (fbkVar instanceof rzz0) {
                    rzz0Var = (rzz0) fbkVar;
                    int i9 = rzz0Var.f204265b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        rzz0Var.f204265b = i9 - Integer.MIN_VALUE;
                    } else {
                        rzz0Var = new rzz0(this, fbkVar);
                    }
                } else {
                    rzz0Var = new rzz0(this, fbkVar);
                }
                Object obj5 = rzz0Var.f204264a;
                int i10 = rzz0Var.f204265b;
                if (i10 == 0) {
                    bga.m29073P(obj5);
                    pzz0 pzz0Var = szz0.f215699e;
                    fbz fbzVar = new fbz((String) ((qpi0) obj).f191326a.get(qzz0.f194336a));
                    rzz0Var.f204265b = 1;
                    if (nizVar.emit(fbzVar, rzz0Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1Var2;
            case 3:
                if (fbkVar instanceof v201) {
                    v201Var = (v201) fbkVar;
                    int i11 = v201Var.f236512b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        v201Var.f236512b = i11 - Integer.MIN_VALUE;
                    } else {
                        v201Var = new v201(this, fbkVar);
                    }
                } else {
                    v201Var = new v201(this, fbkVar);
                }
                Object obj6 = v201Var.f236511a;
                int i12 = v201Var.f236512b;
                if (i12 == 0) {
                    bga.m29073P(obj6);
                    ehy0 ehy0Var = (ehy0) obj;
                    if (ehy0Var instanceof chy0) {
                        int iOrdinal = ((byz0) ((chy0) ehy0Var).f38149a).mo30911D().f78372a.m43587a().ordinal();
                        if (iOrdinal == 0) {
                            i = 1;
                        } else if (iOrdinal == 1) {
                            i = 2;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = 3;
                        }
                        s201Var = new s201(new fbq0(i));
                    } else {
                        s201Var = a7j0.f13074Z;
                    }
                    v201Var.f236512b = 1;
                    if (nizVar.emit(s201Var, v201Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1Var2;
            case 4:
                if (fbkVar instanceof k301) {
                    k301Var = (k301) fbkVar;
                    int i13 = k301Var.f118730b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        k301Var.f118730b = i13 - Integer.MIN_VALUE;
                    } else {
                        k301Var = new k301(this, fbkVar);
                    }
                } else {
                    k301Var = new k301(this, fbkVar);
                }
                Object obj7 = k301Var.f118729a;
                int i14 = k301Var.f118730b;
                if (i14 == 0) {
                    bga.m29073P(obj7);
                    Boolean boolValueOf = Boolean.valueOf(((e301) obj).f55572b);
                    k301Var.f118730b = 1;
                    if (nizVar.emit(boolValueOf, k301Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1Var2;
            case 5:
                if (fbkVar instanceof i701) {
                    i701Var = (i701) fbkVar;
                    int i15 = i701Var.f99403b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        i701Var.f99403b = i15 - Integer.MIN_VALUE;
                    } else {
                        i701Var = new i701(this, fbkVar);
                    }
                } else {
                    i701Var = new i701(this, fbkVar);
                }
                Object obj8 = i701Var.f99402a;
                int i16 = i701Var.f99403b;
                if (i16 == 0) {
                    bga.m29073P(obj8);
                    ty80 ty80Var = (ty80) obj;
                    vy80 vy80Var = ty80Var.f224877f.f271278w.f156643g;
                    boolean z2 = vy80Var.f246003a || vy80Var.f246005c || vy80Var.f246004b;
                    boolean z3 = ty80Var.f224879h;
                    if (z2 && !z3) {
                        z = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    i701Var.f99403b = 1;
                    if (nizVar.emit(boolValueOf2, i701Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1Var2;
            case 6:
                if (fbkVar instanceof a901) {
                    a901Var = (a901) fbkVar;
                    int i17 = a901Var.f13447b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        a901Var.f13447b = i17 - Integer.MIN_VALUE;
                    } else {
                        a901Var = new a901(this, fbkVar);
                    }
                } else {
                    a901Var = new a901(this, fbkVar);
                }
                Object obj9 = a901Var.f13446a;
                int i18 = a901Var.f13447b;
                if (i18 == 0) {
                    bga.m29073P(obj9);
                    ((cu7) obj).getClass();
                    v801 v801Var = new v801();
                    a901Var.f13447b = 1;
                    if (nizVar.emit(v801Var, a901Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj9);
                }
                return w2a1Var2;
            case 7:
                if (fbkVar instanceof b901) {
                    b901Var = (b901) fbkVar;
                    int i19 = b901Var.f24736b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        b901Var.f24736b = i19 - Integer.MIN_VALUE;
                    } else {
                        b901Var = new b901(this, fbkVar);
                    }
                } else {
                    b901Var = new b901(this, fbkVar);
                }
                Object obj10 = b901Var.f24735a;
                int i20 = b901Var.f24736b;
                if (i20 == 0) {
                    bga.m29073P(obj10);
                    w801 w801Var = new w801(wj50.m88271j((f1j) obj, e1j.f55208a));
                    b901Var.f24736b = 1;
                    if (nizVar.emit(w801Var, b901Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1Var2;
            case 8:
                if (fbkVar instanceof ma01) {
                    ma01Var = (ma01) fbkVar;
                    int i21 = ma01Var.f141424b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ma01Var.f141424b = i21 - Integer.MIN_VALUE;
                    } else {
                        ma01Var = new ma01(this, fbkVar);
                    }
                } else {
                    ma01Var = new ma01(this, fbkVar);
                }
                Object obj11 = ma01Var.f141423a;
                int i22 = ma01Var.f141424b;
                if (i22 == 0) {
                    bga.m29073P(obj11);
                    ty80 ty80Var2 = (ty80) obj;
                    vy80 vy80Var2 = ty80Var2.f224877f.f271278w.f156643g;
                    boolean z4 = vy80Var2.f246003a || vy80Var2.f246005c || vy80Var2.f246004b;
                    boolean z5 = ty80Var2.f224879h;
                    if (z4 && !z5) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    ma01Var.f141424b = 1;
                    if (nizVar.emit(boolValueOf3, ma01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1Var2;
            case 9:
                if (fbkVar instanceof xc01) {
                    xc01Var = (xc01) fbkVar;
                    int i23 = xc01Var.f260042b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        xc01Var.f260042b = i23 - Integer.MIN_VALUE;
                    } else {
                        xc01Var = new xc01(this, fbkVar);
                    }
                } else {
                    xc01Var = new xc01(this, fbkVar);
                }
                Object obj12 = xc01Var.f260041a;
                int i24 = xc01Var.f260042b;
                if (i24 == 0) {
                    bga.m29073P(obj12);
                    ed01 ed01Var = new ed01(obj);
                    xc01Var.f260042b = 1;
                    if (nizVar.emit(ed01Var, xc01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj12);
                }
                return w2a1Var2;
            case 10:
                if (fbkVar instanceof bd01) {
                    bd01Var = (bd01) fbkVar;
                    int i25 = bd01Var.f25974b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        bd01Var.f25974b = i25 - Integer.MIN_VALUE;
                    } else {
                        bd01Var = new bd01(this, fbkVar);
                    }
                } else {
                    bd01Var = new bd01(this, fbkVar);
                }
                Object obj13 = bd01Var.f25973a;
                int i26 = bd01Var.f25974b;
                if (i26 == 0) {
                    bga.m29073P(obj13);
                    ed01 ed01Var2 = new ed01(obj);
                    bd01Var.f25974b = 1;
                    if (nizVar.emit(ed01Var2, bd01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1Var2;
            case 11:
                if (fbkVar instanceof cd01) {
                    cd01Var = (cd01) fbkVar;
                    int i27 = cd01Var.f36702b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        cd01Var.f36702b = i27 - Integer.MIN_VALUE;
                    } else {
                        cd01Var = new cd01(this, fbkVar);
                    }
                } else {
                    cd01Var = new cd01(this, fbkVar);
                }
                Object obj14 = cd01Var.f36701a;
                int i28 = cd01Var.f36702b;
                if (i28 == 0) {
                    bga.m29073P(obj14);
                    Object obj15 = ((s6x0) obj).f206218a;
                    if (obj15 instanceof c6x0) {
                        obj15 = null;
                    }
                    Object ed01Var3 = obj15 != null ? new ed01(obj15) : new dd01(0, null);
                    cd01Var.f36702b = 1;
                    if (nizVar.emit(ed01Var3, cd01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj14);
                }
                return w2a1Var2;
            case 12:
                if (fbkVar instanceof lm01) {
                    lm01Var = (lm01) fbkVar;
                    int i29 = lm01Var.f134734b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        lm01Var.f134734b = i29 - Integer.MIN_VALUE;
                    } else {
                        lm01Var = new lm01(this, fbkVar);
                    }
                } else {
                    lm01Var = new lm01(this, fbkVar);
                }
                Object obj16 = lm01Var.f134733a;
                int i30 = lm01Var.f134734b;
                if (i30 == 0) {
                    bga.m29073P(obj16);
                    im01 im01Var = new im01(null, ((Boolean) obj).booleanValue());
                    lm01Var.f134734b = 1;
                    if (nizVar.emit(im01Var, lm01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj16);
                }
                return w2a1Var2;
            case 13:
                if (fbkVar instanceof oq01) {
                    oq01Var = (oq01) fbkVar;
                    int i31 = oq01Var.f168049b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        oq01Var.f168049b = i31 - Integer.MIN_VALUE;
                    } else {
                        oq01Var = new oq01(this, fbkVar);
                    }
                } else {
                    oq01Var = new oq01(this, fbkVar);
                }
                Object obj17 = oq01Var.f168048a;
                int i32 = oq01Var.f168049b;
                if (i32 == 0) {
                    bga.m29073P(obj17);
                    String strUri = ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
                    oq01Var.f168049b = 1;
                    if (nizVar.emit(strUri, oq01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj17);
                }
                return w2a1Var2;
            case 14:
                if (fbkVar instanceof uq01) {
                    uq01Var = (uq01) fbkVar;
                    int i33 = uq01Var.f232882b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        uq01Var.f232882b = i33 - Integer.MIN_VALUE;
                    } else {
                        uq01Var = new uq01(this, fbkVar);
                    }
                } else {
                    uq01Var = new uq01(this, fbkVar);
                }
                Object obj18 = uq01Var.f232881a;
                int i34 = uq01Var.f232882b;
                if (i34 == 0) {
                    bga.m29073P(obj18);
                    Boolean boolValueOf4 = Boolean.valueOf(!wj50.m88271j((s6m0) obj, ko6.f124546a));
                    uq01Var.f232882b = 1;
                    if (nizVar.emit(boolValueOf4, uq01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj18);
                }
                return w2a1Var2;
            case 15:
                if (fbkVar instanceof zq01) {
                    zq01Var = (zq01) fbkVar;
                    int i35 = zq01Var.f285276b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        zq01Var.f285276b = i35 - Integer.MIN_VALUE;
                    } else {
                        zq01Var = new zq01(this, fbkVar);
                    }
                } else {
                    zq01Var = new zq01(this, fbkVar);
                }
                Object obj19 = zq01Var.f285275a;
                int i36 = zq01Var.f285276b;
                if (i36 == 0) {
                    bga.m29073P(obj19);
                    ybv ybvVar2 = ((ty80) obj).f224877f;
                    zq01Var.f285276b = 1;
                    if (nizVar.emit(ybvVar2, zq01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj19);
                }
                return w2a1Var2;
            case 16:
                if (fbkVar instanceof kr01) {
                    kr01Var = (kr01) fbkVar;
                    int i37 = kr01Var.f125488b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        kr01Var.f125488b = i37 - Integer.MIN_VALUE;
                    } else {
                        kr01Var = new kr01(this, fbkVar);
                    }
                } else {
                    kr01Var = new kr01(this, fbkVar);
                }
                Object obj20 = kr01Var.f125487a;
                int i38 = kr01Var.f125488b;
                if (i38 == 0) {
                    bga.m29073P(obj20);
                    ir01 ir01Var = new ir01(((Boolean) obj).booleanValue());
                    kr01Var.f125488b = 1;
                    if (nizVar.emit(ir01Var, kr01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj20);
                }
                return w2a1Var2;
            case 17:
                if (fbkVar instanceof yv01) {
                    yv01Var = (yv01) fbkVar;
                    int i39 = yv01Var.f276520b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        yv01Var.f276520b = i39 - Integer.MIN_VALUE;
                    } else {
                        yv01Var = new yv01(this, fbkVar);
                    }
                } else {
                    yv01Var = new yv01(this, fbkVar);
                }
                Object obj21 = yv01Var.f276519a;
                int i40 = yv01Var.f276520b;
                if (i40 == 0) {
                    bga.m29073P(obj21);
                    if (!((iqx) ((gqx) obj)).f104863f) {
                        yv01Var.f276520b = 1;
                        if (nizVar.emit(obj, yv01Var) == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj21);
                }
                return w2a1Var2;
            case 18:
                if (fbkVar instanceof zv01) {
                    zv01Var = (zv01) fbkVar;
                    int i41 = zv01Var.f286579b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        zv01Var.f286579b = i41 - Integer.MIN_VALUE;
                    } else {
                        zv01Var = new zv01(this, fbkVar);
                    }
                } else {
                    zv01Var = new zv01(this, fbkVar);
                }
                Object obj22 = zv01Var.f286578a;
                int i42 = zv01Var.f286579b;
                if (i42 == 0) {
                    bga.m29073P(obj22);
                    gqx gqxVar = (gqx) obj;
                    List listMo45450b = gqxVar.mo45450b(uy31.class);
                    List listMo45450b2 = gqxVar.mo45450b(cud.class);
                    List listMo45450b3 = gqxVar.mo45450b(pk01.class);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = listMo45450b3.iterator();
                    while (it3.hasNext()) {
                        fqx fqxVar = (fqx) it3.next();
                        pk01 pk01Var = (pk01) fqxVar.f72301b;
                        if (pk01Var == null) {
                            it3 = it3;
                            w2a1Var2 = w2a1Var2;
                            pqm0Var = null;
                        } else {
                            String str2 = fqxVar.f72300a;
                            CardData cardDataM21135r = CardData.m21135r(pk01Var.f178361c);
                            String str3 = pk01Var.f178359a;
                            Set set = dd41.f47702f;
                            xr01 xr01Var = new xr01(r46.m74726U(str3));
                            dd41 dd41VarM74726U = r46.m74726U(pk01Var.f178360b);
                            wj50.m88279p(cardDataM21135r);
                            int iM21137o = cardDataM21135r.m21137o();
                            int i43 = iM21137o == 0 ? -1 : rk01.f199944a[edb.m38547C(iM21137o)];
                            if (i43 == -1) {
                                it3 = it3;
                                v0cVar = y0c.f267958a;
                            } else if (i43 == i4) {
                                it3 = it3;
                                BackgroundWithSticker backgroundWithStickerM21136n = cardDataM21135r.m21136n();
                                if (backgroundWithStickerM21136n.m21133n().hasColor()) {
                                    String strM21144q = backgroundWithStickerM21136n.m21133n().m21127o().m21144q();
                                    String strM21145r = backgroundWithStickerM21136n.m21133n().m21127o().m21145r();
                                    wj50.m88279p(strM21145r);
                                    if (strM21145r.length() <= 0) {
                                        strM21145r = null;
                                    }
                                    hm8Var = new gm8(strM21144q, strM21145r);
                                } else if (backgroundWithStickerM21136n.m21133n().m21131t()) {
                                    hm8Var = new im8(backgroundWithStickerM21136n.m21133n().m21129r().getUrl());
                                } else {
                                    hm8Var = backgroundWithStickerM21136n.m21133n().m21130s() ? new hm8(backgroundWithStickerM21136n.m21133n().m21128q().getUrl()) : new gm8("#000000", null);
                                }
                                v0cVar = new v0c(new xn8(new am8(hm8Var, backgroundWithStickerM21136n.m21133n().m21126n()), backgroundWithStickerM21136n.hasSticker() ? new hm8(backgroundWithStickerM21136n.m21134p().getUrl()) : null));
                            } else if (i43 == 2) {
                                Quote quoteM21138p = cardDataM21135r.m21138p();
                                ae50 ae50VarM21161q = quoteM21138p.m21161q();
                                ArrayList arrayList5 = new ArrayList(i6f.m49804T(ae50VarM21161q, 10));
                                Iterator it4 = ae50VarM21161q.iterator();
                                while (it4.hasNext()) {
                                    Line line = (Line) it4.next();
                                    String strM21155p = line.m21155p();
                                    String strM21156q = line.m21156q();
                                    wj50.m88279p(strM21156q);
                                    if (strM21156q.length() <= 0) {
                                        strM21156q = null;
                                    }
                                    Iterator it5 = it4;
                                    arrayList5.add(new vj80(strM21155p, strM21156q));
                                    it4 = it5;
                                }
                                v0cVar = new w0c(new t0u0(quoteM21138p.hasTimestamp() ? Long.valueOf(quoteM21138p.getTimestamp()) : null, arrayList5));
                            } else if (i43 != 3) {
                                if (i43 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                it3 = it3;
                                v0cVar = y0c.f267958a;
                            } else {
                                Timestamp timestampM21139q = cardDataM21135r.m21139q();
                                v0cVar = new x0c(new ru71(timestampM21139q.hasTimestamp() ? timestampM21139q.m21185p().m1948o() : 0L));
                            }
                            pqm0Var = new pqm0(str2, new ok01(xr01Var, dd41VarM74726U, v0cVar));
                        }
                        if (pqm0Var != null) {
                            arrayList4.add(pqm0Var);
                        }
                        it3 = it3;
                        w2a1Var2 = w2a1Var2;
                        i4 = 1;
                    }
                    w2a1Var = w2a1Var2;
                    Map mapM56705r0 = kkc0.m56705r0(arrayList4);
                    List<fqx> listMo45450b4 = gqxVar.mo45450b(daj.class);
                    int iM31820L = c95.m31820L(i6f.m49804T(listMo45450b4, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (fqx fqxVar2 : listMo45450b4) {
                        String str4 = fqxVar2.f72300a;
                        daj dajVar = (daj) fqxVar2.f72301b;
                        if (dajVar == null || (list = dajVar.f47051b) == null) {
                            xu01Var = null;
                        } else if (list.contains(aaj.f13852d)) {
                            xu01Var = xu01.f265969b;
                        } else if (list.contains(aaj.f13850b)) {
                            xu01Var = xu01.f265968a;
                        } else {
                            xu01Var = null;
                        }
                        linkedHashMap.put(str4, xu01Var);
                    }
                    List<fqx> listMo45450b5 = gqxVar.mo45450b(byv.class);
                    ArrayList arrayList6 = new ArrayList();
                    for (fqx fqxVar3 : listMo45450b5) {
                        byv byvVar = (byv) fqxVar3.f72301b;
                        if (byvVar == null || (i2 = byvVar.f32324a) == 0) {
                            jv01Var = null;
                        } else {
                            String str5 = fqxVar3.f72300a;
                            int i44 = wv01.f255310a[edb.m38547C(i2)];
                            if (i44 == 1) {
                                jv01Var = new jv01(str5);
                            } else if (i44 != 2) {
                                jv01Var = null;
                            } else {
                                jv01Var = new kv01(str5);
                            }
                        }
                        if (jv01Var != null) {
                            arrayList6.add(jv01Var);
                        }
                    }
                    int iM31820L2 = c95.m31820L(i6f.m49804T(arrayList6, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
                    for (Object obj23 : arrayList6) {
                        linkedHashMap2.put(((lv01) obj23).getUri(), obj23);
                    }
                    vv01 vv01Var = new vv01(listMo45450b, listMo45450b2, mapM56705r0, linkedHashMap, linkedHashMap2);
                    zv01Var.f286579b = 1;
                    if (nizVar.emit(vv01Var, zv01Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj22);
                    w2a1Var = w2a1Var2;
                }
                return w2a1Var;
            case 19:
                if (fbkVar instanceof j311) {
                    j311Var = (j311) fbkVar;
                    int i45 = j311Var.f108263b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        j311Var.f108263b = i45 - Integer.MIN_VALUE;
                    } else {
                        j311Var = new j311(this, fbkVar);
                    }
                } else {
                    j311Var = new j311(this, fbkVar);
                }
                Object obj24 = j311Var.f108262a;
                int i46 = j311Var.f108263b;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj24);
                    return w2a1Var2;
                }
                bga.m29073P(obj24);
                if (((List) obj).isEmpty()) {
                    return w2a1Var2;
                }
                j311Var.f108263b = 1;
                return nizVar.emit(obj, j311Var) == yukVar ? yukVar : w2a1Var2;
            case 20:
                if (fbkVar instanceof k311) {
                    k311Var = (k311) fbkVar;
                    int i47 = k311Var.f118747b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        k311Var.f118747b = i47 - Integer.MIN_VALUE;
                    } else {
                        k311Var = new k311(this, fbkVar);
                    }
                } else {
                    k311Var = new k311(this, fbkVar);
                }
                Object obj25 = k311Var.f118746a;
                int i48 = k311Var.f118747b;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj25);
                    return w2a1Var2;
                }
                bga.m29073P(obj25);
                if (((Boolean) obj).booleanValue()) {
                    return w2a1Var2;
                }
                k311Var.f118747b = 1;
                return nizVar.emit(obj, k311Var) == yukVar ? yukVar : w2a1Var2;
            case 21:
                if (fbkVar instanceof m311) {
                    m311Var = (m311) fbkVar;
                    int i49 = m311Var.f139511b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        m311Var.f139511b = i49 - Integer.MIN_VALUE;
                    } else {
                        m311Var = new m311(this, fbkVar);
                    }
                } else {
                    m311Var = new m311(this, fbkVar);
                }
                Object obj26 = m311Var.f139510a;
                int i50 = m311Var.f139511b;
                if (i50 != 0) {
                    if (i50 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj26);
                    return w2a1Var2;
                }
                bga.m29073P(obj26);
                if (((Number) obj).intValue() <= 0) {
                    return w2a1Var2;
                }
                m311Var.f139511b = 1;
                return nizVar.emit(obj, m311Var) == yukVar ? yukVar : w2a1Var2;
            case 22:
                if (fbkVar instanceof o411) {
                    o411Var = (o411) fbkVar;
                    int i51 = o411Var.f161515b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        o411Var.f161515b = i51 - Integer.MIN_VALUE;
                    } else {
                        o411Var = new o411(this, fbkVar);
                    }
                } else {
                    o411Var = new o411(this, fbkVar);
                }
                Object obj27 = o411Var.f161514a;
                int i52 = o411Var.f161515b;
                if (i52 != 0) {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj27);
                    return w2a1Var2;
                }
                bga.m29073P(obj27);
                if (!(obj instanceof zbr0)) {
                    return w2a1Var2;
                }
                o411Var.f161515b = 1;
                return nizVar.emit(obj, o411Var) == yukVar ? yukVar : w2a1Var2;
            case 23:
                if (fbkVar instanceof p411) {
                    p411Var = (p411) fbkVar;
                    int i53 = p411Var.f173781b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        p411Var.f173781b = i53 - Integer.MIN_VALUE;
                    } else {
                        p411Var = new p411(this, fbkVar);
                    }
                } else {
                    p411Var = new p411(this, fbkVar);
                }
                Object obj28 = p411Var.f173780a;
                int i54 = p411Var.f173781b;
                if (i54 != 0) {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj28);
                    return w2a1Var2;
                }
                bga.m29073P(obj28);
                u411 u411Var = new u411(((zbr0) obj).f281392a);
                p411Var.f173781b = 1;
                return nizVar.emit(u411Var, p411Var) == yukVar ? yukVar : w2a1Var2;
            case 24:
                if (fbkVar instanceof q411) {
                    q411Var = (q411) fbkVar;
                    int i55 = q411Var.f185024b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        q411Var.f185024b = i55 - Integer.MIN_VALUE;
                    } else {
                        q411Var = new q411(this, fbkVar);
                    }
                } else {
                    q411Var = new q411(this, fbkVar);
                }
                Object obj29 = q411Var.f185023a;
                int i56 = q411Var.f185024b;
                if (i56 != 0) {
                    if (i56 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj29);
                    return w2a1Var2;
                }
                bga.m29073P(obj29);
                if (!(obj instanceof k8r0)) {
                    return w2a1Var2;
                }
                q411Var.f185024b = 1;
                return nizVar.emit(obj, q411Var) == yukVar ? yukVar : w2a1Var2;
            case 25:
                if (fbkVar instanceof r411) {
                    r411Var = (r411) fbkVar;
                    int i57 = r411Var.f195632b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        r411Var.f195632b = i57 - Integer.MIN_VALUE;
                    } else {
                        r411Var = new r411(this, fbkVar);
                    }
                } else {
                    r411Var = new r411(this, fbkVar);
                }
                Object obj30 = r411Var.f195631a;
                int i58 = r411Var.f195632b;
                if (i58 != 0) {
                    if (i58 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj30);
                    return w2a1Var2;
                }
                bga.m29073P(obj30);
                k8r0 k8r0Var = (k8r0) obj;
                t411 t411Var = new t411(k8r0Var.f120414a, k8r0Var.f120415b);
                r411Var.f195632b = 1;
                return nizVar.emit(t411Var, r411Var) == yukVar ? yukVar : w2a1Var2;
            case 26:
                if (fbkVar instanceof y411) {
                    y411Var = (y411) fbkVar;
                    int i59 = y411Var.f269058b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        y411Var.f269058b = i59 - Integer.MIN_VALUE;
                    } else {
                        y411Var = new y411(this, fbkVar);
                    }
                } else {
                    y411Var = new y411(this, fbkVar);
                }
                Object obj31 = y411Var.f269057a;
                int i60 = y411Var.f269058b;
                if (i60 != 0) {
                    if (i60 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj31);
                    return w2a1Var2;
                }
                bga.m29073P(obj31);
                if (!(obj instanceof j8r0)) {
                    return w2a1Var2;
                }
                y411Var.f269058b = 1;
                return nizVar.emit(obj, y411Var) == yukVar ? yukVar : w2a1Var2;
            case 27:
                return m34480b(obj, fbkVar);
            case 28:
                return m34481c(obj, fbkVar);
            default:
                if (fbkVar instanceof ga11) {
                    ga11Var = (ga11) fbkVar;
                    int i61 = ga11Var.f77948b;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        ga11Var.f77948b = i61 - Integer.MIN_VALUE;
                    } else {
                        ga11Var = new ga11(this, fbkVar);
                    }
                } else {
                    ga11Var = new ga11(this, fbkVar);
                }
                Object obj32 = ga11Var.f77947a;
                int i62 = ga11Var.f77948b;
                if (i62 != 0) {
                    if (i62 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj32);
                    return w2a1Var2;
                }
                bga.m29073P(obj32);
                if ("spotify:meta:node_rules_placeholder".equals((String) obj)) {
                    return w2a1Var2;
                }
                ga11Var.f77948b = 1;
                return nizVar.emit(obj, ga11Var) == yukVar ? yukVar : w2a1Var2;
        }
    }

    public /* synthetic */ czz0(niz nizVar, Object obj, int i) {
        this.f43669a = i;
        this.f43670b = nizVar;
    }
}

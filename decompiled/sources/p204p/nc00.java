package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class nc00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152384a;

    /* JADX INFO: renamed from: b */
    public final p7o f152385b;

    /* JADX INFO: renamed from: c */
    public final vsk f152386c;

    /* JADX INFO: renamed from: d */
    public final fiz f152387d;

    /* JADX INFO: renamed from: e */
    public final luk f152388e;

    public /* synthetic */ nc00(p7o p7oVar, vsk vskVar, fiz fizVar, luk lukVar, int i) {
        this.f152384a = i;
        this.f152385b = p7oVar;
        this.f152386c = vskVar;
        this.f152387d = fizVar;
        this.f152388e = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m64104a(String str, ibk ibkVar) {
        lc00 lc00Var;
        String str2;
        String str3;
        String str4;
        String str5;
        rcy rcyVar;
        fy50 fy50Var;
        String str6;
        String str7;
        String str8;
        String str9;
        rcy rcyVar2;
        switch (this.f152384a) {
            case 0:
                if (ibkVar instanceof lc00) {
                    lc00Var = (lc00) ibkVar;
                    int i = lc00Var.f131790f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lc00Var.f131790f = i - Integer.MIN_VALUE;
                    } else {
                        lc00Var = new lc00(this, ibkVar);
                    }
                } else {
                    lc00Var = new lc00(this, ibkVar);
                }
                lc00 lc00Var2 = lc00Var;
                Object objM86756u = lc00Var2.f131788d;
                int i2 = lc00Var2.f131790f;
                fbk fbkVar = null;
                int i3 = 2;
                Object obj = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        str2 = lc00Var2.f131786b;
                        String str10 = lc00Var2.f131785a;
                        bga.m29073P(objM86756u);
                        str3 = str10;
                    } else if (i2 == 2) {
                        str5 = lc00Var2.f131787c;
                        str4 = lc00Var2.f131786b;
                        str3 = lc00Var2.f131785a;
                        bga.m29073P(objM86756u);
                        Map map = (Map) objM86756u;
                        rcyVar = new rcy(this, str3, new pc00(qhg1.m72826q((gmr0) map.get(str5), str5), qhg1.m72826q((gmr0) map.get(str4), str4)), fbkVar, 5);
                        lc00Var2.f131785a = null;
                        lc00Var2.f131786b = null;
                        lc00Var2.f131787c = null;
                        lc00Var2.f131790f = 3;
                        if (x0h1.m89557A(this.f152388e, rcyVar, lc00Var2) == obj) {
                            return obj;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86756u);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM86756u);
                bpp bppVar = new bpp(i3, 14, fbkVar);
                lc00Var2.f131785a = null;
                lc00Var2.f131786b = str;
                lc00Var2.f131790f = 1;
                objM86756u = vyf1.m86756u(this.f152387d, bppVar, lc00Var2);
                if (objM86756u == obj) {
                    return obj;
                }
                str2 = str;
                str3 = null;
                String str11 = ((e301) objM86756u).f55571a;
                List listM46715L = h6f.m46715L(str11, str2);
                lc00Var2.f131785a = str3;
                lc00Var2.f131786b = str2;
                lc00Var2.f131787c = str11;
                lc00Var2.f131790f = 2;
                Object objM64105b = m64105b(listM46715L, lc00Var2);
                if (objM64105b == obj) {
                    return obj;
                }
                str4 = str2;
                str5 = str11;
                objM86756u = objM64105b;
                Map map2 = (Map) objM86756u;
                rcyVar = new rcy(this, str3, new pc00(qhg1.m72826q((gmr0) map2.get(str5), str5), qhg1.m72826q((gmr0) map2.get(str4), str4)), fbkVar, 5);
                lc00Var2.f131785a = null;
                lc00Var2.f131786b = null;
                lc00Var2.f131787c = null;
                lc00Var2.f131790f = 3;
                if (x0h1.m89557A(this.f152388e, rcyVar, lc00Var2) == obj) {
                    return obj;
                }
                return w2a1.f247311a;
            default:
                if (ibkVar instanceof fy50) {
                    fy50Var = (fy50) ibkVar;
                    int i4 = fy50Var.f74527f;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fy50Var.f74527f = i4 - Integer.MIN_VALUE;
                    } else {
                        fy50Var = new fy50(this, ibkVar);
                    }
                } else {
                    fy50Var = new fy50(this, ibkVar);
                }
                fy50 fy50Var2 = fy50Var;
                Object objM86756u2 = fy50Var2.f74525d;
                int i5 = fy50Var2.f74527f;
                fbk fbkVar2 = null;
                int i6 = 2;
                Object obj2 = yuk.f276404a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        str6 = fy50Var2.f74523b;
                        String str12 = fy50Var2.f74522a;
                        bga.m29073P(objM86756u2);
                        str7 = str12;
                    } else if (i5 == 2) {
                        str9 = fy50Var2.f74524c;
                        str8 = fy50Var2.f74523b;
                        str7 = fy50Var2.f74522a;
                        bga.m29073P(objM86756u2);
                        Map map3 = (Map) objM86756u2;
                        rcyVar2 = new rcy(this, str7, new iy50(whg1.m88137j((gmr0) map3.get(str9), str9), whg1.m88137j((gmr0) map3.get(str8), str8)), fbkVar2, 19);
                        fy50Var2.f74522a = null;
                        fy50Var2.f74523b = null;
                        fy50Var2.f74524c = null;
                        fy50Var2.f74527f = 3;
                        if (x0h1.m89557A(this.f152388e, rcyVar2, fy50Var2) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86756u2);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM86756u2);
                bpp bppVar2 = new bpp(i6, 25, fbkVar2);
                fy50Var2.f74522a = null;
                fy50Var2.f74523b = str;
                fy50Var2.f74527f = 1;
                objM86756u2 = vyf1.m86756u(this.f152387d, bppVar2, fy50Var2);
                if (objM86756u2 == obj2) {
                    return obj2;
                }
                str6 = str;
                str7 = null;
                String str13 = ((e301) objM86756u2).f55571a;
                List listM46715L2 = h6f.m46715L(str13, str6);
                fy50Var2.f74522a = str7;
                fy50Var2.f74523b = str6;
                fy50Var2.f74524c = str13;
                fy50Var2.f74527f = 2;
                Object objM64105b2 = m64105b(listM46715L2, fy50Var2);
                if (objM64105b2 == obj2) {
                    return obj2;
                }
                str8 = str6;
                str9 = str13;
                objM86756u2 = objM64105b2;
                Map map4 = (Map) objM86756u2;
                rcyVar2 = new rcy(this, str7, new iy50(whg1.m88137j((gmr0) map4.get(str9), str9), whg1.m88137j((gmr0) map4.get(str8), str8)), fbkVar2, 19);
                fy50Var2.f74522a = null;
                fy50Var2.f74523b = null;
                fy50Var2.f74524c = null;
                fy50Var2.f74527f = 3;
                if (x0h1.m89557A(this.f152388e, rcyVar2, fy50Var2) == obj2) {
                    return obj2;
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m64105b(List list, ibk ibkVar) {
        mc00 mc00Var;
        gy50 gy50Var;
        switch (this.f152384a) {
            case 0:
                if (ibkVar instanceof mc00) {
                    mc00Var = (mc00) ibkVar;
                    int i = mc00Var.f142005c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mc00Var.f142005c = i - Integer.MIN_VALUE;
                    } else {
                        mc00Var = new mc00(this, ibkVar);
                    }
                } else {
                    mc00Var = new mc00(this, ibkVar);
                }
                Object obj = mc00Var.f142003a;
                int i2 = mc00Var.f142005c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                Observable map = this.f152386c.m86362e(list).map(zyx.f287716d);
                i4y i4yVar = i4y.f98636S0;
                mc00Var.f142005c = 1;
                Object objM96569p = zn91.m96569p(map, i4yVar, mc00Var);
                yuk yukVar = yuk.f276404a;
                return objM96569p == yukVar ? yukVar : objM96569p;
            default:
                if (ibkVar instanceof gy50) {
                    gy50Var = (gy50) ibkVar;
                    int i3 = gy50Var.f85475c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gy50Var.f85475c = i3 - Integer.MIN_VALUE;
                    } else {
                        gy50Var = new gy50(this, ibkVar);
                    }
                } else {
                    gy50Var = new gy50(this, ibkVar);
                }
                Object obj2 = gy50Var.f85473a;
                int i4 = gy50Var.f85475c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return obj2;
                }
                bga.m29073P(obj2);
                Observable map2 = this.f152386c.m86362e(list).map(gaz.f78151g);
                wv30 wv30Var = wv30.f255362P0;
                gy50Var.f85475c = 1;
                Object objM96569p2 = zn91.m96569p(map2, wv30Var, gy50Var);
                yuk yukVar2 = yuk.f276404a;
                return objM96569p2 == yukVar2 ? yukVar2 : objM96569p2;
        }
    }
}

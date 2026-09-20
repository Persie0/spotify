package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class wbm implements sbm {

    /* JADX INFO: renamed from: e */
    public static final PlaylistRequestDecorationPolicy f249781e;

    /* JADX INFO: renamed from: f */
    public static final PlaylistRequestDecorationPolicy f249782f;

    /* JADX INFO: renamed from: a */
    public final wt80 f249783a;

    /* JADX INFO: renamed from: b */
    public final ov80 f249784b;

    /* JADX INFO: renamed from: c */
    public final wrf0 f249785c;

    /* JADX INFO: renamed from: d */
    public final r991 f249786d;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26430A();
        amp0VarM18396H.m26433D(true);
        top0VarM18421v.m81214v(amp0VarM18396H);
        f249781e = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
        top0 top0VarM18421v2 = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H2 = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H2.m26440v();
        top0VarM18421v2.m81214v(amp0VarM18396H2);
        f249782f = (PlaylistRequestDecorationPolicy) top0VarM18421v2.build();
    }

    public wbm(wt80 wt80Var, ov80 ov80Var, wrf0 wrf0Var, r991 r991Var) {
        this.f249783a = wt80Var;
        this.f249784b = ov80Var;
        this.f249785c = wrf0Var;
        this.f249786d = r991Var;
    }

    /* JADX INFO: renamed from: a */
    public final xbm m87674a(Map map, String str, String str2, String str3) {
        String str4 = (String) map.get("automix.auto_transition_recipe");
        if (str4 == null) {
            return null;
        }
        this.f249786d.getClass();
        b791 b791VarM75016a = r991.m75016a(str4);
        if (b791VarM75016a == null) {
            return null;
        }
        rzl0 rzl0Var = b791VarM75016a.f24196b;
        boolean z = b791VarM75016a.f24197c || b791VarM75016a.f24198d || q3d0.m72075F(b791VarM75016a.f24195a);
        boolean zM88271j = wj50.m88271j(rzl0Var.f204175b, str3);
        if (z && zM88271j) {
            return new xbm(str2, str, str3, str4, rzl0Var.f204166M0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m87675b(String str, String str2, String str3, ibk ibkVar) {
        tbm tbmVar;
        if (ibkVar instanceof tbm) {
            tbmVar = (tbm) ibkVar;
            int i = tbmVar.f218905c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbmVar.f218905c = i - Integer.MIN_VALUE;
            } else {
                tbmVar = new tbm(this, ibkVar);
            }
        } else {
            tbmVar = new tbm(this, ibkVar);
        }
        Object objM87677d = tbmVar.f218903a;
        int i2 = tbmVar.f218905c;
        if (i2 == 0) {
            bga.m29073P(objM87677d);
            tbmVar.f218905c = 1;
            objM87677d = m87677d(str, str2, str3, tbmVar);
            Object obj = yuk.f276404a;
            if (objM87677d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM87677d);
        }
        acm acmVar = (acm) objM87677d;
        if (acmVar instanceof ybm) {
            return ((ybm) acmVar).f271216a;
        }
        if (wj50.m88271j(acmVar, zbm.f281347a)) {
            return bcm.f25912c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m87676c(wt80 wt80Var, String str, String str2, ibk ibkVar) {
        ubm ubmVar;
        nw80 nw80Var;
        if (ibkVar instanceof ubm) {
            ubmVar = (ubm) ibkVar;
            int i = ubmVar.f228825c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubmVar.f228825c = i - Integer.MIN_VALUE;
            } else {
                ubmVar = new ubm(this, ibkVar);
            }
        } else {
            ubmVar = new ubm(this, ibkVar);
        }
        Object objM62843h = ubmVar.f228823a;
        int i2 = ubmVar.f228825c;
        if (i2 == 0) {
            bga.m29073P(objM62843h);
            ubmVar.f228825c = 1;
            objM62843h = ((mu80) wt80Var).m62843h(str, str2, f249782f, ubmVar);
            yuk yukVar = yuk.f276404a;
            if (objM62843h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62843h);
        }
        m2x0 m2x0Var = objM62843h instanceof m2x0 ? (m2x0) objM62843h : null;
        if (m2x0Var == null || (nw80Var = (nw80) m2x0Var.f139474a) == null) {
            return null;
        }
        return nw80Var.f159053g;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116 A[LOOP:0: B:45:0x0100->B:50:0x0116, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x018f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0119 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final Object m87677d(String str, String str2, String str3, ibk ibkVar) {
        vbm vbmVar;
        String str4;
        String str5;
        String str6;
        p2x0 p2x0Var;
        m2x0 m2x0Var;
        qu80 qu80Var;
        List list;
        Map map;
        boolean zM88858b;
        bcm bcmVar;
        Iterator it;
        int i;
        int i2;
        nw80 nw80Var;
        nw80 nw80Var2;
        nw80 nw80Var3;
        nw80 nw80Var4;
        int i3;
        Map map2;
        Object objM87676c;
        Map map3;
        nw80 nw80Var5;
        nw80 nw80Var6;
        Map map4;
        xbm xbmVarM87674a;
        String str7 = str;
        if (ibkVar instanceof vbm) {
            vbmVar = (vbm) ibkVar;
            int i4 = vbmVar.f239538t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vbmVar.f239538t = i4 - Integer.MIN_VALUE;
            } else {
                vbmVar = new vbm(this, ibkVar);
            }
        } else {
            vbmVar = new vbm(this, ibkVar);
        }
        Object objM35087j = vbmVar.f239536h;
        int i5 = vbmVar.f239538t;
        wt80 wt80Var = this.f249783a;
        xbm xbmVarM87674a2 = null;
        Object obj = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(objM35087j);
            d670 d670VarM51212a = this.f249784b.f170445a.m51212a(str3);
            vbmVar.f239529a = str7;
            str4 = str2;
            vbmVar.f239530b = str4;
            vbmVar.f239538t = 1;
            objM35087j = d670VarM51212a.m35087j(str7, vbmVar);
            if (objM35087j != obj) {
            }
            return obj;
        }
        if (i5 == 1) {
            String str8 = vbmVar.f239530b;
            String str9 = vbmVar.f239529a;
            bga.m29073P(objM35087j);
            str4 = str8;
            str7 = str9;
        } else {
            if (i5 == 2) {
                str6 = vbmVar.f239530b;
                String str10 = vbmVar.f239529a;
                bga.m29073P(objM35087j);
                str5 = str10;
                p2x0Var = (p2x0) objM35087j;
                if (p2x0Var instanceof m2x0) {
                    m2x0Var = (m2x0) p2x0Var;
                } else {
                    m2x0Var = null;
                }
                if (m2x0Var != null) {
                    qu80Var = (qu80) m2x0Var.f139474a;
                } else {
                    qu80Var = null;
                }
                if (qu80Var != null) {
                    list = qu80Var.f192598d;
                    map = qu80Var.f192599e.f271272q;
                    this.f249785c.getClass();
                    zM88858b = wrf0.m88858b(map);
                    bcmVar = bcm.f25912c;
                    if (!zM88858b) {
                        return new ybm(bcmVar);
                    }
                    if (!Boolean.parseBoolean((String) map.get("has-custom-transitions"))) {
                        return new ybm(bcmVar);
                    }
                    it = list.iterator();
                    i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (wj50.m88271j(((nw80) it.next()).f159047a, str6)) {
                            i2 = i;
                            break;
                        }
                        i++;
                    }
                    if (i2 >= 0) {
                        nw80Var = (nw80) list.get(i2);
                        nw80Var2 = (nw80) g6f.m43747t0(i2 - 1, list);
                        nw80Var3 = (nw80) g6f.m43747t0(i2 + 1, list);
                        if (nw80Var2 != null && nw80Var3 == null) {
                            return new ybm(bcmVar);
                        }
                        if (nw80Var3 != null) {
                            nw80Var4 = nw80Var2;
                            i3 = i2;
                            map2 = null;
                            if (nw80Var4 != null) {
                                String str11 = nw80Var4.f159047a;
                                vbmVar.f239529a = null;
                                vbmVar.f239530b = null;
                                vbmVar.f239531c = nw80Var;
                                vbmVar.f239532d = nw80Var4;
                                vbmVar.f239533e = nw80Var3;
                                vbmVar.f239534f = map2;
                                vbmVar.f239535g = i3;
                                vbmVar.f239538t = 4;
                                objM35087j = m87676c(wt80Var, str5, str11, vbmVar);
                                if (objM35087j != obj) {
                                    nw80Var5 = nw80Var4;
                                    nw80Var6 = nw80Var;
                                }
                            } else {
                                map3 = null;
                            }
                            if (nw80Var3 != null) {
                                xbmVarM87674a = null;
                            } else {
                                xbmVarM87674a = null;
                            }
                            if (nw80Var4 != null) {
                                xbmVarM87674a2 = m87674a(map3, nw80Var4.f159047a, nw80Var4.f159049c, nw80Var.f159049c);
                            }
                            return new ybm(new bcm(xbmVarM87674a2, xbmVarM87674a));
                        }
                        String str12 = nw80Var.f159047a;
                        vbmVar.f239529a = str5;
                        vbmVar.f239530b = null;
                        vbmVar.f239531c = nw80Var;
                        vbmVar.f239532d = nw80Var2;
                        vbmVar.f239533e = nw80Var3;
                        vbmVar.f239535g = i2;
                        vbmVar.f239538t = 3;
                        objM87676c = m87676c(wt80Var, str5, str12, vbmVar);
                        if (objM87676c != obj) {
                            nw80Var4 = nw80Var2;
                            objM35087j = objM87676c;
                            map4 = (Map) objM35087j;
                            if (map4 != null) {
                                i3 = i2;
                                map2 = map4;
                                if (nw80Var4 != null) {
                                    String str13 = nw80Var4.f159047a;
                                    vbmVar.f239529a = null;
                                    vbmVar.f239530b = null;
                                    vbmVar.f239531c = nw80Var;
                                    vbmVar.f239532d = nw80Var4;
                                    vbmVar.f239533e = nw80Var3;
                                    vbmVar.f239534f = map2;
                                    vbmVar.f239535g = i3;
                                    vbmVar.f239538t = 4;
                                    objM35087j = m87676c(wt80Var, str5, str13, vbmVar);
                                    if (objM35087j != obj) {
                                        nw80Var5 = nw80Var4;
                                        nw80Var6 = nw80Var;
                                    }
                                } else {
                                    map3 = null;
                                }
                                if (nw80Var3 != null) {
                                    xbmVarM87674a = null;
                                } else {
                                    xbmVarM87674a = null;
                                }
                                if (nw80Var4 != null) {
                                    xbmVarM87674a2 = m87674a(map3, nw80Var4.f159047a, nw80Var4.f159049c, nw80Var.f159049c);
                                }
                                return new ybm(new bcm(xbmVarM87674a2, xbmVarM87674a));
                            }
                        }
                        return obj;
                    }
                }
                return zbm.f281347a;
            }
            if (i5 == 3) {
                i2 = vbmVar.f239535g;
                nw80Var3 = vbmVar.f239533e;
                nw80Var4 = vbmVar.f239532d;
                nw80Var = vbmVar.f239531c;
                str5 = vbmVar.f239529a;
                bga.m29073P(objM35087j);
                map4 = (Map) objM35087j;
                if (map4 != null) {
                    i3 = i2;
                    map2 = map4;
                    if (nw80Var4 != null) {
                        String str14 = nw80Var4.f159047a;
                        vbmVar.f239529a = null;
                        vbmVar.f239530b = null;
                        vbmVar.f239531c = nw80Var;
                        vbmVar.f239532d = nw80Var4;
                        vbmVar.f239533e = nw80Var3;
                        vbmVar.f239534f = map2;
                        vbmVar.f239535g = i3;
                        vbmVar.f239538t = 4;
                        objM35087j = m87676c(wt80Var, str5, str14, vbmVar);
                        if (objM35087j != obj) {
                            nw80Var5 = nw80Var4;
                            nw80Var6 = nw80Var;
                        }
                        return obj;
                    }
                    map3 = null;
                    if (nw80Var3 != null || map2 == null) {
                        xbmVarM87674a = null;
                    } else {
                        xbmVarM87674a = m87674a(map2, nw80Var.f159047a, nw80Var.f159049c, nw80Var3.f159049c);
                    }
                    if (nw80Var4 != null && map3 != null) {
                        xbmVarM87674a2 = m87674a(map3, nw80Var4.f159047a, nw80Var4.f159049c, nw80Var.f159049c);
                    }
                    return new ybm(new bcm(xbmVarM87674a2, xbmVarM87674a));
                }
                return zbm.f281347a;
            }
            if (i5 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = vbmVar.f239534f;
            nw80Var3 = vbmVar.f239533e;
            nw80Var5 = vbmVar.f239532d;
            nw80Var6 = vbmVar.f239531c;
            bga.m29073P(objM35087j);
        }
        map3 = (Map) objM35087j;
        if (map3 != null) {
            nw80Var = nw80Var6;
            nw80Var4 = nw80Var5;
            if (nw80Var3 != null) {
                xbmVarM87674a = null;
            } else {
                xbmVarM87674a = null;
            }
            if (nw80Var4 != null) {
                xbmVarM87674a2 = m87674a(map3, nw80Var4.f159047a, nw80Var4.f159049c, nw80Var.f159049c);
            }
            return new ybm(new bcm(xbmVarM87674a2, xbmVarM87674a));
        }
        return zbm.f281347a;
        st80 st80Var = new st80(f249781e, null, (Set) objM35087j, false, null, a5u0.f12598a, null, 0, null, 474);
        vbmVar.f239529a = str7;
        vbmVar.f239530b = str4;
        vbmVar.f239538t = 2;
        objM35087j = ((mu80) wt80Var).m62841f(str7, st80Var, vbmVar);
        if (objM35087j != obj) {
            str5 = str7;
            str6 = str4;
            p2x0Var = (p2x0) objM35087j;
            if (p2x0Var instanceof m2x0) {
                m2x0Var = (m2x0) p2x0Var;
            } else {
                m2x0Var = null;
            }
            if (m2x0Var != null) {
                qu80Var = (qu80) m2x0Var.f139474a;
            } else {
                qu80Var = null;
            }
            if (qu80Var != null) {
                list = qu80Var.f192598d;
                map = qu80Var.f192599e.f271272q;
                this.f249785c.getClass();
                zM88858b = wrf0.m88858b(map);
                bcmVar = bcm.f25912c;
                if (!zM88858b) {
                    return new ybm(bcmVar);
                }
                if (!Boolean.parseBoolean((String) map.get("has-custom-transitions"))) {
                    return new ybm(bcmVar);
                }
                it = list.iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (wj50.m88271j(((nw80) it.next()).f159047a, str6)) {
                        i2 = i;
                        break;
                    }
                    i++;
                }
                if (i2 >= 0) {
                    nw80Var = (nw80) list.get(i2);
                    nw80Var2 = (nw80) g6f.m43747t0(i2 - 1, list);
                    nw80Var3 = (nw80) g6f.m43747t0(i2 + 1, list);
                    if (nw80Var2 != null) {
                    }
                    if (nw80Var3 != null) {
                        nw80Var4 = nw80Var2;
                        i3 = i2;
                        map2 = null;
                        if (nw80Var4 != null) {
                            String str15 = nw80Var4.f159047a;
                            vbmVar.f239529a = null;
                            vbmVar.f239530b = null;
                            vbmVar.f239531c = nw80Var;
                            vbmVar.f239532d = nw80Var4;
                            vbmVar.f239533e = nw80Var3;
                            vbmVar.f239534f = map2;
                            vbmVar.f239535g = i3;
                            vbmVar.f239538t = 4;
                            objM35087j = m87676c(wt80Var, str5, str15, vbmVar);
                            if (objM35087j != obj) {
                                nw80Var5 = nw80Var4;
                                nw80Var6 = nw80Var;
                                map3 = (Map) objM35087j;
                                if (map3 != null) {
                                    nw80Var = nw80Var6;
                                    nw80Var4 = nw80Var5;
                                }
                            }
                        } else {
                            map3 = null;
                        }
                        if (nw80Var3 != null) {
                            xbmVarM87674a = null;
                        } else {
                            xbmVarM87674a = null;
                        }
                        if (nw80Var4 != null) {
                            xbmVarM87674a2 = m87674a(map3, nw80Var4.f159047a, nw80Var4.f159049c, nw80Var.f159049c);
                        }
                        return new ybm(new bcm(xbmVarM87674a2, xbmVarM87674a));
                    }
                    String str16 = nw80Var.f159047a;
                    vbmVar.f239529a = str5;
                    vbmVar.f239530b = null;
                    vbmVar.f239531c = nw80Var;
                    vbmVar.f239532d = nw80Var2;
                    vbmVar.f239533e = nw80Var3;
                    vbmVar.f239535g = i2;
                    vbmVar.f239538t = 3;
                    objM87676c = m87676c(wt80Var, str5, str16, vbmVar);
                    if (objM87676c != obj) {
                        nw80Var4 = nw80Var2;
                        objM35087j = objM87676c;
                        map4 = (Map) objM35087j;
                        if (map4 != null) {
                            i3 = i2;
                            map2 = map4;
                            if (nw80Var4 != null) {
                                String str17 = nw80Var4.f159047a;
                                vbmVar.f239529a = null;
                                vbmVar.f239530b = null;
                                vbmVar.f239531c = nw80Var;
                                vbmVar.f239532d = nw80Var4;
                                vbmVar.f239533e = nw80Var3;
                                vbmVar.f239534f = map2;
                                vbmVar.f239535g = i3;
                                vbmVar.f239538t = 4;
                                objM35087j = m87676c(wt80Var, str5, str17, vbmVar);
                                if (objM35087j != obj) {
                                    nw80Var5 = nw80Var4;
                                    nw80Var6 = nw80Var;
                                    map3 = (Map) objM35087j;
                                    if (map3 != null) {
                                        nw80Var = nw80Var6;
                                        nw80Var4 = nw80Var5;
                                    }
                                }
                            } else {
                                map3 = null;
                            }
                            if (nw80Var3 != null) {
                                xbmVarM87674a = null;
                            } else {
                                xbmVarM87674a = null;
                            }
                            if (nw80Var4 != null) {
                                xbmVarM87674a2 = m87674a(map3, nw80Var4.f159047a, nw80Var4.f159049c, nw80Var.f159049c);
                            }
                            return new ybm(new bcm(xbmVarM87674a2, xbmVarM87674a));
                        }
                    }
                }
            }
            return zbm.f281347a;
        }
        return obj;
    }
}

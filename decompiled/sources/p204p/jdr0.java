package p204p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class jdr0 {

    /* JADX INFO: renamed from: d */
    public static final PlaylistRequestDecorationPolicy f111383d;

    /* JADX INFO: renamed from: e */
    public static final PlaylistRequestDecorationPolicy f111384e;

    /* JADX INFO: renamed from: a */
    public final wt80 f111385a;

    /* JADX INFO: renamed from: b */
    public final ov80 f111386b;

    /* JADX INFO: renamed from: c */
    public final zxx0 f111387c;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26430A();
        amp0VarM18396H.m26433D(true);
        top0VarM18421v.m81214v(amp0VarM18396H);
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57346D(TrackDecorationPolicy.newBuilder().setLink(true));
        top0VarM18421v.m81218z(ktp0VarM18427E);
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72941s(EpisodeDecorationPolicy.newBuilder().setLink(true));
        top0VarM18421v.m81212t(qjp0VarM18379C);
        f111383d = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
        top0 top0VarM18421v2 = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H2 = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H2.m26440v();
        top0VarM18421v2.m81214v(amp0VarM18396H2);
        f111384e = (PlaylistRequestDecorationPolicy) top0VarM18421v2.build();
    }

    public jdr0(wt80 wt80Var, ov80 ov80Var, wrf0 wrf0Var, zxx0 zxx0Var) {
        this.f111385a = wt80Var;
        this.f111386b = ov80Var;
        this.f111387c = zxx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142 A[LOOP:0: B:42:0x012d->B:47:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0146 A[EDGE_INSN: B:72:0x0146->B:49:0x0146 BREAK  A[LOOP:0: B:42:0x012d->B:47:0x0142], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m53043a(String str, String str2, String str3, ibk ibkVar) {
        idr0 idr0Var;
        String str4;
        String str5;
        String str6;
        x401 x401Var;
        boolean z;
        Set set;
        Set set2;
        String str7;
        String str8;
        qu80 qu80Var;
        List list;
        Iterator it;
        int i;
        nw80 nw80Var;
        Object objM62843h;
        nw80 nw80Var2;
        p2x0 p2x0Var;
        nw80 nw80Var3;
        Map map;
        String str9;
        if (ibkVar instanceof idr0) {
            idr0Var = (idr0) ibkVar;
            int i2 = idr0Var.f101218t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                idr0Var.f101218t = i2 - Integer.MIN_VALUE;
            } else {
                idr0Var = new idr0(this, ibkVar);
            }
        } else {
            idr0Var = new idr0(this, ibkVar);
        }
        Object objM86755t = idr0Var.f101216h;
        int i3 = idr0Var.f101218t;
        wt80 wt80Var = this.f111385a;
        Float fM29806q0 = null;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarMo27555a = this.f111387c.mo27555a();
            idr0Var.f101209a = str;
            str4 = str2;
            idr0Var.f101210b = str4;
            idr0Var.f101211c = str3;
            idr0Var.f101218t = 1;
            objM86755t = vyf1.m86755t(fizVarMo27555a, idr0Var);
            if (objM86755t != yukVar) {
                str5 = str;
                str6 = str3;
            }
            return yukVar;
        }
        if (i3 == 1) {
            str6 = idr0Var.f101211c;
            str4 = idr0Var.f101210b;
            str5 = idr0Var.f101209a;
            bga.m29073P(objM86755t);
        } else {
            if (i3 == 2) {
                z = idr0Var.f101215g;
                set = (Set) idr0Var.f101214f;
                x401 x401Var2 = idr0Var.f101213e;
                x401 x401Var3 = idr0Var.f101212d;
                String str10 = idr0Var.f101210b;
                String str11 = idr0Var.f101209a;
                bga.m29073P(objM86755t);
                x401Var = x401Var2;
                str4 = str10;
                set2 = x401Var3;
                str5 = str11;
                set.addAll((Collection) objM86755t);
                if (!z) {
                    x401Var.add(at80.f19613a);
                }
                st80 st80Var = new st80(f111383d, null, n0e1.m63425d(set2), false, null, a5u0.f12598a, null, 0, null, 474);
                idr0Var.f101209a = str5;
                idr0Var.f101210b = str4;
                idr0Var.f101211c = null;
                idr0Var.f101212d = null;
                idr0Var.f101213e = null;
                idr0Var.f101214f = null;
                idr0Var.f101215g = z;
                idr0Var.f101218t = 3;
                objM86755t = ((mu80) wt80Var).m62841f(str5, st80Var, idr0Var);
                if (objM86755t != yukVar) {
                    str7 = str4;
                    str8 = str5;
                    qu80Var = (qu80) ((p2x0) objM86755t).m68970c();
                    if (qu80Var != null) {
                        list = qu80Var.f192598d;
                        if (wrf0.m88858b(qu80Var.f192599e.f271272q)) {
                            it = list.iterator();
                            i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (wj50.m88271j(((nw80) it.next()).f159047a, str7)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (i > 0) {
                                nw80Var = (nw80) list.get(i - 1);
                                if (bm51.m29803n0(nw80Var.f159049c, "spotify:track:", false)) {
                                    String str12 = nw80Var.f159047a;
                                    idr0Var.f101209a = null;
                                    idr0Var.f101210b = null;
                                    idr0Var.f101211c = null;
                                    idr0Var.f101212d = null;
                                    idr0Var.f101213e = null;
                                    idr0Var.f101214f = nw80Var;
                                    idr0Var.f101215g = z;
                                    idr0Var.f101218t = 4;
                                    objM62843h = ((mu80) wt80Var).m62843h(str8, str12, f111384e, idr0Var);
                                    if (objM62843h != yukVar) {
                                        nw80Var2 = nw80Var;
                                        objM86755t = objM62843h;
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
                return yukVar;
            }
            if (i3 == 3) {
                z = idr0Var.f101215g;
                str7 = idr0Var.f101210b;
                str8 = idr0Var.f101209a;
                bga.m29073P(objM86755t);
                qu80Var = (qu80) ((p2x0) objM86755t).m68970c();
                if (qu80Var != null) {
                    list = qu80Var.f192598d;
                    if (wrf0.m88858b(qu80Var.f192599e.f271272q)) {
                        it = list.iterator();
                        i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (wj50.m88271j(((nw80) it.next()).f159047a, str7)) {
                                break;
                            }
                            i++;
                        }
                        if (i > 0) {
                            nw80Var = (nw80) list.get(i - 1);
                            if (bm51.m29803n0(nw80Var.f159049c, "spotify:track:", false)) {
                                String str13 = nw80Var.f159047a;
                                idr0Var.f101209a = null;
                                idr0Var.f101210b = null;
                                idr0Var.f101211c = null;
                                idr0Var.f101212d = null;
                                idr0Var.f101213e = null;
                                idr0Var.f101214f = nw80Var;
                                idr0Var.f101215g = z;
                                idr0Var.f101218t = 4;
                                objM62843h = ((mu80) wt80Var).m62843h(str8, str13, f111384e, idr0Var);
                                if (objM62843h != yukVar) {
                                    nw80Var2 = nw80Var;
                                    objM86755t = objM62843h;
                                }
                                return yukVar;
                            }
                        }
                    }
                }
                return null;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nw80Var2 = (nw80) idr0Var.f101214f;
            bga.m29073P(objM86755t);
        }
        p2x0Var = (p2x0) objM86755t;
        if (p2x0Var != null) {
            nw80Var3 = (nw80) p2x0Var.m68970c();
        } else {
            nw80Var3 = null;
        }
        String str14 = nw80Var2.f159047a;
        String str15 = nw80Var2.f159049c;
        if (nw80Var3 != null && (map = nw80Var3.f159053g) != null && (str9 = (String) map.get("item.speed")) != null) {
            fM29806q0 = bm51.m29806q0(str9);
        }
        return new kdr0(str14, str15, fM29806q0);
        boolean z2 = ((pe01) objM86755t).f176598o;
        x401Var = new x401();
        d670 d670VarM51212a = this.f111386b.f170445a.m51212a(str6);
        idr0Var.f101209a = str5;
        idr0Var.f101210b = str4;
        idr0Var.f101211c = null;
        idr0Var.f101212d = x401Var;
        idr0Var.f101213e = x401Var;
        idr0Var.f101214f = x401Var;
        idr0Var.f101215g = z2;
        idr0Var.f101218t = 2;
        Serializable serializableM35087j = d670VarM51212a.m35087j(str5, idr0Var);
        if (serializableM35087j != yukVar) {
            z = z2;
            objM86755t = serializableM35087j;
            set = x401Var;
            set2 = set;
            set.addAll((Collection) objM86755t);
            if (!z) {
                x401Var.add(at80.f19613a);
            }
            st80 st80Var2 = new st80(f111383d, null, n0e1.m63425d(set2), false, null, a5u0.f12598a, null, 0, null, 474);
            idr0Var.f101209a = str5;
            idr0Var.f101210b = str4;
            idr0Var.f101211c = null;
            idr0Var.f101212d = null;
            idr0Var.f101213e = null;
            idr0Var.f101214f = null;
            idr0Var.f101215g = z;
            idr0Var.f101218t = 3;
            objM86755t = ((mu80) wt80Var).m62841f(str5, st80Var2, idr0Var);
            if (objM86755t != yukVar) {
                str7 = str4;
                str8 = str5;
                qu80Var = (qu80) ((p2x0) objM86755t).m68970c();
                if (qu80Var != null) {
                    list = qu80Var.f192598d;
                    if (wrf0.m88858b(qu80Var.f192599e.f271272q)) {
                        it = list.iterator();
                        i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (wj50.m88271j(((nw80) it.next()).f159047a, str7)) {
                                break;
                                break;
                            }
                            i++;
                        }
                        if (i > 0) {
                            nw80Var = (nw80) list.get(i - 1);
                            if (bm51.m29803n0(nw80Var.f159049c, "spotify:track:", false)) {
                                String str16 = nw80Var.f159047a;
                                idr0Var.f101209a = null;
                                idr0Var.f101210b = null;
                                idr0Var.f101211c = null;
                                idr0Var.f101212d = null;
                                idr0Var.f101213e = null;
                                idr0Var.f101214f = nw80Var;
                                idr0Var.f101215g = z;
                                idr0Var.f101218t = 4;
                                objM62843h = ((mu80) wt80Var).m62843h(str8, str16, f111384e, idr0Var);
                                if (objM62843h != yukVar) {
                                    nw80Var2 = nw80Var;
                                    objM86755t = objM62843h;
                                    p2x0Var = (p2x0) objM86755t;
                                    if (p2x0Var != null) {
                                        nw80Var3 = (nw80) p2x0Var.m68970c();
                                    } else {
                                        nw80Var3 = null;
                                    }
                                    String str17 = nw80Var2.f159047a;
                                    String str18 = nw80Var2.f159049c;
                                    if (nw80Var3 != null) {
                                        fM29806q0 = bm51.m29806q0(str9);
                                    }
                                    return new kdr0(str17, str18, fM29806q0);
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }
        return yukVar;
    }
}

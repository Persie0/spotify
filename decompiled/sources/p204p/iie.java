package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class iie implements jt50 {

    /* JADX INFO: renamed from: a */
    public final mb80 f102528a;

    /* JADX INFO: renamed from: b */
    public final pgo f102529b;

    /* JADX INFO: renamed from: c */
    public final gfi0 f102530c;

    /* JADX INFO: renamed from: d */
    public final u190 f102531d;

    /* JADX INFO: renamed from: e */
    public final String f102532e;

    /* JADX INFO: renamed from: f */
    public final xyx f102533f;

    /* JADX INFO: renamed from: g */
    public final mcu0 f102534g;

    /* JADX INFO: renamed from: h */
    public final oge0 f102535h;

    /* JADX INFO: renamed from: i */
    public final q831 f102536i;

    /* JADX INFO: renamed from: j */
    public final voi f102537j;

    /* JADX INFO: renamed from: k */
    public final ru00 f102538k;

    /* JADX INFO: renamed from: l */
    public final h62 f102539l;

    /* JADX INFO: renamed from: m */
    public final wek0 f102540m;

    /* JADX INFO: renamed from: n */
    public final nc2 f102541n;

    /* JADX INFO: renamed from: o */
    public final ttf0 f102542o;

    /* JADX INFO: renamed from: p */
    public final emx f102543p;

    /* JADX INFO: renamed from: q */
    public final vmz f102544q;

    /* JADX INFO: renamed from: r */
    public final pe50 f102545r;

    /* JADX INFO: renamed from: s */
    public final tjo f102546s;

    /* JADX INFO: renamed from: t */
    public final rvw0 f102547t;

    /* JADX INFO: renamed from: u */
    public final kuf0 f102548u;

    /* JADX INFO: renamed from: v */
    public final bmo0 f102549v;

    public iie(mb80 mb80Var, pgo pgoVar, gfi0 gfi0Var, u190 u190Var, String str, xyx xyxVar, mcu0 mcu0Var, oge0 oge0Var, q831 q831Var, voi voiVar, ru00 ru00Var, st91 st91Var, hun0 hun0Var, h62 h62Var, kvb1 kvb1Var, ekn eknVar, wek0 wek0Var, bon bonVar, nc2 nc2Var, ttf0 ttf0Var, emx emxVar, vmz vmzVar, pe50 pe50Var) {
        this.f102528a = mb80Var;
        this.f102529b = pgoVar;
        this.f102530c = gfi0Var;
        this.f102531d = u190Var;
        this.f102532e = str;
        this.f102533f = xyxVar;
        this.f102534g = mcu0Var;
        this.f102535h = oge0Var;
        this.f102536i = q831Var;
        this.f102537j = voiVar;
        this.f102538k = ru00Var;
        this.f102539l = h62Var;
        this.f102540m = wek0Var;
        this.f102541n = nc2Var;
        this.f102542o = ttf0Var;
        this.f102543p = emxVar;
        this.f102544q = vmzVar;
        this.f102545r = pe50Var;
        this.f102546s = kvb1Var.m57456a(str);
        this.f102547t = eknVar.m39304a(null);
        this.f102548u = bonVar.m30088a(st91Var);
        this.f102549v = hun0Var.m48684e(new xlo0(u190Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m50706d(ibk ibkVar) {
        cie cieVar;
        if (ibkVar instanceof cie) {
            cieVar = (cie) ibkVar;
            int i = cieVar.f38296c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cieVar.f38296c = i - Integer.MIN_VALUE;
            } else {
                cieVar = new cie(this, ibkVar);
            }
        } else {
            cieVar = new cie(this, ibkVar);
        }
        Object obj = cieVar.f38294a;
        int i2 = cieVar.f38296c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleOnErrorReturnItem = this.f102534g.m61498e().firstOrError().onErrorReturnItem(Boolean.TRUE);
        cieVar.f38296c = 1;
        Object objM96567o = zn91.m96567o(singleOnErrorReturnItem, cieVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX INFO: renamed from: e */
    public final d850 m50707e(String str, int i, boolean z) {
        xyx xyxVar = this.f102533f;
        st91 st91Var = (st91) xyxVar.f267437c;
        kv91 kv91Var = (kv91) xyxVar.f267436b;
        if (z) {
            Integer numValueOf = Integer.valueOf(i);
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-playlist-entity-item-list-item";
            yt91VarM50626j.f276052f = "2.0.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276049c = numValueOf;
            yt91VarM50626j.f276050d = str;
            zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String string = str.toString();
            if (string == null) {
                string = "";
            }
            return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("shuffle_play", 1, Collections.singletonMap("context_to_be_played", string)), zt91VarM94607a, st91Var, System.currentTimeMillis()), null);
        }
        Integer numValueOf2 = Integer.valueOf(i);
        zt91 zt91Var2 = zt91.f286105i;
        yt91 yt91VarM50626j2 = ihf1.m50626j();
        yt91VarM50626j2.f276054h = "music";
        yt91VarM50626j2.f276047a = "mobile-playlist-entity-item-list-item";
        yt91VarM50626j2.f276052f = "2.0.0";
        yt91VarM50626j2.f276053g = "20.0.5";
        yt91VarM50626j2.f276049c = numValueOf2;
        yt91VarM50626j2.f276050d = str;
        zt91 zt91VarM94607a2 = yt91VarM50626j2.m94607a();
        dv91 dv91Var2 = new dv91("hit", 1);
        String string2 = str.toString();
        if (string2 == null) {
            string2 = "";
        }
        return kv91Var.mo57453r(new av91("", "", dv91Var2, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string2)), zt91VarM94607a2, st91Var, System.currentTimeMillis()), null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r2 == r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r2 != p204p.rhj.f199234b) goto L46;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50708f(int i, nw80 nw80Var, rs50 rs50Var, ibk ibkVar) throws Throwable {
        die dieVar;
        int i2;
        rs50 rs50Var2;
        j7f0 j7f0Var;
        String str;
        String string;
        Object objM44623d;
        thj thjVar;
        rhj rhjVar;
        nw80 nw80Var2 = nw80Var;
        if (ibkVar instanceof die) {
            dieVar = (die) ibkVar;
            int i3 = dieVar.f49332f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dieVar.f49332f = i3 - Integer.MIN_VALUE;
            } else {
                dieVar = new die(this, ibkVar);
            }
        } else {
            dieVar = new die(this, ibkVar);
        }
        Object objM86755t = dieVar.f49330d;
        int i4 = dieVar.f49332f;
        Object obj = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(objM86755t);
            if (nw80Var2.f159059m) {
                fiz fizVarM86024a = this.f102544q.m86024a("disable-blocked-content", false);
                dieVar.f49328b = nw80Var2;
                rs50Var2 = rs50Var;
                dieVar.f49329c = rs50Var2;
                i2 = i;
                dieVar.f49327a = i2;
                dieVar.f49332f = 1;
                objM86755t = vyf1.m86755t(fizVarM86024a, dieVar);
            } else {
                i2 = i;
                rs50Var2 = rs50Var;
                j7f0Var = nw80Var2.f159061o;
                str = nw80Var2.f159049c;
                if ((j7f0Var instanceof f0w) && ((f0w) j7f0Var).f64737o != zzv.f288117b) {
                    thjVar = (thj) nw80Var2.f159062p.mo30169a(thj.class);
                    if (thjVar != null) {
                        rhjVar = thjVar.f220443a;
                    } else {
                        rhjVar = null;
                    }
                }
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c != gn80.SHOW_SHOW) {
                    if (rs50Var2 instanceof ps50) {
                        dieVar.f49328b = null;
                        dieVar.f49329c = null;
                        dieVar.f49327a = i2;
                        dieVar.f49332f = 3;
                        if (m50709h(i2, nw80Var2, (ps50) rs50Var2, dieVar) != obj2) {
                            return obj;
                        }
                    } else {
                        if (rs50Var2 instanceof qs50) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dieVar.f49328b = null;
                        dieVar.f49329c = null;
                        dieVar.f49327a = i2;
                        dieVar.f49332f = 4;
                        if (m50710r(i2, nw80Var2, (qs50) rs50Var2, dieVar) != obj2) {
                            return obj;
                        }
                    }
                }
                xyx xyxVar = this.f102533f;
                kv91 kv91Var = (kv91) xyxVar.f267436b;
                st91 st91Var = (st91) xyxVar.f267437c;
                Integer numValueOf = Integer.valueOf(i2);
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-playlist-entity-item-list-item";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276049c = numValueOf;
                yt91VarM50626j.f276050d = str;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                if (str != null) {
                    string = str.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = "";
                }
                d850 d850VarMo57453r = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91Var, System.currentTimeMillis()), null);
                st80 st80VarM83057u = ugz.m83057u(this.f102531d.f225726g);
                dieVar.f49328b = null;
                dieVar.f49329c = null;
                dieVar.f49327a = i2;
                dieVar.f49332f = 2;
                objM44623d = this.f102530c.m44623d(str, d850VarMo57453r, pp91.m70529j(new pqm0("extra_playback_context_uri", this.f102532e), new pqm0("extra_playback_row_id", nw80Var2.f159047a), new pqm0("extra_playback_state", st80VarM83057u)), dieVar);
                if (objM44623d != obj2) {
                    objM44623d = obj;
                }
                if (objM44623d != obj2) {
                    return obj;
                }
            }
            return obj2;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                bga.m29073P(objM86755t);
                return obj;
            }
            if (i4 == 3) {
                bga.m29073P(objM86755t);
                return obj;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return obj;
        }
        int i5 = dieVar.f49327a;
        rs50Var2 = dieVar.f49329c;
        nw80 nw80Var3 = dieVar.f49328b;
        bga.m29073P(objM86755t);
        i2 = i5;
        nw80Var2 = nw80Var3;
        if (((Boolean) objM86755t).booleanValue()) {
            this.f102545r.m69710a().m88811a(nw80Var2.f159049c, false);
            return obj;
        }
        j7f0Var = nw80Var2.f159061o;
        str = nw80Var2.f159049c;
        if (j7f0Var instanceof f0w) {
            thjVar = (thj) nw80Var2.f159062p.mo30169a(thj.class);
            if (thjVar != null) {
                rhjVar = thjVar.f220443a;
            } else {
                rhjVar = null;
            }
        }
        Set set2 = dd41.f47702f;
        if (r46.m74726U(str).f47709c != gn80.SHOW_SHOW) {
            if (rs50Var2 instanceof ps50) {
                dieVar.f49328b = null;
                dieVar.f49329c = null;
                dieVar.f49327a = i2;
                dieVar.f49332f = 3;
                if (m50709h(i2, nw80Var2, (ps50) rs50Var2, dieVar) != obj2) {
                    return obj2;
                }
                return obj;
            }
            if (rs50Var2 instanceof qs50) {
                throw new NoWhenBranchMatchedException();
            }
            dieVar.f49328b = null;
            dieVar.f49329c = null;
            dieVar.f49327a = i2;
            dieVar.f49332f = 4;
            if (m50710r(i2, nw80Var2, (qs50) rs50Var2, dieVar) != obj2) {
                return obj2;
            }
            return obj;
        }
        xyx xyxVar2 = this.f102533f;
        kv91 kv91Var2 = (kv91) xyxVar2.f267436b;
        st91 st91Var2 = (st91) xyxVar2.f267437c;
        Integer numValueOf2 = Integer.valueOf(i2);
        zt91 zt91Var2 = zt91.f286105i;
        yt91 yt91VarM50626j2 = ihf1.m50626j();
        yt91VarM50626j2.f276054h = "music";
        yt91VarM50626j2.f276047a = "mobile-playlist-entity-item-list-item";
        yt91VarM50626j2.f276052f = "2.0.0";
        yt91VarM50626j2.f276053g = "20.0.5";
        yt91VarM50626j2.f276049c = numValueOf2;
        yt91VarM50626j2.f276050d = str;
        zt91 zt91VarM94607a2 = yt91VarM50626j2.m94607a();
        dv91 dv91Var2 = new dv91("hit", 1);
        if (str != null) {
            string = str.toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        d850 d850VarMo57453r2 = kv91Var2.mo57453r(new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a2, st91Var2, System.currentTimeMillis()), null);
        st80 st80VarM83057u2 = ugz.m83057u(this.f102531d.f225726g);
        dieVar.f49328b = null;
        dieVar.f49329c = null;
        dieVar.f49327a = i2;
        dieVar.f49332f = 2;
        objM44623d = this.f102530c.m44623d(str, d850VarMo57453r2, pp91.m70529j(new pqm0("extra_playback_context_uri", this.f102532e), new pqm0("extra_playback_row_id", nw80Var2.f159047a), new pqm0("extra_playback_state", st80VarM83057u2)), dieVar);
        if (objM44623d != obj2) {
            objM44623d = obj;
        }
        if (objM44623d != obj2) {
            return obj2;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0221  */
    /* JADX WARN: Code duplicated, block: B:102:0x0248  */
    /* JADX WARN: Code duplicated, block: B:105:0x0252  */
    /* JADX WARN: Code duplicated, block: B:107:0x0258  */
    /* JADX WARN: Code duplicated, block: B:110:0x0285  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x0219  */
    /* JADX INFO: renamed from: h */
    public final Object m50709h(int i, nw80 nw80Var, ps50 ps50Var, ibk ibkVar) {
        eie eieVar;
        nw80 nw80Var2;
        Object objM50706d;
        ps50 ps50Var2;
        int i2;
        boolean zBooleanValue;
        hto0 hto0VarM65751b;
        Object objM86755t;
        nw80 nw80Var3;
        ps50 ps50Var3;
        boolean z;
        hto0 hto0Var;
        boolean zBooleanValue2;
        ls50 ls50Var;
        j7f0 j7f0Var;
        String str;
        qho qhoVarM25241r;
        oho ohoVar;
        cvb1 cvb1Var;
        d850 d850VarM50707e;
        Object objM86755t2;
        boolean z2;
        int i3;
        d850 d850Var;
        boolean z3;
        nw80 nw80Var4;
        int i4;
        d850 d850Var2;
        boolean z4;
        List list;
        boolean z5;
        eob1 eob1Var;
        i190 i190Var;
        d850 d850Var3;
        boolean zBooleanValue3;
        i190 i190Var2;
        boolean z6;
        boolean z7;
        Integer numValueOf = Integer.valueOf(R.string.video_playback_not_available);
        if (ibkVar instanceof eie) {
            eieVar = (eie) ibkVar;
            int i5 = eieVar.f59860X;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eieVar.f59860X = i5 - Integer.MIN_VALUE;
            } else {
                eieVar = new eie(this, ibkVar);
            }
        } else {
            eieVar = new eie(this, ibkVar);
        }
        Object obj = eieVar.f59869i;
        int i6 = eieVar.f59860X;
        w2a1 w2a1Var = w2a1.f247311a;
        u190 u190Var = this.f102531d;
        Object obj2 = yuk.f276404a;
        switch (i6) {
            case 0:
                bga.m29073P(obj);
                nw80Var2 = nw80Var;
                eieVar.f59862b = nw80Var2;
                eieVar.f59863c = ps50Var;
                eieVar.f59861a = i;
                eieVar.f59860X = 1;
                objM50706d = m50706d(eieVar);
                if (objM50706d != obj2) {
                    ps50Var2 = ps50Var;
                    i2 = i;
                    zBooleanValue = ((Boolean) objM50706d).booleanValue();
                    hto0VarM65751b = nw80Var2.m65751b();
                    ou8 ou8Var = u190Var.f225727h;
                    eieVar.f59862b = nw80Var2;
                    eieVar.f59863c = ps50Var2;
                    eieVar.f59864d = hto0VarM65751b;
                    eieVar.f59861a = i2;
                    eieVar.f59866f = zBooleanValue;
                    eieVar.f59860X = 2;
                    objM86755t = vyf1.m86755t(ou8Var, eieVar);
                    if (objM86755t != obj2) {
                        nw80Var3 = nw80Var2;
                        obj = objM86755t;
                        ps50Var3 = ps50Var2;
                        z = zBooleanValue;
                        hto0Var = hto0VarM65751b;
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                        ls50Var = ps50Var3.f180754a;
                        if (hto0Var == hto0.f95101c) {
                            m50707e(nw80Var3.f159049c, i2, zBooleanValue2);
                            this.f102543p.m39465a(nw80Var3.f159049c);
                            return w2a1Var;
                        }
                        j7f0Var = nw80Var3.f159061o;
                        dpx dpxVar = nw80Var3.f159062p;
                        str = nw80Var3.f159049c;
                        if (!(j7f0Var instanceof ib81) && ((ib81) j7f0Var).f100478h) {
                            d850 d850VarM50707e2 = m50707e(str, i2, zBooleanValue2);
                            String strM65750a = nw80Var3.m65750a(1);
                            mej mejVar = (mej) dpxVar.mo30169a(mej.class);
                            this.f102538k.m76409a(this.f102532e, strM65750a, wj50.m88271j(mejVar != null ? mejVar.f142740a : null, uej.f229547a) ? "spotify:windowed-song:click" : "spotify:gated-song:click", nw80Var3.f159049c, d850VarM50707e2);
                            return w2a1Var;
                        }
                        if (ls50Var instanceof ks50) {
                            h62.m46704b(this.f102539l, new n52(((ks50) ls50Var).f125840a), true, m50707e(str, i2, zBooleanValue2));
                            return w2a1Var;
                        }
                        if (hto0Var == hto0.f95102d) {
                            m50707e(str, i2, zBooleanValue2);
                            this.f102541n.m64108c(str, null);
                            return w2a1Var;
                        }
                        if (!z) {
                            Set set = dd41.f47702f;
                            if (r46.m74726U(str).f47709c == gn80.TRACK) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (nw80Var3.m65756g() || (z5 && nw80Var3.m65755f())) {
                                m50707e(str, i2, zBooleanValue2);
                                return w2a1Var;
                            }
                        }
                        qhoVarM25241r = aag1.m25241r(this.f102529b, this.f102546s, w2a1Var);
                        if (qhoVarM25241r instanceof oho) {
                            ohoVar = (oho) qhoVarM25241r;
                        } else {
                            ohoVar = null;
                        }
                        if (ohoVar != null) {
                            cvb1Var = (cvb1) ohoVar.f165512a;
                        } else {
                            cvb1Var = null;
                        }
                        if (cvb1Var == null && kmg1.m56923u(cvb1Var)) {
                            daj dajVar = (daj) dpxVar.mo30169a(daj.class);
                            if ((dajVar == null || (list = dajVar.f47053d) == null) ? false : list.contains(baj.f25220c)) {
                                d850 d850VarM50707e3 = m50707e(str, i2, zBooleanValue2);
                                eieVar.f59862b = nw80Var3;
                                eieVar.f59863c = null;
                                eieVar.f59864d = null;
                                eieVar.f59865e = d850VarM50707e3;
                                eieVar.f59861a = i2;
                                eieVar.f59866f = z;
                                eieVar.f59867g = zBooleanValue2;
                                eieVar.f59860X = 3;
                                Object objM76493f = this.f102547t.m76493f(str, eieVar);
                                if (objM76493f != obj2) {
                                    i4 = i2;
                                    d850Var2 = d850VarM50707e3;
                                    z4 = zBooleanValue2;
                                    obj = objM76493f;
                                    eob1Var = (eob1) obj;
                                    if (wj50.m88271j(eob1Var, dob1.f51007c)) {
                                        if (wj50.m88271j(eob1Var, dob1.f51006b)) {
                                            if (!wj50.m88271j(eob1Var, dob1.f51005a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            return w2a1Var;
                                        }
                                        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                                        na6.m63963k(true, "Invalid resource ID provided: %s", null);
                                        this.f102536i.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                                        return w2a1Var;
                                    }
                                    i190Var = new i190(nw80Var3.f159047a);
                                    eieVar.f59862b = null;
                                    eieVar.f59863c = null;
                                    eieVar.f59864d = null;
                                    eieVar.f59865e = d850Var2;
                                    eieVar.f59861a = i4;
                                    eieVar.f59866f = z;
                                    eieVar.f59867g = z4;
                                    eieVar.f59860X = 4;
                                    if (u190Var.m82198d(i190Var, d850Var2, eieVar) != obj2) {
                                        d850Var3 = d850Var2;
                                        wek0.m87885d(this.f102540m, d850Var3.f46380a);
                                        return w2a1Var;
                                    }
                                }
                            } else {
                                d850VarM50707e = m50707e(str, i2, zBooleanValue2);
                                eieVar.f59862b = nw80Var3;
                                eieVar.f59863c = null;
                                eieVar.f59864d = null;
                                eieVar.f59865e = d850VarM50707e;
                                eieVar.f59861a = i2;
                                eieVar.f59866f = z;
                                eieVar.f59867g = zBooleanValue2;
                                eieVar.f59860X = 5;
                                objM86755t2 = vyf1.m86755t(ryf1.m76722t(new yxb(u190Var.m82196b(), 16), 1), eieVar);
                                if (objM86755t2 != obj2) {
                                    int i7 = i2;
                                    z2 = zBooleanValue2;
                                    obj = objM86755t2;
                                    i3 = i7;
                                    boolean z8 = z;
                                    d850Var = d850VarM50707e;
                                    z3 = z8;
                                    nw80Var4 = nw80Var3;
                                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                                    i190Var2 = new i190(nw80Var4.f159047a);
                                    eieVar.f59862b = null;
                                    eieVar.f59863c = null;
                                    eieVar.f59864d = null;
                                    eieVar.f59865e = d850Var;
                                    eieVar.f59861a = i3;
                                    eieVar.f59866f = z3;
                                    eieVar.f59867g = z2;
                                    eieVar.f59868h = zBooleanValue3;
                                    eieVar.f59860X = 6;
                                    if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                                        z6 = z2;
                                        z7 = zBooleanValue3;
                                        eieVar.f59862b = null;
                                        eieVar.f59863c = null;
                                        eieVar.f59864d = null;
                                        eieVar.f59865e = null;
                                        eieVar.f59861a = i3;
                                        eieVar.f59866f = z3;
                                        eieVar.f59867g = z6;
                                        eieVar.f59868h = z7;
                                        eieVar.f59860X = 7;
                                        if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                                            return w2a1Var;
                                        }
                                    }
                                }
                            }
                        } else {
                            d850VarM50707e = m50707e(str, i2, zBooleanValue2);
                            eieVar.f59862b = nw80Var3;
                            eieVar.f59863c = null;
                            eieVar.f59864d = null;
                            eieVar.f59865e = d850VarM50707e;
                            eieVar.f59861a = i2;
                            eieVar.f59866f = z;
                            eieVar.f59867g = zBooleanValue2;
                            eieVar.f59860X = 5;
                            objM86755t2 = vyf1.m86755t(ryf1.m76722t(new yxb(u190Var.m82196b(), 16), 1), eieVar);
                            if (objM86755t2 != obj2) {
                                int i8 = i2;
                                z2 = zBooleanValue2;
                                obj = objM86755t2;
                                i3 = i8;
                                boolean z9 = z;
                                d850Var = d850VarM50707e;
                                z3 = z9;
                                nw80Var4 = nw80Var3;
                                zBooleanValue3 = ((Boolean) obj).booleanValue();
                                i190Var2 = new i190(nw80Var4.f159047a);
                                eieVar.f59862b = null;
                                eieVar.f59863c = null;
                                eieVar.f59864d = null;
                                eieVar.f59865e = d850Var;
                                eieVar.f59861a = i3;
                                eieVar.f59866f = z3;
                                eieVar.f59867g = z2;
                                eieVar.f59868h = zBooleanValue3;
                                eieVar.f59860X = 6;
                                if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                                    z6 = z2;
                                    z7 = zBooleanValue3;
                                    eieVar.f59862b = null;
                                    eieVar.f59863c = null;
                                    eieVar.f59864d = null;
                                    eieVar.f59865e = null;
                                    eieVar.f59861a = i3;
                                    eieVar.f59866f = z3;
                                    eieVar.f59867g = z6;
                                    eieVar.f59868h = z7;
                                    eieVar.f59860X = 7;
                                    if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                                        return w2a1Var;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                i2 = eieVar.f59861a;
                ps50Var2 = eieVar.f59863c;
                nw80 nw80Var5 = eieVar.f59862b;
                bga.m29073P(obj);
                objM50706d = obj;
                nw80Var2 = nw80Var5;
                zBooleanValue = ((Boolean) objM50706d).booleanValue();
                hto0VarM65751b = nw80Var2.m65751b();
                ou8 ou8Var2 = u190Var.f225727h;
                eieVar.f59862b = nw80Var2;
                eieVar.f59863c = ps50Var2;
                eieVar.f59864d = hto0VarM65751b;
                eieVar.f59861a = i2;
                eieVar.f59866f = zBooleanValue;
                eieVar.f59860X = 2;
                objM86755t = vyf1.m86755t(ou8Var2, eieVar);
                if (objM86755t != obj2) {
                    nw80Var3 = nw80Var2;
                    obj = objM86755t;
                    ps50Var3 = ps50Var2;
                    z = zBooleanValue;
                    hto0Var = hto0VarM65751b;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    ls50Var = ps50Var3.f180754a;
                    if (hto0Var == hto0.f95101c) {
                        m50707e(nw80Var3.f159049c, i2, zBooleanValue2);
                        this.f102543p.m39465a(nw80Var3.f159049c);
                        return w2a1Var;
                    }
                    j7f0Var = nw80Var3.f159061o;
                    dpx dpxVar2 = nw80Var3.f159062p;
                    str = nw80Var3.f159049c;
                    if (!(j7f0Var instanceof ib81)) {
                    }
                    if (ls50Var instanceof ks50) {
                        h62.m46704b(this.f102539l, new n52(((ks50) ls50Var).f125840a), true, m50707e(str, i2, zBooleanValue2));
                        return w2a1Var;
                    }
                    if (hto0Var == hto0.f95102d) {
                        m50707e(str, i2, zBooleanValue2);
                        this.f102541n.m64108c(str, null);
                        return w2a1Var;
                    }
                    if (!z) {
                        Set set2 = dd41.f47702f;
                        if (r46.m74726U(str).f47709c == gn80.TRACK) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (nw80Var3.m65756g()) {
                            break;
                        }
                        m50707e(str, i2, zBooleanValue2);
                        return w2a1Var;
                    }
                    qhoVarM25241r = aag1.m25241r(this.f102529b, this.f102546s, w2a1Var);
                    if (qhoVarM25241r instanceof oho) {
                        ohoVar = (oho) qhoVarM25241r;
                    } else {
                        ohoVar = null;
                    }
                    if (ohoVar != null) {
                        cvb1Var = (cvb1) ohoVar.f165512a;
                    } else {
                        cvb1Var = null;
                    }
                    if (cvb1Var == null) {
                        d850VarM50707e = m50707e(str, i2, zBooleanValue2);
                        eieVar.f59862b = nw80Var3;
                        eieVar.f59863c = null;
                        eieVar.f59864d = null;
                        eieVar.f59865e = d850VarM50707e;
                        eieVar.f59861a = i2;
                        eieVar.f59866f = z;
                        eieVar.f59867g = zBooleanValue2;
                        eieVar.f59860X = 5;
                        objM86755t2 = vyf1.m86755t(ryf1.m76722t(new yxb(u190Var.m82196b(), 16), 1), eieVar);
                        if (objM86755t2 != obj2) {
                            int i9 = i2;
                            z2 = zBooleanValue2;
                            obj = objM86755t2;
                            i3 = i9;
                            boolean z10 = z;
                            d850Var = d850VarM50707e;
                            z3 = z10;
                            nw80Var4 = nw80Var3;
                            zBooleanValue3 = ((Boolean) obj).booleanValue();
                            i190Var2 = new i190(nw80Var4.f159047a);
                            eieVar.f59862b = null;
                            eieVar.f59863c = null;
                            eieVar.f59864d = null;
                            eieVar.f59865e = d850Var;
                            eieVar.f59861a = i3;
                            eieVar.f59866f = z3;
                            eieVar.f59867g = z2;
                            eieVar.f59868h = zBooleanValue3;
                            eieVar.f59860X = 6;
                            if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                                z6 = z2;
                                z7 = zBooleanValue3;
                                eieVar.f59862b = null;
                                eieVar.f59863c = null;
                                eieVar.f59864d = null;
                                eieVar.f59865e = null;
                                eieVar.f59861a = i3;
                                eieVar.f59866f = z3;
                                eieVar.f59867g = z6;
                                eieVar.f59868h = z7;
                                eieVar.f59860X = 7;
                                if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                                    return w2a1Var;
                                }
                            }
                        }
                    } else {
                        d850VarM50707e = m50707e(str, i2, zBooleanValue2);
                        eieVar.f59862b = nw80Var3;
                        eieVar.f59863c = null;
                        eieVar.f59864d = null;
                        eieVar.f59865e = d850VarM50707e;
                        eieVar.f59861a = i2;
                        eieVar.f59866f = z;
                        eieVar.f59867g = zBooleanValue2;
                        eieVar.f59860X = 5;
                        objM86755t2 = vyf1.m86755t(ryf1.m76722t(new yxb(u190Var.m82196b(), 16), 1), eieVar);
                        if (objM86755t2 != obj2) {
                            int i10 = i2;
                            z2 = zBooleanValue2;
                            obj = objM86755t2;
                            i3 = i10;
                            boolean z11 = z;
                            d850Var = d850VarM50707e;
                            z3 = z11;
                            nw80Var4 = nw80Var3;
                            zBooleanValue3 = ((Boolean) obj).booleanValue();
                            i190Var2 = new i190(nw80Var4.f159047a);
                            eieVar.f59862b = null;
                            eieVar.f59863c = null;
                            eieVar.f59864d = null;
                            eieVar.f59865e = d850Var;
                            eieVar.f59861a = i3;
                            eieVar.f59866f = z3;
                            eieVar.f59867g = z2;
                            eieVar.f59868h = zBooleanValue3;
                            eieVar.f59860X = 6;
                            if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                                z6 = z2;
                                z7 = zBooleanValue3;
                                eieVar.f59862b = null;
                                eieVar.f59863c = null;
                                eieVar.f59864d = null;
                                eieVar.f59865e = null;
                                eieVar.f59861a = i3;
                                eieVar.f59866f = z3;
                                eieVar.f59867g = z6;
                                eieVar.f59868h = z7;
                                eieVar.f59860X = 7;
                                if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                                    return w2a1Var;
                                }
                            }
                        }
                    }
                    break;
                }
                return obj2;
            case 2:
                boolean z12 = eieVar.f59866f;
                int i11 = eieVar.f59861a;
                hto0Var = eieVar.f59864d;
                ps50Var3 = eieVar.f59863c;
                nw80Var3 = eieVar.f59862b;
                bga.m29073P(obj);
                z = z12;
                i2 = i11;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                ls50Var = ps50Var3.f180754a;
                if (hto0Var == hto0.f95101c) {
                    m50707e(nw80Var3.f159049c, i2, zBooleanValue2);
                    this.f102543p.m39465a(nw80Var3.f159049c);
                    return w2a1Var;
                }
                j7f0Var = nw80Var3.f159061o;
                dpx dpxVar3 = nw80Var3.f159062p;
                str = nw80Var3.f159049c;
                if (!(j7f0Var instanceof ib81)) {
                    break;
                }
                if (ls50Var instanceof ks50) {
                    h62.m46704b(this.f102539l, new n52(((ks50) ls50Var).f125840a), true, m50707e(str, i2, zBooleanValue2));
                    return w2a1Var;
                }
                if (hto0Var == hto0.f95102d) {
                    m50707e(str, i2, zBooleanValue2);
                    this.f102541n.m64108c(str, null);
                    return w2a1Var;
                }
                if (!z) {
                    Set set3 = dd41.f47702f;
                    if (r46.m74726U(str).f47709c == gn80.TRACK) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (nw80Var3.m65756g()) {
                        break;
                    }
                    m50707e(str, i2, zBooleanValue2);
                    return w2a1Var;
                }
                qhoVarM25241r = aag1.m25241r(this.f102529b, this.f102546s, w2a1Var);
                if (qhoVarM25241r instanceof oho) {
                    ohoVar = (oho) qhoVarM25241r;
                } else {
                    ohoVar = null;
                }
                if (ohoVar != null) {
                    cvb1Var = (cvb1) ohoVar.f165512a;
                } else {
                    cvb1Var = null;
                }
                if (cvb1Var == null) {
                    d850VarM50707e = m50707e(str, i2, zBooleanValue2);
                    eieVar.f59862b = nw80Var3;
                    eieVar.f59863c = null;
                    eieVar.f59864d = null;
                    eieVar.f59865e = d850VarM50707e;
                    eieVar.f59861a = i2;
                    eieVar.f59866f = z;
                    eieVar.f59867g = zBooleanValue2;
                    eieVar.f59860X = 5;
                    objM86755t2 = vyf1.m86755t(ryf1.m76722t(new yxb(u190Var.m82196b(), 16), 1), eieVar);
                    if (objM86755t2 != obj2) {
                        int i12 = i2;
                        z2 = zBooleanValue2;
                        obj = objM86755t2;
                        i3 = i12;
                        boolean z13 = z;
                        d850Var = d850VarM50707e;
                        z3 = z13;
                        nw80Var4 = nw80Var3;
                        zBooleanValue3 = ((Boolean) obj).booleanValue();
                        i190Var2 = new i190(nw80Var4.f159047a);
                        eieVar.f59862b = null;
                        eieVar.f59863c = null;
                        eieVar.f59864d = null;
                        eieVar.f59865e = d850Var;
                        eieVar.f59861a = i3;
                        eieVar.f59866f = z3;
                        eieVar.f59867g = z2;
                        eieVar.f59868h = zBooleanValue3;
                        eieVar.f59860X = 6;
                        if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                            z6 = z2;
                            z7 = zBooleanValue3;
                            eieVar.f59862b = null;
                            eieVar.f59863c = null;
                            eieVar.f59864d = null;
                            eieVar.f59865e = null;
                            eieVar.f59861a = i3;
                            eieVar.f59866f = z3;
                            eieVar.f59867g = z6;
                            eieVar.f59868h = z7;
                            eieVar.f59860X = 7;
                            if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                                return w2a1Var;
                            }
                        }
                    }
                } else {
                    d850VarM50707e = m50707e(str, i2, zBooleanValue2);
                    eieVar.f59862b = nw80Var3;
                    eieVar.f59863c = null;
                    eieVar.f59864d = null;
                    eieVar.f59865e = d850VarM50707e;
                    eieVar.f59861a = i2;
                    eieVar.f59866f = z;
                    eieVar.f59867g = zBooleanValue2;
                    eieVar.f59860X = 5;
                    objM86755t2 = vyf1.m86755t(ryf1.m76722t(new yxb(u190Var.m82196b(), 16), 1), eieVar);
                    if (objM86755t2 != obj2) {
                        int i13 = i2;
                        z2 = zBooleanValue2;
                        obj = objM86755t2;
                        i3 = i13;
                        boolean z14 = z;
                        d850Var = d850VarM50707e;
                        z3 = z14;
                        nw80Var4 = nw80Var3;
                        zBooleanValue3 = ((Boolean) obj).booleanValue();
                        i190Var2 = new i190(nw80Var4.f159047a);
                        eieVar.f59862b = null;
                        eieVar.f59863c = null;
                        eieVar.f59864d = null;
                        eieVar.f59865e = d850Var;
                        eieVar.f59861a = i3;
                        eieVar.f59866f = z3;
                        eieVar.f59867g = z2;
                        eieVar.f59868h = zBooleanValue3;
                        eieVar.f59860X = 6;
                        if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                            z6 = z2;
                            z7 = zBooleanValue3;
                            eieVar.f59862b = null;
                            eieVar.f59863c = null;
                            eieVar.f59864d = null;
                            eieVar.f59865e = null;
                            eieVar.f59861a = i3;
                            eieVar.f59866f = z3;
                            eieVar.f59867g = z6;
                            eieVar.f59868h = z7;
                            eieVar.f59860X = 7;
                            if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                                return w2a1Var;
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                z4 = eieVar.f59867g;
                z = eieVar.f59866f;
                i4 = eieVar.f59861a;
                d850Var2 = eieVar.f59865e;
                nw80Var3 = eieVar.f59862b;
                bga.m29073P(obj);
                eob1Var = (eob1) obj;
                if (wj50.m88271j(eob1Var, dob1.f51007c)) {
                    if (wj50.m88271j(eob1Var, dob1.f51006b)) {
                        if (!wj50.m88271j(eob1Var, dob1.f51005a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return w2a1Var;
                    }
                    na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
                    na6.m63963k(true, "Invalid resource ID provided: %s", null);
                    this.f102536i.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
                    return w2a1Var;
                }
                i190Var = new i190(nw80Var3.f159047a);
                eieVar.f59862b = null;
                eieVar.f59863c = null;
                eieVar.f59864d = null;
                eieVar.f59865e = d850Var2;
                eieVar.f59861a = i4;
                eieVar.f59866f = z;
                eieVar.f59867g = z4;
                eieVar.f59860X = 4;
                if (u190Var.m82198d(i190Var, d850Var2, eieVar) != obj2) {
                    d850Var3 = d850Var2;
                    wek0.m87885d(this.f102540m, d850Var3.f46380a);
                    return w2a1Var;
                }
                return obj2;
            case 4:
                d850Var3 = eieVar.f59865e;
                bga.m29073P(obj);
                wek0.m87885d(this.f102540m, d850Var3.f46380a);
                return w2a1Var;
            case 5:
                z2 = eieVar.f59867g;
                z3 = eieVar.f59866f;
                i3 = eieVar.f59861a;
                d850Var = eieVar.f59865e;
                nw80Var4 = eieVar.f59862b;
                bga.m29073P(obj);
                zBooleanValue3 = ((Boolean) obj).booleanValue();
                i190Var2 = new i190(nw80Var4.f159047a);
                eieVar.f59862b = null;
                eieVar.f59863c = null;
                eieVar.f59864d = null;
                eieVar.f59865e = d850Var;
                eieVar.f59861a = i3;
                eieVar.f59866f = z3;
                eieVar.f59867g = z2;
                eieVar.f59868h = zBooleanValue3;
                eieVar.f59860X = 6;
                if (u190Var.m82198d(i190Var2, d850Var, eieVar) != obj2) {
                    z6 = z2;
                    z7 = zBooleanValue3;
                    eieVar.f59862b = null;
                    eieVar.f59863c = null;
                    eieVar.f59864d = null;
                    eieVar.f59865e = null;
                    eieVar.f59861a = i3;
                    eieVar.f59866f = z3;
                    eieVar.f59867g = z6;
                    eieVar.f59868h = z7;
                    eieVar.f59860X = 7;
                    if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                        return w2a1Var;
                    }
                }
                return obj2;
            case 6:
                z7 = eieVar.f59868h;
                z6 = eieVar.f59867g;
                z3 = eieVar.f59866f;
                i3 = eieVar.f59861a;
                d850Var = eieVar.f59865e;
                bga.m29073P(obj);
                eieVar.f59862b = null;
                eieVar.f59863c = null;
                eieVar.f59864d = null;
                eieVar.f59865e = null;
                eieVar.f59861a = i3;
                eieVar.f59866f = z3;
                eieVar.f59867g = z6;
                eieVar.f59868h = z7;
                eieVar.f59860X = 7;
                if (m50711s(z6, d850Var, z7, eieVar) != obj2) {
                    return obj2;
                }
                return w2a1Var;
            case 7:
                bga.m29073P(obj);
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.jt50
    /* JADX INFO: renamed from: i */
    public final Enum mo33214i(vs50 vs50Var, ibk ibkVar) throws Throwable {
        gie gieVar;
        if (ibkVar instanceof gie) {
            gieVar = (gie) ibkVar;
            int i = gieVar.f80150c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gieVar.f80150c = i - Integer.MIN_VALUE;
            } else {
                gieVar = new gie(this, ibkVar);
            }
        } else {
            gieVar = new gie(this, ibkVar);
        }
        Object obj = gieVar.f80148a;
        int i2 = gieVar.f80150c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                if (!(vs50Var instanceof ss50)) {
                    return it50.f105436a;
                }
                nw80 nw80Var = ((ss50) vs50Var).f213490b;
                int i3 = ((ss50) vs50Var).f213489a;
                rs50 rs50Var = ((ss50) vs50Var).f213491c;
                gieVar.f80150c = 1;
                Object objM50708f = m50708f(i3, nw80Var, rs50Var, gieVar);
                yuk yukVar = yuk.f276404a;
                if (objM50708f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "ClickInteraction failed during track row click handling", new Object[0]);
        }
        return it50.f105437b;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0114  */
    /* JADX WARN: Code duplicated, block: B:36:0x0133  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015a, code lost:
    
        if (r3.mo29884a(r4, r5, r6, r7, r13, (96 & 32) != 0 ? p204p.q3g0.f184880a : r9, false, r10) == r12) goto L39;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50710r(int i, nw80 nw80Var, qs50 qs50Var, ibk ibkVar) {
        fie fieVar;
        nw80 nw80Var2;
        int i2;
        qs50 qs50Var2;
        ulo0 ulo0Var;
        bmo0 bmo0Var;
        boolean z;
        ctj ctjVar;
        pv00 pv00Var;
        d850 d850Var;
        bso0 bso0Var;
        ctj ctjVar2;
        pv00 pv00Var2;
        bso0 bso0Var2;
        bmo0 bmo0Var2;
        r3g0 p3g0Var;
        ulo0 ulo0Var2;
        int i3;
        bmo0 bmo0Var3;
        ulo0 ulo0Var3;
        if (ibkVar instanceof fie) {
            fieVar = (fie) ibkVar;
            int i4 = fieVar.f69864Z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fieVar.f69864Z = i4 - Integer.MIN_VALUE;
            } else {
                fieVar = new fie(this, ibkVar);
            }
        } else {
            fieVar = new fie(this, ibkVar);
        }
        fie fieVar2 = fieVar;
        Object objM86755t = fieVar2.f69862X;
        int i5 = fieVar2.f69864Z;
        oge0 oge0Var = this.f102535h;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(objM86755t);
            ou8 ou8Var = this.f102531d.f225727h;
            nw80Var2 = nw80Var;
            fieVar2.f69866b = nw80Var2;
            fieVar2.f69867c = qs50Var;
            i2 = i;
            fieVar2.f69865a = i2;
            fieVar2.f69864Z = 1;
            objM86755t = vyf1.m86755t(ou8Var, fieVar2);
            if (objM86755t != yukVar) {
                qs50Var2 = qs50Var;
            }
            return yukVar;
        }
        if (i5 == 1) {
            int i6 = fieVar2.f69865a;
            qs50Var2 = fieVar2.f69867c;
            nw80 nw80Var3 = fieVar2.f69866b;
            bga.m29073P(objM86755t);
            i2 = i6;
            nw80Var2 = nw80Var3;
        } else {
            if (i5 == 2) {
                z = fieVar2.f69874t;
                int i7 = fieVar2.f69865a;
                ulo0 ulo0Var4 = fieVar2.f69873i;
                ctj ctjVar3 = fieVar2.f69872h;
                pv00 pv00Var3 = fieVar2.f69871g;
                bso0 bso0Var3 = fieVar2.f69870f;
                bmo0Var = fieVar2.f69869e;
                d850 d850Var2 = fieVar2.f69868d;
                bga.m29073P(objM86755t);
                i2 = i7;
                ctjVar = ctjVar3;
                bso0Var = bso0Var3;
                d850Var = d850Var2;
                ulo0Var = ulo0Var4;
                pv00Var = pv00Var3;
                if (((Boolean) objM86755t).booleanValue()) {
                    fieVar2.f69866b = null;
                    fieVar2.f69867c = null;
                    fieVar2.f69868d = d850Var;
                    fieVar2.f69869e = bmo0Var;
                    fieVar2.f69870f = bso0Var;
                    fieVar2.f69871g = pv00Var;
                    fieVar2.f69872h = ctjVar;
                    fieVar2.f69873i = ulo0Var;
                    fieVar2.f69865a = i2;
                    fieVar2.f69874t = z;
                    fieVar2.f69864Z = 3;
                    objM86755t = kk40.m56684z(new cjf0(oge0Var, fbkVar, 1), fieVar2);
                    if (objM86755t != yukVar) {
                        i3 = i2;
                        bmo0Var3 = bmo0Var;
                        ulo0Var3 = ulo0Var;
                        bmo0 bmo0Var4 = bmo0Var3;
                        i2 = i3;
                        bmo0Var2 = bmo0Var4;
                        bso0 bso0Var4 = bso0Var;
                        p3g0Var = new p3g0(((Boolean) objM86755t).booleanValue());
                        ulo0Var2 = ulo0Var3;
                        bso0Var2 = bso0Var4;
                        pv00 pv00Var4 = pv00Var;
                        ctjVar2 = ctjVar;
                        pv00Var2 = pv00Var4;
                        fieVar2.f69866b = null;
                        fieVar2.f69867c = null;
                        fieVar2.f69868d = null;
                        fieVar2.f69869e = null;
                        fieVar2.f69870f = null;
                        fieVar2.f69871g = null;
                        fieVar2.f69872h = null;
                        fieVar2.f69873i = null;
                        fieVar2.f69865a = i2;
                        fieVar2.f69874t = z;
                        fieVar2.f69864Z = 4;
                    }
                } else {
                    pv00 pv00Var5 = pv00Var;
                    ctjVar2 = ctjVar;
                    pv00Var2 = pv00Var5;
                    bso0Var2 = bso0Var;
                    bmo0Var2 = bmo0Var;
                    p3g0Var = q3g0.f184880a;
                    ulo0Var2 = ulo0Var;
                    fieVar2.f69866b = null;
                    fieVar2.f69867c = null;
                    fieVar2.f69868d = null;
                    fieVar2.f69869e = null;
                    fieVar2.f69870f = null;
                    fieVar2.f69871g = null;
                    fieVar2.f69872h = null;
                    fieVar2.f69873i = null;
                    fieVar2.f69865a = i2;
                    fieVar2.f69874t = z;
                    fieVar2.f69864Z = 4;
                }
                return yukVar;
            }
            if (i5 == 3) {
                z = fieVar2.f69874t;
                i3 = fieVar2.f69865a;
                ulo0Var3 = fieVar2.f69873i;
                ctjVar = fieVar2.f69872h;
                pv00Var = fieVar2.f69871g;
                bso0Var = fieVar2.f69870f;
                bmo0Var3 = fieVar2.f69869e;
                d850Var = fieVar2.f69868d;
                bga.m29073P(objM86755t);
                bmo0 bmo0Var5 = bmo0Var3;
                i2 = i3;
                bmo0Var2 = bmo0Var5;
                bso0 bso0Var5 = bso0Var;
                p3g0Var = new p3g0(((Boolean) objM86755t).booleanValue());
                ulo0Var2 = ulo0Var3;
                bso0Var2 = bso0Var5;
                pv00 pv00Var6 = pv00Var;
                ctjVar2 = ctjVar;
                pv00Var2 = pv00Var6;
                fieVar2.f69866b = null;
                fieVar2.f69867c = null;
                fieVar2.f69868d = null;
                fieVar2.f69869e = null;
                fieVar2.f69870f = null;
                fieVar2.f69871g = null;
                fieVar2.f69872h = null;
                fieVar2.f69873i = null;
                fieVar2.f69865a = i2;
                fieVar2.f69874t = z;
                fieVar2.f69864Z = 4;
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
            }
        }
        return w2a1.f247311a;
        boolean zBooleanValue = ((Boolean) objM86755t).booleanValue();
        d850 d850VarM50707e = m50707e(nw80Var2.f159049c, i2, zBooleanValue);
        pv00 pv00Var7 = qs50Var2.f191995a;
        ctj ctjVar4 = qs50Var2.f191996b;
        String str = nw80Var2.f159047a;
        ulo0Var = new ulo0(this.f102532e, nw80Var2.f159049c, str);
        fieVar2.f69866b = null;
        fieVar2.f69867c = null;
        fieVar2.f69868d = d850VarM50707e;
        bmo0 bmo0Var6 = this.f102549v;
        fieVar2.f69869e = bmo0Var6;
        bso0 bso0Var6 = bso0.f30364c;
        fieVar2.f69870f = bso0Var6;
        fieVar2.f69871g = pv00Var7;
        fieVar2.f69872h = ctjVar4;
        fieVar2.f69873i = ulo0Var;
        fieVar2.f69865a = i2;
        fieVar2.f69874t = zBooleanValue;
        fieVar2.f69864Z = 2;
        Object objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), fieVar2);
        if (objM56684z != yukVar) {
            bmo0Var = bmo0Var6;
            z = zBooleanValue;
            objM86755t = objM56684z;
            ctjVar = ctjVar4;
            pv00Var = pv00Var7;
            d850Var = d850VarM50707e;
            bso0Var = bso0Var6;
            if (((Boolean) objM86755t).booleanValue()) {
                fieVar2.f69866b = null;
                fieVar2.f69867c = null;
                fieVar2.f69868d = d850Var;
                fieVar2.f69869e = bmo0Var;
                fieVar2.f69870f = bso0Var;
                fieVar2.f69871g = pv00Var;
                fieVar2.f69872h = ctjVar;
                fieVar2.f69873i = ulo0Var;
                fieVar2.f69865a = i2;
                fieVar2.f69874t = z;
                fieVar2.f69864Z = 3;
                objM86755t = kk40.m56684z(new cjf0(oge0Var, fbkVar, 1), fieVar2);
                if (objM86755t != yukVar) {
                    i3 = i2;
                    bmo0Var3 = bmo0Var;
                    ulo0Var3 = ulo0Var;
                    bmo0 bmo0Var7 = bmo0Var3;
                    i2 = i3;
                    bmo0Var2 = bmo0Var7;
                    bso0 bso0Var7 = bso0Var;
                    p3g0Var = new p3g0(((Boolean) objM86755t).booleanValue());
                    ulo0Var2 = ulo0Var3;
                    bso0Var2 = bso0Var7;
                    pv00 pv00Var8 = pv00Var;
                    ctjVar2 = ctjVar;
                    pv00Var2 = pv00Var8;
                    fieVar2.f69866b = null;
                    fieVar2.f69867c = null;
                    fieVar2.f69868d = null;
                    fieVar2.f69869e = null;
                    fieVar2.f69870f = null;
                    fieVar2.f69871g = null;
                    fieVar2.f69872h = null;
                    fieVar2.f69873i = null;
                    fieVar2.f69865a = i2;
                    fieVar2.f69874t = z;
                    fieVar2.f69864Z = 4;
                }
            } else {
                pv00 pv00Var9 = pv00Var;
                ctjVar2 = ctjVar;
                pv00Var2 = pv00Var9;
                bso0Var2 = bso0Var;
                bmo0Var2 = bmo0Var;
                p3g0Var = q3g0.f184880a;
                ulo0Var2 = ulo0Var;
                fieVar2.f69866b = null;
                fieVar2.f69867c = null;
                fieVar2.f69868d = null;
                fieVar2.f69869e = null;
                fieVar2.f69870f = null;
                fieVar2.f69871g = null;
                fieVar2.f69872h = null;
                fieVar2.f69873i = null;
                fieVar2.f69865a = i2;
                fieVar2.f69874t = z;
                fieVar2.f69864Z = 4;
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[PHI: r10 r12
      0x008e: PHI (r10v2 boolean) = (r10v0 boolean), (r10v0 boolean), (r10v1 boolean), (r10v1 boolean), (r10v17 boolean) binds: [B:19:0x0054, B:20:0x0056, B:25:0x0073, B:30:0x008b, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r12v2 boolean) = (r12v0 boolean), (r12v0 boolean), (r12v1 boolean), (r12v1 boolean), (r12v8 boolean) binds: [B:19:0x0054, B:20:0x0056, B:25:0x0073, B:30:0x008b, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m50711s(boolean z, d850 d850Var, boolean z2, ibk ibkVar) {
        hie hieVar;
        Object objM81504c;
        boolean z3;
        boolean z4;
        boolean z5;
        kuf0 kuf0Var;
        if (ibkVar instanceof hie) {
            hieVar = (hie) ibkVar;
            int i = hieVar.f91802f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hieVar.f91802f = i - Integer.MIN_VALUE;
            } else {
                hieVar = new hie(this, ibkVar);
            }
        } else {
            hieVar = new hie(this, ibkVar);
        }
        Object objM56684z = hieVar.f91800d;
        int i2 = hieVar.f91802f;
        w2a1 w2a1Var = w2a1.f247311a;
        oge0 oge0Var = this.f102535h;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = hieVar.f91798b;
                z = hieVar.f91797a;
                d850Var = hieVar.f91799c;
                bga.m29073P(objM56684z);
                if (((Boolean) objM56684z).booleanValue()) {
                    hieVar.f91799c = null;
                    hieVar.f91797a = z;
                    hieVar.f91798b = z2;
                    hieVar.f91802f = 2;
                    objM81504c = this.f102542o.m81504c(this.f102532e, ltf0.f136771a, d850Var, hieVar);
                    if (objM81504c != yukVar) {
                        objM81504c = w2a1Var;
                    }
                    if (objM81504c != yukVar) {
                        hieVar.f91799c = null;
                        hieVar.f91797a = z;
                        hieVar.f91798b = z2;
                        hieVar.f91802f = 3;
                        objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), hieVar);
                        if (objM56684z != yukVar) {
                            z3 = z2;
                        }
                    }
                } else {
                    hieVar.f91799c = null;
                    hieVar.f91797a = z;
                    hieVar.f91798b = z2;
                    hieVar.f91802f = 3;
                    objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), hieVar);
                    if (objM56684z != yukVar) {
                        z3 = z2;
                    }
                }
                return yukVar;
            }
            if (i2 == 2) {
                boolean z6 = hieVar.f91798b;
                boolean z7 = hieVar.f91797a;
                bga.m29073P(objM56684z);
                z2 = z6;
                z = z7;
                hieVar.f91799c = null;
                hieVar.f91797a = z;
                hieVar.f91798b = z2;
                hieVar.f91802f = 3;
                objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), hieVar);
                if (objM56684z != yukVar) {
                    z3 = z2;
                }
                return yukVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = hieVar.f91798b;
            bga.m29073P(objM56684z);
            if (((Boolean) objM56684z).booleanValue() && z3) {
                if (this.f102528a.f141817b.current().getValue() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                api apiVarM77296c = ((s5p) this.f102537j).m77296c();
                z5 = apiVarM77296c != null ? !apiVarM77296c.mo26697m() : false;
                kuf0Var = this.f102548u;
                if (z4) {
                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                    return w2a1Var;
                }
                if (z5) {
                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                }
            }
            return w2a1Var;
        }
        bga.m29073P(objM56684z);
        if (z && z2) {
            hieVar.f91799c = d850Var;
            hieVar.f91797a = z;
            hieVar.f91798b = z2;
            hieVar.f91802f = 1;
            objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 1), hieVar);
            if (objM56684z != yukVar) {
                if (((Boolean) objM56684z).booleanValue()) {
                    hieVar.f91799c = null;
                    hieVar.f91797a = z;
                    hieVar.f91798b = z2;
                    hieVar.f91802f = 2;
                    objM81504c = this.f102542o.m81504c(this.f102532e, ltf0.f136771a, d850Var, hieVar);
                    if (objM81504c != yukVar) {
                        objM81504c = w2a1Var;
                    }
                    if (objM81504c != yukVar) {
                        hieVar.f91799c = null;
                        hieVar.f91797a = z;
                        hieVar.f91798b = z2;
                        hieVar.f91802f = 3;
                        objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), hieVar);
                        if (objM56684z != yukVar) {
                            z3 = z2;
                            if (((Boolean) objM56684z).booleanValue()) {
                                if (this.f102528a.f141817b.current().getValue() != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                api apiVarM77296c2 = ((s5p) this.f102537j).m77296c();
                                if (apiVarM77296c2 != null) {
                                }
                                kuf0Var = this.f102548u;
                                if (z4) {
                                    kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                    return w2a1Var;
                                }
                                if (z5) {
                                    kuf0.m57390a(kuf0Var, huf0.f95398a);
                                }
                            }
                            return w2a1Var;
                        }
                    }
                } else {
                    hieVar.f91799c = null;
                    hieVar.f91797a = z;
                    hieVar.f91798b = z2;
                    hieVar.f91802f = 3;
                    objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), hieVar);
                    if (objM56684z != yukVar) {
                        z3 = z2;
                        if (((Boolean) objM56684z).booleanValue()) {
                            if (this.f102528a.f141817b.current().getValue() != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            api apiVarM77296c3 = ((s5p) this.f102537j).m77296c();
                            if (apiVarM77296c3 != null) {
                            }
                            kuf0Var = this.f102548u;
                            if (z4) {
                                kuf0.m57390a(kuf0Var, iuf0.f105960a);
                                return w2a1Var;
                            }
                            if (z5) {
                                kuf0.m57390a(kuf0Var, huf0.f95398a);
                            }
                        }
                        return w2a1Var;
                    }
                }
            }
        } else {
            hieVar.f91799c = null;
            hieVar.f91797a = z;
            hieVar.f91798b = z2;
            hieVar.f91802f = 3;
            objM56684z = kk40.m56684z(new cjf0(oge0Var, fbkVar, 0), hieVar);
            if (objM56684z != yukVar) {
                z3 = z2;
                if (((Boolean) objM56684z).booleanValue()) {
                    if (this.f102528a.f141817b.current().getValue() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    api apiVarM77296c4 = ((s5p) this.f102537j).m77296c();
                    if (apiVarM77296c4 != null) {
                    }
                    kuf0Var = this.f102548u;
                    if (z4) {
                        kuf0.m57390a(kuf0Var, iuf0.f105960a);
                        return w2a1Var;
                    }
                    if (z5) {
                        kuf0.m57390a(kuf0Var, huf0.f95398a);
                    }
                }
                return w2a1Var;
            }
        }
        return yukVar;
    }
}

package p204p;

import android.os.Bundle;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w1h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f247102a;

    /* JADX INFO: renamed from: a */
    public static final void m86996a(gh00 gh00Var, q6u q6uVar, fxh0 fxh0Var, idx idxVar, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(703847966);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(q6uVar) : xq00Var.m91770i(q6uVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? xq00Var.m91766g(idxVar) : xq00Var.m91770i(idxVar) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var, 0.0f, 0.0f, 0.0f, 16, 7);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (idxVar == null) {
                xq00Var.m91771i0(-1043211393);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1043211392);
                tzy tzyVar = idxVar.f101270a;
                boolean z = ((i3 & 14) == 4) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i3 & 64) != 0 && xq00Var.m91770i(q6uVar)));
                Object objM91750T = xq00Var.m91750T();
                if (z || objM91750T == t6x0.f217647t) {
                    objM91750T = new tsv(25, q6uVar, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                bjf1.m29395c(tzyVar, (gh00) objM91750T, null, null, xq00Var, 0);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new chr(gh00Var, q6uVar, fxh0Var2, idxVar, i, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m86997b(int i, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-1292938464);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(fxh0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.default_cta_text, xq00Var2);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, fxh0Var);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new jj60(12, gh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM61822f, false, null, null, null, (eh00) objM91750T, 15);
            boolean zM91766g = xq00Var2.m91766g(strM54977L);
            Object objM91750T2 = xq00Var2.m91750T();
            if (zM91766g || objM91750T2 == ia7Var) {
                objM91750T2 = new zz70(strM54977L, 0);
                xq00Var2.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM96643a = zoz0.m96643a(fxh0VarM47247x, (gh00) objM91750T2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96643a);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            ahf1.m25932d(strM54977L, null, leu.m58818d(xq00Var2).f64975k, 0L, null, null, 0, false, null, 0, null, xq00Var2, 0, 0, 2042);
            y85.m93057b(cqu.f40993c, new rgj(strM54977L), mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0.f43038a), 0L, 0L, false, xq00Var, cqu.f40994d, 56);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i02(fxh0Var, gh00Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m86998c(String str, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1640937801);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            String strM54977L = k0e1.m54977L(R.string.chat_delete_received_request_delete_action, xq00Var);
            String strM54977L2 = k0e1.m54977L(android.R.string.cancel, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.TRUE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | ((i2 & 896) == 256);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new puj0(eh00Var2, kqi0Var, 7);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var3 = (eh00) objM91750T2;
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var.m91771i0(140172629);
                String strM54977L3 = k0e1.m54977L(R.string.chat_delete_received_request_title, xq00Var);
                String strM54978M = k0e1.m54978M(R.string.chat_delete_received_request_subtitle, new Object[]{str}, xq00Var);
                if (wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                gku gkuVar = new gku(strM54977L, new peu(new t40(strM54977L), eh00Var));
                if (wl51.m88460J0(strM54977L2)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                kku.m56741a(eh00Var3, null, null, strM54977L3, strM54978M, gkuVar, new gku(strM54977L2, new peu(new t40(strM54977L2), eh00Var3)), xq00Var, 2359296, 6);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(140716555);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2331ra(i, 6, str, eh00Var, eh00Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m86999d(hfo0 hfo0Var, gh00 gh00Var, boolean z, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1929114116);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(hfo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            qiu.m72881g(hfo0Var.f90766b == 1 ? 8 : 4, rkk.m75772x(-1465969233, new wo0(hfo0Var, z, gh00Var, 24), xq00Var), xq00Var, 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tbj0(hfo0Var, gh00Var, z, i, 7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Map m87000e(Bundle bundle) {
        String string;
        String str;
        if (bundle != null && (string = bundle.toString()) != null) {
            Matcher matcher = Pattern.compile("Bundle\\[\\{(.*?)\\}\\]").matcher(string);
            r2d0 r2d0Var = !matcher.matches() ? null : new r2d0(matcher, string);
            if (r2d0Var != null && (str = (String) g6f.m43687A0(r2d0Var.m74520a())) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = wl51.m88477a1(str, new String[]{", "}, 0, 6).iterator();
                while (it.hasNext()) {
                    List listM88477a1 = wl51.m88477a1((String) it.next(), new String[]{"="}, 0, 6);
                    if (listM88477a1.size() == 2) {
                        linkedHashMap.put(listM88477a1.get(0), listM88477a1.get(1));
                    }
                }
                return linkedHashMap;
            }
        }
        return nau.f152117a;
    }

    /* JADX INFO: renamed from: f */
    public static String m87001f(int i) {
        if (i < 1000 || i >= 5000) {
            return s571.m77246e(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return edb.m38563l("Code ", i, " is reserved and may not be used.");
    }

    /* JADX INFO: renamed from: g */
    public static int m87002g(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static final HashSet m87003h(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setMo25811e = ((bfe0) it.next()).mo25811e();
            if (setMo25811e == null) {
                return null;
            }
            j6f.m52564V(setMo25811e, hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: i */
    public static final up60 m87004i(ktz0 ktz0Var) {
        if (ktz0Var instanceof uzj) {
            return ((uzj) ktz0Var).f235597b;
        }
        if (ktz0Var instanceof ltz0) {
            return m87004i(((ltz0) ktz0Var).f136935a);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final ktz0 m87005j(i82 i82Var, ktz0 ktz0Var) {
        rr60 rr60VarM49921m;
        up60 up60VarM87004i = m87004i(ktz0Var);
        if (up60VarM87004i == null || (rr60VarM49921m = i82Var.m49921m(lau.f131415a, up60VarM87004i)) == null) {
            return null;
        }
        return rr60VarM49921m.getDescriptor();
    }

    /* JADX INFO: renamed from: k */
    public static final t050 m87006k(z8k z8kVar, djk0 djk0Var, djk0 djk0Var2, kjk0 kjk0Var, kjk0 kjk0Var2, kjk0 kjk0Var3, kjk0 kjk0Var4, gjk0 gjk0Var, kjk0 kjk0Var5, ljk0 ljk0Var, kjk0 kjk0Var6, kjk0 kjk0Var7, kjk0 kjk0Var8, gjk0 gjk0Var2, kjk0 kjk0Var9) {
        return ((b9k) z8kVar).m28489g("ListeningPartyEventCoordinationDaemon", new cjk0(djk0Var, djk0Var2, kjk0Var, kjk0Var2, kjk0Var3, kjk0Var4, gjk0Var, kjk0Var5, ljk0Var, kjk0Var6, kjk0Var7, kjk0Var8, gjk0Var2, kjk0Var9, 1));
    }

    /* JADX INFO: renamed from: l */
    public static void m87007l(lpa lpaVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = lpaVar.f135709e;
            int i2 = lpaVar.f135710f;
            int i3 = lpaVar.f135711g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = lpaVar.f135708d;
            npa npaVar = lpaVar.f135705a;
            wj50.m88279p(npaVar);
            if (j2 == npaVar.f156904b) {
                throw new IllegalStateException("no more bytes");
            }
            j = lpaVar.f135708d;
        } while (lpaVar.m59651c(j == -1 ? 0L : j + ((long) (lpaVar.f135711g - lpaVar.f135710f))) != -1);
    }

    /* JADX INFO: renamed from: m */
    public static final long m87008m(pu71 pu71Var) {
        if (pu71Var instanceof mu71) {
            return ((mu71) pu71Var).f147265a;
        }
        if (pu71Var instanceof nu71) {
            return ((nu71) pu71Var).f158526a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static final Object m87009n(p7v p7vVar, boolean z, fbk fbkVar) {
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (z) {
            Object objM93008c = ((y7v) p7vVar).m93008c(fbkVar);
            return objM93008c == yukVar ? objM93008c : w2a1Var;
        }
        Object objM93013h = ((y7v) p7vVar).m93013h(fbkVar);
        return objM93013h == yukVar ? objM93013h : w2a1Var;
    }

    /* JADX INFO: renamed from: o */
    public static void m87010o(int i) {
        String strM87001f = m87001f(i);
        if (strM87001f != null) {
            throw new IllegalArgumentException(strM87001f.toString());
        }
    }
}

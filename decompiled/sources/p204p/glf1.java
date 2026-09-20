package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.music.R;
import com.spotify.playbacknative.AudioDriver;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class glf1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f81089a;

    /* JADX INFO: renamed from: b */
    public static sd40 f81090b;

    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x0113  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m45131a(fyf fyfVar, fyf fyfVar2, svy0 svy0Var, gh00 gh00Var, fxh0 fxh0Var, boolean z, xq00 xq00Var, int i, int i2) {
        int i3;
        svy0 svy0Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        pgv0 pgv0VarM91796v;
        boolean z5;
        aaf aafVarM87496a;
        boolean z6;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        boolean z7;
        Object objM91750T;
        xq00Var.m91775k0(-472519229);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fyfVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            svy0Var2 = svy0Var;
            i3 |= xq00Var.m91770i(svy0Var2) ? 256 : 128;
        } else {
            svy0Var2 = svy0Var;
        }
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i3 |= xq00Var.m91768h(z2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                fxh0 fxh0VarM61819c = mi21.m61819c(1.0f, fxh0Var);
                aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                z6 = z5;
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61819c);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (xq00Var.f264811a != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                fyfVar.invoke(xq00Var, Integer.valueOf(i3 & 14));
                if (z6) {
                    xq00Var.m91771i0(-1087741296);
                    if ((i3 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objM91750T = xq00Var.m91750T();
                    if (z7 || objM91750T == t6x0.f217647t) {
                        objM91750T = new ue9(19, gh00Var);
                        xq00Var.m91793t0(objM91750T);
                    }
                    mif1.m61869b(svy0Var2, new nvy0((gh00) objM91750T), mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 8)), null, xq00Var, (i3 >> 6) & 14, 8);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-1087029195);
                    xq00Var.m91788r(false);
                }
                fyfVar2.mo24510D0(daf.f47039a, xq00Var, Integer.valueOf((i3 & ContentType.LONG_FORM_ON_DEMAND) | 6));
                xq00Var.m91788r(true);
                z4 = z6;
            } else {
                xq00Var.m91757b0();
                z4 = z2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new gz4(fyfVar, fyfVar2, svy0Var, gh00Var, fxh0Var, z4, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            fxh0 fxh0VarM61819c2 = mi21.m61819c(1.0f, fxh0Var);
            aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            z6 = z5;
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61819c2);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (xq00Var.f264811a != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fyfVar.invoke(xq00Var, Integer.valueOf(i3 & 14));
            if (z6) {
                xq00Var.m91771i0(-1087741296);
                if ((i3 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objM91750T = xq00Var.m91750T();
                if (z7) {
                    objM91750T = new ue9(19, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = new ue9(19, gh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                mif1.m61869b(svy0Var2, new nvy0((gh00) objM91750T), mi21.m61822f(1.0f, zsf1.m96832C(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 8)), null, xq00Var, (i3 >> 6) & 14, 8);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1087029195);
                xq00Var.m91788r(false);
            }
            fyfVar2.mo24510D0(daf.f47039a, xq00Var, Integer.valueOf((i3 & ContentType.LONG_FORM_ON_DEMAND) | 6));
            xq00Var.m91788r(true);
            z4 = z6;
        } else {
            xq00Var.m91757b0();
            z4 = z2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gz4(fyfVar, fyfVar2, svy0Var, gh00Var, fxh0Var, z4, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m45132b(String str, eh00 eh00Var, it9 it9Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1091039601);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(it9Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 48);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
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
            Object objM91750T = xq00Var2.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = new y3m(((x5m) it9Var.f105467b).mo28301c());
                xq00Var2.m91793t0(objM91750T);
            }
            y3m y3mVar = (y3m) objM91750T;
            Set set = dd41.f47702f;
            String strM35694A = r46.m74726U(str).m35694A();
            if (strM35694A == null) {
                strM35694A = str;
            }
            String strM54977L = k0e1.m54977L(R.string.action_save_content_description, xq00Var2);
            boolean z = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T2 = xq00Var2.m91750T();
            if (z || objM91750T2 == ia7Var) {
                objM91750T2 = new rzt0(21, eh00Var);
                xq00Var2.m91793t0(objM91750T2);
            }
            mif1.m61869b(y3mVar, new v3m(strM35694A, str, (u3m) null, (p3m) null, strM54977L, (eh00) objM91750T2, 44), null, null, xq00Var2, 8, 12);
            ahf1.m25932d(k0e1.m54977L(R.string.action_save_label, xq00Var2), null, leu.m58818d(xq00Var2).f64971g, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zmu0(str, eh00Var, it9Var, fxh0Var2, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x001d  */
    /* JADX INFO: renamed from: c */
    public static final s7y m45133c(gmr0 gmr0Var, String str) {
        String str2;
        String str3;
        if (gmr0Var == null || (str2 = gmr0Var.f81450a) == null) {
            str2 = str;
        }
        if (gmr0Var != null && (str3 = gmr0Var.f81451b) != null) {
            if (wl51.m88460J0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                str = str3;
            } else if (gmr0Var != null) {
                str = gmr0Var.f81450a;
            }
        } else if (gmr0Var != null) {
            str = gmr0Var.f81450a;
        }
        return new s7y(str2, str, gmr0Var != null ? gmr0Var.f81455f : null);
    }

    /* JADX INFO: renamed from: d */
    public static final uwt m45134d(ywt ywtVar, gh00 gh00Var) {
        return new uwt(new C1814eh(ywtVar, gh00Var));
    }

    /* JADX INFO: renamed from: e */
    public static final kyu m45135e(xq00 xq00Var) {
        float f = 0;
        return new kyu(0, null, 0, new j4m0(f, f, f, f), null, new jyu(f, leu.m58816b(xq00Var).f117230b.f224762e, leu.m58816b(xq00Var).f117230b.f224761d), null, 0, null, 471);
    }

    /* JADX INFO: renamed from: f */
    public static final ecm m45136f(cut cutVar, gh00 gh00Var) {
        return new ecm(cutVar, gh00Var);
    }

    /* JADX INFO: renamed from: g */
    public static final fcm m45137g(cfo cfoVar, gh00 gh00Var) {
        return new fcm(cfoVar, gh00Var);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m45138h(Set set) {
        String strM45139i = m45139i(set);
        return !(strM45139i == null || strM45139i.length() == 0);
    }

    /* JADX INFO: renamed from: i */
    public static final String m45139i(Set set) {
        Object next;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((nt80) next) instanceof kt80));
        kt80 kt80Var = next instanceof kt80 ? (kt80) next : null;
        if (kt80Var != null) {
            return kt80Var.f126182a;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final av91 m45140j(g5r0 g5r0Var, fv41 fv41Var, c3x c3xVar) {
        String str = fv41Var.f73650b;
        if ((c3xVar instanceof nsw) || (c3xVar instanceof fvw)) {
            return g5r0Var.mo37547a(str);
        }
        if ((c3xVar instanceof qsw) || c3xVar.equals(gvw.f84847a)) {
            return g5r0Var.mo37550g();
        }
        if (c3xVar instanceof ptw) {
            return g5r0Var.mo37549f().mo55947a(str);
        }
        if (!(c3xVar instanceof s1x)) {
            if (c3xVar instanceof esw) {
                return g5r0Var.mo37548b().mo29290a(fv41Var.f73653e);
            }
            return null;
        }
        if (fv41Var.f73654f) {
            return g5r0Var.mo37547a(str);
        }
        obg0 obg0Var = ((e1c1) g5r0Var).f55177a;
        yt91 yt91VarM96903c = obg0Var.f163644c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("video_frame", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), zt91VarM94607a, obg0Var.f163643b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public static final mmh0 m45141k(Object obj, Update update, Connectable connectable, th00 th00Var, gh00 gh00Var) {
        return alf1.m26337t(obj, update, connectable, th00Var, gh00Var);
    }

    /* JADX INFO: renamed from: l */
    public static final mmh0 m45142l(c7x c7xVar, lpc lpcVar, Connectable connectable, z23 z23Var, k0w k0wVar) {
        return alf1.m26338u(c7xVar, lpcVar, connectable, z23Var, k0wVar);
    }

    /* JADX INFO: renamed from: m */
    public static mmh0 m45143m(gh00 gh00Var, Update update, C1044a c1044a, th00 th00Var) {
        return new mmh0(gh00Var, new dmh0(update, 0), c1044a, th00Var, new qsp());
    }

    /* JADX INFO: renamed from: n */
    public static final fxh0 m45144n(fxh0 fxh0Var, gh00 gh00Var) {
        return fxh0Var.mo34315F(new idl0(gh00Var));
    }

    /* JADX INFO: renamed from: o */
    public static Next m45145o(yuf0 yuf0Var, unf0 unf0Var) {
        return Next.m15607i(yuf0.m94655c(yuf0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, onl0.f167287a, null, null, null, null, null, false, null, null, null, null, null, -1073741825, AudioDriver.SPOTIFY_MAX_VOLUME), Collections.singleton(new ylf0(unf0Var.f232162a, false)));
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m45146p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

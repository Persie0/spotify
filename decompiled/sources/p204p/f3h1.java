package p204p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Color;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f3h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f65505a;

    /* JADX INFO: renamed from: a */
    public static final void m40676a(int i, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-1854833411);
        int i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = m24.f139211i;
                xq00Var.m91793t0(objM91750T);
            }
            m6d0 m6d0Var = (m6d0) objM91750T;
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
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
            zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            rbz.m75196n(6, fyfVar, xq00Var, true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cr3(fxh0Var, fyfVar, i, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:12:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m40677b(p204p.el2 r6, java.lang.String r7, p204p.ibk r8) {
        /*
            boolean r0 = r8 instanceof p204p.tm2
            if (r0 == 0) goto L13
            r0 = r8
            p.tm2 r0 = (p204p.tm2) r0
            int r1 = r0.f221576e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221576e = r1
            goto L18
        L13:
            p.tm2 r0 = new p.tm2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f221575d
            int r1 = r0.f221576e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.util.List r6 = r0.f221574c
            java.lang.String r7 = r0.f221573b
            p.el2 r1 = r0.f221572a
            p204p.bga.m29073P(r8)
            r5 = r0
            r0 = r6
            r6 = r1
        L2e:
            r1 = r5
            goto L54
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.util.ArrayList r8 = p204p.yds.m93485o(r8)
            r1 = r3
        L3d:
            r0.f221572a = r6
            r0.f221573b = r7
            r0.f221574c = r8
            r0.f221576e = r2
            p.pl2 r6 = (p204p.pl2) r6
            java.lang.Object r1 = r6.m70243d(r7, r1, r0)
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 != r4) goto L50
            return r4
        L50:
            r5 = r0
            r0 = r8
            r8 = r1
            goto L2e
        L54:
            p.em2 r8 = (p204p.em2) r8
            r0.add(r8)
            java.lang.String r8 = r8.f60797b
            if (r8 == 0) goto L64
            boolean r4 = p204p.wl51.m88460J0(r8)
            if (r4 != 0) goto L64
            goto L65
        L64:
            r8 = r3
        L65:
            if (r8 != 0) goto L68
            return r0
        L68:
            r5 = r1
            r1 = r8
            r8 = r0
            r0 = r5
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.f3h1.m40677b(p.el2, java.lang.String, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m40678c(Map map) {
        CharSequence charSequence = (CharSequence) map.get("madeFor.username");
        return !(charSequence == null || charSequence.length() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX INFO: renamed from: d */
    public static final lm2 m40679d(ArrayList arrayList) {
        r891 r891Var;
        km2 km2Var;
        int i;
        Iterator it = arrayList.iterator();
        do {
            r891Var = null;
            if (!it.hasNext()) {
                km2Var = null;
                break;
            }
            km2Var = ((cl2) it.next()).f39153a;
        } while (km2Var == null);
        if (km2Var != null) {
            String str = km2Var.f124032a;
            String str2 = !wl51.m88460J0(str) ? str : null;
            if (str2 != null) {
                String str3 = km2Var.f124033b;
                String str4 = (str3 == null || wl51.m88460J0(str3)) ? null : str3;
                Long l = km2Var.f124034c;
                String str5 = km2Var.f124035d;
                if (str5 != null) {
                    int iHashCode = str5.hashCode();
                    if (iHashCode != 324393423) {
                        if (iHashCode != 1795426889) {
                            if (iHashCode == 2041810981 && str5.equals("TRANSITION_MODE_UNSPECIFIED")) {
                                r891Var = r891.f196741a;
                            }
                        } else if (str5.equals("TRANSITION_MODE_SEAMLESS")) {
                            r891Var = r891.f196743c;
                        }
                    } else if (str5.equals("TRANSITION_MODE_INSTANT")) {
                        r891Var = r891.f196742b;
                    }
                }
                r891 r891Var2 = r891Var;
                List list = km2Var.f124036e;
                String str6 = km2Var.f124037f;
                if (str6 == null) {
                    i = 0;
                } else {
                    int iHashCode2 = str6.hashCode();
                    if (iHashCode2 != -739603623) {
                        if (iHashCode2 != -738078943) {
                            if (iHashCode2 == 668878485 && str6.equals("SHUFFLE_MODE_ON")) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                        } else if (str6.equals("SHUFFLE_MODE_UNSPECIFIED")) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else if (str6.equals("SHUFFLE_MODE_OFF")) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                }
                return new lm2(str2, str4, l, r891Var2, list, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final auw0 m40680e(auw0 auw0Var) {
        auw0Var.getClass();
        return auw0Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m40681f(plp plpVar, Class cls, qy8 qy8Var, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, th00 th00Var) {
        plpVar.getClass();
        if (qy8Var instanceof cut) {
            plpVar.m70267v(cls, (cut) qy8Var, gh00Var, gh00Var2, gh00Var3, false, th00Var);
        } else if (qy8Var instanceof cfo) {
            plpVar.m70266u(cls, (cfo) qy8Var, gh00Var, gh00Var2, gh00Var3, th00Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m40682g(plp plpVar, Class cls, eh00 eh00Var, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, th00 th00Var) {
        uep uepVar = plpVar.f178767b;
        uepVar.getClass();
        uepVar.m82910u(cls, new lqk(eh00Var, new dxl(18, cls, gh00Var), cls), gh00Var, gh00Var2, gh00Var3, false, th00Var);
    }

    /* JADX INFO: renamed from: h */
    public static final int m40683h(long j, gze1 gze1Var, String str) {
        if (str != null && str.length() != 0) {
            gze1Var = gze1.m46197n(str);
        }
        gce gceVar = gce.DAYS;
        jba0 jba0VarM52885y6 = jba0.m52885y6(gze1Var);
        z050 z050VarM95037m6 = z050.m95037m6(0, j);
        z050VarM95037m6.getClass();
        jba0 jba0Var = pze1.m71734n6(z050VarM95037m6, gze1Var).f183683d.f131611d;
        gceVar.getClass();
        return (int) jba0VarM52885y6.mo27576m(jba0Var, gceVar);
    }

    /* JADX INFO: renamed from: i */
    public static void m40684i() {
        whx whxVar = whx.f251456b;
    }

    /* JADX INFO: renamed from: j */
    public static final String m40685j(int i, String str, Context context, boolean z) {
        if (z) {
            String string = context.getString(R.string.released_on_release_date, str);
            wj50.m88279p(string);
            return string;
        }
        if (14 <= i && i <= Integer.MAX_VALUE) {
            return context.getString(R.string.upcoming_release_release_date, str);
        }
        if (2 <= i && i < 14) {
            return context.getResources().getQuantityString(R.plurals.days_left_until_release_date, i, Integer.valueOf(i));
        }
        if (i == 1) {
            return context.getString(R.string.releases_tomorrow);
        }
        return i == 0 ? context.getString(R.string.releases_today) : "";
    }

    /* JADX INFO: renamed from: k */
    public static Throwable m40686k(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final fxh0 m40687l(int i, fxh0 fxh0Var, String str) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return m40688m(fxh0Var, h6f.m46715L(new n6f(rfg1.m75434d(4294937375L)), new n6f(rfg1.m75434d(4294920244L)), new n6f(rfg1.m75434d(4281149695L))));
        }
        if (iM38547C == 1) {
            if (str != null && !wl51.m88460J0(str)) {
                gfp gfpVar = leu.f132721a;
                return m40688m(fxh0Var, h6f.m46715L(new n6f(((diu) iiu.f102631a.f258037b).f49477b), new n6f(rfg1.m75432b(Color.parseColor(str)))));
            }
            gfp gfpVar2 = leu.f132721a;
            x4b x4bVar = iiu.f102631a;
            return m40688m(fxh0Var, h6f.m46715L(new n6f(((diu) x4bVar.f258037b).f49477b), new n6f(((diu) x4bVar.f258037b).f49477b)));
        }
        if (iM38547C != 2) {
            if (iM38547C == 3) {
                return fxh0Var;
            }
            throw new NoWhenBranchMatchedException();
        }
        n6f n6fVar = new n6f(rfg1.m75434d(4294417362L));
        n6f n6fVar2 = new n6f(rfg1.m75434d(4294908607L));
        n6f n6fVar3 = new n6f(rfg1.m75434d(4293401344L));
        gfp gfpVar3 = leu.f132721a;
        return m40688m(fxh0Var, h6f.m46715L(n6fVar, n6fVar2, n6fVar3, new n6f(((diu) iiu.f102631a.f258037b).f49476a)));
    }

    /* JADX INFO: renamed from: m */
    public static final fxh0 m40688m(fxh0 fxh0Var, List list) {
        return mwg1.m63031k(fxh0Var, (float) 1.5d, new xk80(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), list, null), hmx0.m47993b(32));
    }

    /* JADX INFO: renamed from: n */
    public static final t050 m40689n(z8k z8kVar, mjk0 mjk0Var, l02 l02Var, mjk0 mjk0Var2, mjk0 mjk0Var3, mjk0 mjk0Var4, mjk0 mjk0Var5) {
        return ((b9k) z8kVar).m28489g("MusicBranchLoginDaemon", new jq9(mjk0Var, l02Var, mjk0Var2, mjk0Var3, mjk0Var4, mjk0Var5, 15));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa A[PHI: r3
      0x00fa: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v7 java.lang.String) binds: [B:70:0x00e6, B:78:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: o */
    public static qno0 m40690o(nno0 nno0Var, dno0 dno0Var) {
        String str;
        mmo0 mmo0Var;
        pp91 qzlVar;
        String str2;
        pq10 pq10Var;
        jq10 jq10Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        rno0 rno0Var = dno0Var.f50862a;
        s8k s8kVar = dno0Var.f50863b;
        zbr zbrVar = dno0Var.f50864c;
        String str8 = nno0Var.f156459a;
        if (rno0Var == null || (str7 = rno0Var.f200949a) == null) {
            str = str8;
        } else {
            if (str7.length() <= 0) {
                str7 = null;
            }
            if (str7 == null) {
                str = str8;
            } else {
                str = str7;
            }
        }
        String str9 = rno0Var != null ? rno0Var.f200953e : null;
        String str10 = rno0Var != null ? rno0Var.f200951c : null;
        String str11 = rno0Var != null ? rno0Var.f200955g : null;
        if (rno0Var != null) {
            mk8 mk8Var = rno0Var.f200958j;
            if (mk8Var instanceof fk8) {
                mmo0Var = new mmo0(1, ((fk8) mk8Var).f70496a, 4, null);
            } else if (mk8Var instanceof dk8) {
                mmo0Var = new mmo0(2, null, 2, ((dk8) mk8Var).f49922a);
            } else {
                if (!(mk8Var instanceof gk8)) {
                    throw new NoWhenBranchMatchedException();
                }
                mmo0Var = null;
            }
        } else {
            mmo0Var = null;
        }
        if (rno0Var != null) {
            vzl vzlVar = rno0Var.f200957i;
            if (vzlVar instanceof uzl) {
                qzlVar = new tzl(((uzl) vzlVar).f235605a);
            } else if (vzlVar instanceof rzl) {
                rzl rzlVar = (rzl) vzlVar;
                String str12 = rzlVar.f204162a;
                qzlVar = new qzl(str12.length() == 0 ? en80.f61094b : new fn80(str12), m40691p(rzlVar.f204164c), m40691p(rzlVar.f204163b));
            } else {
                if (!(vzlVar instanceof szl)) {
                    throw new NoWhenBranchMatchedException();
                }
                qzlVar = null;
            }
        } else {
            qzlVar = null;
        }
        n6f n6fVarM40691p = (rno0Var == null || (str6 = rno0Var.f200950b) == null) ? null : m40691p(str6);
        n6f n6fVarM40691p2 = (rno0Var == null || (str5 = rno0Var.f200952d) == null) ? null : m40691p(str5);
        n6f n6fVarM40691p3 = (rno0Var == null || (str4 = rno0Var.f200954f) == null) ? null : m40691p(str4);
        boolean zM58235s = l5h1.m58235s(s8kVar, str8);
        boolean zM58234r = l5h1.m58234r(s8kVar, str8);
        String str13 = nno0Var.f156461c;
        if (str13 != null) {
            str2 = str13;
        } else {
            if (rno0Var == null || (str13 = rno0Var.f200956h) == null || str13.length() <= 0) {
                str13 = null;
            }
            if (str13 == null) {
                str2 = str8;
            } else {
                str2 = str13;
            }
        }
        String str14 = (rno0Var == null || (str3 = rno0Var.f200959k) == null || wl51.m88460J0(str3)) ? null : str3;
        if (rno0Var == null || (jq10Var = rno0Var.f200960l) == null) {
            pq10Var = null;
        } else {
            ArrayList<br10> arrayList = jq10Var.f114764a;
            ArrayList arrayList2 = new ArrayList();
            for (br10 br10Var : arrayList) {
                n6f n6fVarM40691p4 = m40691p(br10Var.f29934a);
                nq10 nq10Var = n6fVarM40691p4 != null ? new nq10(n6fVarM40691p4.f150873a, br10Var.f29935b) : null;
                if (nq10Var != null) {
                    arrayList2.add(nq10Var);
                }
            }
            pq10Var = !arrayList2.isEmpty() ? new pq10(arrayList2) : null;
        }
        return new qno0(str, str9, str11, mmo0Var, qzlVar, zM58235s, zM58234r, str2, nno0Var.f156459a, str14, str10, n6fVarM40691p2, n6fVarM40691p, n6fVarM40691p3, str11, zbrVar != null && zbrVar.f281388d, pq10Var);
    }

    /* JADX INFO: renamed from: p */
    public static n6f m40691p(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            if (kk40.m56652N(str)) {
                str = "#".concat(kk40.m56656R(wl51.m88469S0(str, "#")));
            }
            return new n6f(rfg1.m75432b(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static AppWidgetManager m40692q(Context context) {
        return AppWidgetManager.getInstance(context);
    }

    /* JADX INFO: renamed from: r */
    public static final String m40693r(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!wl51.m88460J0((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return (String) g6f.m43741q0(arrayList);
        }
        Object objM43741q0 = g6f.m43741q0(arrayList);
        Iterator it = arrayList.subList(1, arrayList.size()).iterator();
        while (it.hasNext()) {
            objM43741q0 = objM43741q0 + " • " + wl51.m88491o1((String) it.next()).toString();
        }
        return (String) objM43741q0;
    }

    /* JADX INFO: renamed from: s */
    public static lmo0 m40694s(mmo0 mmo0Var, boolean z) {
        if (mmo0Var == null) {
            return new kmo0(n6f.f150863c);
        }
        int iM38547C = edb.m38547C(mmo0Var.f145191a);
        if (iM38547C == 0) {
            String str = mmo0Var.f145192b;
            return str != null ? new imo0(str) : new kmo0(n6f.f150863c);
        }
        if (iM38547C != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = mmo0Var.f145193c;
        return str2 != null ? new jmo0(str2, z) : new kmo0(n6f.f150863c);
    }

    /* JADX INFO: renamed from: t */
    public static Object[] m40695t(Object[] objArr) {
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }
}

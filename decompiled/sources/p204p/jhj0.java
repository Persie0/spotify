package p204p;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jhj0 implements tty {

    /* JADX INFO: renamed from: a */
    public final String f112489a;

    /* JADX INFO: renamed from: b */
    public final ivl0 f112490b;

    /* JADX INFO: renamed from: c */
    public final fr70 f112491c;

    /* JADX INFO: renamed from: d */
    public final wg61 f112492d;

    /* JADX INFO: renamed from: e */
    public final fr70 f112493e;

    /* JADX INFO: renamed from: f */
    public final r0j f112494f;

    public jhj0(String str, ivl0 ivl0Var, wg61 wg61Var, wg61 wg61Var2, wg61 wg61Var3, r0j r0jVar) {
        this.f112489a = str;
        this.f112490b = ivl0Var;
        this.f112491c = wg61Var;
        this.f112492d = wg61Var2;
        this.f112493e = wg61Var3;
        this.f112494f = r0jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m53399b(jhj0 jhj0Var, xu31 xu31Var, ibk ibkVar) {
        ghj0 ghj0Var;
        npa npaVar;
        if (ibkVar instanceof ghj0) {
            ghj0Var = (ghj0) ibkVar;
            int i = ghj0Var.f79940d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ghj0Var.f79940d = i - Integer.MIN_VALUE;
            } else {
                ghj0Var = new ghj0(jhj0Var, ibkVar);
            }
        } else {
            ghj0Var = new ghj0(jhj0Var, ibkVar);
        }
        Object obj = ghj0Var.f79938b;
        int i2 = ghj0Var.f79940d;
        if (i2 == 0) {
            bga.m29073P(obj);
            npa npaVar2 = new npa();
            ghj0Var.f79937a = npaVar2;
            ghj0Var.f79940d = 1;
            xu31Var.m92119a(npaVar2);
            w2a1 w2a1Var = w2a1.f247311a;
            yuk yukVar = yuk.f276404a;
            if (w2a1Var == yukVar) {
                return yukVar;
            }
            npaVar = npaVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            npaVar = ghj0Var.f79937a;
            bga.m29073P(obj);
        }
        return bga.m29082d(npaVar, jhj0Var.m53403e());
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0246 A[Catch: Exception -> 0x003d, TryCatch #9 {Exception -> 0x003d, blocks: (B:13:0x0038, B:109:0x022b, B:110:0x0235, B:112:0x0243, B:114:0x0246, B:118:0x0250, B:119:0x0251, B:111:0x0236), top: B:151:0x0038, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x026e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [p.n9r0] */
    /* JADX WARN: Type inference failed for: r1v14, types: [p.n9r0] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [p.n9r0] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [p.n9r0] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX INFO: renamed from: c */
    public static final Object m53400c(jhj0 jhj0Var, bvu0 bvu0Var, whj0 whj0Var, whj0 whj0Var2, ibk ibkVar) {
        hhj0 hhj0Var;
        whj0 whj0Var3;
        n9r0 n9r0Var;
        ?? r4;
        ?? r1;
        ?? th;
        ?? th2;
        m12 m12VarM91894p;
        n9r0 n9r0Var2;
        xu31 xu31Var;
        xu31 xu31Var2;
        m12 m12Var;
        xqr xqrVar;
        sqr sqrVarM91895r;
        bvu0 bvu0Var2 = bvu0Var;
        whj0 whj0Var4 = whj0Var2;
        if (ibkVar instanceof hhj0) {
            hhj0Var = (hhj0) ibkVar;
            int i = hhj0Var.f91406g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hhj0Var.f91406g = i - Integer.MIN_VALUE;
            } else {
                hhj0Var = new hhj0(jhj0Var, ibkVar);
            }
        } else {
            hhj0Var = new hhj0(jhj0Var, ibkVar);
        }
        Object l4bVar = hhj0Var.f91404e;
        yuk yukVar = yuk.f276404a;
        int i2 = hhj0Var.f91406g;
        bvu0 bvu0Var3 = null;
        if (i2 == 0) {
            bga.m29073P(l4bVar);
            if (!jhj0Var.f112490b.f106239h.f87484b) {
                if (bvu0Var2 == null) {
                    return null;
                }
                try {
                    s571.m77255n(bvu0Var2);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return null;
            }
            i1p i1pVar = (i1p) jhj0Var.f112493e.getValue();
            hhj0Var.f91400a = bvu0Var2;
            hhj0Var.f91401b = whj0Var4;
            hhj0Var.f91406g = 1;
            i1pVar.getClass();
            if (whj0Var4.f251362a != 304 || whj0Var == null) {
                l4bVar = new l4b(whj0Var4);
            } else {
                lhj0 lhj0Var = whj0Var.f251365d;
                lhj0 lhj0Var2 = whj0Var4.f251365d;
                lhj0Var.getClass();
                Map map = lhj0Var.f133583a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : lhj0Var2.f133583a.entrySet()) {
                    linkedHashMap.put(((String) entry2.getKey()).toLowerCase(Locale.ROOT), new ArrayList((List) entry2.getValue()));
                }
                l4bVar = new l4b(new whj0(whj0Var4.f251362a, whj0Var4.f251363b, whj0Var4.f251364c, new lhj0(kkc0.m56706s0(linkedHashMap)), null, whj0Var4.f251367f));
            }
            if (l4bVar == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r1 = hhj0Var.f91403d;
                whj0Var3 = hhj0Var.f91402c;
                whj0Var4 = hhj0Var.f91401b;
                try {
                    bga.m29073P(l4bVar);
                    r1 = r1;
                    m12Var = (m12) r1.f151854b;
                    xqrVar = (xqr) m12Var.f138799e;
                    synchronized (xqrVar.f265103h) {
                        m12Var.m60488A(true);
                        sqrVarM91895r = xqrVar.m91895r(((qqr) m12Var.f138797c).f191636a);
                    }
                    return sqrVarM91895r != null ? new bvu0(sqrVarM91895r) : bvu0Var3;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        ((m12) r1.f151854b).m60488A(false);
                    } catch (Exception unused2) {
                    }
                    xu31Var = whj0Var4.f251366e;
                    if (xu31Var != null) {
                        try {
                            s571.m77255n(xu31Var);
                        } catch (RuntimeException e3) {
                            throw e3;
                        } catch (Exception unused3) {
                        }
                    }
                    xu31Var2 = whj0Var3.f251366e;
                    if (xu31Var2 != null) {
                        throw e;
                    }
                    try {
                        s571.m77255n(xu31Var2);
                        throw e;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused4) {
                        throw e;
                    }
                }
            }
            whj0 whj0Var5 = hhj0Var.f91401b;
            bvu0 bvu0Var4 = hhj0Var.f91400a;
            bga.m29073P(l4bVar);
            whj0Var4 = whj0Var5;
            bvu0Var2 = bvu0Var4;
            bvu0Var3 = null;
        }
        whj0Var3 = ((l4b) l4bVar).f129616a;
        if (whj0Var3 == null) {
            return bvu0Var3;
        }
        if (bvu0Var2 != null) {
            sqr sqrVar = bvu0Var2.f31447a;
            xqr xqrVar2 = sqrVar.f213138c;
            synchronized (xqrVar2.f265103h) {
                sqrVar.close();
                m12VarM91894p = xqrVar2.m91894p(sqrVar.f213136a.f191636a);
            }
            if (m12VarM91894p != null) {
                n9r0Var2 = new n9r0(m12VarM91894p, 16);
            } else {
                r4 = bvu0Var3;
            }
        } else {
            cvu0 cvu0Var = (cvu0) jhj0Var.f112492d.getValue();
            if (cvu0Var == null) {
                r4 = bvu0Var3;
            } else {
                String str = jhj0Var.f112490b.f106236e;
                if (str == null) {
                    str = jhj0Var.f112489a;
                }
                xqr xqrVar3 = cvu0Var.f42548b;
                byte[] bytes = str.getBytes(vuc.f244913a);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                wj50.m88279p(bArrDigest);
                char[] cArr = new char[bArrDigest.length * 2];
                int i3 = 0;
                for (byte b : bArrDigest) {
                    int i4 = i3 + 1;
                    char[] cArr2 = exb.f63733c;
                    cArr[i3] = cArr2[(b >> 4) & 15];
                    i3 += 2;
                    cArr[i4] = cArr2[b & 15];
                }
                m12 m12VarM91894p2 = xqrVar3.m91894p(new String(cArr));
                if (m12VarM91894p2 != null) {
                    n9r0Var = new n9r0(m12VarM91894p2, 16);
                } else {
                    r4 = bvu0Var3;
                }
            }
        }
        if (r4 == 0) {
            r4 = n9r0Var;
            r4 = n9r0Var2;
            return bvu0Var3;
        }
        try {
            r4 = n9r0Var;
            r4 = n9r0Var2;
            tuu0 tuu0Var = new tuu0(jhj0Var.m53403e().mo40347k(((m12) r4.f151854b).m60495I(0), false));
            try {
                c95.m31834b0(whj0Var3, tuu0Var);
                try {
                    tuu0Var.close();
                    th = bvu0Var3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    tuu0Var.close();
                } catch (Throwable th5) {
                    y85.m93061f(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            xu31 xu31Var3 = whj0Var3.f251366e;
            if (xu31Var3 != null) {
                ywy ywyVarM53403e = jhj0Var.m53403e();
                tbn0 tbn0VarM60495I = ((m12) r4.f151854b).m60495I(1);
                bvu0Var3 = bvu0Var3;
                hhj0Var.f91400a = bvu0Var3;
                hhj0Var.f91401b = whj0Var4;
                hhj0Var.f91402c = whj0Var3;
                hhj0Var.f91403d = r4;
                hhj0Var.f91406g = 2;
                gqa gqaVar = xu31Var3.f265990a;
                tuu0 tuu0Var2 = new tuu0(ywyVarM53403e.mo40347k(tbn0VarM60495I, false));
                try {
                    qyg1.m74181K(gqaVar.mo45429w1(tuu0Var2));
                    try {
                        tuu0Var2.close();
                        th2 = bvu0Var3;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        tuu0Var2.close();
                    } catch (Throwable th8) {
                        y85.m93061f(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                if (w2a1.f247311a == yukVar) {
                    return yukVar;
                }
            } else {
                bvu0Var3 = bvu0Var3;
            }
            r1 = r4;
            m12Var = (m12) r1.f151854b;
            xqrVar = (xqr) m12Var.f138799e;
            synchronized (xqrVar.f265103h) {
                m12Var.m60488A(true);
                sqrVarM91895r = xqrVar.m91895r(((qqr) m12Var.f138797c).f191636a);
                if (sqrVarM91895r != null) {
                }
            }
        } catch (Exception e5) {
            e = e5;
            r1 = r4;
            ((m12) r1.f151854b).m60488A(false);
            xu31Var = whj0Var4.f251366e;
            if (xu31Var != null) {
                s571.m77255n(xu31Var);
            }
            xu31Var2 = whj0Var3.f251366e;
            if (xu31Var2 != null) {
                throw e;
            }
            s571.m77255n(xu31Var2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX INFO: renamed from: f */
    public static String m53401f(String str, String str2) {
        String strM70868l;
        if (str2 == null || bm51.m29803n0(str2, "text/plain", false)) {
            if (wl51.m88460J0(str)) {
                strM70868l = null;
            } else {
                String strM88487k1 = wl51.m88487k1(wl51.m88487k1(str, '#'), '?');
                String strM88482f1 = wl51.m88482f1('.', wl51.m88482f1('/', strM88487k1, strM88487k1), "");
                if (wl51.m88460J0(strM88482f1)) {
                    strM70868l = null;
                } else {
                    String lowerCase = strM88482f1.toLowerCase(Locale.ROOT);
                    strM70868l = (String) eef0.f58764a.get(lowerCase);
                    if (strM70868l == null) {
                        strM70868l = psh.m70868l(lowerCase);
                    }
                }
            }
            if (strM70868l != null) {
                return strM70868l;
            }
        }
        if (str2 != null) {
            return wl51.m88485i1(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:15:0x003a, B:78:0x01ab, B:22:0x0050, B:73:0x018f, B:75:0x0193, B:61:0x0149, B:63:0x014f, B:44:0x00d1, B:46:0x00d8, B:48:0x00e6, B:55:0x0118, B:57:0x0124, B:51:0x00fc, B:53:0x0106, B:66:0x016b, B:67:0x0172), top: B:90:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
    
        if (r0 == r11) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // p204p.tty
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo25711a(fbk fbkVar) throws Exception {
        fhj0 fhj0Var;
        bvu0 bvu0Var;
        rlv0 rlv0VarM36622v;
        bvu0 bvu0Var2;
        rlv0 rlv0Var;
        cvu0 cvu0Var;
        rlv0 rlv0Var2;
        rlv0 rlv0Var3;
        fu31 fu31Var;
        if (fbkVar instanceof fhj0) {
            fhj0Var = (fhj0) fbkVar;
            int i = fhj0Var.f69678e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fhj0Var.f69678e = i - Integer.MIN_VALUE;
            } else {
                fhj0Var = new fhj0(this, (ibk) fbkVar);
            }
        } else {
            fhj0Var = new fhj0(this, (ibk) fbkVar);
        }
        fhj0 fhj0Var2 = fhj0Var;
        Object objM53402d = fhj0Var2.f69676c;
        rlv0 rlv0Var4 = fhj0Var2.f69678e;
        String str = this.f112489a;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (rlv0Var4 != 0) {
                    if (rlv0Var4 == 1) {
                        rlv0 rlv0Var5 = fhj0Var2.f69675b;
                        rlv0 rlv0Var6 = fhj0Var2.f69674a;
                        try {
                            bga.m29073P(objM53402d);
                            rlv0Var = rlv0Var5;
                            rlv0VarM36622v = rlv0Var6;
                        } catch (Exception e) {
                            e = e;
                            rlv0Var4 = rlv0Var6;
                            bvu0Var = (bvu0) rlv0Var4.f200373a;
                            if (bvu0Var != null) {
                                try {
                                    s571.m77255n(bvu0Var);
                                } catch (RuntimeException e2) {
                                    throw e2;
                                } catch (Exception unused) {
                                }
                            }
                            throw e;
                        }
                    } else if (rlv0Var4 == 2) {
                        rlv0Var3 = fhj0Var2.f69674a;
                        bga.m29073P(objM53402d);
                        fu31Var = (fu31) objM53402d;
                        if (fu31Var != null) {
                            return fu31Var;
                        }
                        shj0 shj0VarM53404g = m53404g();
                        rph0 rph0Var = new rph0(this, fbkVar2, 23);
                        fhj0Var2.f69674a = rlv0Var3;
                        fhj0Var2.f69675b = null;
                        fhj0Var2.f69678e = 3;
                        objM53402d = m53402d(shj0VarM53404g, rph0Var, fhj0Var2);
                    } else {
                        if (rlv0Var4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rlv0 rlv0Var7 = fhj0Var2.f69674a;
                        bga.m29073P(objM53402d);
                    }
                    return (fu31) objM53402d;
                }
                rlv0VarM36622v = dq60.m36622v(objM53402d);
                ivl0 ivl0Var = this.f112490b;
                if (!ivl0Var.f106239h.f87483a || (cvu0Var = (cvu0) this.f112492d.getValue()) == null) {
                    bvu0Var2 = null;
                } else {
                    String str2 = ivl0Var.f106236e;
                    if (str2 == null) {
                        str2 = str;
                    }
                    xqr xqrVar = cvu0Var.f42548b;
                    byte[] bytes = str2.getBytes(vuc.f244913a);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] bArrDigest = messageDigest.digest();
                    wj50.m88279p(bArrDigest);
                    char[] cArr = new char[bArrDigest.length * 2];
                    int i2 = 0;
                    for (byte b : bArrDigest) {
                        int i3 = i2 + 1;
                        char[] cArr2 = exb.f63733c;
                        cArr[i2] = cArr2[(b >> 4) & 15];
                        i2 += 2;
                        cArr[i3] = cArr2[b & 15];
                    }
                    sqr sqrVarM91895r = xqrVar.m91895r(new String(cArr));
                    if (sqrVarM91895r != null) {
                        bvu0Var2 = new bvu0(sqrVarM91895r);
                    } else {
                        bvu0Var2 = null;
                    }
                }
                rlv0VarM36622v.f200373a = bvu0Var2;
                rlv0 rlv0Var8 = new rlv0();
                if (bvu0Var2 != null) {
                    ywy ywyVarM53403e = m53403e();
                    sqr sqrVar = ((bvu0) rlv0VarM36622v.f200373a).f31447a;
                    if (sqrVar.f213137b) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    tbn0 tbn0Var = (tbn0) sqrVar.f213136a.f191638c.get(0);
                    ywyVarM53403e.getClass();
                    Long l = whg1.m88142o(ywyVarM53403e, tbn0Var).f116739d;
                    if (l != null && l.longValue() == 0) {
                        return new fu31(m53405h((bvu0) rlv0VarM36622v.f200373a), m53401f(str, null), 3);
                    }
                    whj0 whj0VarM53406i = m53406i((bvu0) rlv0VarM36622v.f200373a);
                    rlv0Var8.f200373a = whj0VarM53406i;
                    if (whj0VarM53406i != null) {
                        i1p i1pVar = (i1p) this.f112493e.getValue();
                        whj0 whj0Var = (whj0) rlv0Var8.f200373a;
                        m53404g();
                        fhj0Var2.f69674a = rlv0VarM36622v;
                        fhj0Var2.f69675b = rlv0Var8;
                        fhj0Var2.f69678e = 1;
                        i1pVar.getClass();
                        k4b k4bVar = new k4b(whj0Var);
                        if (k4bVar != yukVar) {
                            rlv0Var = rlv0Var8;
                            objM53402d = k4bVar;
                        }
                    }
                    return yukVar;
                }
                rlv0Var = rlv0Var8;
                rlv0Var2 = rlv0VarM36622v;
                shj0 shj0VarM53404g2 = m53404g();
                nd0 nd0Var = new nd0(23, rlv0Var2, this, rlv0Var, shj0VarM53404g2, (fbk) null);
                fhj0Var2.f69674a = rlv0Var2;
                fhj0Var2.f69675b = null;
                fhj0Var2.f69678e = 2;
                objM53402d = m53402d(shj0VarM53404g2, nd0Var, fhj0Var2);
                if (objM53402d != yukVar) {
                    rlv0Var3 = rlv0Var2;
                    fu31Var = (fu31) objM53402d;
                    if (fu31Var != null) {
                        return fu31Var;
                    }
                    shj0 shj0VarM53404g3 = m53404g();
                    rph0 rph0Var2 = new rph0(this, fbkVar2, 23);
                    fhj0Var2.f69674a = rlv0Var3;
                    fhj0Var2.f69675b = null;
                    fhj0Var2.f69678e = 3;
                    objM53402d = m53402d(shj0VarM53404g3, rph0Var2, fhj0Var2);
                }
                return yukVar;
                shj0 shj0VarM53404g4 = m53404g();
                nd0 nd0Var2 = new nd0(23, rlv0Var2, this, rlv0Var, shj0VarM53404g4, (fbk) null);
                fhj0Var2.f69674a = rlv0Var2;
                fhj0Var2.f69675b = null;
                fhj0Var2.f69678e = 2;
                objM53402d = m53402d(shj0VarM53404g4, nd0Var2, fhj0Var2);
                if (objM53402d != yukVar) {
                    rlv0Var3 = rlv0Var2;
                    fu31Var = (fu31) objM53402d;
                    if (fu31Var != null) {
                        return fu31Var;
                    }
                    shj0 shj0VarM53404g5 = m53404g();
                    rph0 rph0Var3 = new rph0(this, fbkVar2, 23);
                    fhj0Var2.f69674a = rlv0Var3;
                    fhj0Var2.f69675b = null;
                    fhj0Var2.f69678e = 3;
                    objM53402d = m53402d(shj0VarM53404g5, rph0Var3, fhj0Var2);
                }
                return yukVar;
            } catch (Exception e3) {
                e = e3;
                rlv0Var4 = rlv0Var2;
                bvu0Var = (bvu0) rlv0Var4.f200373a;
                if (bvu0Var != null) {
                    s571.m77255n(bvu0Var);
                }
                throw e;
            }
            k4b k4bVar2 = (k4b) objM53402d;
            if (k4bVar2.f119170a != null) {
                return new fu31(m53405h((bvu0) rlv0VarM36622v.f200373a), m53401f(str, k4bVar2.f119170a.f251365d.m58997b()), 3);
            }
            rlv0Var2 = rlv0VarM36622v;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m53402d(shj0 shj0Var, th00 th00Var, fhj0 fhj0Var) {
        if (this.f112490b.f106240i.f87483a && wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        g9b g9bVar = (g9b) this.f112491c.getValue();
        return g9b.m44015a(g9bVar.f77720a, shj0Var, new lw2(th00Var, null), fhj0Var);
    }

    /* JADX INFO: renamed from: e */
    public final ywy m53403e() {
        ywy ywyVar;
        cvu0 cvu0Var = (cvu0) this.f112492d.getValue();
        return (cvu0Var == null || (ywyVar = cvu0Var.f42547a) == null) ? this.f112490b.f106237f : ywyVar;
    }

    /* JADX INFO: renamed from: g */
    public final shj0 m53404g() {
        skp skpVar = xb40.f259838b;
        ivl0 ivl0Var = this.f112490b;
        Object objM97055r = zuj0.m97055r(ivl0Var, skpVar);
        h4b h4bVar = ivl0Var.f106239h;
        lhj0 lhj0Var = (lhj0) objM97055r;
        lhj0Var.getClass();
        Map map = lhj0Var.f133583a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        boolean z = h4bVar.f87483a;
        boolean z2 = ivl0Var.f106240i.f87483a && this.f112494f.mo71849a();
        if (!z2 && z) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), h6f.m46717N("only-if-cached, max-stale=2147483647"));
        } else if (!z2 || z) {
            if (!z2 && !z) {
                linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), h6f.m46717N("no-cache, only-if-cached"));
            }
        } else if (h4bVar.f87484b) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), h6f.m46717N("no-cache"));
        } else {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), h6f.m46717N("no-cache, no-store"));
        }
        String str = (String) zuj0.m97055r(ivl0Var, xb40.f259837a);
        lhj0 lhj0Var2 = new lhj0(kkc0.m56706s0(linkedHashMap));
        if (zuj0.m97055r(ivl0Var, xb40.f259839c) == null) {
            return new shj0(this.f112489a, str, lhj0Var2, ivl0Var.f106241j);
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public final cwy m53405h(bvu0 bvu0Var) {
        sqr sqrVar = bvu0Var.f31447a;
        if (sqrVar.f213137b) {
            throw new IllegalStateException("snapshot is closed");
        }
        tbn0 tbn0Var = (tbn0) sqrVar.f213136a.f191638c.get(1);
        ywy ywyVarM53403e = m53403e();
        String str = this.f112490b.f106236e;
        if (str == null) {
            str = this.f112489a;
        }
        return bga.m29081c(tbn0Var, ywyVarM53403e, str, bvu0Var, 16);
    }

    /* JADX INFO: renamed from: i */
    public final whj0 m53406i(bvu0 bvu0Var) throws Throwable {
        Throwable th;
        whj0 whj0VarM31826V;
        try {
            ywy ywyVarM53403e = m53403e();
            sqr sqrVar = bvu0Var.f31447a;
            if (sqrVar.f213137b) {
                throw new IllegalStateException("snapshot is closed");
            }
            vuu0 vuu0Var = new vuu0(ywyVarM53403e.mo40348n((tbn0) sqrVar.f213136a.f191638c.get(0)));
            try {
                whj0VarM31826V = c95.m31826V(vuu0Var);
                try {
                    vuu0Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    vuu0Var.close();
                } catch (Throwable th4) {
                    y85.m93061f(th3, th4);
                }
                th = th3;
                whj0VarM31826V = null;
            }
            if (th == null) {
                return whj0VarM31826V;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}

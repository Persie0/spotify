package p204p;

import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class a7j0 implements ygs, Function, BiFunction, Predicate, Function3, tn61, vja1, ojn0, hkq, v94, fz61, ymj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13084a;

    /* JADX INFO: renamed from: b */
    public static final a7j0 f13075b = new a7j0(1);

    /* JADX INFO: renamed from: c */
    public static final a7j0 f13076c = new a7j0(2);

    /* JADX INFO: renamed from: d */
    public static final a7j0 f13077d = new a7j0(3);

    /* JADX INFO: renamed from: e */
    public static final a7j0 f13078e = new a7j0(4);

    /* JADX INFO: renamed from: f */
    public static final a7j0 f13079f = new a7j0(5);

    /* JADX INFO: renamed from: g */
    public static final a7j0 f13080g = new a7j0(6);

    /* JADX INFO: renamed from: h */
    public static final a7j0 f13081h = new a7j0(7);

    /* JADX INFO: renamed from: i */
    public static final a7j0 f13082i = new a7j0(8);

    /* JADX INFO: renamed from: t */
    public static final a7j0 f13083t = new a7j0(9);

    /* JADX INFO: renamed from: X */
    public static final a7j0 f13072X = new a7j0(10);

    /* JADX INFO: renamed from: Y */
    public static final a7j0 f13073Y = new a7j0(11);

    /* JADX INFO: renamed from: Z */
    public static final a7j0 f13074Z = new a7j0(12);

    /* JADX INFO: renamed from: L0 */
    public static final a7j0 f13065L0 = new a7j0(13);

    /* JADX INFO: renamed from: M0 */
    public static final a7j0 f13066M0 = new a7j0(14);

    /* JADX INFO: renamed from: N0 */
    public static final a7j0 f13067N0 = new a7j0(15);

    /* JADX INFO: renamed from: O0 */
    public static final a7j0 f13068O0 = new a7j0(16);

    /* JADX INFO: renamed from: P0 */
    public static final a7j0 f13069P0 = new a7j0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final a7j0 f13070Q0 = new a7j0(18);

    /* JADX INFO: renamed from: R0 */
    public static final /* synthetic */ a7j0 f13071R0 = new a7j0(19);

    public /* synthetic */ a7j0(int i) {
        this.f13084a = i;
    }

    /* JADX INFO: renamed from: A */
    public static iva m24943A(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (thg1.m80850p(str.charAt(i2 + 1)) + (thg1.m80850p(str.charAt(i2)) << 4));
        }
        return new iva(bArr);
    }

    /* JADX INFO: renamed from: B */
    public static void m24944B(ovy ovyVar) throws IOException {
        if (((ewy) ovyVar).f63623b.exists()) {
            if (!lxy.m60212g(ovyVar)) {
                m24949v(ovyVar);
            }
            if (ovyVar.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + ovyVar + ".");
        }
    }

    /* JADX INFO: renamed from: C */
    public static iva m24945C(String str) {
        iva ivaVar = new iva(kk40.m56679u(str));
        ivaVar.f106180c = str;
        return ivaVar;
    }

    /* JADX INFO: renamed from: H */
    public static iva m24946H(byte[] bArr) {
        int iM37023z = dul.m37023z(bArr);
        dul.m37008k(bArr.length, 0, iM37023z);
        return new iva(bk5.m29639x0(0, bArr, iM37023z));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m24947N(b3j0 b3j0Var, y8j0 y8j0Var) {
        if (!(b3j0Var instanceof s2j0) || y8j0Var == null) {
            return false;
        }
        b3j0 b3j0Var2 = y8j0Var.f270305a;
        if (b3j0Var2 instanceof t2j0) {
            return true;
        }
        return (b3j0Var2 instanceof s2j0) && ((s2j0) b3j0Var2).f205023a.equals(((s2j0) b3j0Var).f205023a);
    }

    /* JADX INFO: renamed from: u */
    public static final pde m24948u(a7j0 a7j0Var, String str) {
        pde pdeVar = new pde(str);
        pde.f176428d.put(str, pdeVar);
        return pdeVar;
    }

    /* JADX INFO: renamed from: v */
    public static void m24949v(ovy ovyVar) {
        File file = ((ewy) ovyVar).f63623b;
        if (!file.exists()) {
            throw new IllegalArgumentException(ovyVar + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(ovyVar + " is not a directory");
        }
        ovy[] ovyVarArrMo40152b = ovyVar.listFiles();
        IOException e = null;
        if (ovyVarArrMo40152b != null) {
            for (ovy ovyVar2 : ovyVarArrMo40152b) {
                try {
                    lxy.m60211f(ovyVar2);
                } catch (IOException e2) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m24950y(ljo ljoVar, ovy ovyVar) throws IOException {
        File file = ((ewy) ovyVar).f63623b;
        if (!file.exists()) {
            ewy ewyVarMo40151a = ovyVar.getParentFile();
            if (ewyVarMo40151a != null && !ewyVarMo40151a.mkdirs() && !ewyVarMo40151a.f63623b.isDirectory()) {
                throw new IOException("Directory '" + ewyVarMo40151a + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + ovyVar + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + ovyVar + "' cannot be written to");
            }
        }
        ovyVar.getClass();
        kwy kwyVarMo28558h = ((ewy) ovyVar).f63622a.mo28558h(ovyVar);
        try {
            int i = sv30.f214308a;
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = ljoVar.read(bArr);
                if (-1 == i2) {
                    kwyVarMo28558h.close();
                    return;
                }
                kwyVarMo28558h.write(bArr, 0, i2);
            }
        } finally {
            sv30.m79425a(kwyVarMo28558h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[RETURN] */
    /* JADX INFO: renamed from: z */
    public static iva m24951z(String str) {
        int i;
        char cCharAt;
        byte[] bArr = AbstractC1649a.f10968a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new iva(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new iva(bArrCopyOf);
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public pg41 m24952F() {
        return jg31.m53286y(tw41.m81639m(207, 1, 24.0f), 207.0f, null, 4);
    }

    /* JADX INFO: renamed from: G */
    public synchronized pde m24953G(String str) {
        pde pdeVar;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = pde.f176428d;
            pdeVar = (pde) linkedHashMap.get(str);
            if (pdeVar == null) {
                if (bm51.m29803n0(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = bm51.m29803n0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                pdeVar = (pde) linkedHashMap.get(strConcat);
                if (pdeVar == null) {
                    pdeVar = new pde(str);
                }
                linkedHashMap.put(str, pdeVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return pdeVar;
    }

    /* JADX INFO: renamed from: I */
    public pg41 m24954I() {
        return jg31.m53286y(tw41.m81639m(240, 2, 40.0f), 240.0f, null, 4);
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new k0p0((PlayerState) obj, (xul0) obj2, (xul0) obj3);
    }

    /* JADX INFO: renamed from: K */
    public pg41 m24955K() {
        return jg31.m53286y(tw41.m81639m(950, 2, 96.0f), 950.0f, null, 4);
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ /* synthetic */ void mo24956K0(Object obj) {
    }

    /* JADX INFO: renamed from: L */
    public pg41 m24957L() {
        return jg31.m53286y(tw41.m81639m(1000, 2, 120.0f), 1000.0f, null, 4);
    }

    @Override // p204p.hkq
    /* JADX INFO: renamed from: a */
    public boolean mo24958a(SSLSocket sSLSocket) {
        return bm51.m29803n0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f13084a) {
            case 2:
                return new xqk0(((Boolean) obj).booleanValue());
            case 6:
                return new i5q0((Map) obj);
            case 7:
                return Boolean.valueOf(bm51.m29803n0((String) obj, "opt-in-trial", false));
            case 10:
                return new vqc0((Throwable) obj);
            case 11:
                return new rk91("time_out");
            case 14:
                ((og7) ((oua0) obj).f170238a.m56308G()).invoke();
                return new vhx(false, null);
            case 15:
                return ((ContextTrack) ((PlayerState) obj).track().mo49278b()).uri();
            case 17:
                return ((xul0) obj).mo49284i(vof.f243472d);
            default:
                int iOrdinal = ((EsAuthStorageResult$AuthStorageResult) obj).m7498o().ordinal();
                if (iOrdinal == 0) {
                    return pi7.f177849a;
                }
                if (iOrdinal != 1) {
                    return iOrdinal != 2 ? ni7.f154191a : ni7.f154192b;
                }
                return ni7.f154193c;
        }
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: d */
    public int mo24960d() {
        return 16;
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: g */
    public void mo24962g(lp70 lp70Var, long j, g030 g030Var, int i, boolean z) {
        lp70Var.m59599A(j, g030Var, i, z);
    }

    @Override // p204p.ojn0
    /* JADX INFO: renamed from: i */
    public Object mo24963i(d7x0 d7x0Var) {
        return ((x8f1) d7x0Var).f259144b;
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("show_id");
        if (str3 != null && igg1.m50543v(str3)) {
            return new es11(mec0Var, str3, str2, str);
        }
        return null;
    }

    @Override // p204p.hkq
    /* JADX INFO: renamed from: k */
    public dk31 mo24964k(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(dq60.m36610j(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new jp4(superclass);
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: l */
    public boolean mo24965l(lp70 lp70Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p204p.ymj0
    /* JADX INFO: renamed from: r */
    public boolean mo24966r(g030 g030Var, lp70 lp70Var) {
        bnj0 bnj0Var = lp70Var.f135674c1.f263386d;
        bnj0Var.getClass();
        exh0 exh0VarM30022e1 = bnj0Var.m30022e1(cnj0.m33460g(16));
        if (exh0VarM30022e1 != null && exh0VarM30022e1.f63766L0) {
            if (!exh0VarM30022e1.f63770a.f63766L0) {
                mt40.m62791c("visitLocalDescendants called on an unattached node");
            }
            exh0 exh0Var = exh0VarM30022e1.f63770a;
            if ((exh0Var.f63773d & 16) != 0) {
                while (exh0Var != null) {
                    if ((exh0Var.f63772c & 16) != 0) {
                        ?? M88331j = exh0Var;
                        ?? qqi0Var = 0;
                        while (M88331j != 0) {
                            if (M88331j instanceof n6q0) {
                                if (((n6q0) M88331j).mo39634j1()) {
                                    g030Var.f75255c = g030Var.f75253a.f114676b - 1;
                                    return true;
                                }
                            } else if ((M88331j.f63772c & 16) != 0 && (M88331j instanceof xlq)) {
                                exh0 exh0Var2 = ((xlq) M88331j).f263224N0;
                                int i = 0;
                                while (exh0Var2 != null) {
                                    if ((exh0Var2.f63772c & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M88331j = M88331j;
                                            qqi0Var = qqi0Var;
                                            qqi0Var = qqi0Var;
                                            M88331j = exh0Var2;
                                        } else {
                                            if (qqi0Var == 0) {
                                                qqi0Var = new qqi0(0, new exh0[16]);
                                            }
                                            if (M88331j != 0) {
                                                qqi0Var.m73556b(M88331j);
                                                M88331j = 0;
                                            }
                                            qqi0Var.m73556b(exh0Var2);
                                        }
                                    } else {
                                        M88331j = M88331j;
                                        qqi0Var = qqi0Var;
                                    }
                                    exh0Var2 = exh0Var2.f63775f;
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                }
                                if (i == 1) {
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                } else {
                                    M88331j = M88331j;
                                    qqi0Var = qqi0Var;
                                }
                            }
                            M88331j = wjg1.m88331j(qqi0Var);
                        }
                    }
                    exh0Var = exh0Var.f63775f;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [p.qqi0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [p.exh0] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p204p.ymj0
    /* JADX INFO: renamed from: t */
    public boolean mo24967t(exh0 exh0Var) {
        ?? qqi0Var = 0;
        while (exh0Var != 0) {
            if (exh0Var instanceof n6q0) {
                ((n6q0) exh0Var).mo39630R();
            } else if ((exh0Var.f63772c & 16) != 0 && (exh0Var instanceof xlq)) {
                exh0 exh0Var2 = ((xlq) exh0Var).f263224N0;
                int i = 0;
                qqi0Var = qqi0Var;
                exh0Var = exh0Var;
                while (exh0Var2 != null) {
                    if ((exh0Var2.f63772c & 16) != 0) {
                        i++;
                        if (i == 1) {
                            qqi0Var = qqi0Var;
                            exh0Var = exh0Var2;
                        } else {
                            if (qqi0Var == 0) {
                                qqi0Var = new qqi0(0, new exh0[16]);
                            }
                            if (exh0Var != 0) {
                                qqi0Var.m73556b(exh0Var);
                                exh0Var = 0;
                            }
                            qqi0Var.m73556b(exh0Var2);
                        }
                    }
                    exh0Var2 = exh0Var2.f63775f;
                    qqi0Var = qqi0Var;
                    exh0Var = exh0Var;
                }
                if (i == 1) {
                }
            }
            exh0Var = wjg1.m88331j(qqi0Var);
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean zIsEmpty;
        switch (this.f13084a) {
            case 4:
                zIsEmpty = ((iqx) ((gqx) obj)).f104863f;
                break;
            default:
                zIsEmpty = ((List) obj).isEmpty();
                break;
        }
        return !zIsEmpty;
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        return z050.m95038n6(bz61Var);
    }

    public a7j0(mi7 mi7Var) {
        this.f13084a = 21;
    }

    @Override // p204p.ygs
    /* JADX INFO: renamed from: c */
    public void mo24959c() {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        EsOffline$Progress esOffline$Progress = (EsOffline$Progress) obj;
        EsOffline$Progress esOffline$Progress2 = (EsOffline$Progress) obj2;
        boolean z = esOffline$Progress.m16198C() || esOffline$Progress2.m16198C();
        long jM16204I = esOffline$Progress2.m16204I() + esOffline$Progress.m16204I();
        if (z && jM16204I != 0) {
            long jM16197B = esOffline$Progress2.m16197B() + esOffline$Progress.m16197B();
            jmw jmwVarM16182J = EsOffline$Progress.m16182J();
            jmwVarM16182J.m53802y(jM16204I);
            jmwVarM16182J.m53795r(jM16197B);
            jmwVarM16182J.m53799v(esOffline$Progress2.m16201F() + esOffline$Progress.m16201F());
            jmwVarM16182J.m53801x(esOffline$Progress2.m16203H() + esOffline$Progress.m16203H());
            jmwVarM16182J.m53794q(esOffline$Progress2.m16196A() + esOffline$Progress.m16196A());
            jmwVarM16182J.m53798u(esOffline$Progress2.m16200E() + esOffline$Progress.m16200E());
            jmwVarM16182J.m53796s();
            jmwVarM16182J.m53793m(esOffline$Progress2.m16205z() + esOffline$Progress.m16205z());
            jmwVarM16182J.m53797t((jM16197B / jM16204I) * 100.0f);
            jmwVarM16182J.m53800w(esOffline$Progress2.m16202G() + esOffline$Progress.m16202G());
            EsOffline$Progress esOffline$Progress3 = (EsOffline$Progress) jmwVarM16182J.build();
            wj50.m88279p(esOffline$Progress3);
            return new xf61(esOffline$Progress3, esOffline$Progress2.m16198C());
        }
        return yf61.f272158a;
    }

    @Override // p204p.ygs
    /* JADX INFO: renamed from: e */
    public void mo24961e(int i) {
    }
}

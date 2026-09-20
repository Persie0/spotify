package p204p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
public final class h611 implements d611 {

    /* JADX INFO: renamed from: a */
    public final gcu0 f87948a;

    /* JADX INFO: renamed from: b */
    public final c611 f87949b;

    /* JADX INFO: renamed from: c */
    public final c611 f87950c;

    /* JADX INFO: renamed from: d */
    public final y8l0 f87951d;

    /* JADX INFO: renamed from: e */
    public final y0i0 f87952e;

    /* JADX INFO: renamed from: f */
    public final onz0 f87953f;

    public h611(gcu0 gcu0Var, c611 c611Var, c611 c611Var2, y8l0 y8l0Var, y0i0 y0i0Var, onz0 onz0Var) {
        this.f87948a = gcu0Var;
        this.f87949b = c611Var;
        this.f87950c = c611Var2;
        this.f87951d = y8l0Var;
        this.f87952e = y0i0Var;
        this.f87953f = onz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128 A[PHI: r7 r8
      0x0128: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v4 java.lang.Object), (r7v4 java.lang.Object), (r7v4 java.lang.Object) binds: [B:53:0x00c0, B:59:0x0101, B:62:0x010a, B:63:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r8v2 ??) = (r8v7 ??), (r8v8 ??), (r8v9 ??), (r8v10 ??) binds: [B:53:0x00c0, B:59:0x0101, B:62:0x010a, B:63:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
    
        if (r0 == r11) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [p.h611] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.i611] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p.i611] */
    /* JADX WARN: Type inference failed for: r8v3, types: [p.i611] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p204p.d611
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo31502a(i611 i611Var, ibk ibkVar) {
        e611 e611Var;
        Object c6x0Var;
        ?? r3;
        ?? r8;
        Throwable thM77348a;
        Throwable thM77348a2;
        y0i0 y0i0Var;
        Enum enumM67445o;
        Throwable th;
        ?? r9;
        ?? r10;
        i611 i611Var2;
        if (ibkVar instanceof e611) {
            e611Var = (e611) ibkVar;
            int i = e611Var.f56522g;
            if ((i & Integer.MIN_VALUE) != 0) {
                e611Var.f56522g = i - Integer.MIN_VALUE;
            } else {
                e611Var = new e611(this, ibkVar);
            }
        } else {
            e611Var = new e611(this, ibkVar);
        }
        Object objM46701b = e611Var.f56520e;
        ?? r4 = e611Var.f56522g;
        c611 c611Var = this.f87949b;
        yuk yukVar = yuk.f276404a;
        try {
            if (r4 == 0) {
                bga.m29073P(objM46701b);
                e611Var.f56516a = i611Var;
                e611Var.f56522g = 1;
                Object objM44323e = this.f87948a.m44323e(e611Var);
                if (objM44323e != yukVar) {
                    i611Var2 = i611Var;
                    objM46701b = objM44323e;
                }
                return yukVar;
            }
            if (r4 == 1) {
                i611 i611Var3 = e611Var.f56516a;
                bga.m29073P(objM46701b);
                i611Var2 = i611Var3;
            } else {
                if (r4 == 2) {
                    bga.m29073P(objM46701b);
                    return objM46701b;
                }
                if (r4 == 3) {
                    i611 i611Var4 = e611Var.f56516a;
                    bga.m29073P(objM46701b);
                    r4 = i611Var4;
                    r4 = i611Var2;
                    c6x0Var = (a611) objM46701b;
                    r3 = r4;
                    r8 = r3;
                    thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a == null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
                        throw thM77348a;
                    }
                    thM77348a2 = s6x0.m77348a(c6x0Var);
                    r9 = r8;
                    if (thM77348a2 != null) {
                        e611Var.f56516a = r8;
                        e611Var.f56517b = c6x0Var;
                        e611Var.f56518c = thM77348a2;
                        y0i0Var = this.f87952e;
                        e611Var.f56519d = y0i0Var;
                        e611Var.f56522g = 4;
                        enumM67445o = this.f87953f.m67445o(hr01.f94282M0, e611Var);
                        if (enumM67445o != yukVar) {
                            th = thM77348a2;
                            objM46701b = enumM67445o;
                            r10 = r8;
                            y0i0Var.m92590h(new fr01((hr01) objM46701b, sxg1.m79615C(th), sxg1.m79617E(th), r10.f99069a, null, null, null, null, null));
                            r9 = r10;
                            if (th instanceof HttpException) {
                                r9 = r10;
                                na6.m63957e(xl51.m91377Z("\n        The url-dispenser returned HTTP 422. This often means that it wasn't able to convert the " + r10.f99069a + " to an http(s) url.\n        Please make sure that this conversion is implemented by adding it to the method toUrl() on the SpotifyUri file - https://ghe.spotify.net/spotify/services-pilot/blob/master/java/uri/src/main/java/com/spotify/common/uri/SpotifyUri.java\n        "));
                                r9 = r10;
                            }
                            r9 = r10;
                            if (s6x0.m77348a(c6x0Var) == null) {
                                return c6x0Var;
                            }
                            e611Var.f56516a = null;
                            e611Var.f56517b = null;
                            e611Var.f56518c = null;
                            e611Var.f56519d = null;
                            e611Var.f56522g = 5;
                            objM46701b = m46701b(c611Var, r9, e611Var);
                        }
                    } else {
                        r9 = r10;
                        if (s6x0.m77348a(c6x0Var) == null) {
                            return c6x0Var;
                        }
                        e611Var.f56516a = null;
                        e611Var.f56517b = null;
                        e611Var.f56518c = null;
                        e611Var.f56519d = null;
                        e611Var.f56522g = 5;
                        objM46701b = m46701b(c611Var, r9, e611Var);
                    }
                    return yukVar;
                }
                if (r4 == 4) {
                    y0i0Var = e611Var.f56519d;
                    th = e611Var.f56518c;
                    c6x0Var = e611Var.f56517b;
                    i611 i611Var5 = e611Var.f56516a;
                    bga.m29073P(objM46701b);
                    r10 = i611Var5;
                    y0i0Var.m92590h(new fr01((hr01) objM46701b, sxg1.m79615C(th), sxg1.m79617E(th), r10.f99069a, null, null, null, null, null));
                    r9 = r10;
                    if ((th instanceof HttpException) && ((HttpException) th).f288164a == 422) {
                        r9 = r10;
                        na6.m63957e(xl51.m91377Z("\n        The url-dispenser returned HTTP 422. This often means that it wasn't able to convert the " + r10.f99069a + " to an http(s) url.\n        Please make sure that this conversion is implemented by adding it to the method toUrl() on the SpotifyUri file - https://ghe.spotify.net/spotify/services-pilot/blob/master/java/uri/src/main/java/com/spotify/common/uri/SpotifyUri.java\n        "));
                        r9 = r10;
                    }
                    r9 = r10;
                    if (s6x0.m77348a(c6x0Var) == null) {
                        return c6x0Var;
                    }
                    e611Var.f56516a = null;
                    e611Var.f56517b = null;
                    e611Var.f56518c = null;
                    e611Var.f56519d = null;
                    e611Var.f56522g = 5;
                    objM46701b = m46701b(c611Var, r9, e611Var);
                } else {
                    if (r4 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM46701b);
                }
            }
            return (a611) objM46701b;
            if (((Boolean) objM46701b).booleanValue()) {
                e611Var.f56516a = null;
                e611Var.f56522g = 2;
                Object objM46701b2 = m46701b(c611Var, i611Var2, e611Var);
                if (objM46701b2 != yukVar) {
                    return objM46701b2;
                }
            } else {
                e611Var.f56516a = i611Var2;
                e611Var.f56522g = 3;
                objM46701b = m46701b(this.f87950c, i611Var2, e611Var);
                if (objM46701b == yukVar) {
                    r4 = i611Var2;
                } else {
                    r4 = i611Var2;
                    c6x0Var = (a611) objM46701b;
                    r3 = r4;
                    r8 = r3;
                    thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a == null) {
                    }
                    thM77348a2 = s6x0.m77348a(c6x0Var);
                    r9 = r8;
                    if (thM77348a2 != null) {
                        e611Var.f56516a = r8;
                        e611Var.f56517b = c6x0Var;
                        e611Var.f56518c = thM77348a2;
                        y0i0Var = this.f87952e;
                        e611Var.f56519d = y0i0Var;
                        e611Var.f56522g = 4;
                        enumM67445o = this.f87953f.m67445o(hr01.f94282M0, e611Var);
                        if (enumM67445o != yukVar) {
                            th = thM77348a2;
                            objM46701b = enumM67445o;
                            r10 = r8;
                            y0i0Var.m92590h(new fr01((hr01) objM46701b, sxg1.m79615C(th), sxg1.m79617E(th), r10.f99069a, null, null, null, null, null));
                            r9 = r10;
                            if (th instanceof HttpException) {
                                r9 = r10;
                                na6.m63957e(xl51.m91377Z("\n        The url-dispenser returned HTTP 422. This often means that it wasn't able to convert the " + r10.f99069a + " to an http(s) url.\n        Please make sure that this conversion is implemented by adding it to the method toUrl() on the SpotifyUri file - https://ghe.spotify.net/spotify/services-pilot/blob/master/java/uri/src/main/java/com/spotify/common/uri/SpotifyUri.java\n        "));
                                r9 = r10;
                            }
                            r9 = r10;
                            if (s6x0.m77348a(c6x0Var) == null) {
                                return c6x0Var;
                            }
                            e611Var.f56516a = null;
                            e611Var.f56517b = null;
                            e611Var.f56518c = null;
                            e611Var.f56519d = null;
                            e611Var.f56522g = 5;
                            objM46701b = m46701b(c611Var, r9, e611Var);
                        }
                    } else {
                        r9 = r10;
                        if (s6x0.m77348a(c6x0Var) == null) {
                            return c6x0Var;
                        }
                        e611Var.f56516a = null;
                        e611Var.f56517b = null;
                        e611Var.f56518c = null;
                        e611Var.f56519d = null;
                        e611Var.f56522g = 5;
                        objM46701b = m46701b(c611Var, r9, e611Var);
                    }
                }
            }
        } catch (Throwable th2) {
            c6x0Var = new c6x0(th2);
            r3 = r4;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m46701b(d611 d611Var, i611 i611Var, ibk ibkVar) {
        f611 f611Var;
        if (ibkVar instanceof f611) {
            f611Var = (f611) ibkVar;
            int i = f611Var.f66233e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f611Var.f66233e = i - Integer.MIN_VALUE;
            } else {
                f611Var = new f611(this, ibkVar);
            }
        } else {
            f611Var = new f611(this, ibkVar);
        }
        Object objMo31502a = f611Var.f66231c;
        int i2 = f611Var.f66233e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo31502a);
            f611Var.f66229a = i611Var;
            f611Var.f66233e = 1;
            objMo31502a = d611Var.mo31502a(i611Var, f611Var);
            if (objMo31502a != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = f611Var.f66230b;
            bga.m29073P(objMo31502a);
            return obj2;
        }
        i611Var = f611Var.f66229a;
        bga.m29073P(objMo31502a);
        String str = i611Var.f99069a;
        String str2 = ((a611) objMo31502a).f12671b;
        f611Var.f66229a = null;
        f611Var.f66230b = objMo31502a;
        f611Var.f66233e = 2;
        return m46702c(str, str2, f611Var) == obj ? obj : objMo31502a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m46702c(String str, String str2, ibk ibkVar) {
        g611 g611Var;
        if (ibkVar instanceof g611) {
            g611Var = (g611) ibkVar;
            int i = g611Var.f76832e;
            if ((i & Integer.MIN_VALUE) != 0) {
                g611Var.f76832e = i - Integer.MIN_VALUE;
            } else {
                g611Var = new g611(this, ibkVar);
            }
        } else {
            g611Var = new g611(this, ibkVar);
        }
        Object objM86755t = g611Var.f76830c;
        int i2 = g611Var.f76832e;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            g611Var.f76828a = str;
            g611Var.f76829b = str2;
            g611Var.f76832e = 1;
            objM86755t = vyf1.m86755t(this.f87948a.m44321c(), g611Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = g611Var.f76829b;
            str = g611Var.f76828a;
            bga.m29073P(objM86755t);
        }
        if (((Boolean) objM86755t).booleanValue()) {
            y8l0 y8l0Var = this.f87951d;
            y8l0Var.getClass();
            if (bm51.m29803n0(str, "spotify:track", false)) {
                y8l0Var.f270313a.m95608b(str, str2).mo52182p(new l45(19));
            }
        }
        return w2a1.f247311a;
    }
}

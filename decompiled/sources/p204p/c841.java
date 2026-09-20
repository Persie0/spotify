package p204p;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class c841 implements se20 {

    /* JADX INFO: renamed from: a */
    public final String f35108a;

    /* JADX INFO: renamed from: b */
    public final etz f35109b;

    /* JADX INFO: renamed from: c */
    public final r741 f35110c;

    /* JADX INFO: renamed from: d */
    public final cw0 f35111d;

    /* JADX INFO: renamed from: e */
    public final a34 f35112e;

    /* JADX INFO: renamed from: f */
    public final j8o f35113f;

    /* JADX INFO: renamed from: g */
    public final pe20 f35114g;

    public c841(hc80 hc80Var, String str, etz etzVar, r741 r741Var, cw0 cw0Var, a34 a34Var, j8o j8oVar) {
        this.f35108a = str;
        this.f35109b = etzVar;
        this.f35110c = r741Var;
        this.f35111d = cw0Var;
        this.f35112e = a34Var;
        this.f35113f = j8oVar;
        hc80Var.getLifecycle().mo31986a(new y741(hc80Var, this));
        this.f35114g = new pe20((zv41) etzVar.f62827f, new z741(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7 A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef A[Catch: Exception -> 0x0123, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, Exception -> 0x0123, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0116, B:15:0x0034, B:50:0x00e8, B:16:0x0039, B:47:0x00dc, B:17:0x003e, B:34:0x0096, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a3, B:39:0x00a7, B:42:0x00b3, B:44:0x00bb, B:52:0x00ef, B:53:0x00f4, B:21:0x0049, B:23:0x0051, B:54:0x00f5), top: B:64:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public static final Object m31773d(c841 c841Var, ibk ibkVar) {
        b841 b841Var;
        sv0 sv0Var;
        uu61 uu61Var;
        cw0 cw0Var;
        cw0 cw0Var2;
        uu61 uu61Var2;
        cw0 cw0Var3;
        cw0 cw0Var4;
        cw0 cw0Var5;
        cw0 cw0Var6;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof b841) {
            b841Var = (b841) ibkVar;
            int i = b841Var.f24492c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b841Var.f24492c = i - Integer.MIN_VALUE;
            } else {
                b841Var = new b841(c841Var, ibkVar);
            }
        } else {
            b841Var = new b841(c841Var, ibkVar);
        }
        Object objM86755t = b841Var.f24490a;
        yuk yukVar = yuk.f276404a;
        try {
            switch (b841Var.f24492c) {
                case 0:
                    bga.m29073P(objM86755t);
                    if (c841Var.f35112e.m24600g()) {
                        nuu0 nuu0Var = c841Var.f35111d.f42593i;
                        b841Var.f24492c = 1;
                        objM86755t = vyf1.m86755t(nuu0Var, b841Var);
                        if (objM86755t != yukVar) {
                            sv0Var = (sv0) objM86755t;
                            if (sv0Var instanceof pv0) {
                                if (wj50.m88271j(c841Var.f35110c.f196438g, c841Var.f35108a)) {
                                    return w2a1Var;
                                }
                                uu61Var2 = new uu61(new pqm0(new tu61(), c841Var.f35108a));
                                cw0Var3 = c841Var.f35111d;
                                b841Var.f24492c = 2;
                                if (cw0.m34075c(cw0Var3, uu61Var2, b841Var) == yukVar) {
                                    cw0Var4 = c841Var.f35111d;
                                    b841Var.f24492c = 3;
                                    if (cw0Var4.m34078e(b841Var) == yukVar) {
                                    }
                                    c841Var.f35110c.f196438g = c841Var.f35108a;
                                    return w2a1Var;
                                }
                            } else {
                                if (sv0Var instanceof qv0) {
                                    cw0Var2 = c841Var.f35111d;
                                    b841Var.f24492c = 4;
                                    if (cw0Var2.m34078e(b841Var) == yukVar) {
                                    }
                                    c841Var.f35110c.f196438g = c841Var.f35108a;
                                    return w2a1Var;
                                }
                                if (wj50.m88271j(sv0Var, rv0.f202973a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uu61Var = new uu61(new pqm0(new tu61(), c841Var.f35108a));
                                cw0Var = c841Var.f35111d;
                                b841Var.f24492c = 5;
                                if (cw0.m34075c(cw0Var, uu61Var, b841Var) == yukVar) {
                                    cw0Var5 = c841Var.f35111d;
                                    b841Var.f24492c = 6;
                                    if (cw0Var5.m34078e(b841Var) == yukVar) {
                                    }
                                    c841Var.f35110c.f196438g = c841Var.f35108a;
                                    return w2a1Var;
                                }
                            }
                        }
                    } else {
                        uu61 uu61Var3 = new uu61(new pqm0(new tu61(), c841Var.f35108a));
                        cw0 cw0Var7 = c841Var.f35111d;
                        b841Var.f24492c = 7;
                        if (cw0.m34075c(cw0Var7, uu61Var3, b841Var) != yukVar) {
                            cw0Var6 = c841Var.f35111d;
                            b841Var.f24492c = 8;
                            if (cw0Var6.m34078e(b841Var) != yukVar) {
                                return w2a1Var;
                            }
                        }
                    }
                    return yukVar;
                case 1:
                    bga.m29073P(objM86755t);
                    sv0Var = (sv0) objM86755t;
                    if (sv0Var instanceof pv0) {
                        if (wj50.m88271j(c841Var.f35110c.f196438g, c841Var.f35108a)) {
                            return w2a1Var;
                        }
                        uu61Var2 = new uu61(new pqm0(new tu61(), c841Var.f35108a));
                        cw0Var3 = c841Var.f35111d;
                        b841Var.f24492c = 2;
                        if (cw0.m34075c(cw0Var3, uu61Var2, b841Var) == yukVar) {
                            cw0Var4 = c841Var.f35111d;
                            b841Var.f24492c = 3;
                            if (cw0Var4.m34078e(b841Var) == yukVar) {
                            }
                            c841Var.f35110c.f196438g = c841Var.f35108a;
                            return w2a1Var;
                        }
                    } else {
                        if (sv0Var instanceof qv0) {
                            cw0Var2 = c841Var.f35111d;
                            b841Var.f24492c = 4;
                            if (cw0Var2.m34078e(b841Var) == yukVar) {
                            }
                            c841Var.f35110c.f196438g = c841Var.f35108a;
                            return w2a1Var;
                        }
                        if (wj50.m88271j(sv0Var, rv0.f202973a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uu61Var = new uu61(new pqm0(new tu61(), c841Var.f35108a));
                        cw0Var = c841Var.f35111d;
                        b841Var.f24492c = 5;
                        if (cw0.m34075c(cw0Var, uu61Var, b841Var) == yukVar) {
                            cw0Var5 = c841Var.f35111d;
                            b841Var.f24492c = 6;
                            if (cw0Var5.m34078e(b841Var) == yukVar) {
                            }
                            c841Var.f35110c.f196438g = c841Var.f35108a;
                            return w2a1Var;
                        }
                    }
                    return yukVar;
                case 2:
                    bga.m29073P(objM86755t);
                    cw0Var4 = c841Var.f35111d;
                    b841Var.f24492c = 3;
                    if (cw0Var4.m34078e(b841Var) == yukVar) {
                        return yukVar;
                    }
                    c841Var.f35110c.f196438g = c841Var.f35108a;
                    return w2a1Var;
                case 3:
                case 4:
                case 6:
                    bga.m29073P(objM86755t);
                    c841Var.f35110c.f196438g = c841Var.f35108a;
                    return w2a1Var;
                case 5:
                    bga.m29073P(objM86755t);
                    cw0Var5 = c841Var.f35111d;
                    b841Var.f24492c = 6;
                    if (cw0Var5.m34078e(b841Var) == yukVar) {
                        return yukVar;
                    }
                    c841Var.f35110c.f196438g = c841Var.f35108a;
                    return w2a1Var;
                case 7:
                    bga.m29073P(objM86755t);
                    cw0Var6 = c841Var.f35111d;
                    b841Var.f24492c = 8;
                    if (cw0Var6.m34078e(b841Var) != yukVar) {
                        return yukVar;
                    }
                    return w2a1Var;
                case 8:
                    bga.m29073P(objM86755t);
                    return w2a1Var;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @Override // p204p.se20
    /* JADX INFO: renamed from: p */
    public final re20 mo29205p() {
        return this.f35114g;
    }
}

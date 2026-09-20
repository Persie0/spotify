package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class q46 implements g5w0, i6i0 {

    /* JADX INFO: renamed from: L0 */
    public final Object f185071L0;

    /* JADX INFO: renamed from: M0 */
    public final Object f185072M0;

    /* JADX INFO: renamed from: X */
    public final Object f185073X;

    /* JADX INFO: renamed from: Y */
    public final Object f185074Y;

    /* JADX INFO: renamed from: Z */
    public final Object f185075Z;

    /* JADX INFO: renamed from: a */
    public final boolean f185076a;

    /* JADX INFO: renamed from: b */
    public final Object f185077b;

    /* JADX INFO: renamed from: c */
    public final Object f185078c;

    /* JADX INFO: renamed from: d */
    public final Object f185079d;

    /* JADX INFO: renamed from: e */
    public final Object f185080e;

    /* JADX INFO: renamed from: f */
    public final Object f185081f;

    /* JADX INFO: renamed from: g */
    public final Object f185082g;

    /* JADX INFO: renamed from: h */
    public final Object f185083h;

    /* JADX INFO: renamed from: i */
    public final Object f185084i;

    /* JADX INFO: renamed from: t */
    public final Object f185085t;

    public q46(boolean z, kqi0 kqi0Var, kqi0 kqi0Var2, s0d0 s0d0Var, kqi0 kqi0Var3, kqi0 kqi0Var4, kqi0 kqi0Var5, kqi0 kqi0Var6, kqi0 kqi0Var7, kqi0 kqi0Var8, kqi0 kqi0Var9, kqi0 kqi0Var10, kqi0 kqi0Var11, kqi0 kqi0Var12, kqi0 kqi0Var13) {
        this.f185076a = z;
        this.f185077b = kqi0Var;
        this.f185078c = kqi0Var2;
        this.f185079d = s0d0Var;
        this.f185080e = kqi0Var3;
        this.f185081f = kqi0Var4;
        this.f185082g = kqi0Var5;
        this.f185083h = kqi0Var6;
        this.f185084i = kqi0Var7;
        this.f185085t = kqi0Var8;
        this.f185073X = kqi0Var9;
        this.f185074Y = kqi0Var10;
        this.f185075Z = kqi0Var11;
        this.f185071L0 = kqi0Var12;
        this.f185072M0 = kqi0Var13;
    }

    @Override // p204p.i6i0
    /* JADX INFO: renamed from: a */
    public void mo34490a(eh00 eh00Var, xq00 xq00Var, int i) {
        Object obj = eh00Var;
        Object obj2 = (kqi0) this.f185078c;
        kqi0 kqi0Var = (kqi0) this.f185077b;
        xq00Var.m91775k0(2036129482);
        int i2 = i | (xq00Var.m91770i(obj) ? 4 : 2) | (xq00Var.m91766g(this) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = this.f185076a;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM91768h = xq00Var.m91768h(z) | xq00Var.m91770i(kqi0Var) | xq00Var.m91770i(obj2) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (zM91768h || objM91750T == t6x0.f217647t) {
                Object ojiVar = new oji(this.f185076a, obj, kqi0Var, obj2, null, 2);
                xq00Var.m91793t0(ojiVar);
                objM91750T = ojiVar;
            }
            hz40.m49237i(boolValueOf, (th00) objM91750T, xq00Var);
            s0d0.m76861d((s0d0) this.f185079d, (gh00) ((kqi0) this.f185080e).getValue(), (xf4) ((kqi0) this.f185081f).getValue(), ((Boolean) ((kqi0) this.f185082g).getValue()).booleanValue(), ((Boolean) ((kqi0) this.f185083h).getValue()).booleanValue(), (eh00) ((kqi0) this.f185084i).getValue(), ((Boolean) ((kqi0) this.f185085t).getValue()).booleanValue(), ((Boolean) ((kqi0) this.f185073X).getValue()).booleanValue(), eh00Var, (String) ((kqi0) this.f185074Y).getValue(), (gh00) ((kqi0) this.f185075Z).getValue(), ((Boolean) ((kqi0) this.f185071L0).getValue()).booleanValue(), (Uri) ((kqi0) this.f185072M0).getValue(), mi21.m61822f(1.0f, cxh0.f43038a), xq00Var, (i2 << 21) & 29360128, 0);
            obj = eh00Var;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hgb0(this, obj, i, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m72144b(String str, ibk ibkVar) {
        l46 l46Var;
        if (ibkVar instanceof l46) {
            l46Var = (l46) ibkVar;
            int i = l46Var.f129577c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l46Var.f129577c = i - Integer.MIN_VALUE;
            } else {
                l46Var = new l46(this, ibkVar);
            }
        } else {
            l46Var = new l46(this, ibkVar);
        }
        Object objMo71009c = l46Var.f129575a;
        int i2 = l46Var.f129577c;
        if (i2 == 0) {
            bga.m29073P(objMo71009c);
            xso0 xso0Var = (xso0) this.f185083h;
            l46Var.f129577c = 1;
            objMo71009c = xso0Var.mo71009c(str, l46Var);
            yuk yukVar = yuk.f276404a;
            if (objMo71009c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo71009c);
        }
        tto0 tto0Var = (tto0) ((xv41) objMo71009c).getValue();
        return Boolean.valueOf((tto0Var instanceof sto0) && ((sto0) tto0Var).f213941a == qto0.f192426d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m72145c(String str, ibk ibkVar) {
        m46 m46Var;
        if (ibkVar instanceof m46) {
            m46Var = (m46) ibkVar;
            int i = m46Var.f139849c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m46Var.f139849c = i - Integer.MIN_VALUE;
            } else {
                m46Var = new m46(this, ibkVar);
            }
        } else {
            m46Var = new m46(this, ibkVar);
        }
        Object objMo71009c = m46Var.f139847a;
        int i2 = m46Var.f139849c;
        if (i2 == 0) {
            bga.m29073P(objMo71009c);
            xso0 xso0Var = (xso0) this.f185083h;
            m46Var.f139849c = 1;
            objMo71009c = xso0Var.mo71009c(str, m46Var);
            yuk yukVar = yuk.f276404a;
            if (objMo71009c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo71009c);
        }
        tto0 tto0Var = (tto0) ((xv41) objMo71009c).getValue();
        return Boolean.valueOf((tto0Var instanceof sto0) && ((sto0) tto0Var).f213941a == qto0.f192423a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.g5w0
    /* JADX INFO: renamed from: i */
    public Object mo26032i(tu41 tu41Var, d850 d850Var, fbk fbkVar) {
        p46 p46Var;
        if (fbkVar instanceof p46) {
            p46Var = (p46) fbkVar;
            int i = p46Var.f173827e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p46Var.f173827e = i - Integer.MIN_VALUE;
            } else {
                p46Var = new p46(this, (ibk) fbkVar);
            }
        } else {
            p46Var = new p46(this, (ibk) fbkVar);
        }
        Object objM72144b = p46Var.f173825c;
        int i2 = p46Var.f173827e;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar2 = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM72144b);
            it41 it41Var = tu41Var instanceof it41 ? (it41) tu41Var : null;
            if (it41Var != null) {
                String str = it41Var.f105421a.f237979a;
                p46Var.f173823a = tu41Var;
                p46Var.f173824b = d850Var;
                p46Var.f173827e = 1;
                objM72144b = m72144b(str, p46Var);
                if (objM72144b != obj) {
                }
                return obj;
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM72144b);
            return w2a1Var;
        }
        d850Var = p46Var.f173824b;
        tu41Var = p46Var.f173823a;
        bga.m29073P(objM72144b);
        tu41 tu41Var2 = tu41Var;
        d850 d850Var2 = d850Var;
        if (!((Boolean) objM72144b).booleanValue() && d850Var2 != null) {
            luk lukVar = (luk) this.f185085t;
            f81 f81Var = new f81(this, tu41Var2, d850Var2, fbkVar2, 13);
            p46Var.f173823a = null;
            p46Var.f173824b = null;
            p46Var.f173827e = 2;
            if (x0h1.m89557A(lukVar, f81Var, p46Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e A[PHI: r0 r2 r3 r5 r10
      0x004e: PHI (r0v18 java.lang.String) = (r0v14 java.lang.String), (r0v23 java.lang.String) binds: [B:67:0x015c, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r2v22 java.lang.Object) = (r2v20 java.lang.Object), (r2v1 java.lang.Object) binds: [B:67:0x015c, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r3v8 p.z650) = (r3v5 p.z650), (r3v10 p.z650) binds: [B:67:0x015c, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r5v11 long) = (r5v9 long), (r5v12 long) binds: [B:67:0x015c, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r10v9 ??) = (r10v12 ??), (r10v11 ??) binds: [B:67:0x015c, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String, p.d850, p.it41, p.z650] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String, p.d850, p.fbk, p.it41, p.z650] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String, p.d850, p.fbk, p.it41, p.z650] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, p.q46] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p.rz5] */
    @Override // p204p.g5w0
    /* JADX INFO: renamed from: m */
    public Object mo26036m(tu41 tu41Var, d850 d850Var, ibk ibkVar) {
        n46 n46Var;
        long jCurrentTimeMillis;
        it41 it41Var;
        String str;
        Object obj;
        z650 z650Var;
        String str2;
        long j;
        ?? r10;
        mp1 mp1Var;
        ?? r11;
        o46 o46Var;
        ?? r12;
        long j2;
        ?? r8;
        c26 c26Var;
        ?? r4;
        o46 o46Var2;
        d850 d850Var2 = d850Var;
        luk lukVar = (luk) this.f185085t;
        if (ibkVar instanceof n46) {
            n46Var = (n46) ibkVar;
            int i = n46Var.f150219h;
            if ((i & Integer.MIN_VALUE) != 0) {
                n46Var.f150219h = i - Integer.MIN_VALUE;
            } else {
                n46Var = new n46(this, ibkVar);
            }
        } else {
            n46Var = new n46(this, ibkVar);
        }
        n46 n46Var2 = n46Var;
        Object objM83207c = n46Var2.f150217f;
        int i2 = n46Var2.f150219h;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        switch (i2) {
            case 0:
                bga.m29073P(objM83207c);
                z650 z650Var2 = d850Var2 != null ? d850Var2.f46380a : null;
                jCurrentTimeMillis = System.currentTimeMillis();
                it41Var = tu41Var instanceof it41 ? (it41) tu41Var : null;
                if (it41Var != null) {
                    str = it41Var.f105421a.f237979a;
                    a92 a92Var = it41Var.f105433m;
                    y82 y82Var = a92Var instanceof y82 ? (y82) a92Var : null;
                    if (this.f185076a && y82Var != null && y82Var.f270173a) {
                        f81 f81Var = new f81(this, y82Var, d850Var2, fbkVar, 12);
                        n46Var2.f150212a = null;
                        n46Var2.f150213b = null;
                        n46Var2.f150214c = null;
                        n46Var2.f150215d = null;
                        n46Var2.f150216e = jCurrentTimeMillis;
                        n46Var2.f150219h = 1;
                        if (x0h1.m89557A(lukVar, f81Var, n46Var2) == yukVar) {
                        }
                    } else {
                        obj = null;
                        if (it41Var.f105431k) {
                            uiq0 uiq0Var = (uiq0) ((i4t0) this.f185075Z).get();
                            n46Var2.f150212a = d850Var2;
                            n46Var2.f150213b = null;
                            n46Var2.f150214c = it41Var;
                            n46Var2.f150215d = str;
                            n46Var2.f150216e = jCurrentTimeMillis;
                            n46Var2.f150219h = 2;
                            objM83207c = uiq0Var.m83207c(str, n46Var2);
                            if (objM83207c != yukVar) {
                                r10 = obj;
                                mp1Var = new mp1((q46) this, it41Var, d850Var2, (mna0) objM83207c, str, (fbk) null);
                                n46Var2.f150212a = r10;
                                n46Var2.f150213b = r10;
                                n46Var2.f150214c = r10;
                                n46Var2.f150215d = r10;
                                n46Var2.f150216e = jCurrentTimeMillis;
                                n46Var2.f150219h = 3;
                                if (x0h1.m89557A(lukVar, mp1Var, n46Var2) != yukVar) {
                                }
                            }
                        } else {
                            n46Var2.f150212a = null;
                            n46Var2.f150213b = z650Var2;
                            n46Var2.f150214c = null;
                            n46Var2.f150215d = str;
                            n46Var2.f150216e = jCurrentTimeMillis;
                            n46Var2.f150219h = 4;
                            Object objM72144b = m72144b(str, n46Var2);
                            if (objM72144b != yukVar) {
                                z650Var = z650Var2;
                                objM83207c = objM72144b;
                                str2 = str;
                                j = jCurrentTimeMillis;
                                r11 = obj;
                                if (((Boolean) objM83207c).booleanValue()) {
                                    o46Var = new o46(this, str2, r11, 0);
                                    n46Var2.f150212a = r11;
                                    n46Var2.f150213b = r11;
                                    n46Var2.f150214c = r11;
                                    n46Var2.f150215d = r11;
                                    n46Var2.f150216e = j;
                                    n46Var2.f150219h = 5;
                                    if (x0h1.m89557A(lukVar, o46Var, n46Var2) != yukVar) {
                                    }
                                } else {
                                    n46Var2.f150212a = r11;
                                    n46Var2.f150213b = z650Var;
                                    n46Var2.f150214c = r11;
                                    n46Var2.f150215d = str2;
                                    n46Var2.f150216e = j;
                                    n46Var2.f150219h = 6;
                                    objM83207c = m72145c(str2, n46Var2);
                                    if (objM83207c != yukVar) {
                                        r12 = r11;
                                        j2 = j;
                                        if (((Boolean) objM83207c).booleanValue()) {
                                            o46Var2 = new o46(this, str2, r12, 1);
                                            n46Var2.f150212a = r12;
                                            n46Var2.f150213b = r12;
                                            n46Var2.f150214c = r12;
                                            n46Var2.f150215d = r12;
                                            n46Var2.f150216e = j2;
                                            n46Var2.f150219h = 7;
                                            if (x0h1.m89557A(lukVar, o46Var2, n46Var2) == yukVar) {
                                            }
                                        } else {
                                            r8 = (rz5) this.f185080e;
                                            c26Var = new c26((String) this.f185078c, str2);
                                            if (z650Var != null) {
                                                r4 = z650Var.f279709a;
                                            } else {
                                                r4 = r12;
                                            }
                                            n46Var2.f150212a = r12;
                                            n46Var2.f150213b = r12;
                                            n46Var2.f150214c = r12;
                                            n46Var2.f150215d = r12;
                                            n46Var2.f150216e = j2;
                                            n46Var2.f150219h = 8;
                                            if (r8.m76779a(c26Var, r4, j2, n46Var2) == yukVar) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    r10 = obj;
                    r12 = r11;
                    return yukVar;
                }
                return w2a1Var;
            case 1:
                bga.m29073P(objM83207c);
                return w2a1Var;
            case 2:
                long j3 = n46Var2.f150216e;
                String str3 = n46Var2.f150215d;
                it41 it41Var2 = n46Var2.f150214c;
                d850 d850Var3 = n46Var2.f150212a;
                bga.m29073P(objM83207c);
                str = str3;
                it41Var = it41Var2;
                d850Var2 = d850Var3;
                jCurrentTimeMillis = j3;
                r10 = 0;
                r10 = obj;
                mp1Var = new mp1((q46) this, it41Var, d850Var2, (mna0) objM83207c, str, (fbk) null);
                n46Var2.f150212a = r10;
                n46Var2.f150213b = r10;
                n46Var2.f150214c = r10;
                n46Var2.f150215d = r10;
                n46Var2.f150216e = jCurrentTimeMillis;
                n46Var2.f150219h = 3;
                if (x0h1.m89557A(lukVar, mp1Var, n46Var2) != yukVar) {
                    return w2a1Var;
                }
                r10 = obj;
                r12 = r11;
                return yukVar;
            case 3:
                bga.m29073P(objM83207c);
                return w2a1Var;
            case 4:
                j = n46Var2.f150216e;
                str2 = n46Var2.f150215d;
                z650Var = n46Var2.f150213b;
                bga.m29073P(objM83207c);
                r11 = 0;
                if (((Boolean) objM83207c).booleanValue()) {
                    o46Var = new o46(this, str2, r11, 0);
                    n46Var2.f150212a = r11;
                    n46Var2.f150213b = r11;
                    n46Var2.f150214c = r11;
                    n46Var2.f150215d = r11;
                    n46Var2.f150216e = j;
                    n46Var2.f150219h = 5;
                    if (x0h1.m89557A(lukVar, o46Var, n46Var2) != yukVar) {
                        return w2a1Var;
                    }
                } else {
                    n46Var2.f150212a = r11;
                    n46Var2.f150213b = z650Var;
                    n46Var2.f150214c = r11;
                    n46Var2.f150215d = str2;
                    n46Var2.f150216e = j;
                    n46Var2.f150219h = 6;
                    objM83207c = m72145c(str2, n46Var2);
                    if (objM83207c != yukVar) {
                        r12 = r11;
                        j2 = j;
                        if (((Boolean) objM83207c).booleanValue()) {
                            o46Var2 = new o46(this, str2, r12, 1);
                            n46Var2.f150212a = r12;
                            n46Var2.f150213b = r12;
                            n46Var2.f150214c = r12;
                            n46Var2.f150215d = r12;
                            n46Var2.f150216e = j2;
                            n46Var2.f150219h = 7;
                            if (x0h1.m89557A(lukVar, o46Var2, n46Var2) == yukVar) {
                                return w2a1Var;
                            }
                        } else {
                            r8 = (rz5) this.f185080e;
                            c26Var = new c26((String) this.f185078c, str2);
                            if (z650Var != null) {
                                r4 = z650Var.f279709a;
                            } else {
                                r4 = r12;
                            }
                            n46Var2.f150212a = r12;
                            n46Var2.f150213b = r12;
                            n46Var2.f150214c = r12;
                            n46Var2.f150215d = r12;
                            n46Var2.f150216e = j2;
                            n46Var2.f150219h = 8;
                            if (r8.m76779a(c26Var, r4, j2, n46Var2) == yukVar) {
                                return w2a1Var;
                            }
                        }
                    }
                }
                r10 = obj;
                r12 = r11;
                return yukVar;
            case 5:
                bga.m29073P(objM83207c);
                return w2a1Var;
            case 6:
                j = n46Var2.f150216e;
                str2 = n46Var2.f150215d;
                z650Var = n46Var2.f150213b;
                bga.m29073P(objM83207c);
                r12 = 0;
                r12 = r11;
                j2 = j;
                if (((Boolean) objM83207c).booleanValue()) {
                    o46Var2 = new o46(this, str2, r12, 1);
                    n46Var2.f150212a = r12;
                    n46Var2.f150213b = r12;
                    n46Var2.f150214c = r12;
                    n46Var2.f150215d = r12;
                    n46Var2.f150216e = j2;
                    n46Var2.f150219h = 7;
                    if (x0h1.m89557A(lukVar, o46Var2, n46Var2) == yukVar) {
                        return w2a1Var;
                    }
                    r10 = obj;
                    r12 = r11;
                    return yukVar;
                }
                r8 = (rz5) this.f185080e;
                c26Var = new c26((String) this.f185078c, str2);
                if (z650Var != null) {
                    r4 = z650Var.f279709a;
                } else {
                    r4 = r12;
                }
                n46Var2.f150212a = r12;
                n46Var2.f150213b = r12;
                n46Var2.f150214c = r12;
                n46Var2.f150215d = r12;
                n46Var2.f150216e = j2;
                n46Var2.f150219h = 8;
                if (r8.m76779a(c26Var, r4, j2, n46Var2) == yukVar) {
                    return w2a1Var;
                }
                r10 = obj;
                r12 = r11;
                return yukVar;
            case 7:
                bga.m29073P(objM83207c);
                return w2a1Var;
            case 8:
                bga.m29073P(objM83207c);
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // p204p.g5w0
    /* JADX INFO: renamed from: r */
    public ad61 mo26041r() {
        return (yc61) this.f185072M0;
    }

    public q46(Context context, String str, String str2, psp pspVar, rz5 rz5Var, kbm0 kbm0Var, s4k s4kVar, xso0 xso0Var, wr9 wr9Var, luk lukVar, emx emxVar, ru00 ru00Var, i4t0 i4t0Var, xre xreVar, h62 h62Var, boolean z) {
        this.f185077b = str;
        this.f185078c = str2;
        this.f185079d = pspVar;
        this.f185080e = rz5Var;
        this.f185081f = kbm0Var;
        this.f185082g = s4kVar;
        this.f185083h = xso0Var;
        this.f185084i = wr9Var;
        this.f185085t = lukVar;
        this.f185073X = emxVar;
        this.f185074Y = ru00Var;
        this.f185075Z = i4t0Var;
        this.f185071L0 = h62Var;
        this.f185076a = z;
        qx4 qx4Var = qx4.f193491Z;
        g9k g9kVar = new g9k(context, R.style.Theme_Encore_Dark);
        int iM86386m = vtg1.m86386m(g9kVar, R.attr.brightAccentTextBase, 0);
        int iM86386m2 = vtg1.m86386m(g9kVar, R.attr.brightAccentDecorativeSubdued, 0);
        Drawable drawable = g9kVar.getDrawable(R.drawable.encore_icon_add_to_queue);
        fbk fbkVar = null;
        if (drawable != null) {
            drawable.setTint(iM86386m);
        } else {
            drawable = null;
        }
        vc61 vc61Var = drawable != null ? new vc61(iM86386m2, new qvp(drawable, null), qx4Var) : null;
        this.f185072M0 = new yc61(vc61Var != null ? new x5w0(vc61Var.f240065a, vc61Var.f240066b, new C2102lt(this, fbkVar, 11)) : null, null);
    }
}

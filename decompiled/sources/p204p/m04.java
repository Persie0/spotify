package p204p;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.compose.p002ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class m04 implements onp, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: L0 */
    public final RunnableC2210od f138498L0;

    /* JADX INFO: renamed from: X */
    public final toi0 f138499X;

    /* JADX INFO: renamed from: Y */
    public dpz0 f138500Y;

    /* JADX INFO: renamed from: Z */
    public boolean f138501Z;

    /* JADX INFO: renamed from: a */
    public final oz3 f138502a;

    /* JADX INFO: renamed from: b */
    public final ay0 f138503b;

    /* JADX INFO: renamed from: c */
    public cgj f138504c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f138505d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final long f138506e = 100;

    /* JADX INFO: renamed from: f */
    public int f138507f = 1;

    /* JADX INFO: renamed from: g */
    public boolean f138508g = true;

    /* JADX INFO: renamed from: h */
    public final bqa f138509h = xtm0.m92080a(1, 0, 6);

    /* JADX INFO: renamed from: i */
    public toi0 f138510i;

    /* JADX INFO: renamed from: t */
    public long f138511t;

    public m04(oz3 oz3Var, ay0 ay0Var) {
        this.f138502a = oz3Var;
        this.f138503b = ay0Var;
        new Handler(Looper.getMainLooper());
        toi0 toi0Var = x350.f257695a;
        this.f138510i = toi0Var;
        this.f138499X = new toi0();
        this.f138500Y = new dpz0(oz3Var.getSemanticsOwner().m42388a(), toi0Var);
        this.f138498L0 = new RunnableC2210od(this, 2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r1
      0x0047: PHI (r1v3 p.upa) = (r1v1 p.upa), (r1v2 p.upa), (r1v5 p.upa) binds: [B:16:0x003a, B:30:0x0083, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r1 r8
      0x0052: PHI (r1v2 p.upa) = (r1v3 p.upa), (r1v4 p.upa) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r8v3 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0083 -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m60399a(p204p.ibk r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p204p.l04
            if (r0 == 0) goto L13
            r0 = r8
            p.l04 r0 = (p204p.l04) r0
            int r1 = r0.f128293d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128293d = r1
            goto L18
        L13:
            p.l04 r0 = new p.l04
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f128291b
            int r1 = r0.f128293d
            r2 = 2
            r3 = 1
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            p.upa r1 = r0.f128290a
            p204p.bga.m29073P(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            p.upa r1 = r0.f128290a
            p204p.bga.m29073P(r8)
            goto L52
        L3a:
            p204p.bga.m29073P(r8)
            p.bqa r8 = r7.f138509h
            r8.getClass()
            p.upa r1 = new p.upa
            r1.<init>(r8)
        L47:
            r0.f128290a = r1
            r0.f128293d = r3
            java.lang.Object r8 = r1.m83652a(r0)
            if (r8 != r4) goto L52
            goto L85
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L86
            r1.m83653c()
            boolean r8 = r7.m60403e()
            if (r8 == 0) goto L66
            r7.m60404f()
        L66:
            p.oz3 r8 = r7.f138502a
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.f138501Z
            if (r5 != 0) goto L79
            if (r8 == 0) goto L79
            r7.f138501Z = r3
            p.od r5 = r7.f138498L0
            r8.post(r5)
        L79:
            r0.f128290a = r1
            r0.f128293d = r2
            long r5 = r7.f138506e
            java.lang.Object r8 = p204p.njg1.m64619l(r5, r0)
            if (r8 != r4) goto L47
        L85:
            return r4
        L86:
            p.w2a1 r8 = p204p.w2a1.f247311a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.m04.m60399a(p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[LOOP:2: B:21:0x006f->B:39:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d2 A[EDGE_INSN: B:91:0x00d2->B:41:0x00d2 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c9], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m60400b(w350 w350Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        long[] jArr2;
        long[] jArr3;
        long j3;
        long j4;
        w350 w350Var2 = w350Var;
        int[] iArr3 = w350Var2.f247487b;
        long[] jArr4 = w350Var2.f247486a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j5 = jArr4[i2];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j5 & 255) < 128) {
                        int i6 = iArr3[(i2 << 3) + i5];
                        c = c2;
                        dpz0 dpz0Var = (dpz0) this.f138499X.m87103b(i6);
                        epz0 epz0Var = (epz0) w350Var2.m87103b(i6);
                        cpz0 cpz0Var = epz0Var != null ? epz0Var.f61737a : null;
                        if (cpz0Var == null) {
                            throw edb.m38576y("no value for specified key");
                        }
                        j2 = j6;
                        int i7 = cpz0Var.f40691f;
                        voz0 voz0Var = cpz0Var.f40689d;
                        if (dpz0Var == null) {
                            cqi0 cqi0Var = voz0Var.f243555a;
                            Object[] objArr = cqi0Var.f40897b;
                            long[] jArr5 = cqi0Var.f40896a;
                            int length2 = jArr5.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = i3;
                                int i9 = 0;
                                while (true) {
                                    long j7 = jArr5[i9];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                lpz0 lpz0Var = (lpz0) objArr[(i9 << 3) + i11];
                                                lpz0 lpz0Var2 = hpz0.f93944a;
                                                lpz0 lpz0Var3 = hpz0.f93927C;
                                                if (wj50.m88271j(lpz0Var, lpz0Var3)) {
                                                    List list = (List) whg1.m88143p(voz0Var, lpz0Var3);
                                                    m60406h(i7, String.valueOf(list != null ? (j15) g6f.m43745s0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i8;
                                        }
                                        if (i10 != i8) {
                                            break;
                                        }
                                        if (i9 != length2) {
                                            break;
                                        }
                                        i9++;
                                        j5 = j;
                                        i8 = 8;
                                    } else if (i9 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i9++;
                                        j5 = j;
                                        i8 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            cqi0 cqi0Var2 = voz0Var.f243555a;
                            Object[] objArr2 = cqi0Var2.f40897b;
                            long[] jArr6 = cqi0Var2.f40896a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr4 = jArr4;
                                int i12 = 0;
                                while (true) {
                                    long j8 = jArr6[i12];
                                    Object[] objArr4 = objArr3;
                                    i = i5;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j8 & 255) < 128) {
                                                jArr3 = jArr6;
                                                lpz0 lpz0Var4 = (lpz0) objArr4[(i12 << 3) + i14];
                                                lpz0 lpz0Var5 = hpz0.f93944a;
                                                j3 = j8;
                                                lpz0 lpz0Var6 = hpz0.f93927C;
                                                if (wj50.m88271j(lpz0Var4, lpz0Var6)) {
                                                    List list2 = (List) whg1.m88143p(dpz0Var.f51767a, lpz0Var6);
                                                    j15 j15Var = list2 != null ? (j15) g6f.m43745s0(list2) : null;
                                                    List list3 = (List) whg1.m88143p(voz0Var, lpz0Var6);
                                                    j15 j15Var2 = list3 != null ? (j15) g6f.m43745s0(list3) : null;
                                                    if (!wj50.m88271j(j15Var, j15Var2)) {
                                                        m60406h(i7, String.valueOf(j15Var2));
                                                    }
                                                }
                                            } else {
                                                jArr3 = jArr6;
                                                j3 = j8;
                                            }
                                            j8 = j3 >> 8;
                                            i14++;
                                            jArr6 = jArr3;
                                        }
                                        jArr2 = jArr6;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr6;
                                    }
                                    if (i12 == length3) {
                                        break;
                                    }
                                    i12++;
                                    i5 = i;
                                    objArr3 = objArr4;
                                    jArr6 = jArr2;
                                }
                            }
                            j5 = j >> 8;
                            i5 = i + 1;
                            jArr4 = jArr4;
                            c2 = c;
                            j6 = j2;
                            iArr3 = iArr2;
                            i3 = 8;
                            w350Var2 = w350Var;
                        }
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                    }
                    i = i5;
                    j5 = j >> 8;
                    i5 = i + 1;
                    jArr4 = jArr4;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    i3 = 8;
                    w350Var2 = w350Var;
                }
                iArr = iArr3;
                int i15 = i3;
                jArr = jArr4;
                if (i4 != i15) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            w350Var2 = w350Var;
            jArr4 = jArr;
            iArr3 = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m60401c(cpz0 cpz0Var, th00 th00Var) {
        cpz0Var.getClass();
        List listM33569j = cpz0.m33569j(4, cpz0Var);
        int size = listM33569j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listM33569j.get(i2);
            if (m60402d().m87102a(((cpz0) obj).f40691f)) {
                th00Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final w350 m60402d() {
        if (this.f138508g) {
            this.f138508g = false;
            this.f138510i = b0g1.m27792n(this.f138502a.getSemanticsOwner(), wv3.f255340X0);
            this.f138511t = System.currentTimeMillis();
        }
        return this.f138510i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m60403e() {
        return this.f138504c != null;
    }

    /* JADX INFO: renamed from: f */
    public final void m60404f() {
        cgj cgjVar = this.f138504c;
        if (cgjVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f138505d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                agj agjVar = (agj) arrayList.get(i);
                int iM38547C = edb.m38547C(agjVar.m25860c());
                if (iM38547C == 0) {
                    vaa1 vaa1VarM25859b = agjVar.m25859b();
                    if (vaa1VarM25859b != null) {
                        ((bgj) cgjVar).m29136d(vaa1VarM25859b.m85053r());
                    }
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bgj bgjVar = (bgj) cgjVar;
                    AutofillId autofillIdM29134b = bgjVar.m29134b(agjVar.m25858a());
                    if (autofillIdM29134b != null) {
                        bgjVar.m29137e(autofillIdM29134b);
                    }
                }
            }
            ((bgj) cgjVar).m29133a();
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m60405g(cpz0 cpz0Var, dpz0 dpz0Var) {
        m60401c(cpz0Var, new C2359s1(27, dpz0Var, this));
        List listM33569j = cpz0.m33569j(4, cpz0Var);
        int size = listM33569j.size();
        for (int i = 0; i < size; i++) {
            cpz0 cpz0Var2 = (cpz0) listM33569j.get(i);
            w350 w350VarM60402d = m60402d();
            int i2 = cpz0Var2.f40691f;
            if (w350VarM60402d.m87102a(i2)) {
                toi0 toi0Var = this.f138499X;
                if (toi0Var.m87102a(i2)) {
                    Object objM87103b = toi0Var.m87103b(i2);
                    if (objM87103b == null) {
                        throw edb.m38576y("node not present in pruned tree before this change");
                    }
                    m60405g(cpz0Var2, (dpz0) objM87103b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m60406h(int i, String str) {
        cgj cgjVar;
        if (Build.VERSION.SDK_INT >= 29 && (cgjVar = this.f138504c) != null) {
            bgj bgjVar = (bgj) cgjVar;
            AutofillId autofillIdM29134b = bgjVar.m29134b(i);
            if (autofillIdM29134b == null) {
                throw edb.m38576y("Invalid content capture ID");
            }
            bgjVar.m29138f(autofillIdM29134b, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX INFO: renamed from: i */
    public final void m60407i(int i, cpz0 cpz0Var) {
        C1811ee c1811ee;
        gh00 gh00Var;
        d68 d68VarM48394i;
        AutofillId autofillIdM35102a;
        tiv0 tiv0VarM33570a;
        vaa1 vaa1Var;
        String strM78201F;
        gh00 gh00Var2;
        if (m60403e()) {
            voz0 voz0Var = cpz0Var.f40689d;
            Boolean bool = (Boolean) whg1.m88143p(voz0Var, hpz0.f93929E);
            if (this.f138507f == 1 && wj50.m88271j(bool, Boolean.TRUE)) {
                C1811ee c1811ee2 = (C1811ee) whg1.m88143p(voz0Var, toz0.f222358m);
                if (c1811ee2 != null && (gh00Var2 = (gh00) c1811ee2.f58630b) != null) {
                }
            } else if (this.f138507f == 2 && wj50.m88271j(bool, Boolean.FALSE) && (c1811ee = (C1811ee) whg1.m88143p(voz0Var, toz0.f222358m)) != null && (gh00Var = (gh00) c1811ee.f58630b) != null) {
            }
            int i2 = cpz0Var.f40691f;
            cgj cgjVar = this.f138504c;
            if (cgjVar == null || Build.VERSION.SDK_INT < 29 || (d68VarM48394i = hrg1.m48394i(this.f138502a)) == null) {
                vaa1Var = null;
            } else {
                cpz0 cpz0VarM33580l = cpz0Var.m33580l();
                int i3 = cpz0Var.f40691f;
                if (cpz0VarM33580l != null) {
                    autofillIdM35102a = ((bgj) cgjVar).m29134b(cpz0VarM33580l.f40691f);
                    if (autofillIdM35102a == null) {
                        vaa1Var = null;
                    }
                } else {
                    autofillIdM35102a = d68VarM48394i.m35102a();
                }
                vaa1 vaa1VarM29135c = ((bgj) cgjVar).m29135c(autofillIdM35102a, i3);
                if (vaa1VarM29135c == null) {
                    vaa1Var = null;
                } else {
                    voz0 voz0Var2 = cpz0Var.f40689d;
                    if (voz0Var2.f243555a.m33619c(hpz0.f93938N)) {
                        vaa1Var = null;
                    } else {
                        Bundle bundleM85041c = vaa1VarM29135c.m85041c();
                        if (bundleM85041c != null) {
                            bundleM85041c.putLong("android.view.contentcapture.EventTimestamp", this.f138511t);
                            bundleM85041c.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        String str = (String) whg1.m88143p(voz0Var2, hpz0.f93925A);
                        if (str != null) {
                            vaa1VarM29135c.m85049n(i3, str);
                        }
                        if (((Boolean) whg1.m88143p(voz0Var2, hpz0.f93957n)) != null) {
                            vaa1VarM29135c.m85046k("android.widget.ViewGroup");
                        }
                        List list = (List) whg1.m88143p(voz0Var2, hpz0.f93927C);
                        if (list != null) {
                            vaa1VarM29135c.m85046k("android.widget.TextView");
                            vaa1VarM29135c.m85050o(q690.m72221b(list, "\n", null, 62));
                        }
                        j15 j15Var = (j15) whg1.m88143p(voz0Var2, hpz0.f93931G);
                        if (j15Var != null) {
                            vaa1VarM29135c.m85046k("android.widget.EditText");
                            vaa1VarM29135c.m85050o(j15Var);
                        }
                        List list2 = (List) whg1.m88143p(voz0Var2, hpz0.f93944a);
                        if (list2 != null) {
                            vaa1VarM29135c.m85047l(q690.m72221b(list2, "\n", null, 62));
                        }
                        tix0 tix0Var = (tix0) whg1.m88143p(voz0Var2, hpz0.f93969z);
                        if (tix0Var != null && (strM78201F = sig1.m78201F(tix0Var.f220762a)) != null) {
                            vaa1VarM29135c.m85046k(strM78201F);
                        }
                        db71 db71VarM78224u = sig1.m78224u(voz0Var2);
                        if (db71VarM78224u != null) {
                            cb71 cb71Var = db71VarM78224u.f47230a;
                            if71 if71Var = cb71Var.f36034b;
                            yqq yqqVar = cb71Var.f36039g;
                            vaa1VarM29135c.m85051p(yqqVar.mo24617W0() * yqqVar.mo24619j() * TextUnit.m308c(if71Var.f101704a.f63411b));
                        }
                        bnj0 bnj0VarM33573d = cpz0Var.m33573d();
                        if (bnj0VarM33573d == null) {
                            tiv0VarM33570a = tiv0.f220750e;
                        } else {
                            bnj0 bnj0Var = bnj0VarM33573d.mo30020b1().f63766L0 ? bnj0VarM33573d : null;
                            if (bnj0Var != null) {
                                tiv0VarM33570a = cpz0Var.m33570a(bnj0Var);
                            } else {
                                tiv0VarM33570a = tiv0.f220750e;
                            }
                        }
                        float f = tiv0VarM33570a.f220751a;
                        float f2 = tiv0VarM33570a.f220752b;
                        vaa1VarM29135c.m85048m((int) f, (int) f2, (int) (tiv0VarM33570a.f220753c - f), (int) (tiv0VarM33570a.f220754d - f2));
                        vaa1Var = vaa1VarM29135c;
                    }
                }
            }
            if (vaa1Var != null) {
                this.f138505d.add(new agj(i2, this.f138511t, 1, vaa1Var));
            }
            m60401c(cpz0Var, new l82(this, 17));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m60408j(cpz0 cpz0Var) {
        if (m60403e()) {
            this.f138505d.add(new agj(cpz0Var.f40691f, this.f138511t, 2, null));
            List listM33569j = cpz0.m33569j(4, cpz0Var);
            int size = listM33569j.size();
            for (int i = 0; i < size; i++) {
                m60408j((cpz0) listM33569j.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m60409k() {
        toi0 toi0Var = this.f138499X;
        toi0Var.m81195c();
        w350 w350VarM60402d = m60402d();
        int[] iArr = w350VarM60402d.f247487b;
        Object[] objArr = w350VarM60402d.f247488c;
        long[] jArr = w350VarM60402d.f247486a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            toi0Var.m81201i(iArr[i4], new dpz0(((epz0) objArr[i4]).f61737a, m60402d()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f138500Y = new dpz0(this.f138502a.getSemanticsOwner().m42388a(), m60402d());
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f138504c = (cgj) this.f138503b.invoke();
        m60407i(-1, this.f138502a.getSemanticsOwner().m42388a());
        m60404f();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        m60408j(this.f138502a.getSemanticsOwner().m42388a());
        m60404f();
        this.f138504c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f138502a.getHandler();
        wj50.m88279p(handler);
        handler.removeCallbacks(this.f138498L0);
        this.f138504c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

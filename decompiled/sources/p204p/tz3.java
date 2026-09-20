package p204p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class tz3 extends C2647ze implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: l1 */
    public static final soi0 f225101l1;

    /* JADX INFO: renamed from: L0 */
    public C2374sf f225102L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f225103M0;

    /* JADX INFO: renamed from: N0 */
    public final toi0 f225104N0;

    /* JADX INFO: renamed from: O0 */
    public final toi0 f225105O0;

    /* JADX INFO: renamed from: P0 */
    public final mw31 f225106P0;

    /* JADX INFO: renamed from: Q0 */
    public final mw31 f225107Q0;

    /* JADX INFO: renamed from: R0 */
    public int f225108R0;

    /* JADX INFO: renamed from: S0 */
    public Integer f225109S0;

    /* JADX INFO: renamed from: T0 */
    public final zj5 f225110T0;

    /* JADX INFO: renamed from: U0 */
    public final bqa f225111U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f225112V0;

    /* JADX INFO: renamed from: W0 */
    public qz3 f225113W0;

    /* JADX INFO: renamed from: X */
    public int f225114X;

    /* JADX INFO: renamed from: X0 */
    public toi0 f225115X0;

    /* JADX INFO: renamed from: Y */
    public int f225116Y;

    /* JADX INFO: renamed from: Y0 */
    public final uoi0 f225117Y0;

    /* JADX INFO: renamed from: Z */
    public C2374sf f225118Z;

    /* JADX INFO: renamed from: Z0 */
    public final roi0 f225119Z0;

    /* JADX INFO: renamed from: a1 */
    public final roi0 f225120a1;

    /* JADX INFO: renamed from: b1 */
    public final String f225121b1;

    /* JADX INFO: renamed from: c1 */
    public final String f225122c1;

    /* JADX INFO: renamed from: d */
    public final oz3 f225123d;

    /* JADX INFO: renamed from: d1 */
    public final yb81 f225124d1;

    /* JADX INFO: renamed from: e1 */
    public final toi0 f225126e1;

    /* JADX INFO: renamed from: f1 */
    public dpz0 f225128f1;

    /* JADX INFO: renamed from: g */
    public final AccessibilityManager f225129g;

    /* JADX INFO: renamed from: g1 */
    public boolean f225130g1;

    /* JADX INFO: renamed from: h1 */
    public final roi0 f225132h1;

    /* JADX INFO: renamed from: i */
    public List f225133i;

    /* JADX INFO: renamed from: i1 */
    public final RunnableC2364s6 f225134i1;

    /* JADX INFO: renamed from: j1 */
    public final ArrayList f225135j1;

    /* JADX INFO: renamed from: k1 */
    public final k23 f225136k1;

    /* JADX INFO: renamed from: t */
    public final pz3 f225137t;

    /* JADX INFO: renamed from: e */
    public int f225125e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public final j20 f225127f = new j20(this, 4);

    /* JADX INFO: renamed from: h */
    public long f225131h = 100;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        soi0 soi0Var = u350.f226270a;
        soi0 soi0Var2 = new soi0(32);
        int i = soi0Var2.f211200b;
        if (i < 0) {
            epv0.m39675K("");
            throw null;
        }
        int i2 = i + 32;
        soi0Var2.m78649b(i2);
        int[] iArr2 = soi0Var2.f211199a;
        int i3 = soi0Var2.f211200b;
        if (i != i3) {
            bk5.m29627o0(i2, i, i3, iArr2, iArr2);
        }
        bk5.m29635t0(i, 0, 12, iArr, iArr2);
        soi0Var2.f211200b += 32;
        f225101l1 = soi0Var2;
    }

    public tz3(oz3 oz3Var) {
        this.f225123d = oz3Var;
        this.f225129g = (AccessibilityManager) oz3Var.getContext().getSystemService("accessibility");
        new Handler(Looper.getMainLooper());
        this.f225137t = new pz3(this);
        this.f225114X = Integer.MIN_VALUE;
        this.f225116Y = Integer.MIN_VALUE;
        this.f225104N0 = new toi0();
        this.f225105O0 = new toi0();
        this.f225106P0 = new mw31(0);
        this.f225107Q0 = new mw31(0);
        this.f225108R0 = -1;
        this.f225110T0 = new zj5(0);
        this.f225111U0 = xtm0.m92080a(1, 0, 6);
        this.f225112V0 = true;
        toi0 toi0Var = x350.f257695a;
        this.f225115X0 = toi0Var;
        this.f225117Y0 = new uoi0();
        this.f225119Z0 = new roi0();
        this.f225120a1 = new roi0();
        this.f225121b1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f225122c1 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f225124d1 = new yb81(12);
        this.f225126e1 = new toi0();
        this.f225128f1 = new dpz0(oz3Var.getSemanticsOwner().m42388a(), toi0Var);
        int i = r350.f195426a;
        this.f225132h1 = new roi0();
        oz3Var.addOnAttachStateChangeListener(this);
        this.f225134i1 = new RunnableC2364s6(this, 1);
        this.f225135j1 = new ArrayList();
        this.f225136k1 = new k23(this, 19);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m82017E(tz3 tz3Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        tz3Var.m82029D(i, i2, num, null);
    }

    /* JADX INFO: renamed from: L */
    public static Rect m82018L(ncg1 ncg1Var, float f, float f2) {
        if (!(ncg1Var instanceof lyl0) && !(ncg1Var instanceof myl0)) {
            return null;
        }
        tiv0 tiv0VarMo57721q = ncg1Var.mo57721q();
        return new Rect((int) (tiv0VarMo57721q.f220751a + f), (int) (tiv0VarMo57721q.f220752b + f2), (int) (tiv0VarMo57721q.f220753c + f), (int) (tiv0VarMo57721q.f220754d + f2));
    }

    /* JADX INFO: renamed from: N */
    public static float[] m82019N(ncg1 ncg1Var) {
        if (!(ncg1Var instanceof myl0)) {
            return null;
        }
        zlx0 zlx0Var = ((myl0) ncg1Var).f148481d;
        long j = zlx0Var.f284102h;
        long j2 = zlx0Var.f284101g;
        long j3 = zlx0Var.f284100f;
        long j4 = zlx0Var.f284099e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: O */
    public static Region m82020O(ncg1 ncg1Var, float f, float f2) {
        if (!(ncg1Var instanceof kyl0)) {
            return null;
        }
        kyl0 kyl0Var = (kyl0) ncg1Var;
        tiv0 tiv0VarM80940l = kyl0Var.mo57721q().m80940l(f, f2);
        Region region = new Region(new Rect((int) (tiv0VarM80940l.f220751a + 0.0f), (int) (tiv0VarM80940l.f220752b + 0.0f), (int) (tiv0VarM80940l.f220753c + 0.0f), (int) (tiv0VarM80940l.f220754d + 0.0f)));
        Region region2 = new Region();
        vbn0 vbn0Var = kyl0Var.f127886d;
        if (!(vbn0Var instanceof uk4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((uk4) vbn0Var).f231212a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m82021P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: t */
    public static String m82022t(cpz0 cpz0Var) {
        j15 j15Var;
        if (cpz0Var != null) {
            voz0 voz0Var = cpz0Var.f40689d;
            cqi0 cqi0Var = voz0Var.f243555a;
            lpz0 lpz0Var = hpz0.f93944a;
            if (cqi0Var.m33619c(lpz0Var)) {
                return q690.m72221b((List) voz0Var.m86110d(lpz0Var), ",", null, 62);
            }
            lpz0 lpz0Var2 = hpz0.f93931G;
            if (cqi0Var.m33619c(lpz0Var2)) {
                j15 j15Var2 = (j15) whg1.m88143p(voz0Var, lpz0Var2);
                if (j15Var2 != null) {
                    return j15Var2.f107641b;
                }
            } else {
                List list = (List) whg1.m88143p(voz0Var, hpz0.f93927C);
                if (list != null && (j15Var = (j15) g6f.m43745s0(list)) != null) {
                    return j15Var.f107641b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m82023x(bky0 bky0Var, float f) {
        eh00 eh00Var = bky0Var.f28041a;
        if (f >= 0.0f || ((Number) eh00Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) eh00Var.invoke()).floatValue() < ((Number) bky0Var.f28042b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m82024y(bky0 bky0Var) {
        eh00 eh00Var = bky0Var.f28041a;
        boolean z = bky0Var.f28043c;
        if (((Number) eh00Var.invoke()).floatValue() <= 0.0f || z) {
            return ((Number) eh00Var.invoke()).floatValue() < ((Number) bky0Var.f28042b.invoke()).floatValue() && z;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m82025z(bky0 bky0Var) {
        eh00 eh00Var = bky0Var.f28041a;
        boolean z = bky0Var.f28043c;
        if (((Number) eh00Var.invoke()).floatValue() >= ((Number) bky0Var.f28042b.invoke()).floatValue() || z) {
            return ((Number) eh00Var.invoke()).floatValue() > 0.0f && z;
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final int m82026A(int i) {
        if (i == this.f225123d.getSemanticsOwner().m42388a().f40691f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public final void m82027B(cpz0 cpz0Var, dpz0 dpz0Var) {
        int[] iArr = f450.f65676a;
        uoi0 uoi0Var = new uoi0();
        List listM33569j = cpz0.m33569j(4, cpz0Var);
        lp70 lp70Var = cpz0Var.f40688c;
        int size = listM33569j.size();
        for (int i = 0; i < size; i++) {
            cpz0 cpz0Var2 = (cpz0) listM33569j.get(i);
            w350 w350VarM82047s = m82047s();
            int i2 = cpz0Var2.f40691f;
            if (w350VarM82047s.m87102a(i2)) {
                if (!dpz0Var.f51768b.m83622c(i2)) {
                    m82050w(lp70Var);
                    return;
                }
                uoi0Var.m83620a(i2);
            }
        }
        uoi0 uoi0Var2 = dpz0Var.f51768b;
        int[] iArr2 = uoi0Var2.f232444b;
        long[] jArr = uoi0Var2.f232443a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !uoi0Var.m83622c(iArr2[(i3 << 3) + i5])) {
                            m82050w(lp70Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listM33569j2 = cpz0.m33569j(4, cpz0Var);
        int size2 = listM33569j2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            cpz0 cpz0Var3 = (cpz0) listM33569j2.get(i6);
            dpz0 dpz0Var2 = (dpz0) this.f225126e1.m87103b(cpz0Var3.f40691f);
            if (dpz0Var2 != null && m82047s().m87102a(cpz0Var3.f40691f)) {
                m82027B(cpz0Var3, dpz0Var2);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m82028C(AccessibilityEvent accessibilityEvent) {
        if (!m82049v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f225103M0 = true;
        }
        try {
            return ((Boolean) this.f225127f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f225103M0 = false;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m82029D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m82049v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM82043o = m82043o(i, i2);
        if (num != null) {
            accessibilityEventM82043o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM82043o.setContentDescription(q690.m72221b(list, ",", null, 62));
        }
        return m82028C(accessibilityEventM82043o);
    }

    /* JADX INFO: renamed from: F */
    public final void m82030F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventM82043o = m82043o(m82026A(i), 32);
        accessibilityEventM82043o.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM82043o.getText().add(str);
        }
        m82028C(accessibilityEventM82043o);
    }

    /* JADX INFO: renamed from: G */
    public final void m82031G(int i) {
        qz3 qz3Var = this.f225113W0;
        if (qz3Var != null) {
            if (i != qz3Var.m74282d().f40691f) {
                return;
            }
            if (SystemClock.uptimeMillis() - qz3Var.m74284f() <= 1000) {
                AccessibilityEvent accessibilityEventM82043o = m82043o(m82026A(qz3Var.m74282d().f40691f), 131072);
                accessibilityEventM82043o.setFromIndex(qz3Var.m74280b());
                accessibilityEventM82043o.setToIndex(qz3Var.m74283e());
                accessibilityEventM82043o.setAction(qz3Var.m74279a());
                accessibilityEventM82043o.setMovementGranularity(qz3Var.m74281c());
                accessibilityEventM82043o.getText().add(m82022t(qz3Var.m74282d()));
                m82028C(accessibilityEventM82043o);
            }
        }
        this.f225113W0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x04dd A[PHI: r41 r42
      0x04dd: PHI (r41v11 int) = (r41v10 int), (r41v10 int), (r41v12 int) binds: [B:184:0x04e6, B:186:0x04f2, B:181:0x04db] A[DONT_GENERATE, DONT_INLINE]
      0x04dd: PHI (r42v6 boolean) = (r42v5 boolean), (r42v5 boolean), (r42v7 boolean) binds: [B:184:0x04e6, B:186:0x04f2, B:181:0x04db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:210:0x05e4  */
    /* JADX WARN: Not found block with instruction: 0x02d6: MOVE (r4v7 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:727) */
    /* JADX INFO: renamed from: H */
    public final void m82032H(w350 w350Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        Integer num4;
        voz0 voz0Var;
        cpz0 cpz0Var;
        int i6;
        boolean zM30563o;
        cqi0 cqi0Var;
        int i7;
        cqi0 cqi0Var2;
        lp70 lp70Var;
        int i8;
        int i9;
        ArrayList arrayList3;
        long j;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int i12;
        String str;
        int i13;
        int i14;
        AccessibilityEvent accessibilityEventM82044p;
        lp70 lp70Var2;
        w350 w350Var2 = w350Var;
        Integer num5 = 64;
        ArrayList arrayList4 = this.f225135j1;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = w350Var2.f247487b;
        long[] jArr3 = w350Var2.f247486a;
        int i15 = 2;
        int length = jArr3.length - 2;
        int i16 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j2 = jArr3[i17];
            int i18 = i15;
            int i19 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i20 = 8;
                int i21 = 8 - ((~(i17 - i19)) >>> 31);
                long j3 = j2;
                int i22 = i16;
                while (i22 < i21) {
                    if ((j3 & 255) < 128) {
                        int i23 = iArr3[(i17 << 3) + i22];
                        dpz0 dpz0Var = (dpz0) this.f225126e1.m87103b(i23);
                        if (dpz0Var == null) {
                            i2 = i22;
                            num3 = num5;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i20;
                            i4 = i21;
                            i5 = i17;
                            num4 = num6;
                        } else {
                            voz0 voz0Var2 = dpz0Var.f51767a;
                            cqi0 cqi0Var3 = voz0Var2.f243555a;
                            epz0 epz0Var = (epz0) w350Var2.m87103b(i23);
                            int i24 = i20;
                            cpz0 cpz0Var2 = epz0Var != null ? epz0Var.f61737a : null;
                            if (cpz0Var2 == null) {
                                throw edb.m38576y("no value for specified key");
                            }
                            lp70 lp70Var3 = cpz0Var2.f40688c;
                            voz0 voz0Var3 = cpz0Var2.f40689d;
                            iArr2 = iArr3;
                            int i25 = cpz0Var2.f40691f;
                            jArr2 = jArr3;
                            cqi0 cqi0Var4 = voz0Var3.f243555a;
                            i5 = i17;
                            Object[] objArr = cqi0Var4.f40897b;
                            Object[] objArr2 = cqi0Var4.f40898c;
                            long[] jArr4 = cqi0Var4.f40896a;
                            i2 = i22;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                int i26 = i25;
                                cqi0 cqi0Var5 = cqi0Var4;
                                int i27 = 0;
                                zM30563o = false;
                                while (true) {
                                    long j4 = jArr4[i27];
                                    lp70 lp70Var4 = lp70Var3;
                                    i4 = i21;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j4 & 255) < 128) {
                                                int i30 = (i27 << 3) + i29;
                                                Object obj = objArr[i30];
                                                int i31 = length2;
                                                Object obj2 = objArr2[i30];
                                                j = j4;
                                                lpz0 lpz0Var = (lpz0) obj;
                                                lpz0 lpz0Var2 = hpz0.f93965v;
                                                i10 = i29;
                                                if (wj50.m88271j(lpz0Var, lpz0Var2) || wj50.m88271j(lpz0Var, hpz0.f93966w)) {
                                                    kly0 kly0VarM78221r = sig1.m78221r(i23, arrayList5);
                                                    if (kly0VarM78221r != null) {
                                                        z = false;
                                                    } else {
                                                        kly0VarM78221r = new kly0(i23, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(kly0VarM78221r);
                                                } else {
                                                    z = false;
                                                }
                                                if (z || !wj50.m88271j(obj2, whg1.m88143p(voz0Var2, lpz0Var))) {
                                                    lpz0 lpz0Var3 = hpz0.f93947d;
                                                    if (wj50.m88271j(lpz0Var, lpz0Var3)) {
                                                        String str2 = (String) obj2;
                                                        boolean zM33619c = cqi0Var3.m33619c(lpz0Var3);
                                                        int i32 = i24;
                                                        if (zM33619c) {
                                                            m82030F(i23, i32, str2);
                                                        }
                                                    } else if (wj50.m88271j(lpz0Var, hpz0.f93945b)) {
                                                        m82017E(this, m82026A(i23), 2048, num5, 8);
                                                        m82017E(this, m82026A(i23), 2048, num6, 8);
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        if (wj50.m88271j(lpz0Var, hpz0.f93936L)) {
                                                            m82017E(this, m82026A(i23), 2048, 8192, 8);
                                                            m82017E(this, m82026A(i23), 2048, num6, 8);
                                                        } else if (wj50.m88271j(lpz0Var, hpz0.f93939O)) {
                                                            m82017E(this, m82026A(i23), 2048, 3072, 8);
                                                        } else if (wj50.m88271j(lpz0Var, hpz0.f93946c)) {
                                                            m82017E(this, m82026A(i23), 2048, num5, 8);
                                                            m82017E(this, m82026A(i23), 2048, num6, 8);
                                                        } else {
                                                            lpz0 lpz0Var4 = hpz0.f93935K;
                                                            if (wj50.m88271j(lpz0Var, lpz0Var4)) {
                                                                tix0 tix0Var = (tix0) whg1.m88143p(voz0Var3, hpz0.f93969z);
                                                                if (!(tix0Var != null && tix0Var.f220762a == 4)) {
                                                                    lp70Var2 = lp70Var4;
                                                                    m82017E(this, m82026A(i23), 2048, num5, 8);
                                                                    m82017E(this, m82026A(i23), 2048, num6, 8);
                                                                } else if (wj50.m88271j(whg1.m88143p(voz0Var3, lpz0Var4), Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventM82043o = m82043o(m82026A(i23), 4);
                                                                    lp70Var2 = lp70Var4;
                                                                    cpz0 cpz0Var3 = new cpz0(cpz0Var2.f40686a, true, lp70Var2, voz0Var3);
                                                                    List list = (List) whg1.m88143p(cpz0Var3.m33579k(), hpz0.f93944a);
                                                                    String strM72221b = list != null ? q690.m72221b(list, ",", null, 62) : null;
                                                                    List list2 = (List) whg1.m88143p(cpz0Var3.m33579k(), hpz0.f93927C);
                                                                    String strM72221b2 = list2 != null ? q690.m72221b(list2, ",", null, 62) : null;
                                                                    if (strM72221b != null) {
                                                                        accessibilityEventM82043o.setContentDescription(strM72221b);
                                                                    }
                                                                    if (strM72221b2 != null) {
                                                                        accessibilityEventM82043o.getText().add(strM72221b2);
                                                                    }
                                                                    m82028C(accessibilityEventM82043o);
                                                                } else {
                                                                    lp70Var2 = lp70Var4;
                                                                    m82017E(this, m82026A(i23), 2048, num6, 8);
                                                                }
                                                                lp70Var4 = lp70Var2;
                                                            } else {
                                                                cpz0Var2 = cpz0Var2;
                                                                i27 = i27;
                                                                lp70Var4 = lp70Var4;
                                                                if (wj50.m88271j(lpz0Var, hpz0.f93944a)) {
                                                                    m82029D(m82026A(i23), 2048, 4, (List) obj2);
                                                                } else {
                                                                    lpz0 lpz0Var5 = hpz0.f93931G;
                                                                    String str3 = "";
                                                                    if (wj50.m88271j(lpz0Var, lpz0Var5)) {
                                                                        cqi0Var5 = cqi0Var5;
                                                                        if (cqi0Var5.m33619c(toz0.f222356k)) {
                                                                            j15 j15Var = (j15) whg1.m88143p(voz0Var2, lpz0Var5);
                                                                            if (j15Var == null) {
                                                                                j15Var = "";
                                                                            }
                                                                            CharSequence charSequence = (j15) whg1.m88143p(voz0Var3, lpz0Var5);
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence charSequenceM82021P = m82021P(charSequence);
                                                                            int length3 = j15Var.length();
                                                                            int length4 = charSequence.length();
                                                                            Integer num7 = num6;
                                                                            int i33 = length3 > length4 ? length4 : length3;
                                                                            int i34 = 0;
                                                                            while (true) {
                                                                                i13 = i33;
                                                                                if (i34 >= i33) {
                                                                                    num5 = num5;
                                                                                    break;
                                                                                }
                                                                                num5 = num5;
                                                                                if (j15Var.charAt(i34) != charSequence.charAt(i34)) {
                                                                                    break;
                                                                                }
                                                                                i34++;
                                                                                i33 = i13;
                                                                                num5 = num5;
                                                                            }
                                                                            int i35 = 0;
                                                                            while (true) {
                                                                                if (i35 >= i13 - i34) {
                                                                                    i14 = i35;
                                                                                    break;
                                                                                }
                                                                                i14 = i35;
                                                                                if (j15Var.charAt((length3 - 1) - i35) != charSequence.charAt((length4 - 1) - i14)) {
                                                                                    break;
                                                                                } else {
                                                                                    i35 = i14 + 1;
                                                                                }
                                                                            }
                                                                            int i36 = (length3 - i14) - i34;
                                                                            int i37 = (length4 - i14) - i34;
                                                                            lpz0 lpz0Var6 = hpz0.f93938N;
                                                                            boolean zM33619c2 = cqi0Var3.m33619c(lpz0Var6);
                                                                            boolean zM33619c3 = cqi0Var5.m33619c(lpz0Var6);
                                                                            boolean zM33619c4 = cqi0Var3.m33619c(hpz0.f93931G);
                                                                            boolean z3 = zM33619c4 && !zM33619c2 && zM33619c3;
                                                                            boolean z4 = zM33619c4 && zM33619c2 && !zM33619c3;
                                                                            if (z3 || z4) {
                                                                                i23 = i23;
                                                                                num6 = num7;
                                                                                accessibilityEventM82044p = m82044p(m82026A(i23), num6, num7, Integer.valueOf(length4), charSequenceM82021P);
                                                                            } else {
                                                                                AccessibilityEvent accessibilityEventM82043o2 = m82043o(m82026A(i23), 16);
                                                                                accessibilityEventM82043o2.setFromIndex(i34);
                                                                                accessibilityEventM82043o2.setRemovedCount(i36);
                                                                                accessibilityEventM82043o2.setAddedCount(i37);
                                                                                accessibilityEventM82043o2.setBeforeText(j15Var);
                                                                                accessibilityEventM82043o2.getText().add(charSequenceM82021P);
                                                                                accessibilityEventM82044p = accessibilityEventM82043o2;
                                                                                num6 = num7;
                                                                                i23 = i23;
                                                                            }
                                                                            accessibilityEventM82044p.setClassName("android.widget.EditText");
                                                                            m82028C(accessibilityEventM82044p);
                                                                            if (z3 || z4) {
                                                                                long j5 = ((ic71) voz0Var3.m86110d(hpz0.f93932H)).f100752a;
                                                                                accessibilityEventM82044p.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventM82044p.setToIndex((int) (j5 & 4294967295L));
                                                                                m82028C(accessibilityEventM82044p);
                                                                            }
                                                                        } else {
                                                                            num5 = num5;
                                                                            i31 = i31;
                                                                            i23 = i23;
                                                                            cqi0Var3 = cqi0Var3;
                                                                            m82017E(this, m82026A(i23), 2048, Integer.valueOf(i18), 8);
                                                                        }
                                                                        i11 = i31;
                                                                        i26 = i26;
                                                                        num6 = num6;
                                                                    } else {
                                                                        voz0Var2 = voz0Var2;
                                                                        num5 = num5;
                                                                        cqi0Var5 = cqi0Var5;
                                                                        i23 = i23;
                                                                        i11 = i31;
                                                                        cqi0Var3 = cqi0Var3;
                                                                        lpz0 lpz0Var7 = hpz0.f93932H;
                                                                        if (wj50.m88271j(lpz0Var, lpz0Var7)) {
                                                                            j15 j15Var2 = (j15) whg1.m88143p(voz0Var3, lpz0Var5);
                                                                            if (j15Var2 != null && (str = j15Var2.f107641b) != null) {
                                                                                str3 = str;
                                                                            }
                                                                            long j6 = ((ic71) voz0Var3.m86110d(lpz0Var7)).f100752a;
                                                                            num6 = num6;
                                                                            m82028C(m82044p(m82026A(i23), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), m82021P(str3)));
                                                                            int i38 = i26;
                                                                            m82031G(i38);
                                                                            i26 = i38;
                                                                            i11 = i11;
                                                                        } else {
                                                                            num6 = num6;
                                                                            int i39 = i26;
                                                                            if (wj50.m88271j(lpz0Var, lpz0Var2) || wj50.m88271j(lpz0Var, hpz0.f93966w)) {
                                                                                i26 = i39;
                                                                                m82050w(lp70Var4);
                                                                                kly0 kly0VarM78221r2 = sig1.m78221r(i23, arrayList4);
                                                                                wj50.m88279p(kly0VarM78221r2);
                                                                                kly0VarM78221r2.m56859a((bky0) whg1.m88143p(voz0Var3, lpz0Var2));
                                                                                kly0VarM78221r2.m56860b((bky0) whg1.m88143p(voz0Var3, hpz0.f93966w));
                                                                                if (kly0VarM78221r2.mo29991B0()) {
                                                                                    this.f225123d.getSnapshotObserver().f108103a.m61344d(kly0VarM78221r2, this.f225136k1, new zq2(10, kly0VarM78221r2, this));
                                                                                }
                                                                            } else if (wj50.m88271j(lpz0Var, hpz0.f93955l)) {
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    m82028C(m82043o(m82026A(i39), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                m82017E(this, m82026A(i39), 2048, num6, i12);
                                                                                i26 = i39;
                                                                            } else {
                                                                                lpz0 lpz0Var8 = toz0.f222369x;
                                                                                if (wj50.m88271j(lpz0Var, lpz0Var8)) {
                                                                                    List list3 = (List) voz0Var3.m86110d(lpz0Var8);
                                                                                    List list4 = (List) whg1.m88143p(voz0Var2, lpz0Var8);
                                                                                    if (list4 != null) {
                                                                                        dqi0 dqi0Var = sdy0.f208112a;
                                                                                        dqi0 dqi0Var2 = new dqi0();
                                                                                        int size = list3.size();
                                                                                        int i40 = 0;
                                                                                        while (i40 < size) {
                                                                                            dqi0Var2.m36642a(((d9m) list3.get(i40)).m35377a());
                                                                                            i40++;
                                                                                            list3 = list3;
                                                                                        }
                                                                                        dqi0 dqi0Var3 = new dqi0();
                                                                                        int size2 = list4.size();
                                                                                        int i41 = 0;
                                                                                        while (i41 < size2) {
                                                                                            dqi0Var3.m36642a(((d9m) list4.get(i41)).m35377a());
                                                                                            i41++;
                                                                                            i39 = i39;
                                                                                        }
                                                                                        i26 = i39;
                                                                                        zM30563o = !dqi0Var2.equals(dqi0Var3);
                                                                                    } else {
                                                                                        i26 = i39;
                                                                                        z2 = true;
                                                                                        if (!list3.isEmpty()) {
                                                                                            zM30563o = z2;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i26 = i39;
                                                                                    z2 = true;
                                                                                    if ((obj2 instanceof C1811ee) && bul.m30558j((C1811ee) obj2, whg1.m88143p(voz0Var2, lpz0Var))) {
                                                                                        zM30563o = false;
                                                                                    } else {
                                                                                        zM30563o = z2;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            cqi0Var5 = cqi0Var5;
                                                            i11 = i31;
                                                            cqi0Var3 = cqi0Var3;
                                                        }
                                                        voz0Var2 = voz0Var2;
                                                        i11 = i31;
                                                        cqi0Var3 = cqi0Var3;
                                                    }
                                                    arrayList3 = arrayList5;
                                                    voz0Var2 = voz0Var2;
                                                    i11 = i31;
                                                    cqi0Var3 = cqi0Var3;
                                                } else {
                                                    arrayList3 = arrayList5;
                                                    voz0Var2 = voz0Var2;
                                                    i11 = i31;
                                                    cqi0Var3 = cqi0Var3;
                                                }
                                            } else {
                                                cqi0Var3 = cqi0Var3;
                                                num5 = num5;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i10 = i29;
                                                cpz0Var2 = cpz0Var2;
                                                i27 = i27;
                                                cqi0Var5 = cqi0Var5;
                                                lp70Var4 = lp70Var4;
                                                num6 = num6;
                                                i23 = i23;
                                                voz0Var2 = voz0Var2;
                                                i26 = i26;
                                                i11 = length2;
                                            }
                                            i24 = 8;
                                            cqi0Var5 = cqi0Var5;
                                            i26 = i26;
                                            cqi0Var3 = cqi0Var3;
                                            j4 = j >> 8;
                                            length2 = i11;
                                            i29 = i10 + 1;
                                            i23 = i23;
                                            num6 = num6;
                                            lp70Var4 = lp70Var4;
                                            voz0Var2 = voz0Var2;
                                            i27 = i27;
                                            arrayList5 = arrayList3;
                                            cpz0Var2 = cpz0Var2;
                                            num5 = num5;
                                        }
                                        cqi0Var = cqi0Var3;
                                        num3 = num5;
                                        arrayList2 = arrayList5;
                                        cpz0Var = cpz0Var2;
                                        i7 = i27;
                                        cqi0Var2 = cqi0Var5;
                                        lp70Var = lp70Var4;
                                        num4 = num6;
                                        i6 = i23;
                                        voz0Var = voz0Var2;
                                        i8 = i26;
                                        i9 = length2;
                                        if (i28 != i24) {
                                            break;
                                        }
                                    } else {
                                        cqi0Var = cqi0Var3;
                                        num3 = num5;
                                        arrayList2 = arrayList5;
                                        cpz0Var = cpz0Var2;
                                        i7 = i27;
                                        cqi0Var2 = cqi0Var5;
                                        lp70Var = lp70Var4;
                                        num4 = num6;
                                        i6 = i23;
                                        voz0Var = voz0Var2;
                                        i8 = i26;
                                        i9 = length2;
                                    }
                                    int i42 = i7;
                                    if (i42 == i9) {
                                        break;
                                    }
                                    num6 = num4;
                                    cqi0Var5 = cqi0Var2;
                                    lp70Var3 = lp70Var;
                                    voz0Var2 = voz0Var;
                                    i21 = i4;
                                    i26 = i8;
                                    cqi0Var3 = cqi0Var;
                                    arrayList5 = arrayList2;
                                    cpz0Var2 = cpz0Var;
                                    i24 = 8;
                                    i27 = i42 + 1;
                                    length2 = i9;
                                    i23 = i6;
                                    num5 = num3;
                                }
                            } else {
                                voz0Var = voz0Var2;
                                num3 = num5;
                                arrayList2 = arrayList5;
                                i4 = i21;
                                cpz0Var = cpz0Var2;
                                num4 = num6;
                                i6 = i23;
                                zM30563o = false;
                            }
                            if (!zM30563o) {
                                zM30563o = bul.m30563o(cpz0Var, voz0Var);
                            }
                            if (zM30563o) {
                                i3 = 8;
                                m82017E(this, m82026A(i6), 2048, num4, 8);
                            } else {
                                i3 = 8;
                            }
                        }
                    } else {
                        i2 = i22;
                        num3 = num5;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i20;
                        i4 = i21;
                        i5 = i17;
                        num4 = num6;
                    }
                    j3 >>= i3;
                    i22 = i2 + 1;
                    w350Var2 = w350Var;
                    num6 = num4;
                    i20 = i3;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i17 = i5;
                    i21 = i4;
                    arrayList5 = arrayList2;
                    num5 = num3;
                }
                num = num5;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i43 = i17;
                num2 = num6;
                if (i21 != i20) {
                    return;
                } else {
                    i = i43;
                }
            } else {
                num = num5;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num6;
                i = i17;
            }
            if (i == i19) {
                return;
            }
            i17 = i + 1;
            w350Var2 = w350Var;
            length = i19;
            num6 = num2;
            i15 = i18;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num5 = num;
            i16 = 0;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m82033I(lp70 lp70Var, uoi0 uoi0Var) {
        voz0 voz0VarM59647x;
        lp70 lp70VarM30560l;
        if (lp70Var.m59606H() && !this.f225123d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(lp70Var)) {
            if (!lp70Var.f135674c1.m91466d(8)) {
                lp70Var = bul.m30560l(lp70Var, wv3.f255336U0);
            }
            if (lp70Var == null || (voz0VarM59647x = lp70Var.m59647x()) == null) {
                return;
            }
            if (!voz0VarM59647x.f243557c && (lp70VarM30560l = bul.m30560l(lp70Var, wv3.f255335T0)) != null) {
                lp70Var = lp70VarM30560l;
            }
            int i = lp70Var.f135671b;
            if (uoi0Var.m83620a(i)) {
                m82017E(this, m82026A(i), 2048, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m82034J(lp70 lp70Var) {
        if (lp70Var.m59606H() && !this.f225123d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(lp70Var)) {
            int i = lp70Var.f135671b;
            bky0 bky0Var = (bky0) this.f225104N0.m87103b(i);
            bky0 bky0Var2 = (bky0) this.f225105O0.m87103b(i);
            if (bky0Var == null && bky0Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM82043o = m82043o(i, 4096);
            if (bky0Var != null) {
                accessibilityEventM82043o.setScrollX((int) ((Number) bky0Var.f28041a.invoke()).floatValue());
                accessibilityEventM82043o.setMaxScrollX((int) ((Number) bky0Var.f28042b.invoke()).floatValue());
            }
            if (bky0Var2 != null) {
                accessibilityEventM82043o.setScrollY((int) ((Number) bky0Var2.f28041a.invoke()).floatValue());
                accessibilityEventM82043o.setMaxScrollY((int) ((Number) bky0Var2.f28042b.invoke()).floatValue());
            }
            m82028C(accessibilityEventM82043o);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m82035K(cpz0 cpz0Var, int i, int i2, boolean z) {
        String strM82022t;
        voz0 voz0Var = cpz0Var.f40689d;
        int i3 = cpz0Var.f40691f;
        lpz0 lpz0Var = toz0.f222355j;
        if (voz0Var.f243555a.m33619c(lpz0Var) && bul.m30559k(cpz0Var)) {
            vh00 vh00Var = (vh00) ((C1811ee) cpz0Var.f40689d.m86110d(lpz0Var)).f58630b;
            if (vh00Var != null) {
                return ((Boolean) vh00Var.mo24510D0(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f225108R0) && (strM82022t = m82022t(cpz0Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM82022t.length()) {
                i = -1;
            }
            this.f225108R0 = i;
            boolean z2 = strM82022t.length() > 0;
            m82028C(m82044p(m82026A(i3), z2 ? Integer.valueOf(this.f225108R0) : null, z2 ? Integer.valueOf(this.f225108R0) : null, z2 ? Integer.valueOf(strM82022t.length()) : null, strM82022t));
            m82031G(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final Rect m82036M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        oz3 oz3Var = this.f225123d;
        long jM68605t = oz3Var.m68605t(jFloatToRawIntBits);
        long jM68605t2 = oz3Var.m68605t((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM68605t >> 32);
        int i2 = (int) (jM68605t2 >> 32);
        int i3 = (int) (jM68605t & 4294967295L);
        int i4 = (int) (jM68605t2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX INFO: renamed from: Q */
    public final void m82037Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        uoi0 uoi0Var = new uoi0();
        uoi0 uoi0Var2 = this.f225117Y0;
        int[] iArr = uoi0Var2.f232444b;
        long[] jArr3 = uoi0Var2.f232443a;
        int length = jArr3.length - 2;
        toi0 toi0Var = this.f225126e1;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            epz0 epz0Var = (epz0) m82047s().m87103b(i6);
                            cpz0 cpz0Var = epz0Var != null ? epz0Var.f61737a : null;
                            if (cpz0Var != null) {
                                if (!cpz0Var.f40689d.f243555a.m33619c(hpz0.f93947d)) {
                                    uoi0Var.m83620a(i6);
                                    dpz0 dpz0Var = (dpz0) toi0Var.m87103b(i6);
                                    m82030F(i6, 32, dpz0Var != null ? (String) whg1.m88143p(dpz0Var.f51767a, hpz0.f93947d) : null);
                                }
                            } else {
                                uoi0Var.m83620a(i6);
                                dpz0 dpz0Var2 = (dpz0) toi0Var.m87103b(i6);
                                m82030F(i6, 32, dpz0Var2 != null ? (String) whg1.m88143p(dpz0Var2.f51767a, hpz0.f93947d) : null);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = uoi0Var.f232444b;
        long[] jArr4 = uoi0Var.f232443a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = uoi0Var2.f232445c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = uoi0Var2.f232443a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (uoi0Var2.f232444b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                uoi0Var2.m83627h(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        toi0Var.m81195c();
        w350 w350VarM82047s = m82047s();
        int[] iArr3 = w350VarM82047s.f247487b;
        Object[] objArr = w350VarM82047s.f247488c;
        long[] jArr6 = w350VarM82047s.f247486a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            cpz0 cpz0Var2 = ((epz0) objArr[i25]).f61737a;
                            voz0 voz0Var = cpz0Var2.f40689d;
                            lpz0 lpz0Var = hpz0.f93947d;
                            if (voz0Var.f243555a.m33619c(lpz0Var) && uoi0Var2.m83620a(i26)) {
                                m82030F(i26, 16, (String) cpz0Var2.f40689d.m86110d(lpz0Var));
                            }
                            toi0Var.m81201i(i26, new dpz0(cpz0Var2, m82047s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f225128f1 = new dpz0(this.f225123d.getSemanticsOwner().m42388a(), m82047s());
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: b */
    public final s5f1 mo39306b(View view) {
        return this.f225137t;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX INFO: renamed from: j */
    public final void m82038j(int i, C2374sf c2374sf, String str, Bundle bundle) {
        cpz0 cpz0Var;
        ch01 ch01Var;
        db71 db71VarM78224u;
        long jM71288w;
        int i2;
        oz3 oz3Var;
        AccessibilityNodeInfo accessibilityNodeInfo = c2374sf.f208417a;
        epz0 epz0Var = (epz0) m82047s().m87103b(i);
        if (epz0Var == null || (cpz0Var = epz0Var.f61737a) == null) {
            return;
        }
        lp70 lp70Var = cpz0Var.f40688c;
        voz0 voz0Var = cpz0Var.f40689d;
        cqi0 cqi0Var = voz0Var.f243555a;
        String strM82022t = m82022t(cpz0Var);
        if (wj50.m88271j(str, this.f225121b1)) {
            int iM76057d = this.f225119Z0.m76057d(i, -1);
            if (iM76057d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM76057d);
                return;
            }
            return;
        }
        if (wj50.m88271j(str, this.f225122c1)) {
            int iM76057d2 = this.f225120a1.m76057d(i, -1);
            if (iM76057d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM76057d2);
                return;
            }
            return;
        }
        boolean zM33619c = cqi0Var.m33619c(toz0.f222346a);
        oz3 oz3Var2 = this.f225123d;
        if (zM33619c && bundle != null && wj50.m88271j(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 <= 0 || i3 < 0) {
                return;
            }
            if (i3 < (strM82022t != null ? strM82022t.length() : Alert.DURATION_SHOW_INDEFINITELY) && (db71VarM78224u = sig1.m78224u(voz0Var)) != null) {
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = i3 + i5;
                    RectF rectF = null;
                    if (i6 >= db71VarM78224u.f47230a.f36033a.f107641b.length()) {
                        arrayList.add(null);
                        i2 = i5;
                        oz3Var = oz3Var2;
                    } else {
                        tiv0 tiv0VarM35531b = db71VarM78224u.m35531b(i6);
                        bnj0 bnj0VarM33573d = cpz0Var.m33573d();
                        if (bnj0VarM33573d == null) {
                            jM71288w = 0;
                        } else {
                            if (!bnj0VarM33573d.mo30020b1().f63766L0) {
                                bnj0VarM33573d = null;
                            }
                            if (bnj0VarM33573d != null) {
                                jM71288w = pwg1.m71288w(bnj0VarM33573d);
                            } else {
                                jM71288w = 0;
                            }
                        }
                        tiv0 tiv0VarM80941m = tiv0VarM35531b.m80941m(jM71288w);
                        tiv0 tiv0VarM33576g = cpz0Var.m33576g();
                        tiv0 tiv0VarM80937i = tiv0VarM80941m.m80939k(tiv0VarM33576g) ? tiv0VarM80941m.m80937i(tiv0VarM33576g) : null;
                        if (tiv0VarM80937i != null) {
                            long jM68605t = oz3Var2.m68605t((((long) Float.floatToRawIntBits(tiv0VarM80937i.f220752b)) & 4294967295L) | (((long) Float.floatToRawIntBits(tiv0VarM80937i.f220751a)) << 32));
                            long jM68605t2 = oz3Var2.m68605t((((long) Float.floatToRawIntBits(tiv0VarM80937i.f220754d)) & 4294967295L) | (((long) Float.floatToRawIntBits(tiv0VarM80937i.f220753c)) << 32));
                            int i7 = (int) (jM68605t >> 32);
                            int i8 = i5;
                            int i9 = (int) (jM68605t2 >> 32);
                            oz3 oz3Var3 = oz3Var2;
                            int i10 = (int) (jM68605t & 4294967295L);
                            oz3Var = oz3Var3;
                            i2 = i8;
                            int i11 = (int) (jM68605t2 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                        } else {
                            i2 = i5;
                            oz3Var = oz3Var2;
                        }
                        arrayList.add(rectF);
                    }
                    i5 = i2 + 1;
                    oz3Var2 = oz3Var;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        lpz0 lpz0Var = hpz0.f93925A;
        if (cqi0Var.m33619c(lpz0Var) && bundle != null && wj50.m88271j(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) whg1.m88143p(voz0Var, lpz0Var);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (wj50.m88271j(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, cpz0Var.f40691f);
            return;
        }
        if (wj50.m88271j(str, "androidx.compose.ui.semantics.shapeType")) {
            ch01 ch01Var2 = (ch01) whg1.m88143p(voz0Var, hpz0.f93943S);
            if (ch01Var2 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                tiv0 tiv0VarM82048u = m82048u(cpz0Var, rect, ch01Var2);
                float f = tiv0VarM82048u.f220752b;
                float f2 = tiv0VarM82048u.f220751a;
                ncg1 ncg1VarMo29107a = ch01Var2.mo29107a(tiv0VarM82048u.m80935g(), lp70Var.f135666Y0, oz3Var2.getDensity());
                if (ncg1VarMo29107a instanceof lyl0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m82018L(ncg1VarMo29107a, f2, f));
                    return;
                } else if (ncg1VarMo29107a instanceof myl0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m82018L(ncg1VarMo29107a, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m82019N(ncg1VarMo29107a));
                    return;
                } else {
                    if (!(ncg1VarMo29107a instanceof kyl0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m82020O(ncg1VarMo29107a, f2, f));
                    return;
                }
            }
            return;
        }
        if (wj50.m88271j(str, "androidx.compose.ui.semantics.shapeRect")) {
            ch01 ch01Var3 = (ch01) whg1.m88143p(voz0Var, hpz0.f93943S);
            if (ch01Var3 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                tiv0 tiv0VarM82048u2 = m82048u(cpz0Var, rect2, ch01Var3);
                Rect rectM82018L = m82018L(ch01Var3.mo29107a(tiv0VarM82048u2.m80935g(), lp70Var.f135666Y0, oz3Var2.getDensity()), tiv0VarM82048u2.f220751a, tiv0VarM82048u2.f220752b);
                if (rectM82018L != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM82018L);
                    return;
                }
                return;
            }
            return;
        }
        if (wj50.m88271j(str, "androidx.compose.ui.semantics.shapeCorners")) {
            ch01 ch01Var4 = (ch01) whg1.m88143p(voz0Var, hpz0.f93943S);
            if (ch01Var4 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM82019N = m82019N(ch01Var4.mo29107a(m82048u(cpz0Var, rect3, ch01Var4).m80935g(), lp70Var.f135666Y0, oz3Var2.getDensity()));
                if (fArrM82019N != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM82019N);
                    return;
                }
                return;
            }
            return;
        }
        if (!wj50.m88271j(str, "androidx.compose.ui.semantics.shapeRegion") || (ch01Var = (ch01) whg1.m88143p(voz0Var, hpz0.f93943S)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect4);
        tiv0 tiv0VarM82048u3 = m82048u(cpz0Var, rect4, ch01Var);
        Region regionM82020O = m82020O(ch01Var.mo29107a(tiv0VarM82048u3.m80935g(), lp70Var.f135666Y0, oz3Var2.getDensity()), tiv0VarM82048u3.f220751a, tiv0VarM82048u3.f220752b);
        if (regionM82020O != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM82020O);
        }
    }

    /* JADX INFO: renamed from: k */
    public final Rect m82039k(epz0 epz0Var) {
        c450 c450Var = epz0Var.f61738b;
        return m82036M(c450Var.f33848a, c450Var.f33849b, c450Var.f33850c, c450Var.f33851d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0057, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:34:0x007e, B:35:0x008d, B:38:0x009c, B:39:0x00a3, B:20:0x0041, B:23:0x0048), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0057, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:34:0x007e, B:35:0x008d, B:38:0x009c, B:39:0x00a3, B:20:0x0041, B:23:0x0048), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e A[Catch: all -> 0x0032, LOOP:0: B:33:0x007c->B:34:0x007e, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0057, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:34:0x007e, B:35:0x008d, B:38:0x009c, B:39:0x00a3, B:20:0x0041, B:23:0x0048), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (p204p.njg1.m64619l(r7, r0) == r5) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bc -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m82040l(ibk ibkVar) {
        rz3 rz3Var;
        uoi0 uoi0Var;
        upa upaVar;
        uoi0 uoi0Var2;
        upa upaVar2;
        int i;
        int i2;
        Handler handler;
        Object objM83652a;
        if (ibkVar instanceof rz3) {
            rz3Var = (rz3) ibkVar;
            int i3 = rz3Var.f204047e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rz3Var.f204047e = i3 - Integer.MIN_VALUE;
            } else {
                rz3Var = new rz3(this, ibkVar);
            }
        } else {
            rz3Var = new rz3(this, ibkVar);
        }
        Object obj = rz3Var.f204045c;
        int i4 = rz3Var.f204047e;
        zj5 zj5Var = this.f225110T0;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 == 0) {
                bga.m29073P(obj);
                uoi0Var = new uoi0();
                bqa bqaVar = this.f225111U0;
                bqaVar.getClass();
                upaVar = new upa(bqaVar);
                rz3Var.f204043a = uoi0Var;
                rz3Var.f204044b = upaVar;
                rz3Var.f204047e = 1;
                objM83652a = upaVar.m83652a(rz3Var);
                if (objM83652a == yukVar) {
                    upa upaVar3 = upaVar;
                    uoi0Var2 = uoi0Var;
                    obj = objM83652a;
                    upaVar2 = upaVar3;
                    if (!((Boolean) obj).booleanValue()) {
                        zj5Var.clear();
                        return w2a1.f247311a;
                    }
                    upaVar2.m83653c();
                    if (m82049v()) {
                        i = zj5Var.f283362c;
                        for (i2 = 0; i2 < i; i2++) {
                            lp70 lp70Var = (lp70) zj5Var.f283361b[i2];
                            m82033I(lp70Var, uoi0Var2);
                            m82034J(lp70Var);
                        }
                        uoi0Var2.m83621b();
                        handler = this.f225123d.getHandler();
                        if (!this.f225130g1) {
                            this.f225130g1 = true;
                            handler.post(this.f225134i1);
                        }
                    }
                    zj5Var.clear();
                    this.f225104N0.m81195c();
                    this.f225105O0.m81195c();
                    long j = this.f225131h;
                    rz3Var.f204043a = uoi0Var2;
                    rz3Var.f204044b = upaVar2;
                    rz3Var.f204047e = 2;
                }
                return yukVar;
            }
            if (i4 == 1) {
                upaVar2 = rz3Var.f204044b;
                uoi0Var2 = rz3Var.f204043a;
                bga.m29073P(obj);
                if (!((Boolean) obj).booleanValue()) {
                    zj5Var.clear();
                    return w2a1.f247311a;
                }
                upaVar2.m83653c();
                if (m82049v()) {
                    i = zj5Var.f283362c;
                    while (i2 < i) {
                        lp70 lp70Var2 = (lp70) zj5Var.f283361b[i2];
                        m82033I(lp70Var2, uoi0Var2);
                        m82034J(lp70Var2);
                    }
                    uoi0Var2.m83621b();
                    handler = this.f225123d.getHandler();
                    if (!this.f225130g1 && handler != null) {
                        this.f225130g1 = true;
                        handler.post(this.f225134i1);
                    }
                }
                zj5Var.clear();
                this.f225104N0.m81195c();
                this.f225105O0.m81195c();
                long j2 = this.f225131h;
                rz3Var.f204043a = uoi0Var2;
                rz3Var.f204044b = upaVar2;
                rz3Var.f204047e = 2;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                upaVar2 = rz3Var.f204044b;
                uoi0Var2 = rz3Var.f204043a;
                bga.m29073P(obj);
            }
            uoi0Var = uoi0Var2;
            upaVar = upaVar2;
            rz3Var.f204043a = uoi0Var;
            rz3Var.f204044b = upaVar;
            rz3Var.f204047e = 1;
            objM83652a = upaVar.m83652a(rz3Var);
            if (objM83652a == yukVar) {
                upa upaVar4 = upaVar;
                uoi0Var2 = uoi0Var;
                obj = objM83652a;
                upaVar2 = upaVar4;
                if (!((Boolean) obj).booleanValue()) {
                    zj5Var.clear();
                    return w2a1.f247311a;
                }
                upaVar2.m83653c();
                if (m82049v()) {
                    i = zj5Var.f283362c;
                    while (i2 < i) {
                        lp70 lp70Var3 = (lp70) zj5Var.f283361b[i2];
                        m82033I(lp70Var3, uoi0Var2);
                        m82034J(lp70Var3);
                    }
                    uoi0Var2.m83621b();
                    handler = this.f225123d.getHandler();
                    if (!this.f225130g1) {
                        this.f225130g1 = true;
                        handler.post(this.f225134i1);
                    }
                }
                zj5Var.clear();
                this.f225104N0.m81195c();
                this.f225105O0.m81195c();
                long j3 = this.f225131h;
                rz3Var.f204043a = uoi0Var2;
                rz3Var.f204044b = upaVar2;
                rz3Var.f204047e = 2;
            }
            return yukVar;
        } catch (Throwable th) {
            zj5Var.clear();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX INFO: renamed from: m */
    public final boolean m82041m(long j, boolean z, int i) {
        lpz0 lpz0Var;
        int i2;
        bky0 bky0Var;
        if (!wj50.m88271j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        w350 w350VarM82047s = m82047s();
        if (Offset.m253c(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            lpz0Var = hpz0.f93966w;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            lpz0Var = hpz0.f93965v;
        }
        Object[] objArr = w350VarM82047s.f247488c;
        long[] jArr = w350VarM82047s.f247486a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        epz0 epz0Var = (epz0) objArr[(i3 << 3) + i6];
                        c450 c450Var = epz0Var.f61738b;
                        i2 = i4;
                        float f = c450Var.f33848a;
                        float f2 = c450Var.f33849b;
                        float f3 = c450Var.f33850c;
                        float f4 = c450Var.f33851d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if (((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) && (bky0Var = (bky0) whg1.m88143p(epz0Var.f61737a.f40689d, lpz0Var)) != null) {
                            eh00 eh00Var = bky0Var.f28041a;
                            boolean z3 = bky0Var.f28043c;
                            int i7 = z3 ? -i : i;
                            if (i == 0 && z3) {
                                i7 = -1;
                            }
                            if (i7 < 0) {
                                if (((Number) eh00Var.invoke()).floatValue() > 0.0f) {
                                    z2 = true;
                                }
                            } else if (((Number) eh00Var.invoke()).floatValue() < ((Number) bky0Var.f28042b.invoke()).floatValue()) {
                                z2 = true;
                            }
                        }
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m82042n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m82049v()) {
                m82027B(this.f225123d.getSemanticsOwner().m42388a(), this.f225128f1);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m82032H(m82047s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m82037Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AccessibilityEvent m82043o(int i, int i2) {
        epz0 epz0Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        oz3 oz3Var = this.f225123d;
        accessibilityEventObtain.setPackageName(oz3Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(oz3Var, i);
        if (m82049v() && (epz0Var = (epz0) m82047s().m87103b(i)) != null) {
            cpz0 cpz0Var = epz0Var.f61737a;
            accessibilityEventObtain.setPassword(cpz0Var.f40689d.f243555a.m33619c(hpz0.f93938N));
            glg1.m45173x(accessibilityEventObtain, wj50.m88271j(whg1.m88143p(cpz0Var.f40689d, hpz0.f93958o), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f225133i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f225133i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f225129g;
        if (accessibilityManager.isEnabled()) {
            this.f225133i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f225123d.getHandler();
        wj50.m88279p(handler);
        handler.removeCallbacks(this.f225134i1);
        AccessibilityManager accessibilityManager = this.f225129g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: renamed from: p */
    public final AccessibilityEvent m82044p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM82043o = m82043o(i, 8192);
        if (num != null) {
            accessibilityEventM82043o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM82043o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM82043o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM82043o.getText().add(charSequence);
        }
        return accessibilityEventM82043o;
    }

    /* JADX INFO: renamed from: q */
    public final int m82045q(cpz0 cpz0Var) {
        voz0 voz0Var = cpz0Var.f40689d;
        voz0 voz0Var2 = cpz0Var.f40689d;
        lpz0 lpz0Var = hpz0.f93944a;
        if (!voz0Var.f243555a.m33619c(hpz0.f93944a)) {
            lpz0 lpz0Var2 = hpz0.f93932H;
            if (voz0Var2.f243555a.m33619c(lpz0Var2)) {
                return (int) (((ic71) voz0Var2.m86110d(lpz0Var2)).f100752a & 4294967295L);
            }
        }
        return this.f225108R0;
    }

    /* JADX INFO: renamed from: r */
    public final int m82046r(cpz0 cpz0Var) {
        voz0 voz0Var = cpz0Var.f40689d;
        voz0 voz0Var2 = cpz0Var.f40689d;
        lpz0 lpz0Var = hpz0.f93944a;
        if (!voz0Var.f243555a.m33619c(hpz0.f93944a)) {
            lpz0 lpz0Var2 = hpz0.f93932H;
            if (voz0Var2.f243555a.m33619c(lpz0Var2)) {
                return (int) (((ic71) voz0Var2.m86110d(lpz0Var2)).f100752a >> 32);
            }
        }
        return this.f225108R0;
    }

    /* JADX INFO: renamed from: s */
    public final w350 m82047s() {
        if (this.f225112V0) {
            this.f225112V0 = false;
            oz3 oz3Var = this.f225123d;
            this.f225115X0 = b0g1.m27792n(oz3Var.getSemanticsOwner(), wv3.f255334S0);
            if (m82049v()) {
                bul.m30564p(this.f225115X0, this.f225119Z0, this.f225120a1, oz3Var.getContext().getResources());
            }
        }
        return this.f225115X0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0014->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0075], SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public final tiv0 m82048u(cpz0 cpz0Var, Rect rect, ch01 ch01Var) {
        sz3 sz3Var = new sz3(ch01Var);
        lp70 lp70Var = cpz0Var.f40688c;
        exh0 exh0Var = lp70Var.f135674c1.f263388f;
        jlq jlqVar = null;
        if ((exh0Var.f63773d & 8) != 0) {
            loop0: while (exh0Var != null) {
                if ((exh0Var.f63772c & 8) == 0) {
                    if ((exh0Var.f63773d & 8) != 0) {
                        break;
                        break;
                    }
                    exh0Var = exh0Var.f63775f;
                } else {
                    exh0 exh0VarM88331j = exh0Var;
                    qqi0 qqi0Var = null;
                    while (exh0VarM88331j != null) {
                        if (exh0VarM88331j instanceof apz0) {
                            ((apz0) exh0VarM88331j).mo26732g(sz3Var);
                            if (sz3Var.m79720b()) {
                                jlqVar = exh0VarM88331j;
                                break loop0;
                            }
                        } else if ((exh0VarM88331j.f63772c & 8) != 0 && (exh0VarM88331j instanceof xlq)) {
                            int i = 0;
                            for (exh0 exh0Var2 = ((xlq) exh0VarM88331j).f263224N0; exh0Var2 != null; exh0Var2 = exh0Var2.f63775f) {
                                if ((exh0Var2.f63772c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        exh0VarM88331j = exh0Var2;
                                    } else {
                                        if (qqi0Var == null) {
                                            qqi0Var = new qqi0(0, new exh0[16]);
                                        }
                                        if (exh0VarM88331j != null) {
                                            qqi0Var.m73556b(exh0VarM88331j);
                                            exh0VarM88331j = null;
                                        }
                                        qqi0Var.m73556b(exh0Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        exh0VarM88331j = wjg1.m88331j(qqi0Var);
                    }
                    if ((exh0Var.f63773d & 8) != 0) {
                        break;
                    }
                    exh0Var = exh0Var.f63775f;
                }
            }
        }
        jlq jlqVar2 = (apz0) jlqVar;
        if (jlqVar2 == null || !((exh0) jlqVar2).f63770a.f63766L0) {
            return pwg1.m71276k(lp70Var.f135674c1.f263386d, false);
        }
        bnj0 bnj0VarM88317G = wjg1.m88317G(jlqVar2);
        tiv0 tiv0VarMo30001I = pwg1.m71280o(bnj0VarM88317G).mo30001I(bnj0VarM88317G, false);
        Rect rectM82036M = m82036M(tiv0VarMo30001I.f220751a, tiv0VarMo30001I.f220752b, tiv0VarMo30001I.f220753c, tiv0VarMo30001I.f220754d);
        float f = rectM82036M.left - rect.left;
        float f2 = rectM82036M.top - rect.top;
        return new tiv0(f, f2, rectM82036M.width() + f, rectM82036M.height() + f2);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m82049v() {
        AccessibilityManager accessibilityManager = this.f225129g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f225133i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f225133i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: w */
    public final void m82050w(lp70 lp70Var) {
        if (this.f225110T0.add(lp70Var)) {
            this.f225111U0.mo30231j(w2a1.f247311a);
        }
    }
}

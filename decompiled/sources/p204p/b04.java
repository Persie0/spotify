package p204p;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import com.spotify.casita.p040v1.resolved.EmbeddedAdMetadata;
import com.spotify.casita.p040v1.resolved.EmbeddedAdTrackingUrls;
import com.spotify.device_context.p058v1.DeviceIdentity;
import com.spotify.device_context.p058v1.ReportedAttributes;
import com.spotify.device_context.p058v1.TargetDevice;
import com.spotify.ubiquity.p167v1.ExternalAccessoryDescription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b04 {

    /* JADX INFO: renamed from: a */
    public static final C2126mg f21766a = new C2126mg(3);

    /* JADX INFO: renamed from: b */
    public static final ypo f21767b = new ypo(new er3(0));

    /* JADX INFO: renamed from: c */
    public static qif1 f21768c;

    /* JADX INFO: renamed from: d */
    public static sd40 f21769d;

    /* JADX INFO: renamed from: A */
    public static final boolean m27716A(xq00 xq00Var) {
        long jM43172a = ((fz70) ((rvd1) xq00Var.m91774k(wsh.f254630u))).m43172a();
        return ((int) (jM43172a >> 32)) < ((int) (jM43172a & 4294967295L));
    }

    /* JADX INFO: renamed from: B */
    public static final void m27717B(float[] fArr, float[] fArr2) {
        float fM27737s = m27737s(0, 0, fArr2, fArr);
        float fM27737s2 = m27737s(0, 1, fArr2, fArr);
        float fM27737s3 = m27737s(0, 2, fArr2, fArr);
        float fM27737s4 = m27737s(0, 3, fArr2, fArr);
        float fM27737s5 = m27737s(1, 0, fArr2, fArr);
        float fM27737s6 = m27737s(1, 1, fArr2, fArr);
        float fM27737s7 = m27737s(1, 2, fArr2, fArr);
        float fM27737s8 = m27737s(1, 3, fArr2, fArr);
        float fM27737s9 = m27737s(2, 0, fArr2, fArr);
        float fM27737s10 = m27737s(2, 1, fArr2, fArr);
        float fM27737s11 = m27737s(2, 2, fArr2, fArr);
        float fM27737s12 = m27737s(2, 3, fArr2, fArr);
        float fM27737s13 = m27737s(3, 0, fArr2, fArr);
        float fM27737s14 = m27737s(3, 1, fArr2, fArr);
        float fM27737s15 = m27737s(3, 2, fArr2, fArr);
        float fM27737s16 = m27737s(3, 3, fArr2, fArr);
        fArr[0] = fM27737s;
        fArr[1] = fM27737s2;
        fArr[2] = fM27737s3;
        fArr[3] = fM27737s4;
        fArr[4] = fM27737s5;
        fArr[5] = fM27737s6;
        fArr[6] = fM27737s7;
        fArr[7] = fM27737s8;
        fArr[8] = fM27737s9;
        fArr[9] = fM27737s10;
        fArr[10] = fM27737s11;
        fArr[11] = fM27737s12;
        fArr[12] = fM27737s13;
        fArr[13] = fM27737s14;
        fArr[14] = fM27737s15;
        fArr[15] = fM27737s16;
    }

    /* JADX INFO: renamed from: C */
    public static final f5u m27718C(EmbeddedAdMetadata embeddedAdMetadata) {
        String id = embeddedAdMetadata.getId();
        String strM5627t = embeddedAdMetadata.m5627t();
        String strM5629w = embeddedAdMetadata.m5629w();
        String strM5630x = embeddedAdMetadata.m5630x();
        String strM5628v = embeddedAdMetadata.m5628v();
        String strM5631y = embeddedAdMetadata.m5631y();
        Map mapM5632z = embeddedAdMetadata.m5632z();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapM5632z.size()));
        for (Map.Entry entry : mapM5632z.entrySet()) {
            linkedHashMap.put(entry.getKey(), new a6u(((EmbeddedAdTrackingUrls) entry.getValue()).m5635p()));
        }
        return new f5u(id, strM5627t, strM5629w, strM5630x, strM5628v, strM5631y, linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static final qs3 m27719a(td61 td61Var, gh00 gh00Var, br3 br3Var, im91 im91Var, ypo ypoVar, gh00 gh00Var2) {
        qs3 qs3Var = new qs3(td61Var, gh00Var2);
        qs3Var.f191964b = gh00Var;
        qs3Var.f191965c = br3Var;
        qs3Var.f191966d = im91Var;
        qs3Var.f191967e = ypoVar;
        return qs3Var;
    }

    /* JADX INFO: renamed from: b */
    public static qs3 m27720b(Enum r2, eep eepVar, gh00 gh00Var, eh00 eh00Var, w9z w9zVar, ypo ypoVar) {
        qs3 qs3Var = new qs3(r2, new C2126mg(2));
        qs3Var.f191975m.setValue(eepVar);
        qs3Var.m73671j(r2);
        qs3Var.f191964b = gh00Var;
        qs3Var.f191965c = eh00Var;
        qs3Var.f191966d = w9zVar;
        qs3Var.f191967e = ypoVar;
        return qs3Var;
    }

    /* JADX INFO: renamed from: c */
    public static final eep m27721c(gh00 gh00Var) {
        ges gesVar = new ges();
        gh00Var.invoke(gesVar);
        float[] fArr = gesVar.f79176b;
        ArrayList arrayList = gesVar.f79175a;
        int size = arrayList.size();
        n0e1.m63444u(size, fArr.length);
        return new eep(arrayList, Arrays.copyOfRange(fArr, 0, size));
    }

    /* JADX INFO: renamed from: d */
    public static final void m27722d(int i, xq00 xq00Var) {
        xq00Var.m91775k0(947872626);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            p711.m69222a(epv0.m39673I("mixing_row_loading", mi21.m61822f(1.0f, cxh0.f43038a)), new kyu(null, 3, null, null, 26), null, false, null, null, null, null, null, chg.f38010a, null, chg.f38011b, null, null, null, chg.f38012c, xq00Var, 805306438, 196656, 30204);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tys(i, 11, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m27723e(ybs ybsVar, float f, float f2, xq00 xq00Var, int i, int i2) {
        float f3;
        int i3;
        float f4;
        xq00Var.m91775k0(391187282);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            f3 = f2;
        } else if ((i & 384) == 0) {
            f3 = f2;
            i3 = (xq00Var.m91760d(f3) ? 256 : 128) | i;
        } else {
            f3 = f2;
            i3 = i;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            f4 = i4 != 0 ? 0 : f3;
            cxh0 cxh0Var = cxh0.f43038a;
            dha.m36004a(xtm0.m92060G(nec.m64246i(epv0.m39673I("mixing_row_shimmer_box", zsf1.m96832C(mi21.m61824h(f, ybsVar != null ? mi21.m61838v(ybsVar.f271238a, cxh0Var) : mi21.m61822f(1.0f, cxh0Var)), 0.0f, f4, 0.0f, 0.0f, 13)), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
        } else {
            xq00Var.m91757b0();
            f4 = f3;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jox(ybsVar, f, f4, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m27724f(int i, int i2, String str, xq00 xq00Var) {
        xq00Var.m91775k0(-25474069);
        int i3 = (xq00Var.m91762e(i) ? 32 : 16) | i2;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            qiu.m72876b(18, rkk.m75772x(1856331040, new ttk0(str, i, 6, (byte) 0), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ttk0(str, i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Object m27725g(qs3 qs3Var, float f, ms3 ms3Var, eep eepVar, Object obj, n05 n05Var, mb61 mb61Var) {
        Object objM62149k;
        float fM38702f = eepVar.m38702f(obj);
        olv0 olv0Var = new olv0();
        olv0Var.f166933a = Float.isNaN(qs3Var.f191972j.m84031v()) ? 0.0f : qs3Var.f191972j.m84031v();
        if (!Float.isNaN(fM38702f)) {
            float f2 = olv0Var.f166933a;
            if (f2 != fM38702f && (objM62149k = mkg1.m62149k(f2, fM38702f, f, n05Var, new cr3(0, ms3Var, olv0Var), mb61Var)) == yuk.f276404a) {
                return objM62149k;
            }
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[RETURN] */
    /* JADX INFO: renamed from: h */
    public static final Object m27726h(eep eepVar, float f, float f2, gh00 gh00Var, eh00 eh00Var) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            Object objM38697a = eepVar.m38697a(f);
            wj50.m88279p(objM38697a);
            return objM38697a;
        }
        if (Math.abs(f2) >= Math.abs(((Number) eh00Var.invoke()).floatValue())) {
            Object objM38698b = eepVar.m38698b(f, z2);
            wj50.m88279p(objM38698b);
            return objM38698b;
        }
        Object objM38698b2 = eepVar.m38698b(f, false);
        wj50.m88279p(objM38698b2);
        float fM38702f = eepVar.m38702f(objM38698b2);
        Object objM38698b3 = eepVar.m38698b(f, true);
        wj50.m88279p(objM38698b3);
        float fM38702f2 = eepVar.m38702f(objM38698b3);
        float fAbs = Math.abs(((Number) gh00Var.invoke(Float.valueOf(Math.abs(fM38702f - fM38702f2)))).floatValue());
        if (!z2) {
            fM38702f = fM38702f2;
        }
        boolean z3 = Math.abs(fM38702f - f) >= fAbs;
        if (z3) {
            if (z2) {
                return objM38698b3;
            }
            return objM38698b2;
        }
        if (z3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
            return objM38698b2;
        }
        return objM38698b3;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m27727i(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m27728j(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static final eep m27729k() {
        return new eep(lau.f131415a, new float[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final void m27730l(float[] fArr, float f, float f2, float[] fArr2) {
        r3d0.m74632e(fArr2);
        r3d0.m74638k(f, f2, fArr2);
        m27717B(fArr, fArr2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m27731m(eh00 eh00Var, th00 th00Var, ibk ibkVar) {
        or3 or3Var;
        if (ibkVar instanceof or3) {
            or3Var = (or3) ibkVar;
            int i = or3Var.f168431b;
            if ((i & Integer.MIN_VALUE) != 0) {
                or3Var.f168431b = i - Integer.MIN_VALUE;
            } else {
                or3Var = new or3(ibkVar);
            }
        } else {
            or3Var = new or3(ibkVar);
        }
        Object obj = or3Var.f168430a;
        int i2 = or3Var.f168431b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                ur3 ur3Var = new ur3(eh00Var, th00Var, null, 2);
                or3Var.f168431b = 1;
                Object objM56684z = kk40.m56684z(ur3Var, or3Var);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: n */
    public static final TargetDevice m27732n(y5p y5pVar) {
        String str;
        ExternalAccessoryDescription externalAccessoryDescription = null;
        if (y5pVar == null) {
            return null;
        }
        ou61 ou61VarM9222p = TargetDevice.m9222p();
        gtw0 gtw0VarM9219o = ReportedAttributes.m9219o();
        gtw0VarM9219o.m45707m(y5pVar.f269510c.name());
        ou61VarM9222p.m68094q((ReportedAttributes) gtw0VarM9219o.build());
        e07 e07Var = y5pVar.f269498B.f239170a;
        if (!e07Var.m37480b()) {
            bwx bwxVarM21860p = ExternalAccessoryDescription.m21860p();
            fu6 fu6Var = e07Var.f54890e;
            int i = fu6Var != null ? fu6Var.f73412a : 0;
            int i2 = i == 0 ? -1 : u9k.f228217a[edb.m38547C(i)];
            String str2 = "";
            if (i2 == 1) {
                str = "car";
            } else if (i2 == 2) {
                str = "headphones";
            } else if (i2 == 3) {
                str = "speaker";
            } else if (i2 != 4) {
                str = i2 != 5 ? "" : "face_wearable";
            } else {
                str = "wearable";
            }
            bwxVarM21860p.m30724m(str);
            int iOrdinal = e07Var.f54889d.ordinal();
            if (iOrdinal == 1) {
                str2 = "aux";
            } else if (iOrdinal == 2) {
                str2 = "bluetooth_or_usb";
            } else if (iOrdinal == 3) {
                str2 = "bluetooth";
            }
            bwxVarM21860p.m30725q(str2);
            externalAccessoryDescription = (ExternalAccessoryDescription) bwxVarM21860p.build();
        }
        if (externalAccessoryDescription != null) {
            q6r q6rVarM9216o = DeviceIdentity.m9216o();
            q6rVarM9216o.m72246m(externalAccessoryDescription);
            ou61VarM9222p.m68093m((DeviceIdentity) q6rVarM9216o.build());
        }
        return (TargetDevice) ou61VarM9222p.build();
    }

    /* JADX INFO: renamed from: o */
    public static fxh0 m27733o(fxh0 fxh0Var, qs3 qs3Var, vvl0 vvl0Var, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return fxh0Var.mo34315F(new ar3(qs3Var, vvl0Var, z, null));
    }

    /* JADX INFO: renamed from: p */
    public static Object m27734p(qs3 qs3Var, m5u m5uVar) throws Throwable {
        Object obj;
        fbk fbkVar = null;
        if (qs3Var.m73665d()) {
            obj = qs3Var.f191966d;
            if (obj == null) {
                wj50.m88260d0("snapAnimationSpec");
                throw null;
            }
        } else {
            obj = zq3.f285296a;
        }
        Object objM73662a = qs3Var.m73662a(fcs.f68250b, xqi0.f265055a, new jr3(qs3Var, obj, fbkVar, 0), m5uVar);
        return objM73662a == yuk.f276404a ? objM73662a : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public static final Object m27735q(qs3 qs3Var, Object obj, float f, n05 n05Var, ypo ypoVar, ibk ibkVar) throws Throwable {
        kr3 kr3Var;
        float f2;
        olv0 olv0Var;
        if (ibkVar instanceof kr3) {
            kr3Var = (kr3) ibkVar;
            int i = kr3Var.f125534d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kr3Var.f125534d = i - Integer.MIN_VALUE;
            } else {
                kr3Var = new kr3(ibkVar);
            }
        } else {
            kr3Var = new kr3(ibkVar);
        }
        Object obj2 = kr3Var.f125533c;
        int i2 = kr3Var.f125534d;
        if (i2 == 0) {
            bga.m29073P(obj2);
            olv0 olv0Var2 = new olv0();
            olv0Var2.f166933a = f;
            xh00 lr3Var = new lr3(qs3Var, f, n05Var, olv0Var2, ypoVar, null);
            kr3Var.f125532b = olv0Var2;
            kr3Var.f125531a = f;
            kr3Var.f125534d = 1;
            Object objM73662a = qs3Var.m73662a(obj, xqi0.f265055a, lr3Var, kr3Var);
            Object obj3 = yuk.f276404a;
            if (objM73662a == obj3) {
                return obj3;
            }
            f2 = f;
            olv0Var = olv0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = kr3Var.f125531a;
            olv0Var = kr3Var.f125532b;
            bga.m29073P(obj2);
        }
        return new Float(f2 - olv0Var.f166933a);
    }

    /* JADX INFO: renamed from: r */
    public static Object m27736r(qs3 qs3Var, Object obj, float f, ibk ibkVar) {
        n05 n05Var;
        ypo ypoVar;
        if (qs3Var.m73665d()) {
            n05Var = qs3Var.f191966d;
            if (n05Var == null) {
                wj50.m88260d0("snapAnimationSpec");
                throw null;
            }
        } else {
            n05Var = zq3.f285296a;
        }
        n05 n05Var2 = n05Var;
        if (qs3Var.m73665d()) {
            ypoVar = qs3Var.f191967e;
            if (ypoVar == null) {
                wj50.m88260d0("decayAnimationSpec");
                throw null;
            }
        } else {
            ypoVar = zq3.f285298c;
        }
        return m27735q(qs3Var, obj, f, n05Var2, ypoVar, ibkVar);
    }

    /* JADX INFO: renamed from: s */
    public static final float m27737s(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList m27738t(Map map) {
        String str = (String) map.get("multiUserAttributionDisplayNames");
        int i = 0;
        List listM88477a1 = lau.f131415a;
        List listM88477a2 = str != null ? wl51.m88477a1(str, new String[]{","}, 0, 6) : listM88477a1;
        String str2 = (String) map.get("multiUserAttributionImages");
        List listM88477a3 = str2 != null ? wl51.m88477a1(str2, new String[]{","}, 0, 6) : listM88477a1;
        String str3 = (String) map.get("multiUserAttributionUsernames");
        if (str3 != null) {
            listM88477a1 = wl51.m88477a1(str3, new String[]{","}, 0, 6);
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM88477a2, 10));
        for (Object obj : listM88477a2) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            String str4 = (String) obj;
            String str5 = (String) g6f.m43747t0(i, listM88477a1);
            if (str5 == null) {
                str5 = str4;
            }
            arrayList.add(new vb81(str5, str4, (String) g6f.m43747t0(i, listM88477a3), null));
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static List m27739u(Map map, fk60 fk60Var) {
        String str = (String) map.get("multiUserAttributionMetadata");
        lau lauVar = lau.f131415a;
        if (str == null) {
            return lauVar;
        }
        try {
            List<bq9> list = ((mm9) fk60Var.m41880a(str, mm9.Companion.serializer())).f145079a;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (bq9 bq9Var : list) {
                arrayList.add(new vb81(bq9Var.f29745a, bq9Var.f29746b, bq9Var.f29747c, bq9Var.f29748d));
            }
            return arrayList;
        } catch (SerializationException e) {
            na6.m63959g("Failed to parse json string: multiUserAttributionMetadata", e);
            return lauVar;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Long m27740v(y7t0 y7t0Var, xre xreVar) {
        hvi0 hvi0Var = cks.f39079b;
        long j = y7t0Var.f270134c;
        ils ilsVar = ils.SECONDS;
        if (cks.m33184c(jwg1.m54450E(j, ilsVar), jwg1.m54450E(System.currentTimeMillis(), ils.MILLISECONDS)) > 0) {
            return Long.valueOf(cks.m33187f(jwg1.m54450E(y7t0Var.f270134c, ilsVar)));
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static c030 m27741w(String str) {
        if (tgv.m80784e(str)) {
            return c030.f32661a;
        }
        if (tgv.m80789j(str)) {
            return c030.f32662b;
        }
        if (str != null ? xoc1.f263950O.m83613a(str) : false) {
            return c030.f32663c;
        }
        if (str != null ? xoc1.f263870E.m83613a(str) : false) {
            return c030.f32664d;
        }
        if (str != null ? xoc1.f263891G4.m83613a(str) : false) {
            return c030.f32665e;
        }
        if (tgv.m80782c(str)) {
            return c030.f32666f;
        }
        if (tgv.m80786g(str)) {
            return c030.f32667g;
        }
        if (tgv.m80780a(str)) {
            return c030.f32668h;
        }
        Set set = dd41.f47702f;
        if (r46.m74708A(str, gn80.PRERELEASE)) {
            return c030.f32669i;
        }
        if (r46.m74709B(str, gn80.BROWSE_GENRES, gn80.BROWSE_HUBS)) {
            return c030.f32670t;
        }
        if (r46.m74708A(str, gn80.VENUE)) {
            return c030.f32658X;
        }
        if (tgv.m80781b(str)) {
            return c030.f32659Y;
        }
        return tgv.m80783d(str) ? c030.f32660Z : c030.f32656L0;
    }

    /* JADX INFO: renamed from: x */
    public static void m27742x() {
        int i = xj80.f262066b;
    }

    /* JADX INFO: renamed from: y */
    public static final fiz m27743y(o1e1 o1e1Var, UUID uuid) {
        List listSingletonList = Collections.singletonList(String.valueOf(uuid));
        StringBuilder sbM36620t = dq60.m36620t("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = listSingletonList.size();
        n0e1.m63421b(size, sbM36620t);
        sbM36620t.append(")");
        String string = sbM36620t.toString();
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(size, string);
        Iterator it = listSingletonList.iterator();
        int i = 1;
        while (it.hasNext()) {
            ojx0VarM50495m.mo38269L0(i, (String) it.next());
            i++;
        }
        return mvl0.m62953p(new ah40(epv0.m39692l(o1e1Var.f160711a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new C2245p6(new m1e1(o1e1Var, ojx0VarM50495m), 10)), 2));
    }

    /* JADX INFO: renamed from: z */
    public static final t050 m27744z(z8k z8kVar, njk0 njk0Var, njk0 njk0Var2, njk0 njk0Var3, njk0 njk0Var4) {
        return ((b9k) z8kVar).m28489g("PickAndShuffleAwarenessPlayerListenerDaemon", new bjk0(njk0Var, njk0Var2, njk0Var3, njk0Var4, 12));
    }
}

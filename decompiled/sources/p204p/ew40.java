package p204p;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p002ui.geometry.Size;
import java.io.Closeable;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ew40 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63429b;

    public /* synthetic */ ew40(Object obj, int i) {
        this.f63428a = i;
        this.f63429b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0119 A[Catch: all -> 0x010a, LOOP:3: B:39:0x00d4->B:54:0x0119, LOOP_END, TryCatch #1 {all -> 0x010a, blocks: (B:47:0x0104, B:51:0x010e, B:56:0x0123, B:54:0x0119), top: B:197:0x0104 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eh00
    public final Object invoke() {
        int iM88463M0;
        int i;
        pqm0 pqm0Var;
        pqm0 pqm0Var2;
        eh00 eh00Var;
        mb31 mb31Var;
        mb31 mb31Var2;
        boolean z;
        mb31 mb31Var3;
        int i2 = 2;
        boolean z2 = true;
        int i3 = 0;
        switch (this.f63428a) {
            case 0:
                return (InputMethodManager) ((View) ((fw40) this.f63429b).f73934b).getContext().getSystemService("input_method");
            case 1:
                Object obj = ((ur60) this.f63429b).f233239a;
                sb70 sb70Var = obj instanceof sb70 ? (sb70) obj : null;
                if (sb70Var != null) {
                    return sb70Var.mo25523C();
                }
                return null;
            case 2:
                cv70 cv70Var = ((fv70) this.f63429b).f73724j;
                if (cv70Var != null) {
                    hvg1.m48859l(cv70Var);
                }
                return w2a1.f247311a;
            case 3:
                return Integer.valueOf(((yw70) this.f63429b).m94779h().f214608n);
            case 4:
                return new BaseInputConnection(((o480) this.f63429b).f161575a, false);
            case 5:
                ioc0 ioc0Var = (ioc0) this.f63429b;
                vum0 vum0Var = ioc0Var.f104174P0;
                if (vum0Var.m86437v() <= ioc0Var.f104175Q0.m86437v()) {
                    return null;
                }
                if (((wnc0) ioc0Var.f104180V0.getValue()).f253149a != 1 || ((Boolean) ioc0Var.f104176R0.getValue()).booleanValue()) {
                    return Float.valueOf(ioc0Var.m51155H1() + vum0Var.m86437v());
                }
                return null;
            case 6:
                ((gsh0) this.f63429b).f83968d.invoke();
                return w2a1.f247311a;
            case 7:
                return (cvu0) ((hvu0) this.f63429b).f95795a.f73871e.getValue();
            case 8:
                return new g9b((z4l0) ((b8b) this.f63429b).f24544b);
            case 9:
                x8q0 x8q0Var = (x8q0) this.f63429b;
                return new uzj(gjg1.m44908H("kotlinx.serialization.Polymorphic", t8q0.f218124z0, new ktz0[0], new rv70(x8q0Var, 14)), x8q0Var.f259208a);
            case 10:
                a0f1.m24341b((zld1) this.f63429b);
                return w2a1.f247311a;
            case 11:
                a0f1.m24341b((Closeable) ((rlv0) this.f63429b).f200373a);
                return w2a1.f247311a;
            case 12:
                zuu0 zuu0Var = ((yvu0) this.f63429b).f276758h;
                wj50.m88279p(zuu0Var);
                zuu0Var.cancel();
                return w2a1.f247311a;
            case 13:
                int i4 = 7;
                f1x0 f1x0Var = (f1x0) this.f63429b;
                ClassLoader classLoader = f1x0Var.f64998c;
                hp60 hp60Var = f1x0Var.f64999d;
                ArrayList<URL> list = Collections.list(classLoader.getResources(""));
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    wj50.m88279p(url);
                    if (wj50.m88271j(url.getProtocol(), "file")) {
                        String str = tbn0.f218907b;
                        pqm0Var2 = new pqm0(hp60Var, qbn0.m72504e(new File(url.toURI())));
                    } else {
                        pqm0Var2 = null;
                    }
                    if (pqm0Var2 != null) {
                        arrayList.add(pqm0Var2);
                    }
                }
                ArrayList<URL> list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list2) {
                    wj50.m88279p(url2);
                    String string = url2.toString();
                    if (bm51.m29803n0(string, "jar:file:", false) && (iM88463M0 = wl51.m88463M0(string, "!", 0, 6)) != -1) {
                        String str2 = tbn0.f218907b;
                        i = i4;
                        pqm0Var = new pqm0(s800.m77407H(qbn0.m72504e(new File(URI.create(string.substring(4, iM88463M0)))), hp60Var, new q5s0(i)), f1x0.f64997f);
                    } else {
                        pqm0Var = null;
                        i = i4;
                    }
                    if (pqm0Var != null) {
                        arrayList2.add(pqm0Var);
                    }
                    i4 = i;
                }
                return g6f.m43700N0(arrayList2, arrayList);
            case 14:
                return ((Callable) this.f63429b).call();
            case 15:
                x7y0 x7y0Var = (x7y0) this.f63429b;
                s9y0 s9y0Var = x7y0Var.f259014a;
                Object obj2 = x7y0Var.f259017d;
                if (obj2 != null) {
                    return s9y0Var.mo55774b(x7y0Var, obj2);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 16:
                ltx0 ltx0Var = ((h8y0) this.f63429b).f88837c;
                if (ltx0Var == null) {
                    return null;
                }
                Bundle bundleM70529j = pp91.m70529j((pqm0[]) Arrays.copyOf(new pqm0[0], 0));
                ltx0Var.m59919l(bundleM70529j);
                if (xtf1.m92015C(bundleM70529j)) {
                    return null;
                }
                return bundleM70529j;
            case 17:
                h9y0 h9y0Var = (h9y0) this.f63429b;
                h9y0Var.getLifecycle().mo31986a(new khv0(h9y0Var));
                return w2a1.f247311a;
            case 18:
                cmy0 cmy0Var = (cmy0) this.f63429b;
                w24 w24Var = (w24) oqg1.m67639h(cmy0Var, d2m0.f44585a);
                cmy0Var.f39824Z0 = w24Var;
                cmy0Var.f39825a1 = w24Var != null ? new v24(w24Var.f247218a, w24Var.f247219b, w24Var.f247220c, w24Var.f247221d) : null;
                return w2a1.f247311a;
            case 19:
                jez0 jez0Var = (jez0) this.f63429b;
                c791 c791Var = jez0Var.f111769f;
                jez0Var.f111770g = c791Var != null ? ((Number) c791Var.f34838l.getValue()).longValue() : 0L;
                return w2a1.f247311a;
            case 20:
                return this.f63429b;
            case 21:
                return ((sr60) ((ArrayList) this.f63429b).get(0)).mo27067y();
            case 22:
                vg01 vg01Var = (vg01) this.f63429b;
                yum0 yum0Var = vg01Var.f241089c;
                if (((Size) yum0Var.getValue()).f494a == 9205357640488583168L || Size.m266g(((Size) yum0Var.getValue()).f494a)) {
                    return null;
                }
                return vg01Var.f241087a.mo43315c(((Size) yum0Var.getValue()).f494a);
            case 23:
                return ((wf11) this.f63429b).f250667d;
            case 24:
                kr21 kr21Var = (kr21) this.f63429b;
                if (!((Boolean) kr21Var.f125525n.getValue()).booleanValue() && (eh00Var = kr21Var.f125513b) != null) {
                    eh00Var.invoke();
                }
                return w2a1.f247311a;
            case 25:
                ((y631) this.f63429b).m92858a();
                return Boolean.TRUE;
            case 26:
                mb31 mb31Var4 = (mb31) this.f63429b;
                while (true) {
                    synchronized (mb31Var4.f141786g) {
                        try {
                            if (mb31Var4.f141782c) {
                                mb31Var = mb31Var4;
                            } else {
                                mb31Var4.f141782c = z2;
                                try {
                                    qqi0 qqi0Var = mb31Var4.f141785f;
                                    Object[] objArr = qqi0Var.f191608a;
                                    int i5 = qqi0Var.f191610c;
                                    int i6 = i3;
                                    while (i6 < i5) {
                                        try {
                                            lb31 lb31Var = (lb31) objArr[i6];
                                            dqi0 dqi0Var = lb31Var.f131548g;
                                            gh00 gh00Var = lb31Var.f131542a;
                                            Object[] objArr2 = dqi0Var.f52019b;
                                            long[] jArr = dqi0Var.f52018a;
                                            int length = jArr.length - i2;
                                            if (length >= 0) {
                                                int i7 = i3;
                                                while (true) {
                                                    long j = jArr[i7];
                                                    mb31Var3 = mb31Var4;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i8 = 8;
                                                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                                                        while (i3 < i9) {
                                                            if ((j & 255) < 128) {
                                                                try {
                                                                    gh00Var.invoke(objArr2[(i7 << 3) + i3]);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    mb31Var2 = mb31Var3;
                                                                    z = 0;
                                                                    mb31Var2.f141782c = z;
                                                                    throw th;
                                                                }
                                                            }
                                                            j >>= i8;
                                                            i3++;
                                                            i8 = i8;
                                                        }
                                                        if (i9 == i8) {
                                                            if (i7 != length) {
                                                                i7++;
                                                                mb31Var4 = mb31Var3;
                                                                i3 = 0;
                                                            }
                                                        }
                                                    } else if (i7 != length) {
                                                        i7++;
                                                        mb31Var4 = mb31Var3;
                                                        i3 = 0;
                                                    }
                                                }
                                            } else {
                                                mb31Var3 = mb31Var4;
                                            }
                                            dqi0Var.m36643b();
                                            i6++;
                                            mb31Var4 = mb31Var3;
                                            i2 = 2;
                                            i3 = 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            mb31Var3 = mb31Var4;
                                        }
                                    }
                                    mb31Var = mb31Var4;
                                    mb31Var.f141782c = i3;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mb31Var2 = mb31Var4;
                                    z = i3;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (!mb31Var.m61343c()) {
                        return w2a1.f247311a;
                    }
                    mb31Var4 = mb31Var;
                    i2 = 2;
                    z2 = true;
                    i3 = 0;
                }
                break;
            case 27:
                String string2 = ((SharedPreferences) ((sr31) this.f63429b).f213224b).getString("pref_key_sticky_variant", null);
                if (string2 == null) {
                    return new LinkedHashMap();
                }
                List listM88477a1 = wl51.m88477a1(string2, new String[]{"|"}, 0, 6);
                int iM31820L = c95.m31820L(i6f.m49804T(listM88477a1, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                Iterator it = listM88477a1.iterator();
                while (it.hasNext()) {
                    List listM88477a2 = wl51.m88477a1((String) it.next(), new String[]{"="}, 2, 2);
                    if (listM88477a2.size() != 2) {
                        listM88477a2 = null;
                    }
                    pqm0 pqm0Var3 = listM88477a2 != null ? new pqm0(listM88477a2.get(0), listM88477a2.get(1)) : new pqm0("", "");
                    linkedHashMap.put(pqm0Var3.f180350a, pqm0Var3.f180351b);
                }
                return new LinkedHashMap(linkedHashMap);
            case 28:
                return Float.valueOf(((Number) ((gw4) this.f63429b).m45912e()).floatValue());
            default:
                n171 n171Var = (n171) this.f63429b;
                n171Var.f149333c1 = null;
                iig1.m50728o(n171Var);
                bxg1.m30835l(n171Var);
                hvg1.m48859l(n171Var);
                return Boolean.TRUE;
        }
    }
}

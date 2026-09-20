package p204p;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.res.Configuration;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.icu.text.ListFormatter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.pf */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2254pf {
    /* JADX INFO: renamed from: A */
    public static boolean m69744A(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: B */
    public static final String m69745B(qf40 qf40Var, xq00 xq00Var, int i, int i2) {
        Object listFormatter;
        ListFormatter.Width width;
        Object obj = t6x0.f217647t;
        xq00Var.m91771i0(-1617465837);
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 2 : 1;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            xq00Var.m91771i0(-685411436);
            if ((((i & 14) ^ 6) <= 4 || !xq00Var.m91766g(qf40Var)) && (i & 6) != 4) {
                z = false;
            }
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == obj) {
                objM91750T = g6f.m43753y0(qf40Var, ", ", null, null, null, 62);
                xq00Var.m91793t0(objM91750T);
            }
            String str = (String) objM91750T;
            xq00Var.m91788r(false);
            xq00Var.m91788r(false);
            return str;
        }
        xq00Var.m91771i0(-686451331);
        Locale locale = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).getLocales().get(0);
        boolean zM91766g = xq00Var.m91766g(locale);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91766g || objM91750T2 == obj) {
            if (i4 >= 33) {
                int iM38547C = edb.m38547C(i3);
                if (iM38547C == 0) {
                    width = ListFormatter.Width.WIDE;
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    width = ListFormatter.Width.NARROW;
                }
                listFormatter = ListFormatter.getInstance(locale, ListFormatter.Type.AND, width);
            } else {
                listFormatter = ListFormatter.getInstance(locale);
            }
            objM91750T2 = listFormatter;
            xq00Var.m91793t0(objM91750T2);
        }
        wj50.m88279p(objM91750T2);
        ListFormatter listFormatter2 = (ListFormatter) objM91750T2;
        boolean zM91766g2 = xq00Var.m91766g(listFormatter2);
        if ((((i & 14) ^ 6) <= 4 || !xq00Var.m91766g(qf40Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zM91766g2 | z;
        Object objM91750T3 = xq00Var.m91750T();
        if (z2 || objM91750T3 == obj) {
            objM91750T3 = listFormatter2.format(qf40Var);
            xq00Var.m91793t0(objM91750T3);
        }
        wj50.m88279p(objM91750T3);
        String str2 = (String) objM91750T3;
        xq00Var.m91788r(false);
        xq00Var.m91788r(false);
        return str2;
    }

    /* JADX INFO: renamed from: C */
    public static LinkedHashMap m69746C(Parcel parcel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = Build.VERSION.SDK_INT >= 33 ? parcel.readHashMap(LinkedHashMap.class.getClassLoader(), String.class, Object.class) : parcel.readHashMap(LinkedHashMap.class.getClassLoader());
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: D */
    public static final void m69747D(Intent intent, z650 z650Var) {
        intent.putExtra("extra_interaction_id", new z650(z650Var.f279709a));
    }

    /* JADX INFO: renamed from: E */
    public static final void m69748E(Intent intent, d850 d850Var) {
        intent.putExtra("extra_interaction_logging_result", (Parcelable) d850Var);
        intent.putExtra("extra_interaction_id", d850Var.f46380a);
    }

    /* JADX INFO: renamed from: F */
    public static final void m69749F(Intent intent, b3j0 b3j0Var) {
        intent.putExtra("extra_navigation_action", b3j0Var);
    }

    /* JADX INFO: renamed from: G */
    public static void m69750G(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: H */
    public static final void m69751H(CursorAnchorInfo.Builder builder, tiv0 tiv0Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(yyg1.m94897H(tiv0Var)).setHandwritingBounds(yyg1.m94897H(tiv0Var)).build());
    }

    /* JADX INFO: renamed from: I */
    public static final void m69752I(CursorAnchorInfo.Builder builder, tiv0 tiv0Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(yyg1.m94897H(tiv0Var)).setHandwritingBounds(yyg1.m94897H(tiv0Var)).build());
    }

    /* JADX INFO: renamed from: J */
    public static void m69753J(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    /* JADX INFO: renamed from: K */
    public static final void m69754K(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    /* JADX INFO: renamed from: L */
    public static void m69755L(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX INFO: renamed from: M */
    public static final zqj m69756M(String str, Bundle bundle) {
        Iterable parcelableArrayList;
        Iterable parcelableArrayList2;
        ArrayList parcelableArrayList3;
        qf40 qf40VarM67574x;
        Object c6x0Var;
        eyy eyyVar;
        Parcelable parcelable;
        Object c6x0Var2;
        String string = bundle.getString("query", "");
        int i = Build.VERSION.SDK_INT;
        Iterable iterable = lau.f131415a;
        if (i < 33 ? (parcelableArrayList = bundle.getParcelableArrayList("results")) == null : (parcelableArrayList = bundle.getParcelableArrayList("results", vbv.class)) == null) {
            parcelableArrayList = iterable;
        }
        qf40 qf40VarM67574x2 = opo.m67574x(parcelableArrayList);
        if (i < 33 ? (parcelableArrayList2 = bundle.getParcelableArrayList("recommendations")) == null : (parcelableArrayList2 = bundle.getParcelableArrayList("recommendations", vbv.class)) == null) {
            parcelableArrayList2 = iterable;
        }
        qf40 qf40VarM67574x3 = opo.m67574x(parcelableArrayList2);
        if (i < 33 ? (parcelableArrayList3 = bundle.getParcelableArrayList("recent_searches")) != null : (parcelableArrayList3 = bundle.getParcelableArrayList("recent_searches", vbv.class)) != null) {
            iterable = parcelableArrayList3;
        }
        qf40 qf40VarM67574x4 = opo.m67574x(iterable);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("available_filters");
        if (stringArrayList != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : stringArrayList) {
                try {
                    wj50.m88279p(str2);
                    c6x0Var2 = eyy.valueOf(str2);
                } catch (Throwable th) {
                    c6x0Var2 = new c6x0(th);
                }
                if (c6x0Var2 instanceof c6x0) {
                    c6x0Var2 = null;
                }
                eyy eyyVar2 = (eyy) c6x0Var2;
                if (eyyVar2 != null) {
                    arrayList.add(eyyVar2);
                }
            }
            qf40VarM67574x = opo.m67574x(arrayList);
            if (qf40VarM67574x == null) {
                qf40VarM67574x = lv21.f137205b;
            }
        } else {
            qf40VarM67574x = lv21.f137205b;
        }
        qf40 qf40Var = qf40VarM67574x;
        String string2 = bundle.getString("selected_filter");
        if (string2 != null) {
            try {
                c6x0Var = eyy.valueOf(string2);
            } catch (Throwable th2) {
                c6x0Var = new c6x0(th2);
            }
            if (c6x0Var instanceof c6x0) {
                c6x0Var = null;
            }
            eyyVar = (eyy) c6x0Var;
            if (eyyVar == null) {
                eyyVar = eyy.f64219a;
            }
        } else {
            eyyVar = eyy.f64219a;
        }
        eyy eyyVar3 = eyyVar;
        boolean z = bundle.getBoolean("is_searching", false);
        boolean z2 = bundle.getBoolean("is_loading_recommendations", true);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("error", mqj.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("error");
            parcelable = (mqj) (parcelable2 instanceof mqj ? parcelable2 : null);
        }
        return new zqj(str, string, qf40VarM67574x2, qf40VarM67574x3, qf40VarM67574x4, qf40Var, eyyVar3, z, z2, (mqj) parcelable);
    }

    /* JADX INFO: renamed from: N */
    public static void m69757N(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: a */
    public static final Shader m69758a(Shader shader, long j, float f, float f2) {
        RuntimeShader runtimeShader = shader instanceof RuntimeShader ? (RuntimeShader) shader : null;
        if (runtimeShader == null) {
            runtimeShader = new RuntimeShader("\n/**\n * Rotating linear gradient shader, where rotation is controlled by iRotation uniform.\n * This is essentially the same as:\n * LinearGradientShader(\n *     colors = FocusedHighlightColors,\n *     colorStops = FocusedHighlightColorStops,\n *     from = Offset.Zero,\n *     to = Offset(size.width, size.height),\n * )\n * But allowing for efficient rotation, instead of needing to create a new shader / brush every\n * frame with new coordinates.\n */\n// Width / height\nuniform float2 iResolution;\n// Rotation in radians. 0 radians means a horizontal gradient.\n// Positive values will have the effect of rotating the gradient clockwise.\nuniform float iRotation;\n// Alpha animation progress from 0 to 1. This will be applied to the color stops so that each\n// color stop will fade in.\nuniform float iAlphaProgress;\n\nhalf4 main(float2 fragCoord) {\n    // Horizontal gradient\n    half4 colors[4];\n    colors[0] = half4(1.0, 1.0, 1.0, 1.0 * iAlphaProgress); // White with 100% alpha\n    colors[1] = half4(1.0, 1.0, 1.0, 0.2 * iAlphaProgress); // White with 20% alpha\n    colors[2] = half4(1.0, 1.0, 1.0, 0.2 * iAlphaProgress); // White with 20% alpha\n    colors[3] = half4(1.0, 1.0, 1.0, 0.8 * iAlphaProgress); // White with 80% alpha\n\n    // Stops for the horizontal gradient\n    float stops[4];\n    stops[0] = 0.0;\n    stops[1] = 0.3;\n    stops[2] = 0.66;\n    stops[3] = 1.0;\n\n    // Normalize\n    half2 uv = fragCoord.xy / iResolution.xy;\n\n    // Offset around a rotational center\n    half2 rotationCenter = half2(0.5, 0.5);\n    uv -= rotationCenter;\n\n    // Rotate\n    // We rotate in the opposite direction as we are rotating the coordinate we sample the gradient\n    // from. To create the effect of a gradient 'moving' clockwise, we need to move the\n    // coordinate in the opposite direction (counter-clockwise).\n    float2x2 matrix = float2x2(cos(-iRotation),-sin(-iRotation),sin(-iRotation),cos(-iRotation));\n    uv *= matrix;\n\n    // Translate back into [0,1] space\n    uv += rotationCenter;\n\n    // Blend through stops using the x coordinate, since we have a horizontal gradient\n    half4 color = mix(colors[0], colors[1], smoothstep(stops[0], stops[1], uv.x));\n    color = mix(color, colors[2], smoothstep(stops[1], stops[2], uv.x));\n    color = mix(color, colors[3], smoothstep(stops[2], stops[3], uv.x));\n\n    return color;\n}\n");
        }
        runtimeShader.setFloatUniform("iResolution", Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        runtimeShader.setFloatUniform("iRotation", f);
        runtimeShader.setFloatUniform("iAlphaProgress", f2);
        return runtimeShader;
    }

    /* JADX INFO: renamed from: b */
    public static gn10 m69759b(Bundle bundle) throws GoogleIdTokenParsingException {
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            wj50.m88279p(string);
            wj50.m88279p(string2);
            return new gn10(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e) {
            throw new GoogleIdTokenParsingException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static x35 m69760c(jah jahVar) {
        return new x35(jahVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final b3j0 m69761d(Intent intent) {
        z650 z650VarM69768k;
        z2j0 z2j0Var;
        b3j0 b3j0Var;
        String string;
        d850 d850VarM69770m = m69770m(intent);
        if (d850VarM69770m == null || (z650VarM69768k = d850VarM69770m.f46380a) == null) {
            z650VarM69768k = m69768k(intent);
        }
        b3j0 b3j0Var2 = null;
        if (z650VarM69768k == null || z650VarM69768k.f279709a.length() == 0) {
            z2j0Var = null;
        } else {
            Uri data = intent.getData();
            if (data == null) {
                string = null;
            } else {
                if ("open.spotify.com".equals(data.getHost()) || "play.spotify.com".equals(data.getHost())) {
                    data = null;
                }
                if (data != null) {
                    string = data.toString();
                } else {
                    string = null;
                }
            }
            z2j0Var = new z2j0(string, z650VarM69768k);
        }
        if (z2j0Var != null) {
            return z2j0Var;
        }
        try {
            if (Build.VERSION.SDK_INT < 33) {
                Serializable serializableExtra = intent.getSerializableExtra("extra_navigation_action");
                if (serializableExtra instanceof b3j0) {
                    b3j0Var = (b3j0) serializableExtra;
                }
                if (b3j0Var2 == null) {
                    return x2j0.f257512a;
                }
                return b3j0Var2;
            }
            b3j0Var = (b3j0) intent.getSerializableExtra("extra_navigation_action", b3j0.class);
            b3j0Var2 = b3j0Var;
        } catch (Exception unused) {
        }
        if (b3j0Var2 == null) {
            return x2j0.f257512a;
        }
        return b3j0Var2;
    }

    /* JADX INFO: renamed from: e */
    public static final n6j0 m69762e(Intent intent) {
        d850 d850VarM69769l = m69769l(intent);
        if (d850VarM69769l == null) {
            return null;
        }
        return new n6j0(d850VarM69769l);
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m69763f(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = lau.f131415a;
        }
        ArrayList arrayListM43737o0 = g6f.m43737o0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM43737o0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new rhr0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, wj50.m88271j(str2, str)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    public static long m69764g(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode();
    }

    /* JADX INFO: renamed from: h */
    public static bu6 m69765h(AudioManager audioManager, xs6 xs6Var, pf40 pf40Var, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(xs6Var.m91967c());
        HashMap map = new HashMap();
        map.put(2, new HashSet(k0e1.m54987f(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (h0b1.m46288P(format) || bu6.f31030h.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(k0e1.m54987f(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(k0e1.m54987f(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        jf40 jf40VarM69788m = pf40.m69788m();
        for (Map.Entry entry : map.entrySet()) {
            jf40VarM69788m.m28985c(new au6(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new bu6(jf40VarM69788m.m53150g(), pf40Var, list);
    }

    /* JADX INFO: renamed from: i */
    public static rhr0 m69766i(Context context) {
        Object next;
        int iMyPid = Process.myPid();
        Iterator it = m69763f(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((rhr0) next).f199323b != iMyPid);
        rhr0 rhr0Var = (rhr0) next;
        return rhr0Var == null ? new rhr0(m69776s(), iMyPid, 0, false) : rhr0Var;
    }

    /* JADX INFO: renamed from: j */
    public static AudioDeviceInfo m69767j(AudioManager audioManager, xs6 xs6Var) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(xs6Var.m91967c());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    /* JADX INFO: renamed from: k */
    public static z650 m69768k(Intent intent) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return (z650) intent.getSerializableExtra("extra_interaction_id", z650.class);
            }
            Serializable serializableExtra = intent.getSerializableExtra("extra_interaction_id");
            if (serializableExtra instanceof z650) {
                return (z650) serializableExtra;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final d850 m69769l(Intent intent) {
        d850 d850VarM69770m = m69770m(intent);
        if (d850VarM69770m == null) {
            z650 z650VarM69768k = m69768k(intent);
            d850VarM69770m = null;
            if (z650VarM69768k != null) {
                return new d850(z650VarM69768k, null);
            }
        }
        return d850VarM69770m;
    }

    /* JADX INFO: renamed from: m */
    public static d850 m69770m(Intent intent) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return (d850) intent.getParcelableExtra("extra_interaction_logging_result", d850.class);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_interaction_logging_result");
            if (parcelableExtra instanceof d850) {
                return (d850) parcelableExtra;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m69771n() {
        int i = Build.VERSION.SDK_INT;
        return (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Alert.DURATION_SHOW_INDEFINITELY : MediaStore.getPickImagesMaxLimit();
    }

    /* JADX INFO: renamed from: o */
    public static OnBackInvokedDispatcher m69772o(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: p */
    public static Object m69773p(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    /* JADX INFO: renamed from: q */
    public static Object[] m69774q(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList m69775r(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* JADX INFO: renamed from: s */
    public static String m69776s() throws Throwable {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return Process.myProcessName();
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strM74611s = r35.m74611s();
        return strM74611s != null ? strM74611s : "";
    }

    /* JADX INFO: renamed from: t */
    public static cns m69777t(peb pebVar) {
        Long l = (Long) pebVar.m69715a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (cns) dns.f50875a.get(l);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static Serializable m69778u(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    /* JADX INFO: renamed from: v */
    public static SparseArray m69779v(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    /* JADX INFO: renamed from: w */
    public static String m69780w(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: x */
    public static final BoringLayout.Metrics m69781x(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m69782y(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m69783z(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}

package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatEditText;
import com.spotify.music.R;
import io.ably.lib.rest.Auth;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mec1 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f142677a = null;

    /* JADX INFO: renamed from: b */
    public static Field f142678b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f142679c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f142680d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e */
    public static final wdc1 f142681e = new wdc1();

    /* JADX INFO: renamed from: f */
    public static final zdc1 f142682f = new zdc1();

    /* JADX INFO: renamed from: a */
    public static int m61549a(View view, CharSequence charSequence, InterfaceC1667ah interfaceC1667ah) {
        int iM66803a;
        ArrayList arrayListM61554f = m61554f(view);
        int i = 0;
        while (true) {
            if (i >= arrayListM61554f.size()) {
                int i2 = -1;
                for (int i3 = 0; i3 < 32 && i2 == -1; i3++) {
                    int i4 = f142680d[i3];
                    boolean z = true;
                    for (int i5 = 0; i5 < arrayListM61554f.size(); i5++) {
                        z &= ((C2212of) arrayListM61554f.get(i5)).m66803a() != i4;
                    }
                    if (z) {
                        i2 = i4;
                    }
                }
                iM66803a = i2;
                break;
            }
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfo.AccessibilityAction) ((C2212of) arrayListM61554f.get(i)).f164604a).getLabel())) {
                iM66803a = ((C2212of) arrayListM61554f.get(i)).m66803a();
                break;
            }
            i++;
        }
        if (iM66803a != -1) {
            C2212of c2212of = new C2212of(null, iM66803a, charSequence, interfaceC1667ah, null);
            View.AccessibilityDelegate accessibilityDelegateM61553e = m61553e(view);
            C2647ze c2647ze = accessibilityDelegateM61553e == null ? null : accessibilityDelegateM61553e instanceof C2610ye ? ((C2610ye) accessibilityDelegateM61553e).f271884a : new C2647ze(accessibilityDelegateM61553e);
            if (c2647ze == null) {
                c2647ze = new C2647ze();
            }
            m61564p(view, c2647ze);
            m61560l(view, c2212of.m66803a());
            m61554f(view).add(c2212of);
            m61556h(view, 0);
        }
        return iM66803a;
    }

    /* JADX INFO: renamed from: b */
    public static void m61550b(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        ((View) view.getParent()).setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public static zkc1 m61551c(View view) {
        if (f142677a == null) {
            f142677a = new WeakHashMap();
        }
        zkc1 zkc1Var = (zkc1) f142677a.get(view);
        if (zkc1Var != null) {
            return zkc1Var;
        }
        zkc1 zkc1Var2 = new zkc1(view);
        f142677a.put(view, zkc1Var2);
        return zkc1Var2;
    }

    /* JADX INFO: renamed from: d */
    public static swd1 m61552d(View view, swd1 swd1Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsM79541f = swd1Var.m79541f();
        if (windowInsetsM79541f != null) {
            WindowInsets windowInsetsM50372a = i >= 30 ? iec1.m50372a(view, windowInsetsM79541f) : aec1.m25715a(view, windowInsetsM79541f);
            if (!windowInsetsM50372a.equals(windowInsetsM79541f)) {
                return swd1.m79536g(view, windowInsetsM50372a);
            }
        }
        return swd1Var;
    }

    /* JADX INFO: renamed from: e */
    public static View.AccessibilityDelegate m61553e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return hec1.m47301a(view);
        }
        if (f142679c) {
            return null;
        }
        if (f142678b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f142678b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f142679c = true;
                return null;
            }
        }
        try {
            Object obj = f142678b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f142679c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m61554f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: g */
    public static String[] m61555g(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? jec1.m53092a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: h */
    public static void m61556h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = ((CharSequence) new ydc1(0).m77101e(view)) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add((CharSequence) new ydc1(0).m77101e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add((CharSequence) new ydc1(0).m77101e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static swd1 m61557i(View view, swd1 swd1Var) {
        WindowInsets windowInsetsM79541f = swd1Var.m79541f();
        if (windowInsetsM79541f != null) {
            WindowInsets windowInsetsM25716b = aec1.m25716b(view, windowInsetsM79541f);
            if (!windowInsetsM25716b.equals(windowInsetsM79541f)) {
                return swd1.m79536g(view, windowInsetsM25716b);
            }
        }
        return swd1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static lij m61558j(View view, lij lijVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(lijVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return jec1.m53093b(view, lijVar);
        }
        cdl0 cdl0Var = (cdl0) view.getTag(R.id.tag_on_receive_content_listener);
        ddl0 ddl0Var = f142681e;
        if (cdl0Var == null) {
            if (view instanceof ddl0) {
                ddl0Var = (ddl0) view;
            }
            return ddl0Var.mo117a(lijVar);
        }
        lij lijVarMo24851a = cdl0Var.mo24851a(view, lijVar);
        if (lijVarMo24851a == null) {
            return null;
        }
        if (view instanceof ddl0) {
            ddl0Var = (ddl0) view;
        }
        return ddl0Var.mo117a(lijVarMo24851a);
    }

    /* JADX INFO: renamed from: k */
    public static void m61559k(View view, int i) {
        m61560l(view, i);
        m61556h(view, 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m61560l(View view, int i) {
        ArrayList arrayListM61554f = m61554f(view);
        for (int i2 = 0; i2 < arrayListM61554f.size(); i2++) {
            if (((C2212of) arrayListM61554f.get(i2)).m66803a() == i) {
                arrayListM61554f.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m61561m(View view, C2212of c2212of, CharSequence charSequence, InterfaceC1667ah interfaceC1667ah) {
        C2647ze c2647ze;
        if (interfaceC1667ah == null && charSequence == null) {
            m61559k(view, c2212of.m66803a());
            return;
        }
        C2212of c2212of2 = new C2212of(null, c2212of.f164605b, charSequence, interfaceC1667ah, c2212of.f164606c);
        View.AccessibilityDelegate accessibilityDelegateM61553e = m61553e(view);
        if (accessibilityDelegateM61553e == null) {
            c2647ze = null;
        } else {
            c2647ze = accessibilityDelegateM61553e instanceof C2610ye ? ((C2610ye) accessibilityDelegateM61553e).f271884a : new C2647ze(accessibilityDelegateM61553e);
        }
        if (c2647ze == null) {
            c2647ze = new C2647ze();
        }
        m61564p(view, c2647ze);
        m61560l(view, c2212of2.m66803a());
        m61554f(view).add(c2212of2);
        m61556h(view, 0);
    }

    /* JADX INFO: renamed from: n */
    public static View m61562n(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) gec1.m44467d(view, i);
        }
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* JADX INFO: renamed from: o */
    public static void m61563o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            hec1.m47302b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m61564p(View view, C2647ze c2647ze) {
        if (c2647ze == null && (m61553e(view) instanceof C2610ye)) {
            c2647ze = new C2647ze();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2647ze == null ? null : c2647ze.f281840b);
    }

    /* JADX INFO: renamed from: q */
    public static void m61565q(View view, boolean z) {
        new ydc1(2).m77106j(view, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r */
    public static void m61566r(View view, CharSequence charSequence) {
        new ydc1(0).m77106j(view, charSequence);
        zdc1 zdc1Var = f142682f;
        if (charSequence == null) {
            zdc1Var.f281682a.remove(view);
            view.removeOnAttachStateChangeListener(zdc1Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(zdc1Var);
        } else {
            zdc1Var.f281682a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(zdc1Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zdc1Var);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m61567s(View view, String[] strArr, cdl0 cdl0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            jec1.m53094c(view, strArr, cdl0Var);
            return;
        }
        if (strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        wj50.m88275l("When the listener is set, MIME types must also be set", strArr != null);
        if (strArr != null) {
            for (String str : strArr) {
                if (str.startsWith(Auth.WILDCARD_CLIENTID)) {
                    z = true;
                    break;
                }
            }
            wj50.m88275l("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, cdl0Var);
    }

    /* JADX INFO: renamed from: t */
    public static void m61568t(View view, CharSequence charSequence) {
        new ydc1(1).m77106j(view, charSequence);
    }
}

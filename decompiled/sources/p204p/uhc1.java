package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class uhc1 {

    /* JADX INFO: renamed from: a */
    public static final uhc1 f230418a = new uhc1();

    /* JADX INFO: renamed from: b */
    public static WeakReference f230419b = new WeakReference(null);

    /* JADX INFO: renamed from: c */
    public static Method f230420c;

    /* JADX INFO: renamed from: a */
    public static final View m83146a(View view) {
        if (!p2l.f173365a.contains(uhc1.class)) {
            while (view != null) {
                try {
                    uhc1 uhc1Var = f230418a;
                    boolean zEquals = false;
                    if (!p2l.f173365a.contains(uhc1Var)) {
                        try {
                            zEquals = view.getClass().getName().equals("com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            p2l.m68953a(uhc1Var, th);
                        }
                    }
                    if (!zEquals) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    p2l.m68953a(uhc1.class, th2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m83147b(View view) {
        if (p2l.f173365a.contains(uhc1.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004d A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:16:0x0024, B:19:0x002d, B:28:0x0044, B:33:0x004d, B:41:0x005f, B:39:0x005a, B:26:0x003e, B:23:0x0038), top: B:84:0x0024, outer: #1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x005f A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:16:0x0024, B:19:0x002d, B:28:0x0044, B:33:0x004d, B:41:0x005f, B:39:0x005a, B:26:0x003e, B:23:0x0038), top: B:84:0x0024, outer: #1, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static final int m83148c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = p2l.f173365a;
        if (set.contains(uhc1.class)) {
            return 0;
        }
        try {
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean zContains = set.contains(uhc1.class);
            uhc1 uhc1Var = f230418a;
            if (!zContains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (set.contains(uhc1Var)) {
                            cls = null;
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = p2l.f173365a.contains(uhc1Var) ? null : igj0.class;
                                if (cls2 != null && cls2.isInstance(parent)) {
                                }
                            }
                        } else {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th) {
                                p2l.m68953a(uhc1Var, th);
                                cls = null;
                            }
                            if (cls != null) {
                                if (p2l.f173365a.contains(uhc1Var)) {
                                }
                                if (cls2 != null) {
                                }
                            } else {
                                if (p2l.f173365a.contains(uhc1Var)) {
                                }
                                if (cls2 != null) {
                                }
                            }
                        }
                    }
                    i |= 512;
                } catch (Throwable th2) {
                    p2l.m68953a(uhc1.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | 16384;
                    }
                    return ((view instanceof ViewGroup) && uhc1Var.m83158l(view, (View) f230419b.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | 1025;
            if (view instanceof Button) {
                i2 = i | 1029;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | 2048 : i3;
        } catch (Throwable th3) {
            p2l.m68953a(uhc1.class, th3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final JSONObject m83149d(View view) {
        if (p2l.f173365a.contains(uhc1.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f230419b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m83155m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListM83147b = m83147b(view);
                int size = arrayListM83147b.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(m83149d((View) arrayListM83147b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final View.OnClickListener m83150f(View view) {
        Field declaredField;
        if (p2l.f173365a.contains(uhc1.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final View.OnTouchListener m83151g(View view) {
        Field declaredField;
        try {
            if (!p2l.f173365a.contains(uhc1.class)) {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        return (View.OnTouchListener) declaredField.get(obj);
                    }
                } catch (ClassNotFoundException unused) {
                    p8y p8yVar = p8y.f175080a;
                } catch (IllegalAccessException unused2) {
                    p8y p8yVar2 = p8y.f175080a;
                } catch (NoSuchFieldException unused3) {
                    p8y p8yVar3 = p8y.f175080a;
                }
            }
            return null;
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m83152h(View view) {
        CharSequence hint;
        String string;
        if (p2l.f173365a.contains(uhc1.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final ViewGroup m83153i(View view) {
        if (!p2l.f173365a.contains(uhc1.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                p2l.m68953a(uhc1.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ee A[EDGE_INSN: B:42:0x00ee->B:43:0x00ef BREAK  A[LOOP:0: B:32:0x00c2->B:38:0x00dc]] */
    /* JADX INFO: renamed from: j */
    public static final String m83154j(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (p2l.f173365a.contains(uhc1.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((TimePicker) view).getCurrentHour().intValue()), Integer.valueOf(((TimePicker) view).getCurrentMinute().intValue())}, 2));
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m83155m(View view, JSONObject jSONObject) {
        try {
            if (p2l.f173365a.contains(uhc1.class)) {
                return;
            }
            try {
                String strM83154j = m83154j(view);
                String strM83152h = m83152h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", m83148c(view));
                jSONObject.put("id", view.getId());
                if (msz0.m62783b(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", n0b1.m63364d(n0b1.m63358Q(strM83154j)));
                }
                jSONObject.put("hint", n0b1.m63364d(n0b1.m63358Q(strM83152h)));
                if (tag != null) {
                    jSONObject.put("tag", n0b1.m63364d(n0b1.m63358Q(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", n0b1.m63364d(n0b1.m63358Q(contentDescription.toString())));
                }
                jSONObject.put("dimension", f230418a.m83156e(view));
            } catch (JSONException unused) {
                p8y p8yVar = p8y.f175080a;
            }
        } catch (Throwable th) {
            p2l.m68953a(uhc1.class, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m83156e(View view) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m83157k() {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            if (f230420c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f230420c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                p8y p8yVar = p8y.f175080a;
            } catch (NoSuchMethodException unused2) {
                p8y p8yVar2 = p8y.f175080a;
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m83158l(View view, View view2) {
        float[] fArr;
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            View view3 = null;
            if (set.contains(this)) {
                fArr = null;
            } else {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th) {
                    p2l.m68953a(this, th);
                    fArr = null;
                }
            }
            if (!p2l.f173365a.contains(this)) {
                try {
                    m83157k();
                    Method method = f230420c;
                    if (method != null && view2 != null) {
                        try {
                            try {
                                View view4 = (View) method.invoke(null, fArr, view2);
                                if (view4.getId() > 0) {
                                    view3 = (View) view4.getParent();
                                }
                            } catch (IllegalAccessException unused) {
                                p8y p8yVar = p8y.f175080a;
                            }
                        } catch (InvocationTargetException unused2) {
                            p8y p8yVar2 = p8y.f175080a;
                        }
                    }
                } catch (Throwable th2) {
                    p2l.m68953a(this, th2);
                }
            }
            return view3 != null && view3.getId() == view.getId();
        } catch (Throwable th3) {
            p2l.m68953a(this, th3);
            return false;
        }
    }
}

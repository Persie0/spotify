package p204p;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class vy51 {

    /* JADX INFO: renamed from: a */
    public static final vy51 f245949a = new vy51();

    /* JADX INFO: renamed from: b */
    public static final List f245950b = h6f.m46715L(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX INFO: renamed from: a */
    public static final ArrayList m86705a(View view) {
        if (p2l.f173365a.contains(vy51.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f245950b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = uhc1.m83147b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m86705a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            p2l.m68953a(vy51.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JSONObject m86706b(View view, View view2) {
        if (p2l.f173365a.contains(vy51.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m86708e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = uhc1.m83147b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m86706b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            p2l.m68953a(vy51.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final String m86707d(View view) {
        if (p2l.f173365a.contains(vy51.class)) {
            return null;
        }
        try {
            String strM83154j = uhc1.m83154j(view);
            return strM83154j.length() > 0 ? strM83154j : TextUtils.join(" ", f245949a.m86709c(view));
        } catch (Throwable th) {
            p2l.m68953a(vy51.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m86708e(View view, JSONObject jSONObject) {
        if (p2l.f173365a.contains(vy51.class)) {
            return;
        }
        try {
            String strM83154j = uhc1.m83154j(view);
            String strM83152h = uhc1.m83152h(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", uhc1.m83148c(view));
            if (strM83154j.length() > 0) {
                jSONObject.put("text", strM83154j);
            }
            if (strM83152h.length() > 0) {
                jSONObject.put("hint", strM83152h);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            p2l.m68953a(vy51.class, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m86709c(View view) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : uhc1.m83147b(view)) {
                String strM83154j = uhc1.m83154j(view2);
                if (strM83154j.length() > 0) {
                    arrayList.add(strM83154j);
                }
                arrayList.addAll(m86709c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }
}

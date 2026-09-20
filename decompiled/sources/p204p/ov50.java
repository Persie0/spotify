package p204p;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.io.File;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ov50 {

    /* JADX INFO: renamed from: c */
    public static final q69 f170419c = new q69(1);

    /* JADX INFO: renamed from: d */
    public static final q69 f170420d = new q69(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170421a;

    /* JADX INFO: renamed from: b */
    public int f170422b;

    public /* synthetic */ ov50(int i, int i2) {
        this.f170421a = i2;
        this.f170422b = i;
    }

    /* JADX INFO: renamed from: b */
    public static int m68117b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m68118c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: d */
    public static void m68119d(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = wj50.m88282u(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m68120e(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* JADX INFO: renamed from: a */
    public void mo68121a(RecyclerView recyclerView, dkv0 dkv0Var) {
        View view = dkv0Var.f50039a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = mec1.f142677a;
            cec1.m32548l(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo38510f(dkv0 dkv0Var);

    /* JADX INFO: renamed from: g */
    public abstract float mo38511g();

    /* JADX INFO: renamed from: h */
    public abstract float mo38512h();

    /* JADX INFO: renamed from: i */
    public int m68122i(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.f170422b == -1) {
            this.f170422b = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f170419c.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f170420d.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f170422b)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    /* JADX INFO: renamed from: j */
    public void mo38513j(Canvas canvas, RecyclerView recyclerView, dkv0 dkv0Var, float f, float f2, int i, boolean z) {
        View view = dkv0Var.f50039a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            Float fValueOf = Float.valueOf(cec1.m32541e(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = mec1.f142677a;
                    float fM32541e = cec1.m32541e(childAt);
                    if (fM32541e > f3) {
                        f3 = fM32541e;
                    }
                }
            }
            cec1.m32548l(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo41860k(z900 z900Var);

    /* JADX INFO: renamed from: l */
    public abstract void mo41861l(z900 z900Var, int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo38514m(dkv0 dkv0Var, dkv0 dkv0Var2);

    /* JADX INFO: renamed from: n */
    public abstract void mo41862n(z900 z900Var);

    /* JADX INFO: renamed from: p */
    public abstract void mo38515p(int i, dkv0 dkv0Var);

    /* JADX INFO: renamed from: q */
    public abstract void mo41863q(z900 z900Var, int i, int i2);

    public String toString() {
        switch (this.f170421a) {
            case 3:
                return m68120e(this.f170422b);
            default:
                return super.toString();
        }
    }

    public ov50() {
        this.f170421a = 0;
        this.f170422b = -1;
    }

    /* JADX INFO: renamed from: o */
    public void mo68123o(int i, dkv0 dkv0Var) {
    }
}

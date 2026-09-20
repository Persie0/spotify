package p204p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class kis extends x1v {

    /* JADX INFO: renamed from: e */
    public final his f123078e;

    /* JADX INFO: renamed from: f */
    public final y28 f123079f;

    /* JADX INFO: renamed from: g */
    public final iis f123080g;

    /* JADX INFO: renamed from: h */
    public final rhe f123081h;

    /* JADX INFO: renamed from: i */
    public final she f123082i;

    /* JADX INFO: renamed from: j */
    public boolean f123083j;

    /* JADX INFO: renamed from: k */
    public boolean f123084k;

    /* JADX INFO: renamed from: l */
    public long f123085l;

    /* JADX INFO: renamed from: m */
    public StateListDrawable f123086m;

    /* JADX INFO: renamed from: n */
    public n3d0 f123087n;

    /* JADX INFO: renamed from: o */
    public AccessibilityManager f123088o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f123089p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f123090q;

    public kis(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f123078e = new his(this, 0);
        this.f123079f = new y28(this, 7);
        this.f123080g = new iis(this, textInputLayout);
        this.f123081h = new rhe(this, 1);
        this.f123082i = new she(this, 1);
        this.f123083j = false;
        this.f123084k = false;
        this.f123085l = Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public static void m56524d(kis kisVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - kisVar.f123085l;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            kisVar.f123083j = false;
        }
        if (kisVar.f123083j) {
            kisVar.f123083j = false;
            return;
        }
        kisVar.m56528g(!kisVar.f123084k);
        if (!kisVar.f123084k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m56525f(EditText editText) {
        return editText.getKeyListener() != null;
    }

    @Override // p204p.x1v
    /* JADX INFO: renamed from: a */
    public final void mo25262a() {
        Context context = this.f257280b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        n3d0 n3d0VarM56527e = m56527e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        n3d0 n3d0VarM56527e2 = m56527e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f123087n = n3d0VarM56527e;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f123086m = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, n3d0VarM56527e);
        this.f123086m.addState(new int[0], n3d0VarM56527e2);
        int i = this.f257282d;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        TextInputLayout textInputLayout = this.f257279a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new ryp(this, 3));
        LinkedHashSet linkedHashSet = textInputLayout.f2211D1;
        rhe rheVar = this.f123081h;
        linkedHashSet.add(rheVar);
        if (textInputLayout.f2261e != null) {
            rheVar.m75513a(textInputLayout);
        }
        textInputLayout.f2215H1.add(this.f123082i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = r05.f194383a;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        int i2 = 9;
        valueAnimatorOfFloat.addUpdateListener(new rx4(this, i2));
        this.f123090q = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new rx4(this, i2));
        this.f123089p = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new z10(this, 5));
        this.f123088o = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // p204p.x1v
    /* JADX INFO: renamed from: b */
    public final boolean mo56526b(int i) {
        return i != 0;
    }

    /* JADX INFO: renamed from: e */
    public final n3d0 m56527e(float f, float f2, float f3, int i) {
        imx0 imx0Var = new imx0();
        imx0 imx0Var2 = new imx0();
        imx0 imx0Var3 = new imx0();
        imx0 imx0Var4 = new imx0();
        int i2 = 0;
        crs crsVar = new crs(i2);
        crs crsVar2 = new crs(i2);
        crs crsVar3 = new crs(i2);
        crs crsVar4 = new crs(i2);
        C2281q5 c2281q5 = new C2281q5(f);
        C2281q5 c2281q6 = new C2281q5(f);
        C2281q5 c2281q7 = new C2281q5(f2);
        C2281q5 c2281q8 = new C2281q5(f2);
        dh01 dh01Var = new dh01();
        dh01Var.f48937a = imx0Var;
        dh01Var.f48938b = imx0Var2;
        dh01Var.f48939c = imx0Var3;
        dh01Var.f48940d = imx0Var4;
        dh01Var.f48941e = c2281q5;
        dh01Var.f48942f = c2281q6;
        dh01Var.f48943g = c2281q8;
        dh01Var.f48944h = c2281q7;
        dh01Var.f48945i = crsVar;
        dh01Var.f48946j = crsVar2;
        dh01Var.f48947k = crsVar3;
        dh01Var.f48948l = crsVar4;
        Paint paint = n3d0.f150008U0;
        String simpleName = n3d0.class.getSimpleName();
        Context context = this.f257280b;
        int iM81523r = ttg1.m81523r(R.attr.colorSurface, context, simpleName);
        n3d0 n3d0Var = new n3d0();
        n3d0Var.m63599j(context);
        n3d0Var.m63601l(ColorStateList.valueOf(iM81523r));
        n3d0Var.m63600k(f3);
        n3d0Var.setShapeAppearanceModel(dh01Var);
        m3d0 m3d0Var = n3d0Var.f150021a;
        if (m3d0Var.f139599g == null) {
            m3d0Var.f139599g = new Rect();
        }
        n3d0Var.f150021a.f139599g.set(0, i, 0, i);
        n3d0Var.invalidateSelf();
        return n3d0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m56528g(boolean z) {
        if (this.f123084k != z) {
            this.f123084k = z;
            this.f123090q.cancel();
            this.f123089p.start();
        }
    }
}

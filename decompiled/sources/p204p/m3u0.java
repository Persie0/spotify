package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m3u0 extends ConstraintLayout {

    /* JADX INFO: renamed from: R0 */
    public final cjs0 f139761R0;

    /* JADX INFO: renamed from: S0 */
    public int f139762S0;

    /* JADX INFO: renamed from: T0 */
    public final n3d0 f139763T0;

    public m3u0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        n3d0 n3d0Var = new n3d0();
        this.f139763T0 = n3d0Var;
        l0w0 l0w0Var = new l0w0(0.5f);
        dh01 dh01Var = n3d0Var.f150021a.f139593a;
        dh01Var.getClass();
        fem femVar = dh01Var.f48937a;
        fem femVar2 = dh01Var.f48938b;
        fem femVar3 = dh01Var.f48939c;
        fem femVar4 = dh01Var.f48940d;
        crs crsVar = dh01Var.f48945i;
        crs crsVar2 = dh01Var.f48946j;
        crs crsVar3 = dh01Var.f48947k;
        crs crsVar4 = dh01Var.f48948l;
        dh01 dh01Var2 = new dh01();
        dh01Var2.f48937a = femVar;
        dh01Var2.f48938b = femVar2;
        dh01Var2.f48939c = femVar3;
        dh01Var2.f48940d = femVar4;
        dh01Var2.f48941e = l0w0Var;
        dh01Var2.f48942f = l0w0Var;
        dh01Var2.f48943g = l0w0Var;
        dh01Var2.f48944h = l0w0Var;
        dh01Var2.f48945i = crsVar;
        dh01Var2.f48946j = crsVar2;
        dh01Var2.f48947k = crsVar3;
        dh01Var2.f48948l = crsVar4;
        n3d0Var.setShapeAppearanceModel(dh01Var2);
        this.f139763T0.m63601l(ColorStateList.valueOf(-1));
        n3d0 n3d0Var2 = this.f139763T0;
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(n3d0Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86717F, i, 0);
        this.f139762S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f139761R0 = new cjs0(this, 6);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = mec1.f142677a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            cjs0 cjs0Var = this.f139761R0;
            handler.removeCallbacks(cjs0Var);
            handler.post(cjs0Var);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m60742x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            cjs0 cjs0Var = this.f139761R0;
            handler.removeCallbacks(cjs0Var);
            handler.post(cjs0Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f139763T0.m63601l(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: x */
    public final void m60742x() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        c7j c7jVar = new c7j();
        c7jVar.m31736f(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.f139762S0;
                y6j y6jVar = c7jVar.m31740l(id).f258686e;
                y6jVar.f269795A = R.id.circle_center;
                y6jVar.f269796B = i4;
                y6jVar.f269797C = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        c7jVar.m31733b(this);
    }
}

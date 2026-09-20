package p204p;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class rrk extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f202078a;

    /* JADX INFO: renamed from: b */
    public final int f202079b;

    public rrk(BottomSheetBehavior bottomSheetBehavior, ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.f202078a = viewGroup;
        this.f202079b = getContext().getResources().getDimensionPixelSize(R.dimen.core_bottom_sheet_bottom_inset_fade_min_height_threshold);
        hqk hqkVar = new hqk(-1, 0);
        hqkVar.f94200c = 81;
        setLayoutParams(hqkVar);
        int iM86387n = vtg1.m86387n(this, R.attr.baseBackgroundElevatedBase);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        b450 b450Var = new b450(0, 10, 1);
        ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
        Iterator it = b450Var.iterator();
        while (((a450) it).f12141c) {
            arrayList.add(Float.valueOf(decelerateInterpolator.getInterpolation(((t350) it).nextInt() / 10.0f)));
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(m9f.m61224l(iM86387n, (int) (((Number) it2.next()).floatValue() * 255))));
        }
        setBackground(new GradientDrawable(orientation, g6f.m43726i1(arrayList2)));
        bottomSheetBehavior.m1590t(new qrk(this, this.f202078a));
        p3h1.m69032r(this, new xgg(this, 27));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f202078a.getMeasuredWidth(), 1073741824), i2);
    }
}

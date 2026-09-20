package p204p;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.p002ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class l551 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final fyf f129826a;

    /* JADX INFO: renamed from: b */
    public final kv91 f129827b;

    /* JADX INFO: renamed from: c */
    public final lt91 f129828c;

    /* JADX INFO: renamed from: d */
    public final e940 f129829d;

    /* JADX INFO: renamed from: e */
    public final wg61 f129830e;

    /* JADX INFO: renamed from: f */
    public final wpi0 f129831f;

    /* JADX INFO: renamed from: g */
    public final wg61 f129832g;

    /* JADX INFO: renamed from: h */
    public final FrameLayout f129833h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f129834i;

    public l551(Activity activity, fyf fyfVar, kv91 kv91Var, lt91 lt91Var, e940 e940Var, b250 b250Var) {
        super(activity);
        this.f129826a = fyfVar;
        this.f129827b = kv91Var;
        this.f129828c = lt91Var;
        this.f129829d = e940Var;
        this.f129830e = new wg61(new k551(this, 1));
        wpi0 wpi0Var = new wpi0(b250Var == null ? getFallbackInstrumentationEnvironment() : b250Var);
        this.f129831f = wpi0Var;
        this.f129832g = new wg61(new k551(this, 2));
        this.f129833h = (FrameLayout) activity.findViewById(R.id.bottom_sheet_fragment_container);
        hqk hqkVar = new hqk(-1, -2);
        hqkVar.f94200c = 81;
        setLayoutParams(hqkVar);
        setOrientation(1);
        setTranslationY(getResources().getDisplayMetrics().heightPixels);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, view.getResources().getDimensionPixelSize(R.dimen.sticky_footer_shadow_height)));
        view.setBackground(activity.getDrawable(R.drawable.sticky_footer_shadow));
        addView(view);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setClickable(true);
        frameLayout.setBackgroundColor(activity.getColor(R.color.dark_base_background_elevated_base));
        this.f129834i = frameLayout;
        addView(frameLayout);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.bottom_sheet_container);
        if (viewGroup != null) {
            BottomSheetBehavior.m1567z(viewGroup).m1590t(new cmf(this, 8));
        }
        ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        joc1.m53879f(composeView, wpi0Var);
        composeView.setContent(new fyf(new j551(this, 2), true, 664949967));
        this.f129834i.addView(composeView);
        post(new cjs0(this, 26));
    }

    private final b250 getFallbackInstrumentationEnvironment() {
        return (b250) this.f129830e.getValue();
    }

    private final int getSheetMaxWidth() {
        return ((Number) this.f129832g.getValue()).intValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m58200a(b250 b250Var) {
        if (b250Var == null) {
            b250Var = getFallbackInstrumentationEnvironment();
        }
        this.f129831f.m88718c(b250Var);
    }

    public final FrameLayout getContentContainer() {
        return this.f129834i;
    }

    /* JADX INFO: renamed from: getInstrumentationEnvironment$src_main_java_com_spotify_connect_devicepickerpage_devicepickerpage */
    public final wpi0 m58201x5bf7514c() {
        return this.f129831f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout frameLayout = this.f129833h;
        if (frameLayout != null && frameLayout.getPaddingBottom() > 0) {
            FrameLayout frameLayout2 = this.f129834i;
            frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout.getPaddingBottom());
        }
        int size = View.MeasureSpec.getSize(i);
        int sheetMaxWidth = getSheetMaxWidth();
        if (size > sheetMaxWidth) {
            size = sheetMaxWidth;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public final void setContentContainer(FrameLayout frameLayout) {
        this.f129834i = frameLayout;
    }
}

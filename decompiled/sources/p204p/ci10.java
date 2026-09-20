package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class ci10 extends FrameLayout implements fh10 {

    /* JADX INFO: renamed from: e */
    public static final bi10 f38181e = new bi10();

    /* JADX INFO: renamed from: a */
    public final FrameLayout f38182a;

    /* JADX INFO: renamed from: b */
    public zh10 f38183b;

    /* JADX INFO: renamed from: c */
    public int f38184c;

    /* JADX INFO: renamed from: d */
    public lly0 f38185d;

    public ci10(Context context) {
        super(context, null, 0);
        this.f38185d = f38181e;
        LayoutInflater.from(context).inflate(R.layout.glue_header_v2, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.header_content);
        frameLayout.getClass();
        this.f38182a = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m32830b(float f, int i, Drawable drawable) {
        if (drawable instanceof hny0) {
            ((hny0) drawable).mo32831a(f, i);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                m32830b(f, i, layerDrawable.getDrawable(i2));
            }
        }
    }

    private FrameLayout.LayoutParams getContentLayoutParams() {
        return (FrameLayout.LayoutParams) this.f38182a.getLayoutParams();
    }

    @Override // p204p.hny0
    /* JADX INFO: renamed from: a */
    public final void mo32831a(float f, int i) {
        FrameLayout frameLayout = this.f38182a;
        frameLayout.offsetTopAndBottom((i - frameLayout.getTop()) + getContentLayoutParams().topMargin);
        zh10 zh10Var = this.f38183b;
        if (zh10Var instanceof em20) {
            ((em20) zh10Var).mo30875a(f, i);
        }
        m32830b(f, i, getBackground());
        m32830b(f, i, getForeground());
        this.f38185d.mo29286a(f);
    }

    @Override // p204p.fh10
    public int getTotalScrollRange() {
        return getMeasuredHeight() - this.f38184c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        zh10 zh10Var = this.f38183b;
        if (zh10Var instanceof gh10) {
            ((gh10) zh10Var).m44709b();
        }
    }

    public void setContentBottomMargin(int i) {
        getContentLayoutParams().bottomMargin = i;
        WeakHashMap weakHashMap = mec1.f142677a;
        if (!isLaidOut() || isInLayout()) {
            return;
        }
        requestLayout();
    }

    public void setContentTopMargin(int i) {
        getContentLayoutParams().topMargin = i;
        WeakHashMap weakHashMap = mec1.f142677a;
        if (!isLaidOut() || isInLayout()) {
            return;
        }
        requestLayout();
    }

    public void setContentViewBinder(zh10 zh10Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        zh10 zh10Var2 = this.f38183b;
        FrameLayout frameLayout = this.f38182a;
        if (zh10Var2 != null) {
            frameLayout.removeView(zh10Var2.getView());
        }
        this.f38183b = zh10Var;
        if (zh10Var != null) {
            frameLayout.addView(zh10Var.getView(), layoutParams);
        }
    }

    public void setScrollObserver(lly0 lly0Var) {
        this.f38185d = (lly0) vie1.m85630l(lly0Var, f38181e);
    }

    public void setStickyAreaSize(int i) {
        this.f38184c = i;
    }

    @Override // p204p.fh10
    public View getView() {
        return this;
    }
}

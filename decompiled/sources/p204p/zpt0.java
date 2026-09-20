package p204p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class zpt0 {

    /* JADX INFO: renamed from: d */
    public static final zpt0 f285220d;

    /* JADX INFO: renamed from: e */
    public static final int[] f285221e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final int[] f285222f = {-16842910};

    /* JADX INFO: renamed from: g */
    public static final int[] f285223g = {R.attr.state_focused};

    /* JADX INFO: renamed from: h */
    public static final int[] f285224h = {R.attr.state_pressed};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285225a;

    /* JADX INFO: renamed from: b */
    public final int f285226b;

    /* JADX INFO: renamed from: c */
    public final int f285227c;

    static {
        int i = 0;
        f285220d = new zpt0(i, i, 0);
    }

    public /* synthetic */ zpt0(int i, int i2, int i3) {
        this.f285225a = i3;
        this.f285226b = i;
        this.f285227c = i2;
    }

    /* JADX INFO: renamed from: a */
    public ColorStateList m96694a(int i) {
        int i2 = this.f285226b;
        return new ColorStateList(new int[][]{f285222f, f285224h, f285223g, f285221e}, new int[]{m9f.m61221i(this.f285227c, i), m9f.m61221i(i2, i), m9f.m61221i(i2, i), i});
    }

    public String toString() {
        switch (this.f285225a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(zpt0.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.f285226b);
                sb.append(", length = ");
                return klh.m56832d(this.f285227c, "]", sb);
            default:
                return super.toString();
        }
    }

    public zpt0(Context context) {
        this.f285225a = 1;
        TypedValue typedValue = new TypedValue();
        float fraction = context.getTheme().resolveAttribute(com.spotify.music.R.attr.pastePressedDimFraction, typedValue, true) ? typedValue.getFraction(1.0f, 1.0f) : 0.3f;
        TypedValue typedValue2 = new TypedValue();
        float fraction2 = context.getTheme().resolveAttribute(com.spotify.music.R.attr.pasteDisabledDimFraction, typedValue2, true) ? typedValue2.getFraction(1.0f, 1.0f) : 0.6f;
        int iM30532u = bug1.m30532u(context, com.spotify.music.R.attr.pasteDimOverlayColor);
        this.f285226b = m9f.m61224l(iM30532u, (int) (fraction * 255.0f));
        this.f285227c = m9f.m61224l(iM30532u, (int) (fraction2 * 255.0f));
    }
}

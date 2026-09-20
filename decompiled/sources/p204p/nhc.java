package p204p;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nhc {

    /* JADX INFO: renamed from: A */
    public static final boolean[] f153920A;

    /* JADX INFO: renamed from: B */
    public static final int[] f153921B;

    /* JADX INFO: renamed from: C */
    public static final int[] f153922C;

    /* JADX INFO: renamed from: D */
    public static final int[] f153923D;

    /* JADX INFO: renamed from: E */
    public static final int[] f153924E;

    /* JADX INFO: renamed from: v */
    public static final int f153925v = m64462c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w */
    public static final int f153926w;

    /* JADX INFO: renamed from: x */
    public static final int[] f153927x;

    /* JADX INFO: renamed from: y */
    public static final int[] f153928y;

    /* JADX INFO: renamed from: z */
    public static final int[] f153929z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f153930a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final SpannableStringBuilder f153931b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c */
    public boolean f153932c;

    /* JADX INFO: renamed from: d */
    public boolean f153933d;

    /* JADX INFO: renamed from: e */
    public int f153934e;

    /* JADX INFO: renamed from: f */
    public boolean f153935f;

    /* JADX INFO: renamed from: g */
    public int f153936g;

    /* JADX INFO: renamed from: h */
    public int f153937h;

    /* JADX INFO: renamed from: i */
    public int f153938i;

    /* JADX INFO: renamed from: j */
    public int f153939j;

    /* JADX INFO: renamed from: k */
    public int f153940k;

    /* JADX INFO: renamed from: l */
    public int f153941l;

    /* JADX INFO: renamed from: m */
    public int f153942m;

    /* JADX INFO: renamed from: n */
    public int f153943n;

    /* JADX INFO: renamed from: o */
    public int f153944o;

    /* JADX INFO: renamed from: p */
    public int f153945p;

    /* JADX INFO: renamed from: q */
    public int f153946q;

    /* JADX INFO: renamed from: r */
    public int f153947r;

    /* JADX INFO: renamed from: s */
    public int f153948s;

    /* JADX INFO: renamed from: t */
    public int f153949t;

    /* JADX INFO: renamed from: u */
    public int f153950u;

    static {
        int iM64462c = m64462c(0, 0, 0, 0);
        f153926w = iM64462c;
        int iM64462c2 = m64462c(0, 0, 0, 3);
        f153927x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f153928y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f153929z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f153920A = new boolean[]{false, false, false, true, true, true, false};
        f153921B = new int[]{iM64462c, iM64462c2, iM64462c, iM64462c, iM64462c2, iM64462c, iM64462c};
        f153922C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f153923D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f153924E = new int[]{iM64462c, iM64462c, iM64462c, iM64462c, iM64462c, iM64462c2, iM64462c2};
    }

    public nhc() {
        m64465d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: c */
    public static int m64462c(int i, int i2, int i3, int i4) {
        int i5;
        c95.m31847m(i, 4);
        c95.m31847m(i2, 4);
        c95.m31847m(i3, 4);
        c95.m31847m(i4, 4);
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else if (i4 == 2) {
            i5 = 127;
        } else if (i4 != 3) {
            i5 = 255;
        } else {
            i5 = 0;
        }
        return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m64463a(char c) {
        SpannableStringBuilder spannableStringBuilder = this.f153931b;
        if (c != '\n') {
            spannableStringBuilder.append(c);
            return;
        }
        SpannableString spannableStringM64464b = m64464b();
        ArrayList arrayList = this.f153930a;
        arrayList.add(spannableStringM64464b);
        spannableStringBuilder.clear();
        if (this.f153944o != -1) {
            this.f153944o = 0;
        }
        if (this.f153945p != -1) {
            this.f153945p = 0;
        }
        if (this.f153946q != -1) {
            this.f153946q = 0;
        }
        if (this.f153948s != -1) {
            this.f153948s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f153939j && arrayList.size() < 15) {
                this.f153950u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final SpannableString m64464b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f153931b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f153944o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f153944o, length, 33);
            }
            if (this.f153945p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f153945p, length, 33);
            }
            if (this.f153946q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f153947r), this.f153946q, length, 33);
            }
            if (this.f153948s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f153949t), this.f153948s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public final void m64465d() {
        this.f153930a.clear();
        this.f153931b.clear();
        this.f153944o = -1;
        this.f153945p = -1;
        this.f153946q = -1;
        this.f153948s = -1;
        this.f153950u = 0;
        this.f153932c = false;
        this.f153933d = false;
        this.f153934e = 4;
        this.f153935f = false;
        this.f153936g = 0;
        this.f153937h = 0;
        this.f153938i = 0;
        this.f153939j = 15;
        this.f153940k = 0;
        this.f153941l = 0;
        this.f153942m = 0;
        int i = f153926w;
        this.f153943n = i;
        this.f153947r = f153925v;
        this.f153949t = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m64466e(boolean z, boolean z2) {
        int i = this.f153944o;
        SpannableStringBuilder spannableStringBuilder = this.f153931b;
        if (i != -1) {
            if (!z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f153944o, spannableStringBuilder.length(), 33);
                this.f153944o = -1;
            }
        } else if (z) {
            this.f153944o = spannableStringBuilder.length();
        }
        if (this.f153945p == -1) {
            if (z2) {
                this.f153945p = spannableStringBuilder.length();
            }
        } else {
            if (z2) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f153945p, spannableStringBuilder.length(), 33);
            this.f153945p = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m64467f(int i, int i2) {
        int i3 = this.f153946q;
        SpannableStringBuilder spannableStringBuilder = this.f153931b;
        if (i3 != -1 && this.f153947r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f153947r), this.f153946q, spannableStringBuilder.length(), 33);
        }
        if (i != f153925v) {
            this.f153946q = spannableStringBuilder.length();
            this.f153947r = i;
        }
        if (this.f153948s != -1 && this.f153949t != i2) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f153949t), this.f153948s, spannableStringBuilder.length(), 33);
        }
        if (i2 != f153926w) {
            this.f153948s = spannableStringBuilder.length();
            this.f153949t = i2;
        }
    }
}

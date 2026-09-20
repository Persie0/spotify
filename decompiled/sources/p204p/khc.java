package p204p;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class khc {

    /* JADX INFO: renamed from: a */
    public final ArrayList f122599a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f122600b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f122601c;

    /* JADX INFO: renamed from: d */
    public int f122602d;

    /* JADX INFO: renamed from: e */
    public int f122603e;

    /* JADX INFO: renamed from: f */
    public int f122604f;

    /* JADX INFO: renamed from: g */
    public int f122605g;

    /* JADX INFO: renamed from: h */
    public int f122606h;

    public khc(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f122599a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f122600b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f122601c = sb;
        this.f122605g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f122602d = 15;
        this.f122603e = 0;
        this.f122604f = 0;
        this.f122606h = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m56421a(char c) {
        StringBuilder sb = this.f122601c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56422b() {
        StringBuilder sb = this.f122601c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f122599a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                jhc jhcVar = (jhc) arrayList.get(size);
                int i = jhcVar.f112387c;
                if (i != length) {
                    return;
                }
                jhcVar.f112387c = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final b0m m56423c(int i) {
        int i2;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f122600b;
            if (i3 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i3));
            spannableStringBuilder.append('\n');
            i3++;
        }
        spannableStringBuilder.append((CharSequence) m56424d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i4 = this.f122603e + this.f122604f;
        int length = (32 - i4) - spannableStringBuilder.length();
        int i5 = i4 - length;
        if (i != Integer.MIN_VALUE) {
            i2 = i;
        } else if (this.f122605g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
            i2 = (this.f122605g != 2 || i5 <= 0) ? 0 : 2;
        } else {
            i2 = 1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i4 = 32 - length;
            }
            f = ((i4 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        float f2 = f;
        int i6 = this.f122602d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.f122605g == 1) {
            i6 -= this.f122606h - 1;
        }
        return new b0m(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m56424d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f122601c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f122599a;
            if (i5 >= arrayList.size()) {
                break;
            }
            jhc jhcVar = (jhc) arrayList.get(i5);
            boolean z2 = jhcVar.f112386b;
            int i7 = jhcVar.f112385a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = lhc.f133470B[i7];
                }
                z = z3;
            }
            int i8 = jhcVar.f112387c;
            i5++;
            if (i8 != (i5 < arrayList.size() ? ((jhc) arrayList.get(i5)).f112387c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i3 = i4;
                    i6 = i8;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m56425e() {
        return this.f122599a.isEmpty() && this.f122600b.isEmpty() && this.f122601c.length() == 0;
    }
}

package p204p;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class sy41 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f215133a;

    /* JADX INFO: renamed from: b */
    public final int f215134b;

    /* JADX INFO: renamed from: c */
    public final TextPaint f215135c;

    /* JADX INFO: renamed from: d */
    public final int f215136d;

    /* JADX INFO: renamed from: e */
    public final TextDirectionHeuristic f215137e;

    /* JADX INFO: renamed from: f */
    public final Layout.Alignment f215138f;

    /* JADX INFO: renamed from: g */
    public final int f215139g;

    /* JADX INFO: renamed from: h */
    public final TextUtils.TruncateAt f215140h;

    /* JADX INFO: renamed from: i */
    public final int f215141i;

    /* JADX INFO: renamed from: j */
    public final int f215142j;

    /* JADX INFO: renamed from: k */
    public final boolean f215143k;

    /* JADX INFO: renamed from: l */
    public final int f215144l;

    /* JADX INFO: renamed from: m */
    public final int f215145m;

    /* JADX INFO: renamed from: n */
    public final int f215146n;

    /* JADX INFO: renamed from: o */
    public final int f215147o;

    public sy41(CharSequence charSequence, int i, TextPaint textPaint, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        this.f215133a = charSequence;
        this.f215134b = i;
        this.f215135c = textPaint;
        this.f215136d = i2;
        this.f215137e = textDirectionHeuristic;
        this.f215138f = alignment;
        this.f215139g = i3;
        this.f215140h = truncateAt;
        this.f215141i = i4;
        this.f215142j = i5;
        this.f215143k = z;
        this.f215144l = i6;
        this.f215145m = i7;
        this.f215146n = i8;
        this.f215147o = i9;
        if (i < 0) {
            nt40.m65597a("invalid start value");
        }
        int length = charSequence.length();
        if (i < 0 || i > length) {
            nt40.m65597a("invalid end value");
        }
        if (i3 < 0) {
            nt40.m65597a("invalid maxLines value");
        }
        if (i2 < 0) {
            nt40.m65597a("invalid width value");
        }
        if (i4 >= 0) {
            return;
        }
        nt40.m65597a("invalid ellipsizedWidth value");
    }
}

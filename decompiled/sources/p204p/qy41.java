package p204p;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes4.dex */
public final class qy41 {

    /* JADX INFO: renamed from: a */
    public CharSequence f193805a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f193806b;

    /* JADX INFO: renamed from: c */
    public final int f193807c;

    /* JADX INFO: renamed from: d */
    public int f193808d;

    /* JADX INFO: renamed from: k */
    public boolean f193815k;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f193809e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f193810f = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: g */
    public float f193811g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f193812h = 1.0f;

    /* JADX INFO: renamed from: i */
    public int f193813i = 1;

    /* JADX INFO: renamed from: j */
    public boolean f193814j = true;

    /* JADX INFO: renamed from: l */
    public TextUtils.TruncateAt f193816l = null;

    public qy41(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f193805a = charSequence;
        this.f193806b = textPaint;
        this.f193807c = i;
        this.f193808d = charSequence.length();
    }

    /* JADX INFO: renamed from: b */
    public static qy41 m74152b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new qy41(charSequence, textPaint, i);
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m74153a() {
        if (this.f193805a == null) {
            this.f193805a = "";
        }
        int iMax = Math.max(0, this.f193807c);
        CharSequence charSequenceEllipsize = this.f193805a;
        int i = this.f193810f;
        TextPaint textPaint = this.f193806b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f193816l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f193808d);
        this.f193808d = iMin;
        if (this.f193815k && this.f193810f == 1) {
            this.f193809e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f193809e);
        builderObtain.setIncludePad(this.f193814j);
        builderObtain.setTextDirection(this.f193815k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f193816l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f193810f);
        float f = this.f193811g;
        if (f != 0.0f || this.f193812h != 1.0f) {
            builderObtain.setLineSpacing(f, this.f193812h);
        }
        if (this.f193810f > 1) {
            builderObtain.setHyphenationFrequency(this.f193813i);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: c */
    public final void m74154c() {
        this.f193809e = Layout.Alignment.ALIGN_NORMAL;
    }

    /* JADX INFO: renamed from: d */
    public final void m74155d() {
        this.f193816l = TextUtils.TruncateAt.END;
    }

    /* JADX INFO: renamed from: e */
    public final void m74156e(int i) {
        this.f193813i = i;
    }

    /* JADX INFO: renamed from: f */
    public final void m74157f() {
        this.f193814j = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m74158g(boolean z) {
        this.f193815k = z;
    }

    /* JADX INFO: renamed from: h */
    public final void m74159h(float f, float f2) {
        this.f193811g = f;
        this.f193812h = f2;
    }

    /* JADX INFO: renamed from: i */
    public final void m74160i(int i) {
        this.f193810f = i;
    }
}

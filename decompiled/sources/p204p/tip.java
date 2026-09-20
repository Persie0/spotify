package p204p;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class tip implements l7u {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f220719b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f220720a;

    public tip() {
        TextPaint textPaint = new TextPaint();
        this.f220720a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

package androidx.compose.p002ui.text.style;

import p204p.ms2;

/* JADX INFO: loaded from: classes.dex */
public final class TextGeometricTransform {

    /* JADX INFO: renamed from: c */
    public static final TextGeometricTransform f542c = new TextGeometricTransform(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f543a;

    /* JADX INFO: renamed from: b */
    public final float f544b;

    public TextGeometricTransform(float f, float f2) {
        this.f543a = f;
        this.f544b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.f543a == textGeometricTransform.f543a && this.f544b == textGeometricTransform.f544b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f544b) + (Float.hashCode(this.f543a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f543a);
        sb.append(", skewX=");
        return ms2.m62684i(sb, this.f544b, ')');
    }

    public /* synthetic */ TextGeometricTransform() {
        this(1.3f, 0.0f);
    }
}

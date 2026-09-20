package p204p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class s65 {

    /* JADX INFO: renamed from: a */
    public final TextView f206007a;

    /* JADX INFO: renamed from: b */
    private final x8u f206008b;

    public s65(TextView textView) {
        this.f206007a = textView;
        this.f206008b = new x8u(textView);
    }

    /* JADX INFO: renamed from: a */
    public final InputFilter[] m77314a(InputFilter[] inputFilterArr) {
        return this.f206008b.f259226a.mo34006p(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77315b() {
        return this.f206008b.f259226a.mo34007r();
    }

    /* JADX INFO: renamed from: c */
    public final void m77316c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f206007a.getContext().obtainStyledAttributes(attributeSet, h3u0.f87329i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m77318e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m77317d(boolean z) {
        this.f206008b.f259226a.mo34008v(z);
    }

    /* JADX INFO: renamed from: e */
    public final void m77318e(boolean z) {
        this.f206008b.f259226a.mo34009w(z);
    }

    /* JADX INFO: renamed from: f */
    public final TransformationMethod m77319f(dd3 dd3Var) {
        return this.f206008b.f259226a.mo34005A(dd3Var);
    }
}

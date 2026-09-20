package p204p;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a9u implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f13639a;

    public a9u(TransformationMethod transformationMethod) {
        this.f13639a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f13639a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || p7u.m69297a().m69300c() != 1) {
            return charSequence;
        }
        p7u p7uVarM69297a = p7u.m69297a();
        p7uVarM69297a.getClass();
        return p7uVarM69297a.m69304h(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f13639a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}

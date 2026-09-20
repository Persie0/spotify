package p204p;

import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class q65 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCompatEditText f185679a;

    public q65(AppCompatEditText appCompatEditText) {
        this.f185679a = appCompatEditText;
    }

    /* JADX INFO: renamed from: a */
    public final TextClassifier m72215a() {
        return super/*android.widget.EditText*/.getTextClassifier();
    }

    /* JADX INFO: renamed from: b */
    public final void m72216b(TextClassifier textClassifier) {
        super/*android.widget.EditText*/.setTextClassifier(textClassifier);
    }
}

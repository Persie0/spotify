package p204p;

import android.view.ViewTreeObserver;
import android.widget.EditText;
import io.reactivex.rxjava3.core.FlowableEmitter;

/* JADX INFO: loaded from: classes7.dex */
public final class a2b1 implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11620b;

    public /* synthetic */ a2b1(Object obj, int i) {
        this.f11619a = i;
        this.f11620b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        switch (this.f11619a) {
            case 0:
                EditText editText = (EditText) this.f11620b;
                if (z) {
                    if (editText.isFocused()) {
                        editText.post(new n081(editText, 5));
                    }
                    editText.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                }
                break;
            case 1:
                ((FlowableEmitter) this.f11620b).onNext(Boolean.valueOf(z));
                break;
            default:
                ((sir0) this.f11620b).mo30231j(Boolean.valueOf(z));
                break;
        }
    }
}

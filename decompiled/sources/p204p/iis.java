package p204p;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class iis extends fa71 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kis f102626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iis(kis kisVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f102626e = kisVar;
    }

    @Override // p204p.fa71, p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public final void mo1668d(View view, C2374sf c2374sf) {
        super.mo1668d(view, c2374sf);
        if (!kis.m56525f(this.f102626e.f257279a.getEditText())) {
            c2374sf.m77978m(Spinner.class.getName());
        }
        if (c2374sf.m77974i()) {
            c2374sf.m77983r(null);
        }
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: e */
    public final void mo39308e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo39308e(view, accessibilityEvent);
        kis kisVar = this.f102626e;
        TextInputLayout textInputLayout = kisVar.f257279a;
        EditText editText = textInputLayout.getEditText();
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (accessibilityEvent.getEventType() == 1 && kisVar.f123088o.isTouchExplorationEnabled() && !kis.m56525f(textInputLayout.getEditText())) {
            kis.m56524d(kisVar, autoCompleteTextView);
        }
    }
}

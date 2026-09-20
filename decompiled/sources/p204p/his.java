package p204p;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final class his extends xf71 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f91866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x1v f91867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ his(x1v x1vVar, int i) {
        super(1);
        this.f91866b = i;
        this.f91867c = x1vVar;
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        switch (this.f91866b) {
            case 0:
                kis kisVar = (kis) this.f91867c;
                EditText editText = kisVar.f257279a.getEditText();
                if (!(editText instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (kisVar.f123088o.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !kisVar.f257281c.hasFocus()) {
                    autoCompleteTextView.dismissDropDown();
                }
                autoCompleteTextView.post(new uqf1(this, autoCompleteTextView, false, 17));
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    @Override // p204p.xf71, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f91866b) {
            case 1:
                x9n0 x9n0Var = (x9n0) this.f91867c;
                x9n0Var.f257281c.setChecked(!x9n0.m90263d(x9n0Var));
                break;
            default:
                super.beforeTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}

package p204p;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class aam extends x1v {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f13896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aam(TextInputLayout textInputLayout, int i, int i2) {
        super(textInputLayout, i);
        this.f13896e = i2;
    }

    @Override // p204p.x1v
    /* JADX INFO: renamed from: a */
    public final void mo25262a() {
        switch (this.f13896e) {
            case 0:
                int i = this.f257282d;
                TextInputLayout textInputLayout = this.f257279a;
                textInputLayout.setEndIconDrawable(i);
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                TextInputLayout textInputLayout2 = this.f257279a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }
}

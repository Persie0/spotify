package p204p;

import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class ea71 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextInputLayout f57600b;

    public /* synthetic */ ea71(TextInputLayout textInputLayout, int i) {
        this.f57599a = i;
        this.f57600b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57599a) {
            case 0:
                TextInputLayout textInputLayout = this.f57600b;
                textInputLayout.f2214G1.performClick();
                textInputLayout.f2214G1.jumpDrawablesToCurrentState();
                break;
            default:
                this.f57600b.f2261e.requestLayout();
                break;
        }
    }
}

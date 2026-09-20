package p204p;

import android.content.Context;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes8.dex */
public final class tyb0 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224908a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f224909b;

    public tyb0(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f224909b = new b9k(this, context, googleMapOptions);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        swd1 swd1Var;
        switch (this.f224908a) {
            case 0:
                gh00 gh00Var = (gh00) this.f224909b;
                WindowInsets windowInsetsM79541f = null;
                if (gh00Var != null && (swd1Var = (swd1) gh00Var.invoke(swd1.m79536g(null, windowInsets))) != null) {
                    windowInsetsM79541f = swd1Var.m79541f();
                }
                if (windowInsetsM79541f != null) {
                    windowInsets = windowInsetsM79541f;
                }
                return super.dispatchApplyWindowInsets(windowInsets);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyb0(Context context, gh00 gh00Var) {
        super(context);
        this.f224909b = gh00Var;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }
}

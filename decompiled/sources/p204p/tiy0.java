package p204p;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public final class tiy0 extends View {

    /* JADX INFO: renamed from: a */
    public Window f220765a;

    /* JADX INFO: renamed from: b */
    public siy0 f220766b;

    private float getBrightness() {
        Window window = this.f220765a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        vie1.m85626h("ScreenFlashView");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f220765a == null) {
            vie1.m85626h("ScreenFlashView");
            return;
        }
        if (Float.isNaN(f)) {
            vie1.m85626h("ScreenFlashView");
            return;
        }
        WindowManager.LayoutParams attributes = this.f220765a.getAttributes();
        attributes.screenBrightness = f;
        this.f220765a.setAttributes(attributes);
        vie1.m85624f("ScreenFlashView");
    }

    private void setScreenFlashUiInfo(q440 q440Var) {
        vie1.m85624f("ScreenFlashView");
    }

    public q440 getScreenFlash() {
        return this.f220766b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(web webVar) {
        hxg1.m49006s();
    }

    public void setScreenFlashWindow(Window window) {
        hxg1.m49006s();
        if (this.f220765a != window) {
            this.f220766b = window == null ? null : new siy0(this);
        }
        this.f220765a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}

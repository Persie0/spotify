package p204p;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class gj40 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f80366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InAppBrowserActivity f80367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj40(InAppBrowserActivity inAppBrowserActivity, int i, boolean z) {
        super("");
        this.f80366b = i;
        this.f80367c = inAppBrowserActivity;
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f80366b) {
            case 0:
                String str = (String) obj2;
                TextView textView = this.f80367c.f2688d1;
                if (textView != null) {
                    textView.setText(str);
                    return;
                } else {
                    wj50.m88260d0("titleTextView");
                    throw null;
                }
            case 1:
                String str2 = (String) obj2;
                TextView textView2 = this.f80367c.f2689e1;
                if (textView2 != null) {
                    textView2.setText(str2);
                    return;
                } else {
                    wj50.m88260d0("urlTextView");
                    throw null;
                }
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                ProgressBar progressBar = this.f80367c.f2693i1;
                if (progressBar != null) {
                    progressBar.setVisibility(zBooleanValue ? 0 : 8);
                    return;
                } else {
                    wj50.m88260d0("progressBar");
                    throw null;
                }
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                ProgressBar progressBar2 = this.f80367c.f2693i1;
                if (progressBar2 != null) {
                    progressBar2.setProgress(iIntValue, true);
                    return;
                } else {
                    wj50.m88260d0("progressBar");
                    throw null;
                }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gj40(InAppBrowserActivity inAppBrowserActivity, int i) {
        this.f80366b = i;
        switch (i) {
            case 3:
                this.f80367c = inAppBrowserActivity;
                super(0);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.f80367c = inAppBrowserActivity;
                super(bool);
                break;
        }
    }
}

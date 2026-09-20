package p204p;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class euj0 {

    /* JADX INFO: renamed from: a */
    public ktj0 f62989a;

    /* JADX INFO: renamed from: b */
    public CharSequence f62990b;

    /* JADX INFO: renamed from: c */
    public CharSequence f62991c;

    /* JADX INFO: renamed from: d */
    public boolean f62992d = false;

    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:97:0x0179  */
    /* JADX INFO: renamed from: c */
    public static euj0 m40075c(Notification notification) {
        euj0 ztj0Var;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            String string = bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            boolean z = false;
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$ProgressStyle":
                        ztj0Var = new duj0();
                        break;
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        ztj0Var = new rtj0();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        ztj0Var = new htj0();
                        break;
                    case "androidx.core.app.NotificationCompat$CallStyle":
                        ztj0Var = new ptj0();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        ztj0Var = new itj0(1);
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        ztj0Var = new itj0(z);
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        ztj0Var = new ztj0();
                        break;
                    default:
                        ztj0Var = null;
                        break;
                }
            } else {
                ztj0Var = null;
            }
            if (ztj0Var == null) {
                if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                    ztj0Var = new ztj0();
                } else if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
                    ztj0Var = new htj0();
                } else if (bundle.containsKey("android.bigText")) {
                    ztj0Var = new itj0(z);
                } else if (bundle.containsKey("android.textLines")) {
                    ztj0Var = new itj0(1);
                } else if (bundle.containsKey("android.callType")) {
                    ztj0Var = new ptj0();
                } else if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
                    ztj0Var = new duj0();
                } else {
                    String string2 = bundle.getString("android.template");
                    if (string2 == null) {
                        ztj0Var = null;
                    } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                        ztj0Var = new htj0();
                    } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                        ztj0Var = new itj0(z);
                    } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                        ztj0Var = new itj0(1);
                    } else if (Build.VERSION.SDK_INT >= 36 && string2.equals(Notification.ProgressStyle.class.getName())) {
                        ztj0Var = new duj0();
                    } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                        ztj0Var = new ztj0();
                    } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        ztj0Var = new rtj0();
                    } else {
                        ztj0Var = null;
                    }
                }
            }
            if (ztj0Var != null) {
                try {
                    ztj0Var.mo36989e(bundle);
                    return ztj0Var;
                } catch (ClassCastException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo36986a(Bundle bundle) {
        if (this.f62992d) {
            bundle.putCharSequence("android.summaryText", this.f62991c);
        }
        CharSequence charSequence = this.f62990b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strMo36988d = mo36988d();
        if (strMo36988d != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo36988d);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo36987b(hr81 hr81Var);

    /* JADX INFO: renamed from: d */
    public String mo36988d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void mo36989e(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f62991c = bundle.getCharSequence("android.summaryText");
            this.f62992d = true;
        }
        this.f62990b = bundle.getCharSequence("android.title.big");
    }
}

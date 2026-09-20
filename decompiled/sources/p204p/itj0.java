package p204p;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class itj0 extends euj0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f105611e;

    /* JADX INFO: renamed from: f */
    public Object f105612f;

    public /* synthetic */ itj0(boolean z) {
        this.f105611e = 0;
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: b */
    public final void mo36987b(hr81 hr81Var) {
        switch (this.f105611e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) hr81Var.f94377d).setBigContentTitle(this.f62990b).bigText((CharSequence) this.f105612f);
                if (this.f62992d) {
                    bigTextStyleBigText.setSummaryText(this.f62991c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) hr81Var.f94377d).setBigContentTitle(this.f62990b);
                if (this.f62992d) {
                    bigContentTitle.setSummaryText(this.f62991c);
                }
                Iterator it = ((ArrayList) this.f105612f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: d */
    public final String mo36988d() {
        switch (this.f105611e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: e */
    public final void mo36989e(Bundle bundle) {
        switch (this.f105611e) {
            case 0:
                super.mo36989e(bundle);
                this.f105612f = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.mo36989e(bundle);
                ArrayList arrayList = (ArrayList) this.f105612f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m51636f(String str) {
        this.f105612f = ktj0.m57322d(str);
    }

    public itj0(int i) {
        this.f105611e = i;
        switch (i) {
            case 1:
                this.f105612f = new ArrayList();
                break;
        }
    }
}

package p204p;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ztj0 extends euj0 {

    /* JADX INFO: renamed from: e */
    public final ArrayList f286200e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f286201f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public nsn0 f286202g;

    /* JADX INFO: renamed from: h */
    public CharSequence f286203h;

    /* JADX INFO: renamed from: i */
    public Boolean f286204i;

    public ztj0() {
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: a */
    public final void mo36986a(Bundle bundle) {
        super.mo36986a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f286202g.f157848a);
        bundle.putBundle("android.messagingStyleUser", this.f286202g.m65578i());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f286203h);
        if (this.f286203h != null && this.f286204i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f286203h);
        }
        ArrayList arrayList = this.f286200e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", ytj0.m94636a(arrayList));
        }
        ArrayList arrayList2 = this.f286201f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", ytj0.m94636a(arrayList2));
        }
        Boolean bool = this.f286204i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: b */
    public final void mo36987b(hr81 hr81Var) {
        Notification.MessagingStyle messagingStyleM81531b;
        ktj0 ktj0Var = this.f62989a;
        boolean zBooleanValue = false;
        if (ktj0Var == null || ktj0Var.f126310a.getApplicationInfo().targetSdkVersion >= 28 || this.f286204i != null) {
            Boolean bool = this.f286204i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f286203h != null) {
            zBooleanValue = true;
        }
        this.f286204i = Boolean.valueOf(zBooleanValue);
        if (Build.VERSION.SDK_INT >= 28) {
            nsn0 nsn0Var = this.f286202g;
            nsn0Var.getClass();
            messagingStyleM81531b = vtj0.m86399a(t35.m79963c(nsn0Var));
        } else {
            messagingStyleM81531b = ttj0.m81531b(this.f286202g.f157848a);
        }
        Iterator it = this.f286200e.iterator();
        while (it.hasNext()) {
            ttj0.m81530a(messagingStyleM81531b, ((ytj0) it.next()).m94638c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.f286201f.iterator();
            while (it2.hasNext()) {
                utj0.m83929a(messagingStyleM81531b, ((ytj0) it2.next()).m94638c());
            }
        }
        if (this.f286204i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            ttj0.m81532c(messagingStyleM81531b, this.f286203h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            vtj0.m86400b(messagingStyleM81531b, this.f286204i.booleanValue());
        }
        messagingStyleM81531b.setBuilder((Notification.Builder) hr81Var.f94377d);
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: d */
    public final String mo36988d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: e */
    public final void mo36989e(Bundle bundle) {
        super.mo36989e(bundle);
        ArrayList arrayList = this.f286200e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f286202g = nsn0.m65570a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            nsn0 nsn0Var = new nsn0();
            nsn0Var.f157848a = string;
            nsn0Var.f157849b = null;
            nsn0Var.f157850c = null;
            nsn0Var.f157851d = null;
            nsn0Var.f157852e = false;
            nsn0Var.f157853f = false;
            this.f286202g = nsn0Var;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f286203h = charSequence;
        if (charSequence == null) {
            this.f286203h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(ytj0.m94637b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f286201f.addAll(ytj0.m94637b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f286204i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m96936f(ytj0 ytj0Var) {
        ArrayList arrayList = this.f286200e;
        arrayList.add(ytj0Var);
        if (arrayList.size() > 25) {
            arrayList.remove(0);
        }
    }

    public ztj0(nsn0 nsn0Var) {
        if (!TextUtils.isEmpty(nsn0Var.f157848a)) {
            this.f286202g = nsn0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}

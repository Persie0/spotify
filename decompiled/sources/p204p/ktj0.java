package p204p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.music.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ktj0 {

    /* JADX INFO: renamed from: A */
    public long f126304A;

    /* JADX INFO: renamed from: B */
    public int f126305B;

    /* JADX INFO: renamed from: C */
    public final boolean f126306C;

    /* JADX INFO: renamed from: D */
    public final Notification f126307D;

    /* JADX INFO: renamed from: E */
    public boolean f126308E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f126309F;

    /* JADX INFO: renamed from: a */
    public final Context f126310a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f126311b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f126312c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f126313d;

    /* JADX INFO: renamed from: e */
    public CharSequence f126314e;

    /* JADX INFO: renamed from: f */
    public CharSequence f126315f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f126316g;

    /* JADX INFO: renamed from: h */
    public IconCompat f126317h;

    /* JADX INFO: renamed from: i */
    public int f126318i;

    /* JADX INFO: renamed from: j */
    public int f126319j;

    /* JADX INFO: renamed from: k */
    public boolean f126320k;

    /* JADX INFO: renamed from: l */
    public euj0 f126321l;

    /* JADX INFO: renamed from: m */
    public CharSequence f126322m;

    /* JADX INFO: renamed from: n */
    public int f126323n;

    /* JADX INFO: renamed from: o */
    public int f126324o;

    /* JADX INFO: renamed from: p */
    public boolean f126325p;

    /* JADX INFO: renamed from: q */
    public String f126326q;

    /* JADX INFO: renamed from: r */
    public boolean f126327r;

    /* JADX INFO: renamed from: s */
    public String f126328s;

    /* JADX INFO: renamed from: t */
    public Bundle f126329t;

    /* JADX INFO: renamed from: u */
    public int f126330u;

    /* JADX INFO: renamed from: v */
    public int f126331v;

    /* JADX INFO: renamed from: w */
    public RemoteViews f126332w;

    /* JADX INFO: renamed from: x */
    public RemoteViews f126333x;

    /* JADX INFO: renamed from: y */
    public String f126334y;

    /* JADX INFO: renamed from: z */
    public String f126335z;

    public ktj0(Context context, String str) {
        this.f126311b = new ArrayList();
        this.f126312c = new ArrayList();
        this.f126313d = new ArrayList();
        this.f126320k = true;
        this.f126327r = false;
        this.f126330u = 0;
        this.f126331v = 0;
        this.f126305B = 0;
        Notification notification = new Notification();
        this.f126307D = notification;
        this.f126310a = context;
        this.f126334y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f126319j = 0;
        this.f126309F = new ArrayList();
        this.f126306C = true;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m57322d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final void m57323a(int i, PendingIntent pendingIntent, String str) {
        this.f126311b.add(new ctj0(i != 0 ? IconCompat.m393g(null, "", i) : null, str, pendingIntent, new Bundle(), null, null, true, true));
    }

    /* JADX INFO: renamed from: b */
    public final void m57324b(ctj0 ctj0Var) {
        if (ctj0Var != null) {
            this.f126311b.add(ctj0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Notification m57325c() {
        Notification notificationBuild;
        Bundle bundle;
        hr81 hr81Var = new hr81(this);
        ktj0 ktj0Var = (ktj0) hr81Var.f94378e;
        euj0 euj0Var = ktj0Var.f126321l;
        if (euj0Var != null) {
            euj0Var.mo36987b(hr81Var);
        }
        Notification.Builder builder = (Notification.Builder) hr81Var.f94377d;
        int i = hr81Var.f94375b;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            if (i != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && i == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && i == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        RemoteViews remoteViews = ktj0Var.f126332w;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (euj0Var != null) {
            ktj0Var.f126321l.getClass();
        }
        if (euj0Var != null && (bundle = notificationBuild.extras) != null) {
            euj0Var.mo36986a(bundle);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: e */
    public final void m57326e(boolean z) {
        m57332k(16, z);
    }

    /* JADX INFO: renamed from: f */
    public final void m57327f() {
        this.f126334y = "com.google.android.gms.availability";
    }

    /* JADX INFO: renamed from: g */
    public final void m57328g(PendingIntent pendingIntent) {
        this.f126316g = pendingIntent;
    }

    /* JADX INFO: renamed from: h */
    public final void m57329h(CharSequence charSequence) {
        this.f126315f = m57322d(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public final void m57330i(CharSequence charSequence) {
        this.f126314e = m57322d(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public final void m57331j(PendingIntent pendingIntent) {
        this.f126307D.deleteIntent = pendingIntent;
    }

    /* JADX INFO: renamed from: k */
    public final void m57332k(int i, boolean z) {
        Notification notification = this.f126307D;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m57333l(Bitmap bitmap) {
        IconCompat iconCompatM390d;
        if (bitmap == null) {
            iconCompatM390d = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f126310a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatM390d = IconCompat.m390d(bitmap);
        }
        this.f126317h = iconCompatM390d;
    }

    /* JADX INFO: renamed from: m */
    public final void m57334m() {
        this.f126327r = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m57335n(int i) {
        this.f126319j = i;
    }

    /* JADX INFO: renamed from: o */
    public final void m57336o(int i, int i2, boolean z) {
        this.f126323n = i;
        this.f126324o = i2;
        this.f126325p = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m57337p(int i) {
        this.f126307D.icon = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m57338q(euj0 euj0Var) {
        if (this.f126321l != euj0Var) {
            this.f126321l = euj0Var;
            if (euj0Var == null || euj0Var.f62989a == this) {
                return;
            }
            euj0Var.f62989a = this;
            m57338q(euj0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m57339r(String str) {
        this.f126307D.tickerText = m57322d(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m57340s(long j) {
        this.f126307D.when = j;
    }

    public ktj0(Context context) {
        this(context, null);
    }
}

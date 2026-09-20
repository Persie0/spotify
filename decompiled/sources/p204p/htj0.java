package p204p;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class htj0 extends euj0 {

    /* JADX INFO: renamed from: e */
    public IconCompat f95054e;

    /* JADX INFO: renamed from: f */
    public IconCompat f95055f;

    /* JADX INFO: renamed from: g */
    public boolean f95056g;

    /* JADX INFO: renamed from: h */
    public boolean f95057h;

    /* JADX INFO: renamed from: f */
    public static IconCompat m48582f(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            PorterDuff.Mode mode = IconCompat.f774k;
            return x5i0.m90041t((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.m390d((Bitmap) parcelable);
        }
        return null;
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: b */
    public final void mo36987b(hr81 hr81Var) {
        Bitmap bitmapM388b;
        Notification.Builder builder = (Notification.Builder) hr81Var.f94377d;
        Context context = (Context) hr81Var.f94376c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f62990b);
        IconCompat iconCompat = this.f95054e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                gtj0.m45699a(bigContentTitle, x5i0.m90019G(iconCompat, context));
            } else if (iconCompat.m396j() == 1) {
                IconCompat iconCompat2 = this.f95054e;
                int i = iconCompat2.f775a;
                if (i == -1) {
                    Object obj = iconCompat2.f776b;
                    bitmapM388b = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapM388b = (Bitmap) iconCompat2.f776b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapM388b = IconCompat.m388b((Bitmap) iconCompat2.f776b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapM388b);
            }
        }
        if (this.f95056g) {
            IconCompat iconCompat3 = this.f95055f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                ftj0.m42672a(bigContentTitle, x5i0.m90019G(iconCompat3, context));
            }
        }
        if (this.f62992d) {
            bigContentTitle.setSummaryText(this.f62991c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            gtj0.m45701c(bigContentTitle, this.f95057h);
            gtj0.m45700b(bigContentTitle, null);
        }
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: d */
    public final String mo36988d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // p204p.euj0
    /* JADX INFO: renamed from: e */
    public final void mo36989e(Bundle bundle) {
        super.mo36989e(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f95055f = m48582f(bundle.getParcelable("android.largeIcon.big"));
            this.f95056g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f95054e = parcelable != null ? m48582f(parcelable) : m48582f(bundle.getParcelable("android.pictureIcon"));
        this.f95057h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    /* JADX INFO: renamed from: g */
    public final void m48583g() {
        this.f95055f = null;
        this.f95056g = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m48584h(Bitmap bitmap) {
        this.f95054e = bitmap == null ? null : IconCompat.m390d(bitmap);
    }
}

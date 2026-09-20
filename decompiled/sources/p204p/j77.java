package p204p;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import java.util.Objects;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j77 implements j561 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109522a;

    public /* synthetic */ j77(int i) {
        this.f109522a = i;
    }

    @Override // p204p.j561
    public final Object get() {
        int dimensionPixelSize;
        switch (this.f109522a) {
            case 0:
                return Boolean.valueOf(Build.VERSION.SDK_INT > 37 && Objects.equals(h0b1.m46283K("persist.audio.compressed_offload_implicit_aac"), "false"));
            case 1:
                return n0e1.m63399G(Executors.newSingleThreadExecutor());
            case 2:
                Resources system = Resources.getSystem();
                try {
                    dimensionPixelSize = system.getDimensionPixelSize(system.getIdentifier("notification_right_icon_size", "dimen", "android"));
                    if (Build.VERSION.SDK_INT < 31) {
                        dimensionPixelSize = Integer.max(Integer.max(dimensionPixelSize, system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_width", "dimen", "android"))), system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_height", "dimen", "android")));
                    }
                    break;
                } catch (Resources.NotFoundException unused) {
                    dimensionPixelSize = (int) ((Build.VERSION.SDK_INT < 31 ? 280 : 48) * system.getDisplayMetrics().density);
                }
                return Integer.valueOf(dimensionPixelSize);
            case 3:
                byte[] bArr = new byte[12];
                wxp.f256086i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 4:
                return new top();
            case 5:
                return new top();
            case 6:
                String strM46283K = h0b1.m46283K("ro.vendor.api_level");
                if (strM46283K == null) {
                    strM46283K = "";
                }
                return k0e1.m54981P(strM46283K);
            case 7:
                Resources system2 = Resources.getSystem();
                int dimensionPixelSize2 = system2.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize2 = system2.getDimensionPixelSize(system2.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                    break;
                } catch (Resources.NotFoundException unused2) {
                }
                return Integer.valueOf(dimensionPixelSize2);
            case 8:
                return kgq.class;
            default:
                throw new IllegalStateException();
        }
    }
}

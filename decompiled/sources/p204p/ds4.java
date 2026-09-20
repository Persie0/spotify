package p204p;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ds4 {
    /* JADX INFO: renamed from: a */
    public static void m36746a(Window window) {
        window.getDecorView();
        m36749d(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = i >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i2) {
                attributes.layoutInDisplayCutoutMode = i2;
                window.setAttributes(attributes);
            }
        }
        if (i >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m36747b(int i, Resources resources) {
        return resources.getFloat(i);
    }

    /* JADX INFO: renamed from: c */
    public static Insets m36748c(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: d */
    public static void m36749d(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ci11.m32864z(window, z);
        } else if (i >= 30) {
            ci11.m32863y(window, z);
        } else {
            j3h1.m52281s(window, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final ImageDecoder.Source m36750e(vc40 vc40Var, ivl0 ivl0Var, boolean z) {
        tbn0 tbn0VarMo34166t1;
        if (vc40Var.getFileSystem() == ywy.f277076a && (tbn0VarMo34166t1 = vc40Var.mo34166t1()) != null) {
            return ImageDecoder.createSource(tbn0VarMo34166t1.toFile());
        }
        c95 metadata = vc40Var.getMetadata();
        if (metadata instanceof cb6) {
            return ImageDecoder.createSource(ivl0Var.f106232a.getAssets(), ((cb6) metadata).f36021e);
        }
        if ((metadata instanceof imj) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((imj) metadata).f103719e;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new x2l(assetFileDescriptor, 7));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof n1x0) {
            n1x0 n1x0Var = (n1x0) metadata;
            if (n1x0Var.f149554e.equals(ivl0Var.f106232a.getPackageName())) {
                return ImageDecoder.createSource(ivl0Var.f106232a.getResources(), n1x0Var.f149555f);
            }
        }
        if (!(metadata instanceof mua)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((mua) metadata).f147284e.isDirect()) {
            return ImageDecoder.createSource(((mua) metadata).f147284e);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m36751f(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }
}

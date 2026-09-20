package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class cha0 implements s1l0 {

    /* JADX INFO: renamed from: a */
    public final Context f37970a;

    /* JADX INFO: renamed from: b */
    public final Object f37971b;

    public /* synthetic */ cha0(Context context, Object obj) {
        this.f37970a = context;
        this.f37971b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m32751a(cha0 cha0Var, Activity activity, wnb wnbVar) {
        Object c6x0Var;
        if (activity.isFinishing()) {
            Logger.m3973i("ScreenShotGrabber Activity is finishing, skipping screenshot capture", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        if (Build.VERSION.SDK_INT < 26) {
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                c6x0Var = kgg1.m56351n(decorView);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            return (Bitmap) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        }
        hqb hqbVar = new hqb(1, seg1.m77914f(wnbVar));
        hqbVar.m48222q();
        if (decorView.getWidth() <= 0 || decorView.getHeight() <= 0) {
            Logger.m3973i(s571.m77247f(decorView.getWidth(), "ScreenShotGrabber View has invalid dimensions: ", decorView.getHeight(), "x"), new Object[0]);
            hqbVar.resumeWith(null);
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
            try {
                PixelCopy.request(window, bitmapCreateBitmap, new bjy0(bitmapCreateBitmap, hqbVar), new Handler(Looper.getMainLooper()));
            } catch (IllegalArgumentException e2) {
                bitmapCreateBitmap.recycle();
                throw e2;
            }
        }
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m32752b(cha0 cha0Var) {
        Context context = cha0Var.f37970a;
        Object systemService = context.getApplicationContext().getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                int activeModemCount = telephonyManager.getActiveModemCount();
                for (int i2 = 0; i2 < activeModemCount; i2++) {
                    if (telephonyManager.getSimState(i2) == 5) {
                        if (Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "mobile_data", 1) != 1) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (i >= 26) {
                TelephonyManager telephonyManager2 = (TelephonyManager) systemService;
                int phoneCount = telephonyManager2.getPhoneCount();
                for (int i3 = 0; i3 < phoneCount; i3++) {
                    if (telephonyManager2.getSimState(i3) == 5) {
                        if (Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "mobile_data", 1) != 1) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (((TelephonyManager) systemService).getSimState() == 5 && Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "mobile_data", 1) != 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final File m32753c(cha0 cha0Var, Bitmap bitmap) throws IOException {
        File file = new File(cha0Var.f37970a.getCacheDir(), s571.m77251j("user_feedback_screenshot_", UUID.randomUUID().toString(), ".webp"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    bitmap.compress(Bitmap.CompressFormat.WEBP_LOSSY, 50, fileOutputStream);
                } else {
                    bitmap.compress(Bitmap.CompressFormat.WEBP, 50, fileOutputStream);
                }
                fileOutputStream.close();
                file.getAbsolutePath();
                return file;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            file.delete();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m32754d(ibk ibkVar) {
        aha0 aha0Var;
        String str;
        if (ibkVar instanceof aha0) {
            aha0Var = (aha0) ibkVar;
            int i = aha0Var.f15653d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aha0Var.f15653d = i - Integer.MIN_VALUE;
            } else {
                aha0Var = new aha0(this, ibkVar);
            }
        } else {
            aha0Var = new aha0(this, ibkVar);
        }
        Object objM32756f = aha0Var.f15651b;
        int i2 = aha0Var.f15653d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM32756f);
            if (m32755e().isProviderEnabled("gps")) {
                str = "gps";
            } else {
                str = m32755e().isProviderEnabled("network") ? "network" : null;
            }
            if (str != null) {
                aha0Var.f15650a = str;
                aha0Var.f15653d = 1;
                objM32756f = m32756f(str, aha0Var);
                if (objM32756f != yukVar) {
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM32756f);
            return objM32756f;
        }
        str = aha0Var.f15650a;
        bga.m29073P(objM32756f);
        g7r g7rVar = (g7r) objM32756f;
        if (g7rVar != null) {
            return g7rVar;
        }
        if (wj50.m88271j(str, "gps") && m32755e().isProviderEnabled("network")) {
            aha0Var.f15650a = null;
            aha0Var.f15653d = 2;
            Object objM32756f2 = m32756f("network", aha0Var);
            return objM32756f2 == yukVar ? yukVar : objM32756f2;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public LocationManager m32755e() {
        return (LocationManager) ((wg61) this.f37971b).getValue();
    }

    /* JADX INFO: renamed from: f */
    public Object m32756f(String str, aha0 aha0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            hqb hqbVar = new hqb(1, seg1.m77914f(aha0Var));
            hqbVar.m48222q();
            CancellationSignal cancellationSignal = new CancellationSignal();
            hqbVar.mo42415l(new enh(cancellationSignal, 3));
            m32755e().getCurrentLocation(str, cancellationSignal, this.f37970a.getMainExecutor(), new odm(hqbVar, this));
            return hqbVar.m48221p();
        }
        hqb hqbVar2 = new hqb(1, seg1.m77914f(aha0Var));
        hqbVar2.m48222q();
        bha0 bha0Var = new bha0(hqbVar2, this);
        hqbVar2.mo42415l(new ri80(15, this, bha0Var));
        m32755e().requestSingleUpdate(str, bha0Var, Looper.getMainLooper());
        return hqbVar2.m48221p();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m32757g(Activity activity, ibk ibkVar) {
        cjy0 cjy0Var;
        CancellationException e;
        rlv0 rlv0Var;
        File file;
        if (ibkVar instanceof cjy0) {
            cjy0Var = (cjy0) ibkVar;
            int i = cjy0Var.f38707d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cjy0Var.f38707d = i - Integer.MIN_VALUE;
            } else {
                cjy0Var = new cjy0(this, ibkVar);
            }
        } else {
            cjy0Var = new cjy0(this, ibkVar);
        }
        Object obj = cjy0Var.f38705b;
        int i2 = cjy0Var.f38707d;
        if (i2 == 0) {
            rlv0 rlv0VarM36622v = dq60.m36622v(obj);
            try {
                luk lukVar = (luk) this.f37971b;
                wnb wnbVar = new wnb(this, activity, rlv0VarM36622v, null);
                cjy0Var.f38704a = rlv0VarM36622v;
                cjy0Var.f38707d = 1;
                Object objM89557A = x0h1.m89557A(lukVar, wnbVar, cjy0Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
                obj = objM89557A;
                rlv0Var = rlv0VarM36622v;
            } catch (CancellationException e2) {
                e = e2;
                rlv0Var = rlv0VarM36622v;
                file = (File) rlv0Var.f200373a;
                if (file != null) {
                    file.delete();
                }
                throw e;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rlv0Var = cjy0Var.f38704a;
            try {
                bga.m29073P(obj);
            } catch (CancellationException e3) {
                e = e3;
                file = (File) rlv0Var.f200373a;
                if (file != null) {
                    file.delete();
                }
                throw e;
            }
        }
        String str = (String) obj;
        rlv0Var.f200373a = null;
        return str;
    }

    /* JADX INFO: renamed from: h */
    public boolean m32758h() {
        return m32761k() == 3;
    }

    /* JADX INFO: renamed from: i */
    public boolean m32759i() {
        try {
            List<PackageInfo> installedPackages = this.f37970a.getPackageManager().getInstalledPackages(0);
            if (installedPackages != null && installedPackages.isEmpty()) {
                return false;
            }
            Iterator<T> it = installedPackages.iterator();
            while (it.hasNext()) {
                if (wj50.m88271j(((PackageInfo) it.next()).packageName, "com.android.vending")) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public String m32760j() {
        try {
            Context context = this.f37970a;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                String initiatingPackageName = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
                return initiatingPackageName == null ? "" : initiatingPackageName;
            }
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            return installerPackageName == null ? "" : installerPackageName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public int m32761k() {
        int iMo83216b = ((vj10) this.f37971b).mo83216b(this.f37970a);
        return (iMo83216b == 1 || iMo83216b == 3 || iMo83216b == 9) ? 4 : 3;
    }

    public cha0(Context context, int i) {
        Object objM31027s;
        switch (i) {
            case 1:
                this.f37970a = context;
                c9k c9kVarM56661c = kk40.m56661c(new uuk("MobileDataDisabledDetectorScope"));
                if (context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                    fbk fbkVar = null;
                    objM31027s = bzf1.m31027s(new vjz(mvl0.m62953p(nxf1.m65828g(new q0a0(this, fbkVar, 19))), new th80(3, 8, fbkVar), 2), c9kVarM56661c, hf11.f90581a, 1);
                } else {
                    objM31027s = new ysk(Boolean.FALSE, 27);
                }
                this.f37971b = objM31027s;
                break;
            default:
                this.f37970a = context;
                this.f37971b = new wg61(new t790(this, 19));
                break;
        }
    }
}

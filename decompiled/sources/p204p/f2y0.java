package p204p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class f2y0 {

    /* JADX INFO: renamed from: b */
    public static final wsv0 f65291b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f65292c;

    /* JADX INFO: renamed from: a */
    public final Context f65293a;

    static {
        kf40 kf40Var = pf40.f176960b;
        Object[] objArr = {"34:DF:0E:7A:9F:1C:F1:89:2E:45:C0:56:B4:97:3C:D8:1C:CF:14:8A:40:50:D1:1A:EA:4A:C5:A6:5F:90:0A:42", "0A:01:21:31:B1:BD:F9:E8:0E:F9:7D:37:F3:B4:83:62:BE:36:3A:46:4C:84:45:EC:F8:36:27:EB:E8:49:3A:1E", "C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8"};
        jhl0.m53416j(objArr);
        f65291b = pf40.m69787l(3, objArr);
        f65292c = Pattern.compile(":");
    }

    public f2y0(Context context) {
        this.f65293a = context;
    }

    /* JADX INFO: renamed from: a */
    public final long m40626a() {
        try {
            PackageInfo packageInfo = this.f65293a.getPackageManager().getPackageInfo("com.osp.app.signin", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m40627b() {
        String str;
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f65293a.getPackageManager().getPackageInfo("com.osp.app.signin", 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length != 1) {
                str = "";
            } else {
                try {
                    byte[] byteArray = signatureArr[0].toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    str = String.format("%064X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
                } catch (NoSuchAlgorithmException e) {
                    Logger.m3967c(e, "This should not happen", new Object[0]);
                    str = "";
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        kf40 kf40VarListIterator = f65291b.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            if (wj50.m88271j(f65292c.matcher((String) kf40VarListIterator.next()).replaceAll(""), str)) {
                return true;
            }
        }
        return false;
    }
}

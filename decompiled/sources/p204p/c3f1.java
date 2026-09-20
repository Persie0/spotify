package p204p;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c3f1 {

    /* JADX INFO: renamed from: a */
    public final String f33671a;

    public c3f1(String str) {
        this.f33671a = edb.m38560i(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m31380c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = s571.m77252k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return klh.m56834f(str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m31381a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            m31380c(this.f33671a, str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31382b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m31380c(this.f33671a, str, objArr);
        }
    }
}

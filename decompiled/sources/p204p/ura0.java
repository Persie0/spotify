package p204p;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ura0 {

    /* JADX INFO: renamed from: a */
    public final String f233311a;

    /* JADX INFO: renamed from: b */
    public final boolean f233312b;

    /* JADX INFO: renamed from: c */
    public final String f233313c;

    public ura0(String str, String str2) {
        ig31.m50503u(str, "The log tag cannot be null or empty.");
        this.f233311a = str;
        this.f233313c = str2;
        this.f233312b = str.length() <= 23;
    }

    /* JADX INFO: renamed from: a */
    public final void m83848a(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f233312b && Log.isLoggable(this.f233311a, 3)) {
            m83850c(str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83849b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f233312b && Log.isLoggable(this.f233311a, 3)) {
            m83850c(str, objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m83850c(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f233313c;
        String strM77251j = TextUtils.isEmpty(str2) ? "" : s571.m77251j("[", str2, "] ");
        if (TextUtils.isEmpty(strM77251j)) {
            return;
        }
        strM77251j.concat(String.valueOf(str));
    }
}

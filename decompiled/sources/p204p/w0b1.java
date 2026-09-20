package p204p;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class w0b1 {

    /* JADX INFO: renamed from: b */
    public static final long f246691b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    public static final Pattern f246692c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    public static w0b1 f246693d;

    /* JADX INFO: renamed from: a */
    public final hp3 f246694a;

    public w0b1(hp3 hp3Var) {
        this.f246694a = hp3Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86928a(t18 t18Var) {
        if (TextUtils.isEmpty(t18Var.f216173c)) {
            return true;
        }
        long j = t18Var.f216176f + t18Var.f216175e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f246694a.getClass();
        return j < timeUnit.toSeconds(hp3.m48117o()) + f246691b;
    }
}

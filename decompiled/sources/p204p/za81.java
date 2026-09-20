package p204p;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class za81 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f281004a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m95766a() {
        if (Build.VERSION.SDK_INT < 29 || !f281004a.get()) {
            return;
        }
        ab81.f14043a.m25340a("GlanceAppWidget::update", 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m95767b() {
        if (Build.VERSION.SDK_INT < 29 || !f281004a.get()) {
            return;
        }
        ab81.f14043a.m25341b("GlanceAppWidget::update", 0);
    }
}

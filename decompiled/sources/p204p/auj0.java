package p204p;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class auj0 {
    /* JADX INFO: renamed from: a */
    public static void m27203a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m27204b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    /* JADX INFO: renamed from: c */
    public static void m27205c(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m27206d(Notification.ProgressStyle progressStyle, List<buj0> list) {
        for (buj0 buj0Var : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(buj0Var.f31148a).setColor(buj0Var.f31150c).setId(buj0Var.f31149b));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27207e(Notification.ProgressStyle progressStyle, List<cuj0> list) {
        for (cuj0 cuj0Var : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(cuj0Var.f42137a).setColor(cuj0Var.f42139c).setId(cuj0Var.f42138b));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m27208f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    /* JADX INFO: renamed from: g */
    public static void m27209g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    /* JADX INFO: renamed from: h */
    public static void m27210h(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }
}

package p204p;

import android.os.Build;
import android.widget.RemoteViews;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class xg5 {

    /* JADX INFO: renamed from: a */
    public static final xg5 f261212a = new xg5();

    /* JADX INFO: renamed from: a */
    public final void m90556a(RemoteViews remoteViews, int i, sjr sjrVar) {
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException("setClipToOutline is only available on SDK 31 and higher".toString());
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (sjrVar instanceof kjr) {
            remoteViews.setViewOutlinePreferredRadius(i, ((kjr) sjrVar).f123409a, 1);
        } else if (sjrVar instanceof ojr) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, R.dimen.widget_background_radius);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + sjrVar.getClass().getCanonicalName()).toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m90557b(RemoteViews remoteViews, int i, sjr sjrVar) {
        if (sjrVar instanceof qjr) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (sjrVar instanceof ljr) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (sjrVar instanceof kjr) {
            remoteViews.setViewLayoutHeight(i, ((kjr) sjrVar).f123409a, 1);
        } else if (sjrVar instanceof ojr) {
            remoteViews.setViewLayoutHeightDimen(i, R.dimen.widget_background_radius);
        } else {
            if (!wj50.m88271j(sjrVar, mjr.f144315a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m90558c(RemoteViews remoteViews, int i, sjr sjrVar) {
        if (sjrVar instanceof qjr) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (sjrVar instanceof ljr) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (sjrVar instanceof kjr) {
            remoteViews.setViewLayoutWidth(i, ((kjr) sjrVar).f123409a, 1);
        } else if (sjrVar instanceof ojr) {
            remoteViews.setViewLayoutWidthDimen(i, R.dimen.widget_background_radius);
        } else {
            if (!wj50.m88271j(sjrVar, mjr.f144315a)) {
                throw new NoWhenBranchMatchedException();
            }
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        }
    }
}

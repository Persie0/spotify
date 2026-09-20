package p204p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class y8q {

    /* JADX INFO: renamed from: a */
    public final Activity f270338a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f270339b;

    /* JADX INFO: renamed from: c */
    public final k5m0 f270340c;

    public /* synthetic */ y8q(Activity activity, z9j0 z9j0Var, k5m0 k5m0Var) {
        this.f270338a = activity;
        this.f270339b = z9j0Var;
        this.f270340c = k5m0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m93123a(String str, String str2) {
        Bundle bundleM70529j = pp91.m70529j(new pqm0("entity-uri", str), new pqm0("media-url", str2));
        p6j0 p6j0Var = new p6j0("spotify:imagegallery", "", false, false, 0, 0, false, null, null, null);
        Activity activity = this.f270338a;
        z9j0 z9j0Var = this.f270339b;
        if (z9j0Var.mo47349j(activity)) {
            z9j0Var.mo47348i(p6j0Var, bundleM70529j);
        } else {
            k5m0.m55541i(this.f270340c, "spotify:imagegallery", null, bundleM70529j, false, 8);
        }
    }
}

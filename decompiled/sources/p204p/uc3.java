package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: classes.dex */
public final class uc3 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f228929a;

    public uc3(ron ronVar) {
        this.f228929a = ronVar;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m82730a(Context context, EntryPoint entryPoint) {
        if (!((ma4) this.f228929a.get()).m61253h()) {
            int i = AllboardingActivity.f2768j1;
            return id6.m50282i(context, entryPoint);
        }
        return q2z.m72036b(context, "spotify:internal:allboarding:origin:" + entryPoint.getUriSegment());
    }
}

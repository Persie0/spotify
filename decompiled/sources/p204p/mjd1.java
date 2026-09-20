package p204p;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.carmobile.waze.WazeReturnActivity;

/* JADX INFO: loaded from: classes.dex */
public final class mjd1 {
    /* JADX INFO: renamed from: a */
    public final PendingIntent m61980a(Context context) {
        Intent intent = new Intent(context, (Class<?>) WazeReturnActivity.class);
        intent.setFlags(268435456);
        if (Build.VERSION.SDK_INT >= 34) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", ActivityOptions.makeBasic().setPendingIntentCreatorBackgroundActivityStartMode(1).toBundle());
        }
        return PendingIntent.getActivity(context, 1, intent, 201326592);
    }
}

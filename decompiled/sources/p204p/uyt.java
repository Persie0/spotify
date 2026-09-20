package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class uyt {
    /* JADX INFO: renamed from: a */
    public static void m84276a(Context context) {
        Intent intentCreateChooser;
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.APP_EMAIL");
            intent.setFlags(268435456);
            intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.magiclink_request_sent_choose_email));
        } catch (ActivityNotFoundException unused) {
            intentCreateChooser = null;
        }
        if (intentCreateChooser != null) {
            context.startActivity(intentCreateChooser);
        }
    }
}

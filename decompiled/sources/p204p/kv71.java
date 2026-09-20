package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class kv71 {

    /* JADX INFO: renamed from: a */
    public final Context f126796a;

    public kv71(Context context) {
        this.f126796a = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m57448a(String str) {
        Long lM29808s0;
        if (str == null || (lM29808s0 = bm51.m29808s0(10, str)) == null) {
            return "";
        }
        long jLongValue = lM29808s0.longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int hours = (int) timeUnit.toHours(jLongValue);
        int minutes = ((int) timeUnit.toMinutes(jLongValue)) - (hours * 60);
        long j = jLongValue % ((long) 60);
        String string = this.f126796a.getString(R.string.share_to_external_show_with_timestamp, hours > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hours), Integer.valueOf(minutes), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Long.valueOf(j)}, 2)));
        return string == null ? "" : string;
    }
}

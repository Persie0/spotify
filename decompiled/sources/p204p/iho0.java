package p204p;

import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.NumberFormat;
import com.spotify.music.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class iho0 {

    /* JADX INFO: renamed from: a */
    public final Context f102330a;

    public iho0(Context context) {
        this.f102330a = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m50668a(long j, Locale locale, boolean z) {
        if (j < 1000) {
            String string = this.f102330a.getString(R.string.song_dna_row_subtitle_low_plays, "1000");
            wj50.m88279p(string);
            return string;
        }
        if (j <= 9999) {
            String str = NumberFormat.getInstance(locale).format(j);
            wj50.m88279p(str);
            return str;
        }
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(locale, z ? CompactDecimalFormat.CompactStyle.LONG : CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat.setMaximumFractionDigits(1);
        String str2 = compactDecimalFormat.format(j);
        wj50.m88279p(str2);
        return str2;
    }
}

package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ycu0 {

    /* JADX INFO: renamed from: a */
    public final Context f271573a;

    public ycu0(Context context) {
        this.f271573a = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m93378a(int i) {
        String string;
        String string2;
        Context context = this.f271573a;
        if (i >= 1000000) {
            int i2 = i / 1000000;
            int i3 = (i % 1000000) / 100000;
            if (i3 > 0) {
                string2 = context.getString(R.string.reaction_row_reaction_count_millions, i2 + "." + i3);
            } else {
                string2 = context.getString(R.string.reaction_row_reaction_count_millions, String.valueOf(i2));
            }
            wj50.m88279p(string2);
            return string2;
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        int i4 = i / 1000;
        int i5 = (i % 1000) / 100;
        if (i5 > 0) {
            string = context.getString(R.string.reaction_row_reaction_count_thousands, i4 + "." + i5);
        } else {
            string = context.getString(R.string.reaction_row_reaction_count_thousands, String.valueOf(i4));
        }
        wj50.m88279p(string);
        return string;
    }
}

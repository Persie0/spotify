package p204p;

import android.content.Context;
import android.text.format.DateUtils;
import com.spotify.music.R;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public final class v1q implements gh00 {

    /* JADX INFO: renamed from: c */
    public static final q32 f236436c = new q32(8);

    /* JADX INFO: renamed from: a */
    public final Context f236437a;

    /* JADX INFO: renamed from: b */
    public final u1q f236438b = new u1q(this, 0);

    public v1q(Context context) {
        this.f236437a = context;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String str = (String) obj;
        String strSubstring = null;
        if (str.length() >= 2) {
            String strSubstring2 = str.substring(0, 2);
            if (strSubstring2.equals("D:")) {
                String strSubstring3 = str.substring(2);
                DateFormat dateFormat = (DateFormat) f236436c.get();
                Date date = dateFormat != null ? dateFormat.parse(strSubstring3) : null;
                if (date != null) {
                    Context context = this.f236437a;
                    if (context.getResources().getBoolean(R.bool.your_library_quick_scroll_use_date_utils)) {
                        strSubstring = DateUtils.formatDateTime(context, date.getTime(), 65568);
                        wj50.m88279p(strSubstring);
                    } else {
                        Object obj2 = this.f236438b.get();
                        wj50.m88279p(obj2);
                        strSubstring = ((DateFormat) obj2).format(date);
                        wj50.m88279p(strSubstring);
                    }
                }
            } else if (strSubstring2.equals("S:")) {
                strSubstring = str.substring(2);
            }
        }
        return strSubstring == null ? "" : strSubstring;
    }
}

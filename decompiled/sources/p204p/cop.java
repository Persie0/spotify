package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cop implements gw80 {

    /* JADX INFO: renamed from: a */
    public final Context f40317a;

    /* JADX INFO: renamed from: b */
    public final String f40318b;

    /* JADX INFO: renamed from: c */
    public final String f40319c;

    public cop(Context context) {
        this.f40317a = context;
        String string = context.getString(R.string.separator_comma);
        this.f40318b = string;
        this.f40319c = string;
    }

    @Override // p204p.gw80
    /* JADX INFO: renamed from: a */
    public final String mo26956a(List list) {
        if (list.isEmpty()) {
            return "";
        }
        int i = 0;
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        while (i < list.size() - 2) {
            sb.append((String) list.get(i));
            sb.append(this.f40318b);
            i++;
        }
        sb.append(this.f40317a.getString(R.string.separator_and, list.get(i), list.get(i + 1)));
        return sb.toString();
    }

    @Override // p204p.gw80
    /* JADX INFO: renamed from: b */
    public final String mo26957b() {
        return this.f40319c;
    }
}

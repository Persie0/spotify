package p204p;

import android.content.Context;
import android.icu.text.ListFormatter;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jd4 implements gw80 {

    /* JADX INFO: renamed from: a */
    public final ListFormatter f111233a;

    /* JADX INFO: renamed from: b */
    public final String f111234b;

    public jd4(Context context, ListFormatter listFormatter) {
        this.f111233a = listFormatter;
        this.f111234b = context.getString(R.string.separator_comma);
    }

    @Override // p204p.gw80
    /* JADX INFO: renamed from: a */
    public final String mo26956a(List list) {
        return this.f111233a.format(list);
    }

    @Override // p204p.gw80
    /* JADX INFO: renamed from: b */
    public final String mo26957b() {
        return this.f111234b;
    }
}

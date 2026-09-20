package p204p;

import android.content.res.Resources;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class h7a implements h1x0 {

    /* JADX INFO: renamed from: a */
    public final long f88394a;

    /* JADX INFO: renamed from: b */
    public final int f88395b;

    public h7a(int i, long j) {
        this.f88394a = j;
        this.f88395b = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        long jM54450E = jwg1.m54450E(this.f88394a, ils.MILLISECONDS);
        hvi0 hvi0Var = cks.f39079b;
        long jM33199r = cks.m33199r(jM54450E, ils.HOURS);
        int iM33189h = cks.m33189h(jM54450E);
        cks.m33191j(jM54450E);
        cks.m33190i(jM54450E);
        return resources.getString(R.string.npv_header_audiobook_total_progress, jM33199r > 0 ? resources.getString(R.string.npv_header_audiobook_progress_hours_minutes_format, resources.getQuantityString(R.plurals.npv_header_audiobook_progress_hours, (int) jM33199r, Long.valueOf(jM33199r)), resources.getQuantityString(R.plurals.npv_header_audiobook_progress_minutes, iM33189h, Integer.valueOf(iM33189h))) : resources.getQuantityString(R.plurals.npv_header_audiobook_progress_minutes, iM33189h, Integer.valueOf(iM33189h)), Integer.valueOf(this.f88395b));
    }
}

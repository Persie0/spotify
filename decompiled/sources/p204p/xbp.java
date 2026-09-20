package p204p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.text.SimpleDateFormat;
import com.spotify.music.R;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class xbp {

    /* JADX INFO: renamed from: a */
    public final Context f259972a;

    /* JADX INFO: renamed from: b */
    public final vbp f259973b;

    /* JADX INFO: renamed from: c */
    public final SimpleDateFormat f259974c;

    /* JADX INFO: renamed from: d */
    public final DateFormat f259975d;

    /* JADX INFO: renamed from: e */
    public final SimpleDateFormat f259976e;

    /* JADX INFO: renamed from: f */
    public final SimpleDateFormat f259977f;

    public xbp(Context context, vbp vbpVar) {
        Locale locale = Locale.getDefault();
        this.f259972a = context;
        this.f259973b = vbpVar;
        this.f259974c = new SimpleDateFormat("d MMM yyyy", locale);
        this.f259975d = DateFormat.getDateInstance(2, locale);
        this.f259976e = new SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("MMM dd"), locale);
        this.f259977f = new SimpleDateFormat("EEE", locale);
    }

    /* JADX INFO: renamed from: a */
    public final String m90333a(long j) {
        if (wbp.f249835a[edb.m38547C(this.f259973b.m85169a(j))] == 5) {
            return this.f259975d.format(Long.valueOf(j * ((long) 1000)));
        }
        return this.f259976e.format(Long.valueOf(j * ((long) 1000)));
    }

    /* JADX INFO: renamed from: b */
    public final String m90334b(long j) {
        int iM38547C = edb.m38547C(this.f259973b.m85169a(j));
        Context context = this.f259972a;
        if (iM38547C == 0) {
            return context.getString(R.string.date_today);
        }
        if (iM38547C == 1) {
            return context.getString(R.string.date_yesterday);
        }
        if (iM38547C == 2) {
            return context.getString(R.string.date_tomorrow);
        }
        if (iM38547C == 3) {
            return this.f259977f.format(Long.valueOf(j * ((long) 1000)));
        }
        if (iM38547C == 4) {
            return this.f259976e.format(Long.valueOf(j * ((long) 1000)));
        }
        if (iM38547C != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f259975d.format(Long.valueOf(j * ((long) 1000)));
    }
}

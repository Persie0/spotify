package p204p;

import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class plo {

    /* JADX INFO: renamed from: a */
    public final Locale f178763a;

    /* JADX INFO: renamed from: b */
    public final SimpleDateFormat f178764b;

    /* JADX INFO: renamed from: c */
    public final DateFormat f178765c;

    public plo(Locale locale) {
        this.f178763a = locale;
        this.f178764b = new SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("d MMM yyyy"), locale);
        this.f178765c = DateFormat.getDateInstance(1, locale);
    }

    /* JADX INFO: renamed from: a */
    public final String m70265a(long j) {
        return this.f178764b.format(new Date(j * 1000));
    }
}

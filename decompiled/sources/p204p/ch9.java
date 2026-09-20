package p204p;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ch9 {

    /* JADX INFO: renamed from: a */
    public final DateFormat f37962a;

    /* JADX INFO: renamed from: b */
    public final SimpleDateFormat f37963b;

    public ch9(Locale locale) {
        this.f37962a = DateFormat.getDateInstance(1, locale);
        this.f37963b = new SimpleDateFormat("yyyy-MM-dd", locale);
    }

    /* JADX INFO: renamed from: a */
    public final String m32748a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date date = this.f37962a.parse(str);
            if (date != null) {
                return this.f37963b.format(date);
            }
        } catch (ParseException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m32749b(Calendar calendar, int i, int i2, int i3) {
        calendar.set(i3, i2, i);
        return this.f37962a.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: c */
    public final int m32750c(String str, String str2, String str3) {
        try {
            Date date = this.f37962a.parse(str);
            if (date == null) {
                return 2;
            }
            int length = str2.length();
            SimpleDateFormat simpleDateFormat = this.f37963b;
            return ((length == 0 || date.compareTo(simpleDateFormat.parse(str2)) >= 0) && (str3.length() == 0 || date.compareTo(simpleDateFormat.parse(str3)) <= 0)) ? 1 : 3;
        } catch (ParseException unused) {
            return 2;
        }
    }
}

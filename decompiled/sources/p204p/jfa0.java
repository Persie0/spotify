package p204p;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jfa0 {

    /* JADX INFO: renamed from: b */
    public static final jfa0 f111868b = m53163d(wjf1.m88304o(new Locale[0]));

    /* JADX INFO: renamed from: a */
    public final kfa0 f111869a;

    public jfa0(kfa0 kfa0Var) {
        this.f111869a = kfa0Var;
    }

    /* JADX INFO: renamed from: a */
    public static jfa0 m53162a(String str) {
        if (str == null || str.isEmpty()) {
            return f111868b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = ifa0.f101737a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return m53163d(wjf1.m88304o(localeArr));
    }

    /* JADX INFO: renamed from: d */
    public static jfa0 m53163d(LocaleList localeList) {
        return new jfa0(new kfa0(localeList));
    }

    /* JADX INFO: renamed from: b */
    public final Locale m53164b(int i) {
        return this.f111869a.f122114a.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m53165c() {
        return this.f111869a.f122114a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jfa0) {
            return this.f111869a.equals(((jfa0) obj).f111869a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f111869a.f122114a.hashCode();
    }

    public final String toString() {
        return this.f111869a.f122114a.toString();
    }
}

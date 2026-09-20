package p204p;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jqa {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            iqa.m51351b(30);
        }
        if (i >= 30) {
            iqa.m51351b(31);
        }
        if (i >= 30) {
            iqa.m51351b(33);
        }
        if (i >= 30) {
            iqa.m51351b(1000000);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m54083a() {
        Integer num = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i >= 32) {
            String str = Build.VERSION.CODENAME;
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                Integer num2 = str.toUpperCase(locale).equals("BAKLAVA") ? num : null;
                num = "Tiramisu".toUpperCase(locale).equals("BAKLAVA") ? 0 : null;
                if (num2 == null || num == null) {
                    if (num2 == null && num == null) {
                        if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                            return true;
                        }
                    } else if (num2 != null) {
                        return true;
                    }
                } else if (num2.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}

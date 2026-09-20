package p204p;

import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class spd1 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f212819a = Pattern.compile("^NOTE([ \t].*)?$");

    /* JADX INFO: renamed from: a */
    public static boolean m78869a(l2n0 l2n0Var) {
        l2n0Var.getClass();
        String strM57946r = l2n0Var.m57946r(StandardCharsets.UTF_8);
        return strM57946r != null && strM57946r.startsWith("WEBVTT");
    }

    /* JADX INFO: renamed from: b */
    public static float m78870b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: c */
    public static long m78871c(String str) {
        String str2 = h0b1.f86200a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: d */
    public static void m78872d(l2n0 l2n0Var) throws ParserException {
        int i = l2n0Var.f129055b;
        if (m78869a(l2n0Var)) {
            return;
        }
        l2n0Var.m57930R(i);
        throw ParserException.m752a(null, "Expected WEBVTT. Got " + l2n0Var.m57946r(StandardCharsets.UTF_8));
    }
}

package p204p;

import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.icu.util.ULocale;
import com.spotify.music.R;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l9c1 {

    /* JADX INFO: renamed from: a */
    public static final CompactDecimalFormat f131062a;

    /* JADX INFO: renamed from: b */
    public static final CompactDecimalFormat f131063b;

    static {
        ULocale.Category category = ULocale.Category.FORMAT;
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(ULocale.getDefault(category), CompactDecimalFormat.CompactStyle.LONG);
        compactDecimalFormat.setMaximumFractionDigits(0);
        compactDecimalFormat.setMinimumFractionDigits(0);
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        compactDecimalFormat.setRoundingMode(roundingMode.ordinal());
        f131062a = compactDecimalFormat;
        CompactDecimalFormat compactDecimalFormat2 = CompactDecimalFormat.getInstance(ULocale.getDefault(category), CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat2.setMaximumFractionDigits(0);
        compactDecimalFormat2.setMinimumFractionDigits(0);
        compactDecimalFormat2.setRoundingMode(roundingMode.ordinal());
        f131063b = compactDecimalFormat2;
    }

    /* JADX INFO: renamed from: a */
    public static final String m58509a(Context context, o9c1 o9c1Var) {
        if (!(o9c1Var instanceof n9c1)) {
            if (wj50.m88271j(o9c1Var, m9c1.f141273a)) {
                return context.getResources().getString(R.string.social_proof_label_new_content);
            }
            return null;
        }
        String strM58511c = m58511c(f131063b, (n9c1) o9c1Var);
        if (strM58511c == null) {
            return null;
        }
        return context.getResources().getString(R.string.social_proof_label_plays_plus, strM58511c);
    }

    /* JADX INFO: renamed from: b */
    public static final String m58510b(Context context, o9c1 o9c1Var) {
        if (!(o9c1Var instanceof n9c1)) {
            if (wj50.m88271j(o9c1Var, m9c1.f141273a)) {
                return context.getResources().getString(R.string.social_proof_label_new_content);
            }
            return null;
        }
        String strM58511c = m58511c(f131062a, (n9c1) o9c1Var);
        if (strM58511c == null) {
            return null;
        }
        return context.getResources().getString(R.string.social_proof_label_plays_plus_accessibility, strM58511c);
    }

    /* JADX INFO: renamed from: c */
    public static final String m58511c(CompactDecimalFormat compactDecimalFormat, n9c1 n9c1Var) {
        Long lValueOf;
        long j = n9c1Var.f151770a;
        if (j > 0) {
            if (j >= 1000000000) {
                lValueOf = Long.valueOf(((long) Math.floor(j / 1000000000)) * 1000000000);
            } else if (j >= 1000000) {
                lValueOf = Long.valueOf(((long) Math.floor(j / 1000000)) * 1000000);
            } else if (j >= 100000) {
                lValueOf = Long.valueOf(((long) Math.floor(j / 100000)) * 100000);
            } else if (j >= 75000) {
                lValueOf = 75000L;
            } else {
                lValueOf = j >= 50000 ? 50000L : null;
            }
            if (lValueOf != null) {
                return compactDecimalFormat.format(lValueOf.longValue());
            }
        }
        return null;
    }
}

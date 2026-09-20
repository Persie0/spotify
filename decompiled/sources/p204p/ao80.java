package p204p;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.spotify.music.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class ao80 {

    /* JADX INFO: renamed from: a */
    public final m500 f17600a;

    public ao80(m500 m500Var) {
        this.f17600a = m500Var;
    }

    /* JADX INFO: renamed from: a */
    public final SpannableString m26571a(String str, eh00 eh00Var) {
        Matcher matcher = Pattern.compile("<mark>(.*?)</mark>").matcher(str);
        if (!matcher.find()) {
            return new SpannableString(str);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            strGroup = "";
        }
        String strGroup2 = matcher.group(0);
        String strM29801l0 = bm51.m29801l0(str, strGroup2 != null ? strGroup2 : "", strGroup);
        SpannableString spannableString = new SpannableString(strM29801l0);
        int iM88458H0 = wl51.m88458H0(strM29801l0, strGroup, 0, false, 6);
        spannableString.setSpan(new rie(eh00Var, this), iM88458H0, strGroup.length() + iM88458H0, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.f17600a.getColor(R.color.storm)), iM88458H0, strGroup.length() + iM88458H0, 33);
        return spannableString;
    }
}

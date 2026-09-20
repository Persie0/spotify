package p204p;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lw31 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f137443a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: a */
    public static String m60099a(CharSequence charSequence) {
        return f137443a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

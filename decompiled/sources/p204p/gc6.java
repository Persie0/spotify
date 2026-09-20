package p204p;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gc6 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f78495a = Pattern.compile("\\?.*");

    /* JADX INFO: renamed from: b */
    public static final Pattern f78496b = Pattern.compile("^/+");

    /* JADX INFO: renamed from: c */
    public static final Pattern f78497c = Pattern.compile("\\?.*");

    /* JADX INFO: renamed from: d */
    public static final Uri f78498d = Uri.parse("https://open.spotify.com/internal/pullcontext");

    /* JADX INFO: renamed from: a */
    public static final String m44294a(String str) {
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            return f78497c.matcher(str).replaceFirst("");
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!wj50.m88271j(str2, "ecf")) {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderClearQuery.build().toString();
    }
}

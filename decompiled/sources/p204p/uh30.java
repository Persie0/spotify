package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class uh30 {

    /* JADX INFO: renamed from: a */
    public static final wsv0 f230353a = pf40.m69795u("spotify:cached-files", "spotify:local-files:cover:v1");

    /* JADX INFO: renamed from: a */
    public static Uri m83118a(String str) {
        if (str == null) {
            return Uri.EMPTY;
        }
        if (!str.startsWith("spotify:")) {
            return str.startsWith("https://") ? Uri.parse(str) : Uri.EMPTY;
        }
        if (!str.startsWith("spotify:mosaic:")) {
            if (!str.startsWith("spotify:image:")) {
                return f230353a.contains(str) ? Uri.parse(str) : Uri.EMPTY;
            }
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length != 3) {
                return Uri.EMPTY;
            }
            return Uri.parse("https://image-cdn.spotifycdn.com/image/" + strArrSplit[2]);
        }
        Uri.Builder builderBuildUpon = Uri.parse("https://mosaic.scdn.co/").buildUpon();
        builderBuildUpon.appendPath("640");
        String[] strArrSplit2 = str.substring(15).split(":");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit2) {
            sb.append(str2);
        }
        builderBuildUpon.appendPath(sb.toString());
        return Uri.parse(builderBuildUpon.toString());
    }
}

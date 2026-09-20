package p204p;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class czd0 {

    /* JADX INFO: renamed from: a */
    public final String f43534a;

    /* JADX INFO: renamed from: b */
    public final Context f43535b;

    public czd0(Context context, String str) {
        this.f43534a = str;
        this.f43535b = context;
    }

    /* JADX INFO: renamed from: a */
    public static Uri m34430a(Uri uri) {
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return Uri.EMPTY;
        }
        if (!path.isEmpty() && '/' == path.charAt(0)) {
            path = path.substring(1);
        }
        if (path.startsWith("spotify:")) {
            return Uri.parse(path);
        }
        String queryParameter = uri.getQueryParameter("cdn");
        if (kgg1.m56363z(queryParameter)) {
            queryParameter = "i.scdn.co";
        }
        Uri.Builder builderPath = new Uri.Builder().scheme(pka1.f178421b).authority(queryParameter).path(path);
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("cdn") && !str.equals("transformation") && !str.equals("dimension")) {
                builderPath.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return builderPath.build();
    }

    /* JADX INFO: renamed from: b */
    public final Uri m34431b(int i) {
        Uri.Builder builderScheme = new Uri.Builder().scheme("android.resource");
        Context context = this.f43535b;
        return builderScheme.authority(context.getResources().getResourcePackageName(i)).appendPath(context.getResources().getResourceTypeName(i)).appendPath(context.getResources().getResourceEntryName(i)).build();
    }

    /* JADX INFO: renamed from: c */
    public final Uri m34432c(int i, Uri uri) {
        if (uri != null && uri.toString().startsWith("android.resource")) {
            return uri;
        }
        if (uri.toString().startsWith("spotify:")) {
            return m34435f(null, Collections.singletonList(uri.toString()), null, i);
        }
        String authority = uri.getAuthority();
        return kgg1.m56363z(authority) ? Uri.EMPTY : m34435f(authority, uri.getPathSegments(), uri, i);
    }

    /* JADX INFO: renamed from: d */
    public final Uri m34433d(int i, String str) {
        return (str == null || str.isEmpty()) ? Uri.EMPTY : m34432c(i, Uri.parse(str));
    }

    /* JADX INFO: renamed from: e */
    public final Uri m34434e(Uri uri, int i, int i2) {
        String str;
        if (uri != null && uri.toString().startsWith("android.resource")) {
            return uri;
        }
        Uri.Builder builderBuildUpon = m34432c(i, uri).buildUpon();
        if (i2 == 1) {
            str = "LARGE";
        } else if (i2 == 2) {
            str = "NORMAL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SMALL";
        }
        return builderBuildUpon.appendQueryParameter("dimension", str).build();
    }

    /* JADX INFO: renamed from: f */
    public final Uri m34435f(String str, List list, Uri uri, int i) {
        Uri.Builder builderAuthority = new Uri.Builder().scheme("content").authority(this.f43534a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builderAuthority.appendPath((String) it.next());
        }
        if (uri != null && uri.getPath() != null && uri.getPath().endsWith("/")) {
            builderAuthority.appendEncodedPath("");
        }
        if (str != null) {
            builderAuthority.appendQueryParameter("cdn", str);
        }
        builderAuthority.appendQueryParameter("transformation", ikc0.m50947s(i));
        if (uri != null) {
            for (String str2 : uri.getQueryParameterNames()) {
                builderAuthority.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderAuthority.build();
    }
}

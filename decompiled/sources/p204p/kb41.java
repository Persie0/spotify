package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kb41 {

    /* JADX INFO: renamed from: a */
    public static final urv0 f121086a = new urv0("([\\w-]+\\.[\\w-]+\\.[\\w-]+\\.[\\w-]+$)");

    /* JADX INFO: renamed from: a */
    public static final String m55930a(Uri uri) {
        String str;
        r2d0 r2d0VarM83869a = urv0.m83869a(f121086a, String.valueOf(uri.getHost()));
        return (r2d0VarM83869a == null || (str = (String) ((p2d0) r2d0VarM83869a.m74520a()).get(1)) == null) ? uri.getHost() : str;
    }
}

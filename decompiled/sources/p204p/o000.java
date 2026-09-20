package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class o000 {

    /* JADX INFO: renamed from: a */
    public final Uri f160197a;

    /* JADX INFO: renamed from: b */
    public final int f160198b;

    /* JADX INFO: renamed from: c */
    public final int f160199c;

    /* JADX INFO: renamed from: d */
    public final boolean f160200d;

    /* JADX INFO: renamed from: e */
    public final String f160201e;

    /* JADX INFO: renamed from: f */
    public final int f160202f;

    public o000(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.f160197a = uri;
        this.f160198b = i;
        this.f160199c = i2;
        this.f160200d = z;
        this.f160201e = null;
        this.f160202f = i3;
    }

    public o000(String str, String str2) {
        this.f160197a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f160198b = 0;
        this.f160199c = 400;
        this.f160200d = false;
        this.f160201e = str2;
        this.f160202f = 0;
    }
}

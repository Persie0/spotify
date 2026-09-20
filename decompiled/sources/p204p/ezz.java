package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ezz {

    /* JADX INFO: renamed from: a */
    public final ArrayList f64499a;

    /* JADX INFO: renamed from: b */
    public final char f64500b;

    /* JADX INFO: renamed from: c */
    public final double f64501c;

    /* JADX INFO: renamed from: d */
    public final String f64502d;

    /* JADX INFO: renamed from: e */
    public final String f64503e;

    public ezz(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f64499a = arrayList;
        this.f64500b = c;
        this.f64501c = d;
        this.f64502d = str;
        this.f64503e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m40435a(char c, String str, String str2) {
        return str2.hashCode() + s571.m77243b(c * 31, 31, str);
    }

    public final int hashCode() {
        return m40435a(this.f64500b, this.f64503e, this.f64502d);
    }
}

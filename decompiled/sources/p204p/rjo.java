package p204p;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rjo {

    /* JADX INFO: renamed from: a */
    public Uri f199866a;

    /* JADX INFO: renamed from: b */
    public long f199867b;

    /* JADX INFO: renamed from: d */
    public byte[] f199869d;

    /* JADX INFO: renamed from: f */
    public long f199871f;

    /* JADX INFO: renamed from: h */
    public String f199873h;

    /* JADX INFO: renamed from: i */
    public int f199874i;

    /* JADX INFO: renamed from: j */
    public Object f199875j;

    /* JADX INFO: renamed from: c */
    public int f199868c = 1;

    /* JADX INFO: renamed from: e */
    public Map f199870e = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: g */
    public long f199872g = -1;

    /* JADX INFO: renamed from: a */
    public final sjo m75643a() {
        c95.m31848n(this.f199866a, "The uri must be set.");
        return new sjo(this.f199866a, this.f199867b, this.f199868c, this.f199869d, this.f199870e, this.f199871f, this.f199872g, this.f199873h, this.f199874i, this.f199875j);
    }

    /* JADX INFO: renamed from: b */
    public final void m75644b() {
        this.f199874i = 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m75645c(byte[] bArr) {
        this.f199869d = bArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m75646d() {
        this.f199868c = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m75647e(Map map) {
        this.f199870e = map;
    }

    /* JADX INFO: renamed from: f */
    public final void m75648f(String str) {
        this.f199866a = Uri.parse(str);
    }
}

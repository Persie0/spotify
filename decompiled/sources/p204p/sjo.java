package p204p;

import android.net.Uri;
import com.spotify.cosmos.cosmos.Request;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sjo {

    /* JADX INFO: renamed from: a */
    public final Uri f209885a;

    /* JADX INFO: renamed from: b */
    public final long f209886b;

    /* JADX INFO: renamed from: c */
    public final int f209887c;

    /* JADX INFO: renamed from: d */
    public final byte[] f209888d;

    /* JADX INFO: renamed from: e */
    public final Map f209889e;

    /* JADX INFO: renamed from: f */
    public final long f209890f;

    /* JADX INFO: renamed from: g */
    public final long f209891g;

    /* JADX INFO: renamed from: h */
    public final String f209892h;

    /* JADX INFO: renamed from: i */
    public final int f209893i;

    /* JADX INFO: renamed from: j */
    public final Object f209894j;

    static {
        dgd0.m35920a("media3.datasource");
    }

    public sjo(Uri uri) {
        this(uri, 0L, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static String m78347b(int i) {
        if (i == 1) {
            return Request.GET;
        }
        if (i == 2) {
            return Request.POST;
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public final rjo m78348a() {
        rjo rjoVar = new rjo();
        rjoVar.f199866a = this.f209885a;
        rjoVar.f199867b = this.f209886b;
        rjoVar.f199868c = this.f209887c;
        rjoVar.f199869d = this.f209888d;
        rjoVar.f199870e = this.f209889e;
        rjoVar.f199871f = this.f209890f;
        rjoVar.f199872g = this.f209891g;
        rjoVar.f199873h = this.f209892h;
        rjoVar.f199874i = this.f209893i;
        rjoVar.f199875j = this.f209894j;
        return rjoVar;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m78349c(int i) {
        return (this.f209893i & i) == i;
    }

    /* JADX INFO: renamed from: d */
    public final sjo m78350d(long j) {
        long j2 = this.f209891g;
        return m78351e(j, j2 != -1 ? j2 - j : -1L);
    }

    /* JADX INFO: renamed from: e */
    public final sjo m78351e(long j, long j2) {
        if (j == 0 && this.f209891g == j2) {
            return this;
        }
        return new sjo(this.f209885a, this.f209886b, this.f209887c, this.f209888d, this.f209889e, this.f209890f + j, j2, this.f209892h, this.f209893i, this.f209894j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(m78347b(this.f209887c));
        sb.append(" ");
        sb.append(this.f209885a);
        sb.append(", ");
        sb.append(this.f209890f);
        sb.append(", ");
        sb.append(this.f209891g);
        sb.append(", ");
        sb.append(this.f209892h);
        sb.append(", ");
        return klh.m56832d(this.f209893i, "]", sb);
    }

    public sjo(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }

    public sjo(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        c95.m31843i(j + j2 >= 0);
        c95.m31843i(j2 >= 0);
        c95.m31843i(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f209885a = uri;
        this.f209886b = j;
        this.f209887c = i;
        this.f209888d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f209889e = Collections.unmodifiableMap(new HashMap(map));
        this.f209890f = j2;
        this.f209891g = j3;
        this.f209892h = str;
        this.f209893i = i2;
        this.f209894j = obj;
    }
}

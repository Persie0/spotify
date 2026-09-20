package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wz7 {

    /* JADX INFO: renamed from: a */
    public String f256510a;

    /* JADX INFO: renamed from: b */
    public int f256511b;

    /* JADX INFO: renamed from: c */
    public List f256512c;

    /* JADX INFO: renamed from: d */
    public byte f256513d;

    /* JADX INFO: renamed from: a */
    public final xz7 m89401a() {
        String str;
        List list;
        if (this.f256513d == 1 && (str = this.f256510a) != null && (list = this.f256512c) != null) {
            return new xz7(str, this.f256511b, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f256510a == null) {
            sb.append(" name");
        }
        if ((1 & this.f256513d) == 0) {
            sb.append(" importance");
        }
        if (this.f256512c == null) {
            sb.append(" frames");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m89402b(List list) {
        if (list == null) {
            throw new NullPointerException("Null frames");
        }
        this.f256512c = list;
    }

    /* JADX INFO: renamed from: c */
    public final void m89403c(int i) {
        this.f256511b = i;
        this.f256513d = (byte) (this.f256513d | 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m89404d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f256510a = str;
    }
}

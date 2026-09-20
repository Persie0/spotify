package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wy7 {

    /* JADX INFO: renamed from: a */
    public int f256217a;

    /* JADX INFO: renamed from: b */
    public String f256218b;

    /* JADX INFO: renamed from: c */
    public int f256219c;

    /* JADX INFO: renamed from: d */
    public int f256220d;

    /* JADX INFO: renamed from: e */
    public long f256221e;

    /* JADX INFO: renamed from: f */
    public long f256222f;

    /* JADX INFO: renamed from: g */
    public long f256223g;

    /* JADX INFO: renamed from: h */
    public String f256224h;

    /* JADX INFO: renamed from: i */
    public List f256225i;

    /* JADX INFO: renamed from: j */
    public byte f256226j;

    /* JADX INFO: renamed from: a */
    public final xy7 m89339a() {
        String str;
        if (this.f256226j == 63 && (str = this.f256218b) != null) {
            return new xy7(this.f256217a, str, this.f256219c, this.f256220d, this.f256221e, this.f256222f, this.f256223g, this.f256224h, this.f256225i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f256226j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f256218b == null) {
            sb.append(" processName");
        }
        if ((this.f256226j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.f256226j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.f256226j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.f256226j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.f256226j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m89340b(List list) {
        this.f256225i = list;
    }

    /* JADX INFO: renamed from: c */
    public final void m89341c(int i) {
        this.f256220d = i;
        this.f256226j = (byte) (this.f256226j | 4);
    }

    /* JADX INFO: renamed from: d */
    public final void m89342d(int i) {
        this.f256217a = i;
        this.f256226j = (byte) (this.f256226j | 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m89343e(String str) {
        if (str == null) {
            throw new NullPointerException("Null processName");
        }
        this.f256218b = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m89344f(long j) {
        this.f256221e = j;
        this.f256226j = (byte) (this.f256226j | 8);
    }

    /* JADX INFO: renamed from: g */
    public final void m89345g(int i) {
        this.f256219c = i;
        this.f256226j = (byte) (this.f256226j | 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m89346h(long j) {
        this.f256222f = j;
        this.f256226j = (byte) (this.f256226j | 16);
    }

    /* JADX INFO: renamed from: i */
    public final void m89347i(long j) {
        this.f256223g = j;
        this.f256226j = (byte) (this.f256226j | 32);
    }

    /* JADX INFO: renamed from: j */
    public final void m89348j(String str) {
        this.f256224h = str;
    }
}

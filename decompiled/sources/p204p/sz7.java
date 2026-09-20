package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sz7 {

    /* JADX INFO: renamed from: a */
    public String f215400a;

    /* JADX INFO: renamed from: b */
    public String f215401b;

    /* JADX INFO: renamed from: c */
    public List f215402c;

    /* JADX INFO: renamed from: d */
    public q3l f215403d;

    /* JADX INFO: renamed from: e */
    public int f215404e;

    /* JADX INFO: renamed from: f */
    public byte f215405f;

    /* JADX INFO: renamed from: a */
    public final tz7 m79724a() {
        String str;
        List list;
        if (this.f215405f == 1 && (str = this.f215400a) != null && (list = this.f215402c) != null) {
            return new tz7(str, this.f215401b, list, this.f215403d, this.f215404e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f215400a == null) {
            sb.append(" type");
        }
        if (this.f215402c == null) {
            sb.append(" frames");
        }
        if ((1 & this.f215405f) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m79725b(q3l q3lVar) {
        this.f215403d = q3lVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m79726c(List list) {
        if (list == null) {
            throw new NullPointerException("Null frames");
        }
        this.f215402c = list;
    }

    /* JADX INFO: renamed from: d */
    public final void m79727d(int i) {
        this.f215404e = i;
        this.f215405f = (byte) (this.f215405f | 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m79728e(String str) {
        this.f215401b = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m79729f(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f215400a = str;
    }
}

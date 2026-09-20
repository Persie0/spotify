package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ty80 {

    /* JADX INFO: renamed from: a */
    public final long f224872a;

    /* JADX INFO: renamed from: b */
    public final int f224873b;

    /* JADX INFO: renamed from: c */
    public final int f224874c;

    /* JADX INFO: renamed from: d */
    public final long f224875d;

    /* JADX INFO: renamed from: e */
    public final int f224876e;

    /* JADX INFO: renamed from: f */
    public final ybv f224877f;

    /* JADX INFO: renamed from: g */
    public final int f224878g;

    /* JADX INFO: renamed from: h */
    public final boolean f224879h;

    /* JADX INFO: renamed from: i */
    public final Map f224880i;

    /* JADX INFO: renamed from: j */
    public final qu80 f224881j;

    public ty80(long j, int i, int i2, long j2, int i3, ybv ybvVar, int i4, boolean z, Map map) {
        this.f224872a = j;
        this.f224873b = i;
        this.f224874c = i2;
        this.f224875d = j2;
        this.f224876e = i3;
        this.f224877f = ybvVar;
        this.f224878g = i4;
        this.f224879h = z;
        this.f224880i = map;
        this.f224881j = new qu80(0, 0, false, (List) null, (ybv) null, 0L, (Integer) null, false, map, 0L, (List) null, 0, 7935);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81955a() {
        return this.f224878g == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty80)) {
            return false;
        }
        ty80 ty80Var = (ty80) obj;
        return this.f224872a == ty80Var.f224872a && this.f224873b == ty80Var.f224873b && this.f224874c == ty80Var.f224874c && this.f224875d == ty80Var.f224875d && this.f224876e == ty80Var.f224876e && wj50.m88271j(this.f224877f, ty80Var.f224877f) && this.f224878g == ty80Var.f224878g && this.f224879h == ty80Var.f224879h && wj50.m88271j(this.f224880i, ty80Var.f224880i);
    }

    public final int hashCode() {
        return this.f224880i.hashCode() + s571.m77245d(mt60.m62800g(this.f224878g, (this.f224877f.hashCode() + mt60.m62800g(this.f224876e, dq60.m36605e(mt60.m62800g(this.f224874c, mt60.m62800g(this.f224873b, Long.hashCode(this.f224872a) * 31, 31), 31), this.f224875d, 31), 31)) * 31, 31), 31, this.f224879h);
    }

    public /* synthetic */ ty80() {
        this(0L, 0, 0, 0L, 0, new ybv(null, -1), 0, false, nau.f152117a);
    }
}

package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xy7 extends i3l {

    /* JADX INFO: renamed from: a */
    public final int f267245a;

    /* JADX INFO: renamed from: b */
    public final String f267246b;

    /* JADX INFO: renamed from: c */
    public final int f267247c;

    /* JADX INFO: renamed from: d */
    public final int f267248d;

    /* JADX INFO: renamed from: e */
    public final long f267249e;

    /* JADX INFO: renamed from: f */
    public final long f267250f;

    /* JADX INFO: renamed from: g */
    public final long f267251g;

    /* JADX INFO: renamed from: h */
    public final String f267252h;

    /* JADX INFO: renamed from: i */
    public final List f267253i;

    public xy7(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f267245a = i;
        this.f267246b = str;
        this.f267247c = i2;
        this.f267248d = i3;
        this.f267249e = j;
        this.f267250f = j2;
        this.f267251g = j3;
        this.f267252h = str2;
        this.f267253i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i3l) {
            xy7 xy7Var = (xy7) ((i3l) obj);
            List list2 = xy7Var.f267253i;
            String str2 = xy7Var.f267252h;
            if (this.f267245a == xy7Var.f267245a && this.f267246b.equals(xy7Var.f267246b) && this.f267247c == xy7Var.f267247c && this.f267248d == xy7Var.f267248d && this.f267249e == xy7Var.f267249e && this.f267250f == xy7Var.f267250f && this.f267251g == xy7Var.f267251g && ((str = this.f267252h) != null ? str.equals(str2) : str2 == null) && ((list = this.f267253i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f267245a ^ 1000003) * 1000003) ^ this.f267246b.hashCode()) * 1000003) ^ this.f267247c) * 1000003) ^ this.f267248d) * 1000003;
        long j = this.f267249e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f267250f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f267251g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f267252h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f267253i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f267245a + ", processName=" + this.f267246b + ", reasonCode=" + this.f267247c + ", importance=" + this.f267248d + ", pss=" + this.f267249e + ", rss=" + this.f267250f + ", timestamp=" + this.f267251g + ", traceFile=" + this.f267252h + ", buildIdMappingForArch=" + this.f267253i + "}";
    }
}

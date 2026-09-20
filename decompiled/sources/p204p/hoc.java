package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hoc extends sz30 implements foc {

    /* JADX INFO: renamed from: b */
    public final String f93496b;

    /* JADX INFO: renamed from: c */
    public final int f93497c;

    /* JADX INFO: renamed from: d */
    public final int f93498d;

    /* JADX INFO: renamed from: e */
    public final long f93499e;

    /* JADX INFO: renamed from: f */
    public final long f93500f;

    /* JADX INFO: renamed from: g */
    public final sz30[] f93501g;

    public hoc(String str, int i, int i2, long j, long j2, sz30[] sz30VarArr) {
        String str2;
        super("CHAP");
        c95.m31843i(i <= i2);
        this.f93496b = str;
        this.f93497c = i;
        this.f93498d = i2;
        int length = sz30VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            sz30 sz30Var = sz30VarArr[i3];
            if (sz30Var instanceof da71) {
                da71 da71Var = (da71) sz30Var;
                pf40 pf40Var = da71Var.f46991c;
                if (da71Var.f215378a.equals("TIT2") && !pf40Var.isEmpty()) {
                    str2 = (String) pf40Var.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new ee70(null, str2);
        }
        this.f93499e = j;
        this.f93500f = j2;
        this.f93501g = sz30VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hoc.class == obj.getClass()) {
            hoc hocVar = (hoc) obj;
            if (this.f93497c == hocVar.f93497c && this.f93498d == hocVar.f93498d && this.f93499e == hocVar.f93499e && this.f93500f == hocVar.f93500f && Objects.equals(this.f93496b, hocVar.f93496b) && Arrays.equals(this.f93501g, hocVar.f93501g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f93497c) * 31) + this.f93498d) * 31) + ((int) this.f93499e)) * 31) + ((int) this.f93500f)) * 31;
        String str = this.f93496b;
        return i + (str != null ? str.hashCode() : 0);
    }
}

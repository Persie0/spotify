package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class s840 {

    /* JADX INFO: renamed from: a */
    public final String f206541a;

    /* JADX INFO: renamed from: b */
    public final String f206542b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f206543c;

    /* JADX INFO: renamed from: d */
    public final String f206544d;

    public s840(String str, String str2, String str3, ArrayList arrayList) {
        this.f206541a = str;
        this.f206542b = str2;
        this.f206543c = arrayList;
        this.f206544d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s840)) {
            return false;
        }
        s840 s840Var = (s840) obj;
        return wj50.m88271j(this.f206541a, s840Var.f206541a) && wj50.m88271j(this.f206542b, s840Var.f206542b) && this.f206543c.equals(s840Var.f206543c) && wj50.m88271j(this.f206544d, s840Var.f206544d);
    }

    public final int hashCode() {
        return this.f206544d.hashCode() + lq51.m59700f(this.f206543c, s571.m77243b(this.f206541a.hashCode() * 31, 31, this.f206542b), 31);
    }
}

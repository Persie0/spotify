package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class lfe0 {

    /* JADX INFO: renamed from: a */
    public final String f132930a;

    /* JADX INFO: renamed from: b */
    public final String f132931b;

    /* JADX INFO: renamed from: c */
    public final String f132932c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f132933d;

    public lfe0(String str, String str2, String str3, ArrayList arrayList) {
        this.f132930a = str;
        this.f132931b = str2;
        this.f132932c = str3;
        this.f132933d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfe0)) {
            return false;
        }
        lfe0 lfe0Var = (lfe0) obj;
        return wj50.m88271j(this.f132930a, lfe0Var.f132930a) && wj50.m88271j(this.f132931b, lfe0Var.f132931b) && wj50.m88271j(this.f132932c, lfe0Var.f132932c) && this.f132933d.equals(lfe0Var.f132933d);
    }

    public final int hashCode() {
        return this.f132933d.hashCode() + s571.m77243b(s571.m77243b(this.f132930a.hashCode() * 31, 31, this.f132931b), 31, this.f132932c);
    }
}

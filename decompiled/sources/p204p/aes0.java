package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class aes0 {

    /* JADX INFO: renamed from: a */
    public final String f14945a;

    /* JADX INFO: renamed from: b */
    public final String f14946b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f14947c;

    public aes0(String str, String str2, ArrayList arrayList) {
        this.f14945a = str;
        this.f14946b = str2;
        this.f14947c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aes0)) {
            return false;
        }
        aes0 aes0Var = (aes0) obj;
        return wj50.m88271j(this.f14945a, aes0Var.f14945a) && wj50.m88271j(this.f14946b, aes0Var.f14946b) && this.f14947c.equals(aes0Var.f14947c);
    }

    public final int hashCode() {
        return this.f14947c.hashCode() + s571.m77243b(this.f14945a.hashCode() * 31, 31, this.f14946b);
    }
}

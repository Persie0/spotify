package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class u0w0 {

    /* JADX INFO: renamed from: a */
    public final String f225618a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f225619b;

    public u0w0(String str, ArrayList arrayList) {
        this.f225618a = str;
        this.f225619b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0w0)) {
            return false;
        }
        u0w0 u0w0Var = (u0w0) obj;
        return wj50.m88271j(this.f225618a, u0w0Var.f225618a) && this.f225619b.equals(u0w0Var.f225619b);
    }

    public final int hashCode() {
        return this.f225619b.hashCode() + (this.f225618a.hashCode() * 31);
    }
}

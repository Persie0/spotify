package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xoi {

    /* JADX INFO: renamed from: a */
    public final String f264288a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f264289b;

    public xoi(String str, ArrayList arrayList) {
        this.f264288a = str;
        this.f264289b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoi)) {
            return false;
        }
        xoi xoiVar = (xoi) obj;
        return wj50.m88271j(this.f264288a, xoiVar.f264288a) && this.f264289b.equals(xoiVar.f264289b);
    }

    public final int hashCode() {
        return this.f264289b.hashCode() + (this.f264288a.hashCode() * 31);
    }
}

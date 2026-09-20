package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class apk0 {

    /* JADX INFO: renamed from: a */
    public final Object f17968a;

    /* JADX INFO: renamed from: b */
    public final String f17969b;

    public apk0(List list, String str) {
        this.f17968a = list;
        this.f17969b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apk0)) {
            return false;
        }
        apk0 apk0Var = (apk0) obj;
        return this.f17968a.equals(apk0Var.f17968a) && wj50.m88271j(this.f17969b, apk0Var.f17969b);
    }

    public final int hashCode() {
        int iHashCode = this.f17968a.hashCode() * 31;
        String str = this.f17969b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

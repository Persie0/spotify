package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class kiy implements miy {

    /* JADX INFO: renamed from: a */
    public final String f123138a;

    /* JADX INFO: renamed from: b */
    public final String f123139b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f123140c;

    public kiy(String str, String str2, ArrayList arrayList) {
        this.f123138a = str;
        this.f123139b = str2;
        this.f123140c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiy)) {
            return false;
        }
        kiy kiyVar = (kiy) obj;
        return this.f123138a.equals(kiyVar.f123138a) && this.f123139b.equals(kiyVar.f123139b) && this.f123140c.equals(kiyVar.f123140c);
    }

    public final int hashCode() {
        return this.f123140c.hashCode() + s571.m77243b(this.f123138a.hashCode() * 31, 31, this.f123139b);
    }
}

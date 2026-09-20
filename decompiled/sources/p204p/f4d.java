package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class f4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f65756a;

    /* JADX INFO: renamed from: b */
    public final String f65757b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f65758c;

    public f4d(String str, String str2, ArrayList arrayList) {
        this.f65756a = str;
        this.f65757b = str2;
        this.f65758c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4d)) {
            return false;
        }
        f4d f4dVar = (f4d) obj;
        return wj50.m88271j(this.f65756a, f4dVar.f65756a) && wj50.m88271j(this.f65757b, f4dVar.f65757b) && this.f65758c.equals(f4dVar.f65758c);
    }

    public final int hashCode() {
        return this.f65758c.hashCode() + s571.m77243b(this.f65756a.hashCode() * 31, 31, this.f65757b);
    }
}

package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nvt implements pvt {

    /* JADX INFO: renamed from: a */
    public final ArrayList f158959a;

    public nvt(ArrayList arrayList) {
        this.f158959a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvt) && this.f158959a.equals(((nvt) obj).f158959a);
    }

    public final int hashCode() {
        return this.f158959a.hashCode();
    }
}

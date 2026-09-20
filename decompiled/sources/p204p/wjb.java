package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wjb implements yjb {

    /* JADX INFO: renamed from: a */
    public final ArrayList f251924a;

    public wjb(ArrayList arrayList) {
        this.f251924a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m88288a() {
        return this.f251924a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjb) && this.f251924a.equals(((wjb) obj).f251924a);
    }

    public final int hashCode() {
        return this.f251924a.hashCode();
    }
}

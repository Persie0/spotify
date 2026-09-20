package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ly90 {

    /* JADX INFO: renamed from: a */
    public final List f138006a;

    public ly90(List list) {
        this.f138006a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly90) && wj50.m88271j(this.f138006a, ((ly90) obj).f138006a);
    }

    public final int hashCode() {
        return this.f138006a.hashCode();
    }
}

package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wil0 implements ljl0 {

    /* JADX INFO: renamed from: a */
    public final List f251680a;

    public wil0(List list) {
        this.f251680a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wil0) && wj50.m88271j(this.f251680a, ((wil0) obj).f251680a);
    }

    public final int hashCode() {
        return this.f251680a.hashCode();
    }
}

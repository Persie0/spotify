package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class typ0 extends vyp0 {

    /* JADX INFO: renamed from: a */
    public final List f225018a;

    public typ0(List list) {
        this.f225018a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof typ0) && wj50.m88271j(this.f225018a, ((typ0) obj).f225018a);
    }

    public final int hashCode() {
        return this.f225018a.hashCode();
    }
}

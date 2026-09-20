package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tw2 {

    /* JADX INFO: renamed from: a */
    public final List f224300a;

    public tw2(List list) {
        this.f224300a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw2) && wj50.m88271j(this.f224300a, ((tw2) obj).f224300a);
    }

    public final int hashCode() {
        return this.f224300a.hashCode();
    }
}

package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ef3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final List f58923a;

    public ef3(List list) {
        this.f58923a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef3) && wj50.m88271j(this.f58923a, ((ef3) obj).f58923a);
    }

    public final int hashCode() {
        return this.f58923a.hashCode();
    }
}

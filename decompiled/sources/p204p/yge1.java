package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class yge1 implements zge1 {

    /* JADX INFO: renamed from: a */
    public final List f272571a;

    public yge1(List list) {
        this.f272571a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yge1) && wj50.m88271j(this.f272571a, ((yge1) obj).f272571a);
    }

    public final int hashCode() {
        return this.f272571a.hashCode();
    }
}

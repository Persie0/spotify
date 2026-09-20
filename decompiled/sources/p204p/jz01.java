package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class jz01 extends kz01 {

    /* JADX INFO: renamed from: a */
    public final List f117532a;

    public jz01(List list) {
        this.f117532a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz01) && wj50.m88271j(this.f117532a, ((jz01) obj).f117532a);
    }

    public final int hashCode() {
        return this.f117532a.hashCode();
    }
}

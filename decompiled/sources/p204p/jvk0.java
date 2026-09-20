package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class jvk0 {

    /* JADX INFO: renamed from: a */
    public final List f116363a;

    public jvk0(List list) {
        this.f116363a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvk0) && wj50.m88271j(this.f116363a, ((jvk0) obj).f116363a);
    }

    public final int hashCode() {
        return this.f116363a.hashCode();
    }
}

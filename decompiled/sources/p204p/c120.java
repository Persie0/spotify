package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c120 implements e120 {

    /* JADX INFO: renamed from: a */
    public final List f32953a;

    public c120(List list) {
        this.f32953a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c120) && wj50.m88271j(this.f32953a, ((c120) obj).f32953a);
    }

    public final int hashCode() {
        return this.f32953a.hashCode();
    }
}

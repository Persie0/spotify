package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x420 implements y420 {

    /* JADX INFO: renamed from: a */
    public final List f257953a;

    public x420(List list) {
        this.f257953a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x420) && wj50.m88271j(this.f257953a, ((x420) obj).f257953a);
    }

    public final int hashCode() {
        return this.f257953a.hashCode();
    }
}

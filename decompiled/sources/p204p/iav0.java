package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class iav0 {

    /* JADX INFO: renamed from: a */
    public final Map f100351a;

    public iav0(Map map) {
        this.f100351a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iav0) && wj50.m88271j(this.f100351a, ((iav0) obj).f100351a);
    }

    public final int hashCode() {
        return this.f100351a.hashCode();
    }
}

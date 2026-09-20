package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final Map f117566a;

    public jz21(Map map) {
        this.f117566a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz21) && wj50.m88271j(this.f117566a, ((jz21) obj).f117566a);
    }

    public final int hashCode() {
        return this.f117566a.hashCode();
    }
}

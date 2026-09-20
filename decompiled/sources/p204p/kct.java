package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class kct implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f121544a;

    /* JADX INFO: renamed from: b */
    public final String f121545b;

    public kct(String str, String str2) {
        this.f121544a = str;
        this.f121545b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kct)) {
            return false;
        }
        kct kctVar = (kct) obj;
        return wj50.m88271j(this.f121544a, kctVar.f121544a) && wj50.m88271j(this.f121545b, kctVar.f121545b);
    }

    public final int hashCode() {
        return this.f121545b.hashCode() + (this.f121544a.hashCode() * 31);
    }
}

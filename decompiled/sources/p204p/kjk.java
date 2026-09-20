package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kjk {

    /* JADX INFO: renamed from: a */
    public final String f123373a;

    /* JADX INFO: renamed from: b */
    public final List f123374b;

    public kjk(String str, List list) {
        this.f123373a = str;
        this.f123374b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjk)) {
            return false;
        }
        kjk kjkVar = (kjk) obj;
        return wj50.m88271j(this.f123373a, kjkVar.f123373a) && wj50.m88271j(this.f123374b, kjkVar.f123374b);
    }

    public final int hashCode() {
        return this.f123374b.hashCode() + (this.f123373a.hashCode() * 31);
    }
}

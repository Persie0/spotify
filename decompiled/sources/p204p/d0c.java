package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d0c extends i0c {

    /* JADX INFO: renamed from: a */
    public final String f43840a;

    /* JADX INFO: renamed from: b */
    public final String f43841b;

    /* JADX INFO: renamed from: c */
    public final List f43842c;

    public d0c(String str, List list, String str2) {
        this.f43840a = str;
        this.f43841b = str2;
        this.f43842c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0c)) {
            return false;
        }
        d0c d0cVar = (d0c) obj;
        return wj50.m88271j(this.f43840a, d0cVar.f43840a) && wj50.m88271j(this.f43841b, d0cVar.f43841b) && wj50.m88271j(this.f43842c, d0cVar.f43842c);
    }

    public final int hashCode() {
        return this.f43842c.hashCode() + s571.m77243b(this.f43840a.hashCode() * 31, 31, this.f43841b);
    }
}

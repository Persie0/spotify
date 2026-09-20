package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qjd implements ojd {

    /* JADX INFO: renamed from: a */
    public final String f189218a;

    /* JADX INFO: renamed from: b */
    public final List f189219b;

    public qjd(String str, List list) {
        this.f189218a = str;
        this.f189219b = list;
    }

    @Override // p204p.ojd
    /* JADX INFO: renamed from: a */
    public final String mo67111a() {
        return this.f189218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjd)) {
            return false;
        }
        qjd qjdVar = (qjd) obj;
        return wj50.m88271j(this.f189218a, qjdVar.f189218a) && wj50.m88271j(this.f189219b, qjdVar.f189219b);
    }

    public final int hashCode() {
        return this.f189219b.hashCode() + (this.f189218a.hashCode() * 31);
    }
}

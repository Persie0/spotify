package p204p;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class l540 {

    /* JADX INFO: renamed from: a */
    public final InputStream f129819a;

    /* JADX INFO: renamed from: b */
    public final fsk f129820b;

    /* JADX INFO: renamed from: c */
    public final Float f129821c;

    public l540(InputStream inputStream, fsk fskVar, Float f) {
        this.f129819a = inputStream;
        this.f129820b = fskVar;
        this.f129821c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l540)) {
            return false;
        }
        l540 l540Var = (l540) obj;
        return wj50.m88271j(this.f129819a, l540Var.f129819a) && this.f129820b == l540Var.f129820b && wj50.m88271j(this.f129821c, l540Var.f129821c);
    }

    public final int hashCode() {
        int iHashCode = (this.f129820b.hashCode() + (this.f129819a.hashCode() * 31)) * 31;
        Float f = this.f129821c;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}

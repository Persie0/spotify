package p204p;

import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public final class a1w0 {

    /* JADX INFO: renamed from: a */
    public final Calendar f11485a;

    public a1w0(Calendar calendar) {
        this.f11485a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1w0) && wj50.m88271j(this.f11485a, ((a1w0) obj).f11485a);
    }

    public final int hashCode() {
        return this.f11485a.hashCode();
    }
}

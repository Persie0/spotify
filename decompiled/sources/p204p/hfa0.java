package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class hfa0 {

    /* JADX INFO: renamed from: a */
    public final Locale f90651a;

    public hfa0(Locale locale) {
        this.f90651a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hfa0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return wj50.m88271j(this.f90651a.toLanguageTag(), ((hfa0) obj).f90651a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f90651a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f90651a.toLanguageTag();
    }
}

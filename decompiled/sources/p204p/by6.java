package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class by6 {

    /* JADX INFO: renamed from: a */
    public final Locale f32085a;

    /* JADX INFO: renamed from: b */
    public final boolean f32086b;

    public by6(Locale locale, boolean z) {
        this.f32085a = locale;
        this.f32086b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by6)) {
            return false;
        }
        by6 by6Var = (by6) obj;
        return wj50.m88271j(this.f32085a, by6Var.f32085a) && this.f32086b == by6Var.f32086b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32086b) + (this.f32085a.hashCode() * 31);
    }
}

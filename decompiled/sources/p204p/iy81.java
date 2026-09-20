package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class iy81 {

    /* JADX INFO: renamed from: a */
    public final String f106906a;

    /* JADX INFO: renamed from: b */
    public final t2b0 f106907b;

    /* JADX INFO: renamed from: c */
    public final Locale f106908c;

    public iy81(String str, t2b0 t2b0Var, Locale locale) {
        this.f106906a = str;
        this.f106907b = t2b0Var;
        this.f106908c = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy81)) {
            return false;
        }
        iy81 iy81Var = (iy81) obj;
        return wj50.m88271j(this.f106906a, iy81Var.f106906a) && wj50.m88271j(this.f106907b, iy81Var.f106907b) && wj50.m88271j(this.f106908c, iy81Var.f106908c);
    }

    public final int hashCode() {
        return this.f106908c.hashCode() + ((this.f106907b.hashCode() + (this.f106906a.hashCode() * 31)) * 961);
    }

    public iy81(String str, t2b0 t2b0Var, Locale locale, int i) {
        this(str, t2b0Var, (i & 8) != 0 ? Locale.ROOT : locale);
    }
}

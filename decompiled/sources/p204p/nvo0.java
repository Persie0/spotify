package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class nvo0 {

    /* JADX INFO: renamed from: a */
    public final String f158934a;

    /* JADX INFO: renamed from: b */
    public final float f158935b;

    /* JADX INFO: renamed from: c */
    public final long f158936c;

    public nvo0(String str, float f, long j) {
        this.f158934a = str;
        this.f158935b = f;
        this.f158936c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvo0)) {
            return false;
        }
        nvo0 nvo0Var = (nvo0) obj;
        return wj50.m88271j(this.f158934a, nvo0Var.f158934a) && Float.compare(this.f158935b, nvo0Var.f158935b) == 0 && this.f158936c == nvo0Var.f158936c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f158936c) + AbstractC0000a.m8g(this.f158934a.hashCode() * 31, 31, this.f158935b);
    }
}

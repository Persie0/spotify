package p204p;

import androidx.compose.p002ui.text.font.FontFamily;

/* JADX INFO: loaded from: classes5.dex */
public final class gzz {

    /* JADX INFO: renamed from: a */
    public final FontFamily f86074a;

    /* JADX INFO: renamed from: b */
    public final n6f f86075b;

    public gzz(FontFamily fontFamily, n6f n6fVar) {
        this.f86074a = fontFamily;
        this.f86075b = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzz)) {
            return false;
        }
        gzz gzzVar = (gzz) obj;
        return wj50.m88271j(this.f86074a, gzzVar.f86074a) && wj50.m88271j(this.f86075b, gzzVar.f86075b);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.f86074a;
        int iHashCode = (fontFamily == null ? 0 : fontFamily.hashCode()) * 31;
        n6f n6fVar = this.f86075b;
        return iHashCode + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}

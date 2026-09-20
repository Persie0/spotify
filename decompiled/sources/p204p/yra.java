package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yra {

    /* JADX INFO: renamed from: a */
    public final int f275430a;

    /* JADX INFO: renamed from: b */
    public final String f275431b;

    /* JADX INFO: renamed from: c */
    public final List f275432c;

    public yra(String str, int i, List list) {
        this.f275430a = i;
        this.f275431b = str;
        this.f275432c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yra)) {
            return false;
        }
        yra yraVar = (yra) obj;
        return this.f275430a == yraVar.f275430a && wj50.m88271j(this.f275431b, yraVar.f275431b) && wj50.m88271j(this.f275432c, yraVar.f275432c);
    }

    public final int hashCode() {
        return this.f275432c.hashCode() + s571.m77243b(Integer.hashCode(this.f275430a) * 31, 31, this.f275431b);
    }

    public final String toString() {
        return "EmojiDataCategory(headerIconId=" + this.f275430a + ", categoryName=" + this.f275431b + ", emojiDataList=" + this.f275432c + ')';
    }
}

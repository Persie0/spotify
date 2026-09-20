package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b9u extends uv50 {

    /* JADX INFO: renamed from: c */
    public String f24998c;

    /* JADX INFO: renamed from: d */
    public final boolean f24999d;

    /* JADX INFO: renamed from: e */
    public final int f25000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9u(String str, int i, int i2) {
        super(3);
        boolean z = (i2 & 2) != 0;
        i = (i2 & 4) != 0 ? 0 : i;
        this.f24998c = str;
        this.f24999d = z;
        this.f25000e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9u)) {
            return false;
        }
        b9u b9uVar = (b9u) obj;
        return wj50.m88271j(this.f24998c, b9uVar.f24998c) && this.f24999d == b9uVar.f24999d && this.f25000e == b9uVar.f25000e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25000e) + s571.m77245d(this.f24998c.hashCode() * 31, 31, this.f24999d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiViewData(emoji=");
        sb.append(this.f24998c);
        sb.append(", updateToSticky=");
        sb.append(this.f24999d);
        sb.append(", dataIndex=");
        return edb.m38567p(sb, this.f25000e, ')');
    }
}

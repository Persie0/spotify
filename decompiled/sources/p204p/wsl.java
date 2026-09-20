package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wsl {

    /* JADX INFO: renamed from: a */
    public final String f254648a;

    /* JADX INFO: renamed from: b */
    public final Object f254649b;

    public wsl(String str, List list) {
        this.f254648a = str;
        this.f254649b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsl)) {
            return false;
        }
        wsl wslVar = (wsl) obj;
        return this.f254648a.equals(wslVar.f254648a) && this.f254649b.equals(wslVar.f254649b);
    }

    public final int hashCode() {
        return this.f254649b.hashCode() + (this.f254648a.hashCode() * 31);
    }
}

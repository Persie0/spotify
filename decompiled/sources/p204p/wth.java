package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wth implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f254946a;

    /* JADX INFO: renamed from: b */
    public final Map f254947b;

    public wth(String str, Map map) {
        this.f254946a = str;
        this.f254947b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wth)) {
            return false;
        }
        wth wthVar = (wth) obj;
        return wj50.m88271j(this.f254946a, wthVar.f254946a) && wj50.m88271j(this.f254947b, wthVar.f254947b);
    }

    public final int hashCode() {
        return this.f254947b.hashCode() + (this.f254946a.hashCode() * 31);
    }
}

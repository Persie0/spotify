package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sil implements vil {

    /* JADX INFO: renamed from: a */
    public final String f209562a;

    /* JADX INFO: renamed from: b */
    public final List f209563b;

    public sil(String str, ae50 ae50Var) {
        this.f209562a = str;
        this.f209563b = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sil)) {
            return false;
        }
        sil silVar = (sil) obj;
        return wj50.m88271j(this.f209562a, silVar.f209562a) && wj50.m88271j(this.f209563b, silVar.f209563b);
    }

    public final int hashCode() {
        return this.f209563b.hashCode() + (this.f209562a.hashCode() * 31);
    }
}

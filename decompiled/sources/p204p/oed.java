package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oed implements red {

    /* JADX INFO: renamed from: a */
    public final List f164402a;

    /* JADX INFO: renamed from: b */
    public final String f164403b;

    /* JADX INFO: renamed from: c */
    public final int f164404c;

    public oed(int i, String str, ae50 ae50Var) {
        this.f164402a = ae50Var;
        this.f164403b = str;
        this.f164404c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oed)) {
            return false;
        }
        oed oedVar = (oed) obj;
        return wj50.m88271j(this.f164402a, oedVar.f164402a) && wj50.m88271j(this.f164403b, oedVar.f164403b) && this.f164404c == oedVar.f164404c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f164404c) + s571.m77243b(this.f164402a.hashCode() * 31, 31, this.f164403b);
    }
}

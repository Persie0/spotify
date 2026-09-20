package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class maw implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f141701a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f141702b;

    public maw(String str, ArrayList arrayList) {
        this.f141701a = str;
        this.f141702b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maw)) {
            return false;
        }
        maw mawVar = (maw) obj;
        return wj50.m88271j(this.f141701a, mawVar.f141701a) && this.f141702b.equals(mawVar.f141702b);
    }

    public final int hashCode() {
        return this.f141702b.hashCode() + (this.f141701a.hashCode() * 31);
    }
}

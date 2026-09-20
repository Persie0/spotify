package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ibb1 implements jbb1 {

    /* JADX INFO: renamed from: a */
    public final String f100503a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f100504b;

    public ibb1(String str, ArrayList arrayList) {
        this.f100503a = str;
        this.f100504b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibb1)) {
            return false;
        }
        ibb1 ibb1Var = (ibb1) obj;
        return this.f100503a.equals(ibb1Var.f100503a) && this.f100504b.equals(ibb1Var.f100504b);
    }

    public final int hashCode() {
        return this.f100504b.hashCode() + (this.f100503a.hashCode() * 31);
    }
}
